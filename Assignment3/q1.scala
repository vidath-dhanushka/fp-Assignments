package asignment3

object q1 extends App {
  var word: String = "animal"
  var len = word.length;
  def strRev(word:String,l:Int):Char={
    if (l != 0){
      print(word(l-1));
      strRev(word, l-1)
    }else{
      '\n'
    }
  }
  println(strRev(word,len))
}
