/**
  * Created by subhajit.s on 10/3/2016.
  */
object Factorial extends App{
  def factorial(i: Int) = {
    def fact(i:Int,init: Int):Long = {
      if(i<=0) init
      else fact(i-1,i*init)
    }
    fact(i,1)
  }
  println(factorial(4))
}
