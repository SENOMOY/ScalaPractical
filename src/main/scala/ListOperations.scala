/**
  * Created by subhajit.s on 14-05-2017.
  */
object ListOperations extends App {

  println("*********** General List declaration ***********")

  // List of Strings
  val fruit1: List[String] = List("apples", "oranges", "pears")
  // List of Integers
  val nums1: List[Int] = List(1, 2, 3, 4)
  // Empty List.
  val empty1: List[Nothing] = List()
  // Two dimensional list
  val dim1: List[List[Int]] =
    List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1)
    )
  println("Fruits: "+fruit1)
  println("Numbers: "+nums1)
  println("Empty list: "+empty1)
  println("2d List: "+dim1)

  println("*********** Appending elements with :: ***********")

  // List of Strings
  val fruit2 = "apples" :: ("oranges" :: ("pears" :: Nil))
  // List of Integers
  val nums2 = 1 :: (2 :: (3 :: (4 :: Nil)))
  // Empty List.
  val empty2 = Nil
  // Two dimensional list
  val dim2 = (1 :: (0 :: (0 :: Nil))) ::
    (0 :: (1 :: (0 :: Nil))) ::
    (0 :: (0 :: (1 :: Nil))) :: Nil

  println("Head of fruit : " + fruit2.head)
  println("Tail of fruit : " + fruit2.tail)
  println("Check if List(empty) is empty : " + empty2.isEmpty)
  println("Check if fruit is empty : " + fruit2.isEmpty)
  println("Check if nums is empty : " + nums2.isEmpty)

  println("*********** Using ::: and .::: operator ***********")

  // Use two or more lists with ::: operator
  var fruit = fruit1 ::: fruit2
  println("fruit1 ::: fruit2 : " + fruit)
  // Use two lists with Set.:::() method
  val fruits1 = fruit1.:::(fruit2)
  println("fruit1.:::(fruit2) : " + fruits1)
  // Pass two or more lists as arguments
  val fruits2 = List.concat(fruit1, fruit2)
  println("List.concat(fruit1, fruit2) : " + fruits2)
  // Repeats apples three times.
  val fruits3 = List.fill(3)("apples")
  println("fruit : " + fruits3)
  // Repeats 2, 10 times.
  val num3 = List.fill(10)(2)
  println("num : " + num3)

  println("*********** Using tabulate function ***********")

  // Creates 5 elements using the given function.
  val squares = List.tabulate(6)(n => n * n)
  println( "squares : " + squares  )
  val mul = List.tabulate( 4,5 )( _ * _ )
  println( "mul : " + mul  )

  println("*********** Using range function ***********")
  val lstr1 = List.range(1,10)
  val lstr2 = List.range(0,10,2)
  println(s"List range example 1: $lstr1")
  println(s"List range example 2: $lstr2")

}
