/**
  * Created by senomoy on 28-08-2016.
  */
object StringOperation extends App {

  //myPrint("Scala",4)
  //myPrint(inp = 2,input = "Spark")
  //def myPrint(input: String,inp: Int)  =   println(input.concat(" Add me ") * inp)

  val arrStr = Array("empid", "salary", "doj")
  val tbl = "employee"
  val mStr = Map("empid" -> 12345, "doj" -> 2015)

  val str1 = "c"

  var str3 = ""


  val str2 = "Today,we ,are,going,to,start,Spark,Spark,is,the,best,data,processing,tool"

  def findStr(str1: String, str2: String): Boolean = {
    if (str1.head > str2.head)
      false
    else
      true
  }

  val words = "the quick brown fox jumped over the lazy bog".split(' ')

  words.sortBy(x => (x.charAt(0), x.charAt(1))).foreach(println)
  println(str2.length)
  words.filter(_.length == 3).foreach(println)

  val found = words.find(_.equals("abc")) match {
    case Some(str) => if (str.equals("the")) str else "the not found"
    case None => "Not found"
    case _ => ""
  }
  println(found)
  println("mkString" + arrStr.mkString(","))
  println(s"select ${arrStr.mkString(",")} from $tbl where ${mStr.map(k => s"""${k._1}=${k._2}""").mkString(" AND ")}")
  println(str2.trim)
  println(str2.contains("C"))
  str2.split("").foreach(println)
  println(str1.charAt(0))
  println(str3 == "XYZ".toLowerCase)
  println(str2.indexOf("C"))
  println(str2.filter(s => !s.equals('A')))
  println(str2.replaceAll("ABC", "KLM"))
  println(str3.isEmpty)


}

