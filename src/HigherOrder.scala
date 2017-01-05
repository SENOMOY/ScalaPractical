/**
  * Created by senomoy on 03-12-2016.
  */
object HigherOrder extends App{

  def highFunc(fn: Int => String,num: Int) = fn(num)

  def func1[A](a: A) = "<" + a + ">"

  def func2[B](b: B) = "{" + b + "}"

  println(highFunc(func2,10))
}
