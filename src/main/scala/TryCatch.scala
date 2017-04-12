/**
  * Created by senomoy on 28-08-2016.
  */
object TryCatch extends App {

  try {
    val a = 1
    val b = 2
    val c = 0
    b * a * c
    b/0
  }
  catch {
    case e: ArithmeticException => println("ArithmeticException")
    case e: Exception => println("Unknown Exception")
  }
  finally {
    println("Finally...")
  }

  /*try{
    val result = 100 / 0
  } catch {
    case e: Exception => println("Exception caught: " + e)
  }*/


}
