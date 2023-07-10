package Tutorial5

object Q1 {

  def prime(n: Int, i: Int = 2): Boolean = n match {

    case 1 => false
    case n if (n == i) => true
    case n if (n % i == 0) => false
    case _ => prime(n, i + 1)
  }
  def main(args:Array[String]): Unit = {

    println(prime(5))
    println(prime(8))

  }
}
