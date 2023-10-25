import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;

import org.junit.jupiter.api.Test;

class ExpressionTest {

  Expressions e = new Expressions();

  @Test
  void testValueOf() {
    assertEquals(5, e.valueOf("2 3 +"));
  }
}
