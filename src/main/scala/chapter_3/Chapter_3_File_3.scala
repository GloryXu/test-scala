package chapter_3

import scala.io.Source

object Chapter_3_File_3 {

  /**
    * format print
    * @param args
    */
  def main(args: Array[String]): Unit = {
    if (args.length > 0) {
      val lines = Source.fromFile(args(0)).getLines().toList

      /*val longestLine = lines.reduceLeft(
        (a, b) => if(a.length > b.length) a else b
      )*/

      var maxLength = 0
      for (line <- lines)
        maxLength = maxLength.max(widthOfLength(line))

      for (line <- lines) {
        val numSpace = maxLength - widthOfLength(line)
        val padding = " " * numSpace
        println(padding + line.length + "|" + line)
      }

    } else {
      Console.err.println("Please enter filename")
    }
  }

  def widthOfLength(s: String) = s.length.toString.length

}