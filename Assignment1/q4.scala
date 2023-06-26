
object q4 extends App{
  def price(n: Int):Double=n*24.95
  def discount(n: Int):Double=price(n)*0.4
  def shippingcost(n:Int):Double={
    if(n>50){
      3+(n-50)*0.75
    }else{
      3
    }
  }
  def wprice(n:Int):Double=price(n)-discount(n)+shippingcost(n)
  println(wprice(60))

}
