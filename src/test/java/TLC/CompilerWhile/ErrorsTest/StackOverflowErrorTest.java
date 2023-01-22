package TLC.CompilerWhile.ErrorsTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackOverflowErrorTest {


    @Test
    public void testStackOverflowErrorMessage() {
        StackOverflowError error = new StackOverflowError("maximum stack depth reached");
        assertEquals("maximum stack depth reached", error.getMessage());
    }

}
