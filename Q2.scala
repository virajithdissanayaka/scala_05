package Tutorial5
import scala.io.StdIn
object Q2 {
  def main(args:Array[String]): Unit = {
  println("Enter number: " )
    val n =StdIn.readInt()
    print("prime numbers up to "+ n +" : ")
    primeSeq(n -1)

  }

  def prime(n:Int, i:Int =2): Boolean = n match {
    case 1 => false
    case n if (n == i) => true
    case n if (n % i == 0) => false
    case _ => prime(n, i + 1)
  }
  def primeSeq(n: Int): Unit ={
    if(n==2){
      print(n)
    }
    else {
      primeSeq(n-1)
      if(prime(n))
        print("," + n)
    }
  }

}

