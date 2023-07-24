package assignment6

object q1 extends App {
  def Encrypt(word: String, shift: Int) {
    val encryptedChars = new StringBuilder
    word.foreach { char =>
      val encryptedChar = char match {
        case c if c.isUpper => ('A' + (c - 'A' + shift) % 26).toChar
        case c if c.isLower => ('a' + (c - 'a' + shift) % 26).toChar
        case c => c
      }
      encryptedChars.append(encryptedChar)
    }
    println(encryptedChars.toString)
  }

  Encrypt("HelLO", 1)
}
