/**
  * Created by senomoy on 25-08-2016.
  */
object ScalaRange extends App{
val range = 0 to 10
  println("Range variable: "+range)
  println(10 to 20)
  println(s"Range with increment gap: ${10 to 50 by 5}")
  println(s"Range with reverse increment gap: ${100 to 0 by -10}")
  println(s"Range variable with increment : ${range by 1}")
  println(s"Range with until and increment : ${1 until 5}")
  println(s"Range indices: ${(1 to 10).indices}")
  println(s"Range on Long Numbers: ${(1L to 10L)}")
  println(s"Range on Double Numbers: ${(0.0 to 5.0 by 0.5)}")
  println(s"Range on albhabets: ${'a' to 'z'}")
}
