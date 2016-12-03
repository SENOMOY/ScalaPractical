/**
  * Created by subhajit.s on 8/26/2016.
  */
case class CaseClass(name: String)
class NonCaseClass(name: String)

object CaseClass extends App {

  println(CaseClass("a")==CaseClass("a"))
  println(new NonCaseClass("a")==new NonCaseClass("a"))

}
