package perfectapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberCheckerTest {
  @Test
  void knownPerfectsAreTrue() {
    assertAll(
      () -> assertTrue(PerfectNumberChecker.isPerfectNumber(6)),
      () -> assertTrue(PerfectNumberChecker.isPerfectNumber(28)),
      () -> assertTrue(PerfectNumberChecker.isPerfectNumber(496)),
      () -> assertTrue(PerfectNumberChecker.isPerfectNumber(8128))
    );
  } 

  @Test
  void nonPerfectsAreFalse() {
    assertAll(
      () -> assertFalse(PerfectNumberChecker.isPerfectNumber(1)),  
      () -> assertFalse(PerfectNumberChecker.isPerfectNumber(2)),
      () -> assertFalse(PerfectNumberChecker.isPerfectNumber(3)),
      () -> assertFalse(PerfectNumberChecker.isPerfectNumber(12))
    );
  }
}
