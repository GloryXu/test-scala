package com.redsun

object HelloWord {
  def sayHello(x: String): Unit = {
    println("hello," + x);
  }

  def main(args: Array[String]) {
    sayHello("Glory!!!")
    println("Glory helloworld")
  }

}
