/**
  * Created by subhajit.s on 1/4/2017.
  */
object Varargs extends App{

  val abc = List("one","two","three")
  val mp1= abc.map(x=> (x,x)).toMap
  // using varargs
  val mp2= Map(abc.map(x=> (x,x)):_*)

  println(mp1)
  println(mp2)

}
