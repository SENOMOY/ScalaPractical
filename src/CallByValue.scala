/**
  * Created by subhajit.s on 8/26/2016.
  */
object CallByValue extends App{
  def time() = {
    println("Getting time in nano seconds")
    System.nanoTime
  }
  def delayed( t: Long ) = {
    println("Call 1: " + t)
    println("Call 2: " + t)
  }
  delayed(time())
}
