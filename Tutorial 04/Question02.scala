object q2 extends App {
  def patternMatching(input:Int): String = input match {
    case x if x <= 0 => "Negative/Zero"
    case x if x % 2 == 0 => "Even number"
    case _ => "Odd number"
  }

  println(patternMatching(7));
}