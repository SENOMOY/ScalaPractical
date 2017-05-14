
/**
  * Created by subhajit.s on 13-05-2017.
  */
object GenericFunction extends App {

  def genericFunction[T](item: T) = {

    item match {
      case st: String => println(s"It's String $st")
      case int: Int => println(s"It's an Integer $int")
      case dbl: Double => println(s"I's a Double $dbl")
      case _ => println("Not the type we are expecting")
    }
  }

  genericFunction("String value")
  genericFunction(2)
  genericFunction(2.2)
  genericFunction(2f)

}
