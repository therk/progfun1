
trait Expr {
  def eval: Int = this match {
    case Num(n) => n
    case Sum(e1, e2) => e1.eval + e2.eval
    case Prod(e1, e2) => e1.eval * e2.eval
  }
}

case class Num(n: Int) extends Expr {
  def value = n
}

case class Var(s: String) extends Expr {
  def name = s
}

case class Sum(left: Expr, right: Expr) extends Expr {
  def leftOp = left
  def rightOp = right
}

case class Prod(left: Expr, right: Expr) extends Expr {
  def leftOp = left
  def rightOp = right
}



def show(e: Expr): String = e match {
  case Num(n) => n.toString
  case Var(s) => s
  case Sum(e1, e2) => show(e1) + " + " + show(e2)
  case Prod(e1:Sum, e2) => "(" + show(e1) + ")" + " * " + show(e2)
  case Prod(e1, e2:Sum) => show(e1)+ " * " + "(" + show(e2)  + ")"
  case Prod(e1, e2) => show(e1) + " * " + show(e2)

}

val n = Num(5)
n.eval
val e = Sum(n, n)

show(n)
show(Sum(Prod(Num(2), Var("x")), Var("y")))

show(Prod(Sum(Num(2), Var("x")), Var("y")))