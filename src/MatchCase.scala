/**
  * Created by senomoy on 03-12-2016.
  */
object MatchCase extends App{

  val numberRange = 1 to 10

  val OddNumbers = (
    for(i <- numberRange) yield {
    (i%2) match {
      case 0 => None
      case _ => Some(i)
    }
  }
    ).toList.flatten
  println(OddNumbers)
}
