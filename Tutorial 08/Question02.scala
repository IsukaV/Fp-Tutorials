object Question02 extends App {
  printf("Enter Number : ")
  val number = scala.io.StdIn.readInt()

  val checkNumber: Int => String = {
    case n if n < 0 => "Negative"
    case n if n == 0 => "Zero"
    case n if n % 2 == 0 => "Even"
    case _ => "Odd"
  }

  println(checkNumber(number))
}
