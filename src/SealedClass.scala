/**
  * Created by subhajit.s on 8/26/2016.
  */

sealed trait SealedTrait { val b =1 }

object SealedClass extends App with SealedTrait {
  println("SubClass of SealedClass "+b)
}
