#include <stdio.h>

long simple(long a, long n) {
    for (long i = 1; i <= n; i++) { a += i; }  return a;
}

int main() {
    printf("1 + 2 + .. + 10 = %ld\n", simple(0, 10));
}
