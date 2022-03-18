package recfun

object RecFun extends RecFunInterface:

  def main(args: Array[String]): Unit =
    println("Pascal's Triangle")
    for row <- 0 to 10 do
      for col <- 0 to row do
        print(s"${pascal(col, row)} ")
      println()

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    if (c== 0 || c == r) 1
    else pascal(c - 1 , r -1) + pascal(c, r - 1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balanceWithCount(chars: List[Char],openPar: Int): Boolean = {
      if (chars.isEmpty) openPar == 0
      else {
        val num =
          if (chars.head == '(') openPar + 1
          else if (chars.head == ')') openPar -1
          else openPar
        if(num >= 0) balanceWithCount(chars.tail, num)
        else false
      }
    }
    balanceWithCount(chars,0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int =
    if (money < 0 || coins.isEmpty) 0
    else if (money == 0) 1
    else countChange(money - coins.head, coins) + countChange(money, coins.tail)
