package chapter_3

import scala.collection.mutable.Map

object Chapter_3_Tuple {

  def main(args: Array[String]): Unit = {
    tupleInit

    set

    mutableMap
  }

  def tupleInit(): Unit ={
    val pair = (99, "Luftallons")
    println(pair._1)
    println(pair._2)
  }

  def set(): Unit = {
    var jetSet = Set("jack", "tony")
    jetSet += "andy"
    println(jetSet.contains("nihao"))
  }

  def mutableMap(): Unit ={
    val treasureMap = Map[Int, String]()

    // scala的任何对象都能调用 -> 方法（隐式转换）
    treasureMap += (1 -> "test1")
    treasureMap += (2 -> "test2")
    treasureMap += (3 -> "test3")

    println(treasureMap(2))
  }

  def printArgs(args : Array[String]): Unit ={
    var i = 0
    while(i<args.length){
      println(args(i))
      i += 1
    }
  }

  def printArgs1(args : Array[String]): Unit ={
    for(arg <- args){
      println(arg)
    }
  }

  def printArgs2(args : Array[String]): Unit ={
    args.foreach(println)
  }

}
