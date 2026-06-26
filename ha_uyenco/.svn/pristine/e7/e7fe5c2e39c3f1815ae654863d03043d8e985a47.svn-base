object TupleExamples extends App {
//person example
  val person: (String, Int, Boolean) = ("Mary", 21, true)
  
  println(s"Name: ${person._1}, Age: ${person._2}, Passing?: ${person._3}")
  
//math example
  def calculateStats(numbers: List[Int]): (Int, Int, Double) = {
    val sum = numbers.sum
    val max = numbers.max
    val mean = numbers.sum.toDouble/numbers.size
    (sum, max, mean)
  }
  
  val stats = calculateStats(List(10, 20, 30))
  println(s"Sum: ${stats._1}, Max: ${stats._2}, Avg: ${stats._3}")
}

