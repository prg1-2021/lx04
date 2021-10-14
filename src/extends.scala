class Oct15 {
  val num = 1015
  val date = "October 15"
  val fDate = 10.15
}

object J_Oct15 extends Oct15 {
  val 日付 = "神無月の15の日"

  def output(): Unit = {
    println(f"${num}")
    println(f"${date}")
    println(f"${fDate}")
    println(f"${日付}")
  }
}

object ExtendsApp extends App {
  J_Oct15.output()
}
