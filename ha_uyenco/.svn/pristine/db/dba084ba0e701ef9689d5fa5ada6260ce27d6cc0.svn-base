package repeat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class repeatLettersChecker {
  @Test
  void repeatLetters() {
    assertAll(
      () -> assertEquals("h", repeatedLetter.repeatedLetters("hello there")),
      () -> assertEquals("l", repeatedLetter.repeatedLetters("hello okay")),
      () -> assertEquals("e", repeatedLetter.repeatedLetters("hello elmo")),
      () -> assertEquals("l", repeatedLetter.repeatedLetters("hello")),
      () -> assertEquals("l", repeatedLetter.repeatedLetters("hello sam")),
      () -> assertEquals("",  repeatedLetter.repeatedLetters("gopher")),
      () -> assertEquals(" ", repeatedLetter.repeatedLetters("and this oy"))
    );
  }
}
