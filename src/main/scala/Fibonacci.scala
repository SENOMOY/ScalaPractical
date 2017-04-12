/**
  * Created by subhajit.s on 10/3/2016.
  */
object Fibonacci extends App {

  // using recursion
  def fib1(n: Int): Int = n match {
    case 0 | 1 => n
    case _ => fib1(n - 1) + fib1(n - 2)
  }
  println("Using recursion: "+fib1(7))

  // using loop
  def fib2( n : Int ) : Int = {
    var a = 0
    var b = 1
    var i = 0

    while( i < n ) {
      val c = a + b
      a = b
      b = c
      i = i + 1
    }
    return a
  }
  println("Using Loop: "+fib2(7))

  // using tail recursion
  def fibonacci(i: Int) = {
    def fib_init(i: Int, a: Int, b: Int): Int = i match {
      case 0 => a
      case _ => fib_init(i - 1, b, a + b)
    }
    fib_init(i, 0, 1)
  }
  println("Using tail recursion: "+fibonacci(7))

}
