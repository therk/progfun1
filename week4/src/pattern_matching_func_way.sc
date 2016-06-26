
trait Expr

case class Num(n: Int) extends Expr {
  def value = n
}

case class Sum(left: Expr, right: Expr) extends Expr {
  def leftOp = left
  def rightOp = right
}


def eval(e: Expr): Int = e match {
  case Num(n) => n
  case Sum(e1, e2) => eval(e1) + eval(e2)
}

val n = new Num(5)
eval(Sum(n,n))
