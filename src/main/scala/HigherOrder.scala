/**
  * Created by senomoy on 03-12-2016.
  */
object HigherOrder extends App {

  def highFunc(fn: Any => String, num: Any) = fn(num)

  def func1[A](a: A) = "<" + a + ">"

  def func2[B](b: B) = "{" + b + "}"

  def func3[C](c: C) = "[" + c + "]"

  println(highFunc(func1, 10))
  println(highFunc(func2, 3.14))
  println(highFunc(func3, "function 3"))
}
