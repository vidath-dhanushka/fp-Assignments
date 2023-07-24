package assignment6

object q1 extends App {
  def Encrypt(word: String, shift: Int){
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

  def Decrypt(word: String, shift: Int) {
    val decryptedChars = new StringBuilder
    word.foreach { char =>
      val decryptedChar = char match {
        case c if c.isUpper => ('A' + (c - 'A' - shift) % 26).toChar
        case c if c.isLower => ('a' + (c - 'a' - shift) % 26).toChar
        case c => c
      }
      decryptedChars.append(decryptedChar)
    }
    println(decryptedChars.toString)
  }

  def cipher(word:String, shift:Int, Func: (String, Int) => Unit): Unit = {
    Func(word,shift);
  }
  cipher("Hello",1,Encrypt)
  cipher("IfmMP", 1,Decrypt)
}
