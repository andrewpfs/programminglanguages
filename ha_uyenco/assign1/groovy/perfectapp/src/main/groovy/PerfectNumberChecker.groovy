package perfectapp

static isPerfectNumber(def number){ 
  if (number <= 1) {
    return false; 
  }
  
  def result = 1
    
  for(factor in 2..number) {
    if(number % factor == 0) {
      result += factor
    }
  }
    
  result == number * 2
}
