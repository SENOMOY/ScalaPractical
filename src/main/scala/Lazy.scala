/**
  * Created by subhajit.s on 8/26/2016.
  */
object Lazy extends App{

  val nonLazyVal = { println ("Non Lazy declaration") ; 10 }
  println ("Non Lazy println")
  println (nonLazyVal)

  println("*******************************")

  lazy val lazyVal = { println ("Lazy declaration") ;  11 }
  println ("Lazy println")
  println (lazyVal)
}
