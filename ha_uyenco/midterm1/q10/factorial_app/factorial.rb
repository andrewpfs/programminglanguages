def factorial(current, previous_list = [1])
  return previous_list if current == 1;
  
  new_list = previous_list + [previous_list.last * (previous_list.length + 1)]
  factorial(current - 1, new_list)
end
