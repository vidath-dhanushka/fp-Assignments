package assignment9

object q1 extends App {
  class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator cannot be zero")

    private val g = gcd(n.abs, d.abs)
    val num: Int = n / g
    val deno: Int = d / g

    def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    def neg(): Rational = new Rational(-num, deno)

    override def toString: String = s"$num/$deno"
  }
  val x = new Rational(3, 8)
  val negX = x.neg()

  println(negX)
}

