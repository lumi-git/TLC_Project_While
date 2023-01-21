package TLC.CompilerWhile.ErrorsTest;

import TLC.CompilerWhile.Errors.InsufisantArgCountError;
import TLC.CompilerWhile.Stack;
import TLC.CompilerWhile.SymbolElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsufisantArgCoutErrorTest {
    @Test
    public void testInsufisantArgCountError() {
        Stack.getInstance().addSymbol(new SymbolElement("testFunc", "func", "int", 1, 1, 2));
        InsufisantArgCountError error = new InsufisantArgCountError("testFunc", 2, 2);
        assertEquals("Missing arguments for the function : testFunc\n| Function testFunc Takes 2", error.getMessage());
        assertEquals("testFunc", error.getName());
        assertEquals(2, error.getLine());
        assertEquals(2, error.getColumn());
    }
}
