/**
  * Created by subhajit.s on 8/26/2016.
  */
object ScalaOptions extends App {

  val capitals: Map[String,String] = Map("India" -> "Delhi", "USA" -> "DC","UK" -> "London")

  def show(input: Option[String]) = input match {
    case Some(str) => str
    case None => "Not Defined"
  }

  println("capitals.get(\"India\").get: "+capitals.get("ABC"))
  println("capitals.get(\"Germany\").get: "+capitals.get("Germany"))
  println("show(capitals.get(\"India\")): "+show(capitals.get("India")))
  println("show(capitals.get(\"France\")): "+show(capitals.get("France")))
  println("capitals.getOrElse(\"Spain\",\"Madrid\"): "+capitals.getOrElse("Spain","Madrid"))

}
