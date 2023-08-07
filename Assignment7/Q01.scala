object Question01 extends App {
    def filterEvenNumbers(numbers: List[Int]): List[Int] = {
      numbers.filter(num => num % 2 == 0)
    }
    println(filterEvenNumbers(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
}
