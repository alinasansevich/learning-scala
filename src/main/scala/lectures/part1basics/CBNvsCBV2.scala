package lectures.part1basics

object CBNvsCBV2 extends App {

  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = {  // the => arrow tells the system to evaluate the function call EACH time
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(System.nanoTime()) // System.nanoTime() is called once, and the returned value is printed twice
  calledByName(System.nanoTime())  // System.nanoTime() is called twice, hence 2 different results

  /* Results:
by value: 2651176710624 --> same
by value: 2651176710624 --> same
by name: 2651363940555 --> called twice
by name: 2651365454069 --> called twice
34
  */


  // ----------------------------------------------------------
  /*
  def calledByValue(x: Long): Unit = {
    println("by value: " + 1257387745764245L)
    println("by value: " + 1257387745764245L)
  }

  def calledByName(x: => Long): Unit = {  // the => arrow tells the system to evaluate the function call EACH time
    println("by name: " + System.nanoTime())
    println("by name: " + System.nanoTime())
  }

  calledByValue(1257387745764245L)
  calledByName(System.nanoTime())
//--------------------------------------------------
  */
  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x) // y: => Int --> this is evaluated ONLY when it is necessary (and in this case, since it is NOT needed, it is not evaluated, ever)

  //  printFirst(infinite(), 34) // stack overflow
  printFirst(34, infinite()) // infinite() IS NOT EVALUATED, therefore it prints 34

}
