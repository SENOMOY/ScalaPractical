/**
  * Created by senomoy on 03-09-2016.
  */
trait Animal {
def eat(foodType: String): Unit = {
  println("Animals eat food")
}
}

object Cat extends  Animal {
  override def eat(foodType: String): Unit = {
    println("Cat eat fish")
  }

}

class Dog extends  Animal {
  override def eat(foodType: String): Unit = {
    println("Dog eat meat")
  }
}



