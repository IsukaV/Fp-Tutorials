package assignment4

object q1 extends App {
  def interest(amount:Double): Double = {
    if (amount <= 20000.00){
      return ((amount / 100) * 2);
    }else if (amount <= 200000.00){
      return ((amount / 100) * 4);
    }else if (amount<=2000000.00){
      return ((amount / 100) * 3.5);
    }else{
      return ((amount / 100) * 6.5);
    }
  }
  println(interest(15563))
}