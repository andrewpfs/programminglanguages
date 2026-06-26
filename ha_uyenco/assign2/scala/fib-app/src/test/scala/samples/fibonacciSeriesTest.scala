package fib_app

import org.scalatest.funsuite.AnyFunSuite

class FibonacciSeriesTest extends AnyFunSuite {
  test("fibonacciSeries(0) should return 1") {
    assert(FibonacciApp.fibonacciSeries(0) == List(1))
  }
  
  test("fibonacciSeries(1) should return 1, 1") {
    assert(FibonacciApp.fibonacciSeries(1) == List(1, 1))
  }

  test("fibonacciSeries(2) should return 1, 1, 2") {
    assert(FibonacciApp.fibonacciSeries(2) == List(1, 1, 2))
  }

  test("fibonacciSeries(3) should return 1, 1, 2, 3") {
    assert(FibonacciApp.fibonacciSeries(3) == List(1, 1, 2, 3))
  }

  test("fibonacciSeries(5) should return 1, 1, 2, 3, 5, 8") {
    assert(FibonacciApp.fibonacciSeries(5) == List(1, 1, 2, 3, 5, 8))
  }
  
  test("fibonacciSeries(10) should return 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89") {
    assert(FibonacciApp.fibonacciSeries(10) == List(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89))
  }
}

