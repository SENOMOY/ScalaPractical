/**
  * Created by senomoy on 03-09-2016.
  */
trait Animal {
  def eat(foodType: String): Unit
}

object Cat extends Animal {
  override def eat(foodType: String): Unit = {
    println(s"Cat eat $foodType")
  }

}

class Dog extends Animal {
  override def eat(foodType: String): Unit = {
    println(s"Dog eat $foodType")
  }
}

object MainApp extends App {
  Cat.eat("fish")
  (new Dog).eat("meat")
}



