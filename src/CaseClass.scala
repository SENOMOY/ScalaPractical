/**
  * Created by subhajit.s on 8/26/2016.
  */
case class CaseClass(name: String,age: Int)
class NonCaseClass(name: String,age: Int)

object CaseClass extends App {

  val student1 = CaseClass("Senomoy",28)
  val student2 = student1.copy(name="Sencha")

  println(CaseClass("a",2)==CaseClass("a",2))
  println(new NonCaseClass("a",2)==new NonCaseClass("a",2))

  println(student1)
  println(student2)
}
