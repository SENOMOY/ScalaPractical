import scala.util.Try

/**
  * Created by subhajit.s on 1/4/2017.
  */
object EitherRightLeft extends App {

  def multiply ={
    val multiplier1 = Console.readLine("Enter the 1st multiplier: \n").toInt
    val multiplier2 = Console.readLine("Enter the 2nd multiplier: \n").toInt
    val result: Either[Int,String] = if(multiplier1!=0 && multiplier2!=0) Left(multiplier1 * multiplier2) else Right("Zero")

    result match{
      case Right(r) => println(s"The multiplied result is $r")
      case Left(l) => println(s"The multiplied result is $l")
    }
  }
  multiply
}
