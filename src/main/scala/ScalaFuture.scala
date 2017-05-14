import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
import scala.util.Random

/**
  * Created by subhajit.s on 14-05-2017.
  */
object ScalaFuture extends App {

  // not too exciting, the result will always be 42. but more importantly, when?
  println("1 - starting calculation ...")
  val f = Future {
    val sleepTime = Random.nextInt(400)
    println(s"Sleep Time: $sleepTime")
    sleep(sleepTime)
    22
  }

  println("2- before onComplete")
  f.onComplete {
    case Success(value) => println(s"Got the callback and the value is: $value")
    case Failure(e) => e.printStackTrace
  }

  // do the rest of your work
  println("A ...");
  sleep(100)
  println("B ...");
  sleep(100)
  println("C ...");
  sleep(100)
  println("D ...");
  sleep(100)
  println("E ...");
  sleep(100)
  println("F ...");
  sleep(100)

  // keep the jvm alive (may be needed depending on how you run the example)
  // sleep(2000)

  def sleep(duration: Long) {
    Thread.sleep(duration)
  }


}
