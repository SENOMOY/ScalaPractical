/**
  * Created by subhajit.s on 8/26/2016.
  */
object PartiallyAppliedFunction extends App {
  def partialFunction = (x:String,y:String,z:String) => x+y+z
  val email = partialFunction(_: String,_: String,"gfhgfhg")
  println(email)
  println(email("tyty","tytyr"))
  println(email("subhajit","uytuyt"))
}
