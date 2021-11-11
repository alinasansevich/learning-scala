package lectures.part1basics

object Expressions2 extends App {

  val z = 2 + 2 // this is an expresion, 2 + 2 evaluates to the value 4
  println(z)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(z == 1)

  println(!(z == 2 ))

  var aVariable = 2

  aVariable += 3
  println(aVariable)
  println("----------------------------")

  // Instructions (DO) vs Expressions (VALUE)
  // IF expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3 // IF expression
  println(aConditionedValue)
  println(if (aCondition) 5 else 3) // IF expression
  println("----------------------------")

  var j = 0
  while (j < 10) {
    println(j)
    j += 1
  } // AVOID LOOPING LIKE THE PLAGUE! THAT'S IMPERATIVE PROGRAMMING, NOT SCALA
  // EVERYTHING in Scala is an Expression, NOT an Instruction

  val aWeirdValue = (aVariable = 3) // Unit === void --> this is it's data type, "Unit", whatever THAT is!
  println(aWeirdValue) // The Unit type in Scala is used as a return statement for a function when no value is to be returned.
  // Unit type can be e compared to void data type of other programming languages like Java.
  // It is a subclass of anytype trait and is used when nothing means to return by the function.

  val aCodeBlock = {
    val x = 1
    val y = x + 1

    if (y > 1) "hello" else "how low"
  }

  println(aCodeBlock)

  val a = 10
  val aIsEven = a % 2 == 0
  val aIsOdd = !aIsEven
}
