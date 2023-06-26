
object q5 extends App{
  def easy(dis: Double):Double=dis*8
  def tempo(dis: Double):Double=dis*7
  def runtime(d1:Double, d2:Double, d3:Double):Double=easy(d1)+tempo(d2)+easy(d3)
  println(runtime(2,3,2))
}
