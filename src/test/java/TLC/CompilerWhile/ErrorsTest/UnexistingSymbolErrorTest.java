package TLC.CompilerWhile.ErrorsTest;

import TLC.CompilerWhile.Errors.UnexistingSymbolError;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnexistingSymbolErrorTest {
    @Test
    public void testUnexistingSymbolError() {
        UnexistingSymbolError error = new UnexistingSymbolError("x", 10, 2);
        assertEquals("Unknown symbol : x\nDid you forget to declare it ?", error.getMessage());
    }

    @Test
    public void testUnexistingSymbolErrorName() {
        UnexistingSymbolError error = new UnexistingSymbolError("x", 10, 2);
        assertEquals("x", error.getName());
    }

    @Test
    public void testUnexistingSymbolErrorLine() {
        UnexistingSymbolError error = new UnexistingSymbolError("x", 10, 2);
        assertEquals(10, error.getLine()-1);
    }

    @Test
    public void testUnexistingSymbolErrorColum() {
        UnexistingSymbolError error = new UnexistingSymbolError("x", 10, 2);
        assertEquals(2, error.getColumn());
    }
}
