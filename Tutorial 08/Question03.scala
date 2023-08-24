object Question03 extends App {
  val toUpper: String => String = (str: String) => str.toUpperCase()

  val toLower: String => String = (str: String) => str.toLowerCase()

  val formatNames: (String, String => String, Int) => String = (name: String, formatFunc: String => String, index: Int) => {
    var word = ""
    word += name.substring(0, index)
    word += formatFunc(name).charAt(index)
    word += name.substring(index + 1)
    word
  }

  println(toUpper("Benny"))
  println(formatNames("Niroshan", toUpper, 4))
  println(toLower("Saman"))
  println(formatNames("Kumara", toLower, 0))
}