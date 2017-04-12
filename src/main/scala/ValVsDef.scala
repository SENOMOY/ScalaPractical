import java.lang.System

/**
  * Created by subhajit.s on 9/22/2016.
  */
object ValVsDef {
  val value = { println("val declaration"); System.nanoTime }
  def func =  { println("def declaration"); System.nanoTime }

  def main(args: Array[String]) {
    println(value)
    println(value)
    println(func)
    println(func)
  }
}
