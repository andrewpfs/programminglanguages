def factorial(number)
  (2..number).inject([1]) do |acc,i|
    next_factorial = acc.last * i
    new_accumulator = acc + [next_factorial]
  end
end
