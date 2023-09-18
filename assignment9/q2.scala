package assignment9

object q2 extends App {
  class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator cannot be zero")
    val g = gcd(n.abs, d.abs)
    val numer: Int = n
    val denom: Int = d

    def gcd(a: Int, b: Int): Int = {
      if (b == 0)
        a
      else
        gcd(b, a % b)
    }

    def sub(num: Rational): String = {
      val a = denom * num.denom
      val b = numer * num.denom
      val c = denom * num.numer

      val g = gcd(b-c, a)

      val result = new Rational((b-c)/g,a/g)

      ((result.numer).toString+"/"+(result.denom).toString)
    }
  }

  val x = new Rational(3, 4)
  val y = new Rational(5, 8)
  val result = x.sub(y)
  println(s"Result = $result")
}