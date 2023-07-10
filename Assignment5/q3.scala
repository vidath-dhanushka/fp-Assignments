package assignment5

object q3 extends App {
  def sum(n:Int):Int = {
    if(n == 1){
      return 1
    }else{
      return n+sum(n-1)
    }
  }
  println(sum(5))
}
