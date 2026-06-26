error id: file:///C:/Users/andre/projects/uhcs/ha_uyenco/assign2/scala/fib-app/src/main/scala/fib-app/fibonacciAppRecursiveAndIterative.scala:takeRight.
file:///C:/Users/andre/projects/uhcs/ha_uyenco/assign2/scala/fib-app/src/main/scala/fib-app/fibonacciAppRecursiveAndIterative.scala
empty definition using pc, found symbol in pc: takeRight.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 339
uri: file:///C:/Users/andre/projects/uhcs/ha_uyenco/assign2/scala/fib-app/src/main/scala/fib-app/fibonacciAppRecursiveAndIterative.scala
text:
```scala
package fib_app

object FibonacciAppRecursiveAndIterative {
  def fibonacciSeriesRecursiveAndIterative(position : Int): List[Int] = position match {
	case 0 => List(1)
	case 1 => List(1,1)
    case _ => 
      for (i <- 2 to position){
          val series = fibonacciSeriesRecursiveAndIterative(position - 1)
          val nextVal = .take@@Right(2).sum
      }
  } 
  series
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: takeRight.