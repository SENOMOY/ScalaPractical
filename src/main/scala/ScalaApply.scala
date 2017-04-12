/**
  * Created by senomoy on 28-08-2016.
  */
object ScalaApply extends App{

  def apply(x: Int,y:Int) = x + y
  def apply(str: String) = str.toUpperCase

  println(ScalaApply(2,3))
  println(ScalaApply("scala"))

}
