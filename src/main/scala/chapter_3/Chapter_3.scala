package chapter_3

object Chapter_3 {

  def main(args: Array[String]): Unit = {
    forMethod
  }

  def forMethod(): Unit = {
    val greetings = new Array[String](3)
//    val greetingSimple = Array("Jack", "Tom", "Andy")
//    val greetingCreate = Array.apply("Hello", ",", "world!")
//    val greetings : Array[String] = new Array[String](3)
//    greetings.update(0,"hello")
    greetings(0) = "hello"
    greetings(1) = ","
    greetings(2) = "world"

//     java.lang.ArrayIndexOutOfBoundsException
//    (0).to(2)
    for (i <- 0 to 2)
//      print(greetings.apply(i))
      print(greetings(i))
  }

}
