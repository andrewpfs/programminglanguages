package fib_app

import org.scalatest.funsuite.AnyFunSuite

class FibonacciSeriesRescursiveAndIterativeTest extends AnyFunSuite {
  test("fibonacciSeriesRescursiveAndIterative(0) should return 1") {
    assert(FibonacciAppRecursiveAndIterative.fibonacciSeriesRecursiveAndIterative(0) == List(1))
  }
  
  test("fibonacciSeriesRescursiveAndIterative(1) should return 1, 1") {
    assert(FibonacciAppRecursiveAndIterative.fibonacciSeriesRecursiveAndIterative(1) == List(1, 1))
  }

  test("fibonacciSeriesRescursiveAndIterative(2) should return 1, 1, 2") {
    assert(FibonacciAppRecursiveAndIterative.fibonacciSeriesRecursiveAndIterative(2) == List(1, 1, 2))
  }

  test("fibonacciSeriesRescursiveAndIterative(3) should return 1, 1, 2, 3") {
    assert(FibonacciAppRecursiveAndIterative.fibonacciSeriesRecursiveAndIterative(3) == List(1, 1, 2, 3))
  }

  test("fibonacciSeriesRescursiveAndIterative(5) should return 1, 1, 2, 3, 5, 8") {
    assert(FibonacciAppRecursiveAndIterative.fibonacciSeriesRecursiveAndIterative(5) == List(1, 1, 2, 3, 5, 8))
  }
  
  test("fibonacciSeriesRescursiveAndIterative(10) should return 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89") {
    assert(FibonacciAppRecursiveAndIterative.fibonacciSeriesRecursiveAndIterative(10) == List(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89))
  }
}

