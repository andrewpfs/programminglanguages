def functional_is_perfect_number?(number)
  number * 2 == (1..number).select { |factor| number % factor == 0 }.sum
end
