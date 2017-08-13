package chapter_1

import java.util

object Chapter_1_3 {

  def main(args: Array[String]): Unit = {
    println("------------------")
    println(isExistUpperChar)
  }

  def isExistUpperChar(): Boolean = {
    val name = "glory"
    val nameHasUpperCase = name.exists(_.isUpper)
    //    print(nameHasUpperCase)

    val x = new util.HashMap[Int, String]();

    return nameHasUpperCase
  }
}
