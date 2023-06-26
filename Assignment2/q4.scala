package assignment2

object q4 extends App {
  def attendents(price:Int):Int=120+(15-price)/5*20
  def income(price: Int): Int = attendents(price) * price
  def cost(price:Int):Int=500+attendents(price)*3
  def profit(price: Int): Int =income(price) - cost(price)
  println(profit(15),profit(20),profit(10));
}
