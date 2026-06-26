package fib_app

object FibonacciApp {
  def fibonacciSeries(targetPosition : Int): List[Int] = targetPosition match {
    case 0 => List(1)
    case 1 => List(1, 1)
    case _ =>
      (2 to targetPosition).foldLeft(List(1, 1)) { (series, _) =>
        series :+ (series.takeRight(2).sum)
    }
  } 
}
