package fib_app

object FibonacciAppRecursive {
  def fibonacciSeriesRecursive(position : Int): List[Int] = position match {
	  case 0 => List(1)
	  case 1 => List(1, 1)
    case _ => 
      val series = fibonacciSeriesRecursive(position - 1)
      series :+ series.takeRight(2).sum
  } 
}
