package chapter_3

import scala.io.Source

object Chapter_3_File {

  def main(args: Array[String]): Unit = {
//    readFile(Array("./chapter_3/Chapter_3.scala"))
    readFile(Array("/home/glory/IdeaProjects/test-scala/src/main/scala/chapter_3/Chapter_3.scala"))

  }

  def readFile(args : Array[String]): Unit = {
    if(args.length > 0) {
      for(line <- Source.fromFile(args(0)).getLines())
        println(line.length + " " + line)
    } else {
      Console.err.println("Please enter filename")
    }
  }
}