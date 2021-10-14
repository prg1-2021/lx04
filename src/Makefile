all: simple simple.s Simple.class

simple: simple.c
	clang -o simple simple.c

# M1 Mac を持っている人は、普通は Arm64 アーキテクチャ用のアセンブリコードが得られます。
# ただし、Rosetta モードで動かしている場合、intel x64アーキテクチャ用のアセンブリコードが得られます。
simple.s: simple.c
	clang -o simple.s -S simple.c

# M1 Mac を持っている人は make simple-x64 を実行して、intel x64アーキテクチャ用のアセンブリコードを入手できます。
# ほかのアーキテクチャの PC ではたぶん動かないと思います。
X64=arch -x86_64
simple-x64: simple.c
	$(X64) clang -o simple-x64.s -S simple.c
	$(X64) as -o simple-x64.o simple-x64.s
	$(X64) clang -o simple-x64 simple-x64.o

# M1 Mac を持っている人は make simple-x64 を実行して、Arm64アーキテクチャ用のアセンブリコードを入手できます。
# ほかのアーキテクチャの PC ではたぶん動かないと思います。
ARM=arch -arm64e
simple-arm: simple.c
	$(ARM) clang -o simple-arm.s -S simple.c
	$(ARM) as -o simple-arm.o simple-arm.s
	$(ARM) clang -o simple-arm simple-arm.o

Simple.class: simple.scala
	scalac simple.scala

clean:
	rm -f simple simple-{arm,x64} simple*.o *.class

run-c: simple
	./simple

run-s: Simple.class
	scala Simple

run-j: Simple.class
	`brew --prefix`/opt/openjdk/bin/java -classpath `brew --prefix`/opt/scala/libexec/lib/scala-library.jar:. Simple
