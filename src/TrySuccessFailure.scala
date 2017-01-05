import scala.util.{Failure, Success, Try}

/**
  * Created by subhajit.s on 1/4/2017.
  */
object TrySuccessFailure extends App {
  def divide = {
    val dividend = Try(Console.readLine("Enter an Int that you would like to divide: \n").toInt)
    val divisor = Try(Console.readLine("Enter an Int that you would like to divided by: \n").toInt)
    val result = dividend.flatMap(x => divisor.map(y => x / y))

    result match {
      case Success(s) => println(s"Division yielded valid result: $s from dividend ${dividend.get} and divisor ${divisor.get}"); Success(s)
      case Failure(f) => println(s"Division yielded invalid result having exception message: ${f.getMessage}"); Failure(f)
    }
  }
  println(divide)
}
