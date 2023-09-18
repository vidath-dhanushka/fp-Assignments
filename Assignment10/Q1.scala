package Assignment10

object Q1 extends App {
  def calculateAverage(temp: List[Double]) : Double = {
    val tempF = temp.map(celsius => (celsius * 9/5) + 32)
    val sumF = tempF.reduce((a, b) => a + b)
    val avg =  sumF/temp.length
    avg
  }
  val temp = List(0.0, 10.0, 20.0, 30.0)
  println(s"Average Fahrenheit temperature: ${calculateAverage(temp)}")
}