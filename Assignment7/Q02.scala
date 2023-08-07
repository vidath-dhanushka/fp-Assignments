object Question02 extends App {
  def calculateSquare(inputList: List[Int]): List[Int] = {
    inputList.map(number => number * number)
  }
  println(calculateSquare(List(1, 2, 3, 4, 5)))
}
