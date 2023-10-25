import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;

import org.junit.jupiter.api.Test;

class ExpressionTest {

  Expressions e = new Expressions();

  @Test
  void testIn2PostFromSlides() {
    assertEquals("2 3 4 + 2 6 - / *", e.inToPost("2 * ( ( 3 + 4 ) / 2 - 6 )"));
    // 7 / -4 == -1
    assertEquals(-2, e.valueOf("2 3 4 + 2 6 - / *"));
  }
}
