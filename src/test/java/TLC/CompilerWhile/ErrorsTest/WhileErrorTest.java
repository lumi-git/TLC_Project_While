package TLC.CompilerWhile.ErrorsTest;

import TLC.CompilerWhile.Errors.WhileError;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhileErrorTest {
    @Test
    public void testWhileError() {
        WhileError error = new WhileError("Invalid syntax", 5, 2);
        assertEquals("Compile Error -> Error at line 5 column 2 : Invalid syntax", error.toString());
    }

    @Test
    public void testWhileErrorLine() {
        WhileError error = new WhileError("Invalid syntax", 5, 2);
        assertEquals(5, error.getLine());
    }

    @Test
    public void testWhileErrorColumn() {
        WhileError error = new WhileError("Invalid syntax", 5, 2);
        assertEquals(2, error.getColumn());
    }
}
