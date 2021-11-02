package lectures.part1basics

object Functions2 extends App {

  def aFunction(a: String, b: Boolean): String = {
    a + " " + b
  }
  println(aFunction("hello", false)) // It concatenates different data types!!!

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  // println(aParameterlessFunction) // only works in Scala 2 - parameterless functions are invoked without parentheses

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("hola! ", 5))

  // WHEN YOU NEED LOOPS, USE RECURSION!!!

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  aFunctionWithSideEffects("Be quiet!!!")

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }
  println(aBigFunction(9))

  /*
  Exercises:
  1.  A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
  2.  Factorial function 1 * 2 * 3 * .. * n
  3.  A Fibonacci function
      f(1) = 1
      f(2) = 1
      f(n) = f(n - 1) + f(n - 2)
  4.  Tests if a number is prime.
 */

  def greetingFunction(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old."
  }
  println(greetingFunction("Charlie", 5))

  def factorial(n: Int): Int = {
    if (n == 0) 1
    else n * factorial(n-1)
  }

  println(factorial(5))
  println(factorial(0))

  def fibonacciOf(n: Int): Int = {
    if (n <= 2 ) 1 // Base case
    else fibonacciOf(n-1) + fibonacciOf(n-2)
  }

  println(fibonacciOf(5))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    isPrimeUntil(n / 2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(42))
  println(isPrime(37 * 17))
}
