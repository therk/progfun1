package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r)
      return 1
    else if (c < 0 || c > r)
      return 0
    else
      return pascal(c-1, r-1) + pascal(c, r-1)
  }
  
  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def balanceCounter(count: Int, remainingChars: List[Char]):Boolean = {
      if(remainingChars.length == 0) {
        return count == 0
      }
      val head = remainingChars.head
      val c = if (head == '(') count + 1 else if (head == ')') count - 1 else count
      // if c there are more closing ')' that means the count will be less then 0, so unbalanced
      if (c < 0)
        return false
      else
        balanceCounter(c, remainingChars.tail)
    }

    balanceCounter(0, chars)
  }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {

    1
    }
  }
