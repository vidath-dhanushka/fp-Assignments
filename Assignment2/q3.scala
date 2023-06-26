object q3 extends App {
  def basicSal(nh:Int):Int=nh*250
  def otSal(oh:Int):Int=oh*85
  def totSal(nh:Int,oh:Int):Int=basicSal(nh)+otSal(oh)
  def tax(tot:Int):Double=tot*0.12
  def netSal(nh:Int,oh:Int):Double=totSal(nh,oh)-tax(totSal(nh, oh))
  println(netSal(40,30))



}
