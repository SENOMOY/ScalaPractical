/**
  * Created by subhajit.s on 10/4/2016.
  */
object OverLoading extends App{

  def joiner(strings: String*): String = strings.mkString("-")
  def joiner(strings: List[String]): String = joiner(strings: _*)

  println(joiner(List("one","two","three")))

}

