import scala.collection.mutable.ArrayBuffer


object ScalaCollections extends App{
  val fruit: List[String] = List("apples", "oranges", "pears")
  var s: Set[Int] = Set(1,3,5,7)
  val colors: Map[String,String]  = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")
  val t3 = Tuple3(1, "hello", Console)
  val arr: Array[Int] = Array(1,2,3,4,5)
  val seq: Seq[Double] = Seq(1.1,2.2,3.3)
  val arrBuff: ArrayBuffer[Char] = ArrayBuffer('a','b','c','d','e')
  val map1 = Map("one"->1,"two"->2,"three"->3)
  val cmap1= map1 ++ Map("one" -> 11)
  val map2 = map1 ++ Map("four"->4)
  println(map1)
  println(cmap1)
  fruit.forall(_.length==6)

 // seq.mkString(",").foreach(print)
}

