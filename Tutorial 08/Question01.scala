object Question01 extends App {
  printf("Enter Deposit Amount : ")
  val amount = scala.io.StdIn.readInt()

  val calculateInterest: Double => Double ={
    case a if a <= 20000 => a * 0.02
    case a if a <= 200000 => a * 0.04
    case a if a <= 2000000 => a * 0.035
    case a if a > 2000000 => a * 0.065
  }

  println(f"Interest = ${calculateInterest(amount)}")
}
