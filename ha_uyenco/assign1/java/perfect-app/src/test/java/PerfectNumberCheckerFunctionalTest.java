package perfectapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberCheckerFunctionalTest {
  @Test
  void knownPerfectsAreTrue() {
    assertAll(
      () -> assertTrue(PerfectNumberCheckerFunctional.isPerfectNumber(6)),
      () -> assertTrue(PerfectNumberCheckerFunctional.isPerfectNumber(28)),
      () -> assertTrue(PerfectNumberCheckerFunctional.isPerfectNumber(496)),
      () -> assertTrue(PerfectNumberCheckerFunctional.isPerfectNumber(8128))
    );
  } 

  @Test
  void nonPerfectsAreFalse() {
    assertAll(
      () -> assertFalse(PerfectNumberCheckerFunctional.isPerfectNumber(1)),  
      () -> assertFalse(PerfectNumberCheckerFunctional.isPerfectNumber(2)),
      () -> assertFalse(PerfectNumberCheckerFunctional.isPerfectNumber(3)),
      () -> assertFalse(PerfectNumberCheckerFunctional.isPerfectNumber(12))
    );
  }
}
