package Assignment10

object q2 extends App {
  def countLetterOccurrences(words: List[String]): Int = {
    val wordLengths = words.map(word => word.length)
    val totalOccurrences = wordLengths.reduce((total, length) => total + length)
    totalOccurrences
  }
  val Wordlist = List("apple", "banana", "cherry", "date")
  println(s"Total count of letter occurrences: ${countLetterOccurrences(Wordlist)}")
}