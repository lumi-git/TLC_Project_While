package TLC.CompilerWhile.ErrorsTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackOverflowErrorTest {
    @Test
    public void testStackOverflowError() {
        StackOverflowError error = new StackOverflowError("maximum stack depth reached");
        assertEquals("Stack Overflow : maximum stack depth reached", error.toString());
        assertEquals("maximum stack depth reached", error.getMessage());
    }
}
