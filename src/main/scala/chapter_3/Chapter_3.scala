package chapter_3

object Chapter_3 {

  def main(args: Array[String]): Unit = {
    //    forMethod

    testList

    listCons
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

  def testList(): Unit = {
    val list = List(1, 2, 3);

    val oneTwo = List(1, 2)
    val threeFor = List(3, 4)
    val oneTwoThreeFor = oneTwo ::: threeFor;
    println(oneTwoThreeFor)
  }

  def listCons(): Unit = {
    val twoThree = List(2, 3)
    // add param at the front of the list.
    // :: is the right param twoThree's operating method.
    // twoThree.::(1)
    val oneTwoThree = 1 :: twoThree
    println(oneTwoThree)
  }

}
