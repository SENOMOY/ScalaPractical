/**
  * Created by subhajit.s on 8/26/2016.
  */

object ScalaImplicit extends App{

  implicit class ScalaImplicit (s: String){
    def increment = s.map(c => (c + 1).toChar)
  }
  println("HAL".increment)

  def addPrefix(s: String)(implicit p: String) = p + s

  implicit val myImplicitPrefixer = "***"

  println(addPrefix("abc"))

}


