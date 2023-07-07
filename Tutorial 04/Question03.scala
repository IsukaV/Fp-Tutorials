package assignment4

object q3 extends App {
  def toUpper(word:String):String = {
    return word.toUpperCase
  }

  def toLower(word: String): String = {
    return word.toLowerCase
  }
  def formatNames(name:String,Func: String => String): String = {
    val formattedName = Func(name)
    formattedName
  }

  println("Enter a name:")
  val input = scala.io.StdIn.readLine()

  println("Enter the formatting function (toUpper or toLower):")
  val formattingFunction = scala.io.StdIn.readLine()

  val result = formattingFunction match {
    case "toUpper" => formatNames(input, toUpper)
    case "toLower" => formatNames(input, toLower)
    case _ => "Invalid formatting function."
  }
  println(result)
}