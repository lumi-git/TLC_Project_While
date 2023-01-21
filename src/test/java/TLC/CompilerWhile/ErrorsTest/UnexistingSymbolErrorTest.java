package TLC.CompilerWhile.ErrorsTest;

import TLC.CompilerWhile.Errors.UnexistingSymbolError;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnexistingSymbolErrorTest {
    @Test
    public void testUnexistingSymbolError() {
        UnexistingSymbolError error = new UnexistingSymbolError("x", 10, 2);
        assertEquals("Unknown symbol : x\nDid you forget to declare it ?", error.getMessage());
        assertEquals("x", error.getName());
        assertEquals(10, error.getLine());
        assertEquals(2, error.getColumn());
    }
}
