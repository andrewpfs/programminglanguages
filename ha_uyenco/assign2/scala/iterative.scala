
@main def run(): Unit =
  fibonacciSeries(6)


def fibonacciSeries(number : Int) = {
	var a = 0;
	var b = 1;

	if number == 1 then
		print("0")
	else
		print(s"$a $b")
		for(i  <- 2 until number)
			val temp = a + b
			a = b
			b = temp
			print(s" $temp")
}
