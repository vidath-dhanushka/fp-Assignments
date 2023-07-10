package assignment5

object q1 extends App {
  def gcd(num1: Int, num2: Int): Int = num2 match {
    case 0 => num1
    case x if x > num1 => gcd(x, num1)
    case _ => gcd(num2, num1% num2)
  }
  def prime(p: Int, n: Int = 2): Boolean = n match {
    case x if (x == p) => true
    case x if gcd(p, x) > 1 => false
    case x => prime(p, x + 1)
  }
  println(prime(100));
}
