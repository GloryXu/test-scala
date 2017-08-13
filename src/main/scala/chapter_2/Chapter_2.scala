package chapter_2

object Chapter_2 {

  def main(args: Array[String]): Unit = {
//    println(max(3,5))

//    greet
//
//    foreach

    forMethod
  }

  def max(x: Int, y: Int): Int = {
    if (x > y)
      return x
    else
      return y
  }

  def greet() = println("hello world!")

  def foreach(): Unit ={
    val str = "haha hello world! ni hao!"
    str.foreach(arg => print(arg))
    str.foreach(println)
    str.foreach(print)
  }

  def forMethod(): Unit ={
//    val args = "hahah hahh hahha"
    val args = new Array[String](3)
    args(0) = "haha"
    args(1) = "hello"
    args(2) = "world"
    for (arg <- args)
//      println(arg)
      print(arg)
  }

}
