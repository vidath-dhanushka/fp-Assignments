package assignment5

object q5 extends App {
  def isEven(n: Int): Boolean = n match {
    case 0 => true
    case _ => isOdd(n - 1)
  }

  def isOdd(n: Int): Boolean = !(isEven(n))
  def evenSum(n:Int):Int = {
    var sum:Int = 0
    var i = 0
    while(i<n){
      if (isEven(i)) {
        sum = sum + i
      } else {
        isEven(n - 1)
      }
      i = i+1
    }
    return sum
  }
  println(evenSum(10))
}
