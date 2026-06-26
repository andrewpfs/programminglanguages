error id: file:///C:/Users/andre/projects/uhcs/ha_uyenco/assign2/scala/fib-app/src/main/scala/fib-app/fibonacciAppRecursiveAndIterative.scala:scala/collection/immutable/List#takeRight().
file:///C:/Users/andre/projects/uhcs/ha_uyenco/assign2/scala/fib-app/src/main/scala/fib-app/fibonacciAppRecursiveAndIterative.scala
empty definition using pc, found symbol in pc: scala/collection/immutable/List#takeRight().
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -series/takeRight.
	 -series/takeRight#
	 -series/takeRight().
	 -scala/Predef.series.takeRight.
	 -scala/Predef.series.takeRight#
	 -scala/Predef.series.takeRight().
offset: 335
uri: file:///C:/Users/andre/projects/uhcs/ha_uyenco/assign2/scala/fib-app/src/main/scala/fib-app/fibonacciAppRecursiveAndIterative.scala
text:
```scala
package fib_app

object FibonacciAppRecursiveAndIterative {
  def fibonacciSeriesRecursiveAndIterative(position : Int): List[Int] = position match {
    case 0 => List(1)
    case _ =>

        for (i <- 2 to position){
            val series = fibonacciSeriesRecursiveAndIterative(position - 1)
            val nextVal = series.takeRi@@ght(2).sum
            series :+ nextVal
        }
    series
  } 
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/collection/immutable/List#takeRight().