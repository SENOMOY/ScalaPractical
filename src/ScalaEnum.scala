/**
  * Created by subhajit.s on 8/26/2016.
  */

class ScalaEnum extends Enumeration {
  type ScalaEnum = Value
  val Club, Heart, Diamond, Spade = Value
}

object ScalaEnumExample extends App {

  def enumFunc(e: ScalaEnum ) = {
  println(e.values)
  }
  enumFunc(new ScalaEnum)
}
