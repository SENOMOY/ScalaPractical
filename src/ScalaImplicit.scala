/**
  * Created by subhajit.s on 8/26/2016.
  */

object ScalaImplicit extends App{

  implicit class ScalaImplicit (s: String){
    print(s"$s to ")
    def increment = s.map(c => (c + 1).toChar)
  }
  println("HAL".increment)
  println("TCS")

  def addPrefix(s: String)(implicit p: String) = p + s

  def addPrefix(s: Int)(implicit p: Int) = p + s

  implicit val myImplicitPrefixerString = "***"

  implicit val myImplicitPrefixerInteger = 7

  println(addPrefix("abc"))
  println(addPrefix(7))

}


