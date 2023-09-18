package assignment9

object q3 extends App{
  class Account(value:Int){
    var acc_balance: Int = value

    def deposit(amount: Int) = {
      acc_balance = acc_balance + amount
      println(acc_balance)
    }
    def withdraw(amount: Int) = {
      acc_balance = acc_balance - amount
      println(acc_balance)
    }
    def Transfer(acc: Account, amount: Int) = {
      this.withdraw(amount)
      acc.deposit(amount)
      println(acc_balance)
    }
  }
  var member1 = new Account(40000)
  var member2 = new Account(75000)
  member2.withdraw(20000)
  member1.deposit(20000)
  member2.Transfer(member1,5000)
}
