case class Case(i: Int) {
  def test(): Unit = {
    val newCase = Case(0)
    println(f"newCase: ${newCase}")
    println(f"this:    ${this}")
    println(f"this == newCase: ${this == newCase}")
  }
}

object CaseMain extends App {
  Case(0).test()
}

