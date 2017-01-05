/**
  * Created by subhajit.s on 10/3/2016.
  */
object Fibonacci extends App {

  def fibonacci(i: Int) = {
    def fib_init(i:Int,a: Int,b: Int): Int = i match {
      case 0 => a
      case _ => fib_init(i-1,b,a+b)
    }
    fib_init(i,0,1)
  }
println(fibonacci(7))
}
