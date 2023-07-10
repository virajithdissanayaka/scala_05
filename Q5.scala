package Tutorial5
import scala.io.StdIn
object Q5 {

  def sumEven(n: Int): Int = {
    if (n <= 0)
      return 0
    else if (n % 2 == 1)
      return sumEven(n - 1)
    else
      return n + sumEven(n - 2)
  }

  def main(args:Array[String]): Unit = {
  println ("Enter number: ")
    val n= StdIn.readInt()
println("Addition of even number: " +sumEven(n))
  }

}
