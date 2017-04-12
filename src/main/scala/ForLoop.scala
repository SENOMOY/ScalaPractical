
object ForLoop extends App{

  println("forloop example 1")
  for (i<- 1 to 5)
    println(i)

  println("forloop example 2")
  val in = "Hello World"
  var sum = 0
  for (i<- 0 until in.length) sum +=i
  println(sum)

  println("forloop example 3")
  for(i<- 1 to 3; j<-1 to 3) println(10*i + j)

  println("forloop example 4")
  for(i<- 1 to 3; j<-1 to 3 if i ==j) println(10*i + j)

  println("forloop example 5")
  for(i<- 1 to 3; x = 4-i; j<- x to 3) println(10*i + j)

  println("forloop example 6")
  val x = for(i<- 1 to 20) yield i*2.5
  for (i<- x) println(i)
}