/**
  * Created by subhajit.s on 8/25/2016.
  */

/**
  * Value Class having only one parameter and extends Anyval
  */
case class UserID(id: Int) extends AnyVal

case class UserName(name: String) extends AnyVal

/**
  * Constructing case class using value class as parameter type
  */
case class Employee1(id: UserID, name: UserName)

/**
  * Constructing case class using scala data type as parameter type
  */
case class Employee2(id: Int, name: String)


object ValueClass extends App {

  val e1 = Employee1(UserID(1), UserName("Subhajit"))

  /**
    * public Employee1 {
    * private final int id;
    * private final java.lang.String name;
     }
    */

  val e2 = Employee2(1, "Subhajit")
  /**
    * public Employee2 {
    * private final Integer id;
    * private final java.lang.String name;
     }
    */

}
