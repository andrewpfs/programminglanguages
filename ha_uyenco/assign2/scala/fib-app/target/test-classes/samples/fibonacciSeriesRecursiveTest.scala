package fib_app

import org.scalatest.funsuite.AnyFunSuite

class FibonacciSeriesRescursiveTest extends AnyFunSuite {
  test("fibonacciSeriesRescursive(0) should return 1") {
    assert(FibonacciAppRecursive.fibonacciSeriesRecursive(0) == List(1))
  }
  
  test("fibonacciSeriesRescursive(1) should return 1, 1") {
    assert(FibonacciAppRecursive.fibonacciSeriesRecursive(1) == List(1, 1))
  }

  test("fibonacciSeriesRescursive(2) should return 1, 1, 2") {
    assert(FibonacciAppRecursive.fibonacciSeriesRecursive(2) == List(1, 1, 2))
  }

  test("fibonacciSeriesRescursive(3) should return 1, 1, 2, 3") {
    assert(FibonacciAppRecursive.fibonacciSeriesRecursive(3) == List(1, 1, 2, 3))
  }

  test("fibonacciSeriesRescursive(5) should return 1, 1, 2, 3, 5, 8") {
    assert(FibonacciAppRecursive.fibonacciSeriesRecursive(5) == List(1, 1, 2, 3, 5, 8))
  }
  
  test("fibonacciSeriesRescursive(10) should return 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89") {
    assert(FibonacciAppRecursive.fibonacciSeriesRecursive(10) == List(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89))
  }
}

