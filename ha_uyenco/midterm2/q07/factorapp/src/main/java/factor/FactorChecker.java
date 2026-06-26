package factor;

import module java.base;
import java.util.ArrayList;
import java.util.List;

public class FactorChecker{
  public static List<Integer> factorList(List<Integer> inputs){
    return inputs.stream()
      .flatMap(number->
        IntStream.rangeClosed(1,number)
        .filter(factor-> number % factor == 0)
        .boxed()
      )
      .sorted()
      .distinct()
      .collect(Collectors.toList());
  }
  public static void main(String[]args){
    List<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(6);
    System.out.println(factorList(list));

  }
}

