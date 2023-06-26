package asignment3

object q2 extends App {
  def checkStr(stringLi: List[String]): List[String] = {
    var strFiltered = List.empty[String]
    for (str <- stringLi) {
      if (str.length > 5) {
        strFiltered = strFiltered :+ str
      }
    }
    strFiltered
  }
  val stringList = List("Hello","World","Welcome","Programming","attendance")
  println(checkStr(stringList))
}
