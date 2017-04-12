/**
  * Created by senomoy on 25-08-2016.
  */
object PartialFunction extends App {

  def multiply(a: Int,b: Int):Int={
    a*b
  }

  def divide(a: Int,b: Int):Int={
    a/b
  }

  def safeDivide: PartialFunction[(Int,Int),Int] = {
    case(a,b) if b != 0 => a/b
  }
  def app: String = "ABC"


  def safeMultiply: PartialFunction[(Int,Int),Int] = {
    case(x,y) if x != 0 => x * y
  }
  def combinedPartialFunction = safeDivide orElse safeMultiply

  if(safeDivide.isDefinedAt(3,0)) {
    3/0
  }

  println(s"Multiply: ${multiply(2,3)}")
  //println(s"Divide: ${divide(6,0)}")
  println(s"Safe Divide Check using: ${safeDivide.isDefinedAt(3,0)}")
  println(s"Safe Divide: ${safeDivide(6,2)}")
  println(s"Combining Partial Function: ${combinedPartialFunction(10,2)}")

}
