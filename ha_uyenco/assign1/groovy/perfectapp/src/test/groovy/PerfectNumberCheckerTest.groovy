package perfectapp

import spock.lang.Specification
import spock.lang.Rollup
import static perfectapp.PerfectNumberChecker.isPerfectNumber


class PerfectNumberCheckerTest extends Specification{
  @Rollup
  
  def "perfect number checker" (int number, boolean result){
    expect:
    isPerfectNumber(number) == result

    where:
    number || result
    6      || true
    28     || true
    496    || true
    8128   || true
    1      || false
    2      || false
    3      || false
    12     || false
    -1     || false
  }

}