/**
  * Created by subhajit.s on 8/26/2016.
  */
object ScalaCollect extends App {

  val mixedList = List("a", 1, 2, "b", 'c', 9, 42.0)
  val results = mixedList collect {
    case s: String => "String:" + s
    case i: Int => i * i
    case _ => "Not Defined"
  }
  println(results)
}
