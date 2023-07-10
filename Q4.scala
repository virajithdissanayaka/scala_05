package Tutorial5
import scala.io.StdIn

object Q4 {

  def isEven(num : Int) : String = num match{
    case num if (num==0) => "Even number"
    case num if (num==1) => "Odd number"
    case num if (num<0) => isEven(num+2)
    case _=> isEven(num-2)
  }

  def main(args:Array[String]): Unit = {
  println ("Enter  number: ")
    val num = StdIn.readInt()
    print("Entered number : " +isEven(num))

  }

}
