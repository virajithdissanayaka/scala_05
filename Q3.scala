package Tutorial5

object Q3 {
  def sum(n: Int): Int = {
    if (n <= 1)
      return n
    else
      return n + sum(n - 1)
  }

  def main(args:Array[String]): Unit = {
    println(sum(5))
  }

}
