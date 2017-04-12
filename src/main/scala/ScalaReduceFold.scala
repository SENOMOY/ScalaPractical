/**
  * Created by subhajit.s on 8/25/2016.
  */
object ScalaReduceFold extends App {

  val arr = Array(1, 2, 3, 4, 5)
  println("arr.reduce(_ + _) "+arr.reduce(_ + _))
  println("********************")
  println("arr.reduceLeft(_ + _) "+arr.reduceLeft(_ + _))
  println("********************")
  println("arr.reduceRight(_ + _) "+arr.reduceRight(_ + _))
  println("********************")
  arr.reduce((a,b) => {print(a + "," + b); a*b})
  println("********************")
  arr.reduceLeft((a,b) => {print(a + "," + b); a*b})
  println("********************")
  println(arr.fold(5)(_+_))
  println("********************")
  println(arr.foldLeft("")(_+_+","))

}
