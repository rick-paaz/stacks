import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;

import org.junit.jupiter.api.Test;

class OurStackTest {

  @Test
  void testIsEmpty() {
    OurStack<Integer> s = new LinkedStack<>();
    assertTrue(s.isEmpty());
  }

  // Don't forget to make sure peek() and pop() throw EmptyStackException
}
