package chapter_3

import scala.io.Source

object Chapter_3_File_2 {

  def main(args: Array[String]): Unit = {
    if(args.length > 0) {
      for(line <- Source.fromFile(args(0)).getLines())
        println(line.length + " " + line)
    } else {
      Console.err.println("Please enter filename")
    }
  }

}