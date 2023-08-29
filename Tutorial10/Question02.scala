object Question01 extends App {

  def countLetterOccurrences(words: List[String]): Int = {
    val letterCounts = words.map(_.length)
    val totalLetterCount = letterCounts.reduce(_ + _)
    totalLetterCount
  }

  val inputWords = List("apple", "banana", "cherry", "date")
  val totalLetterCount = countLetterOccurrences(inputWords)
  println(s"Total count of letter occurrences: $totalLetterCount")
}