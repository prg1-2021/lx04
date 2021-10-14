object c {
  var re = 1.0
  var im = 0.0

  def output(): Unit = {
    if (im < 0) println(f"${re}${im}i")
    else println(f"${re}+${im}i")
  }

  val me = this
}

object Complex extends App {
  c.output()

  c.re = 2.0
  c.im = -5.0
  c.output()
  println()

  println(f"object c:             ${c}")
  println(f"object c.me (= this): ${c.me}")
  println(f"c == c.me:            ${c == c.me}")
}
