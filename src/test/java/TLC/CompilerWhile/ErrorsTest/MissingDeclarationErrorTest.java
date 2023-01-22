package TLC.CompilerWhile.ErrorsTest;

import TLC.CompilerWhile.Errors.MissingDeclarationError;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingDeclarationErrorTest {
    @Test
    public void testMissingDeclarationError() {
        String name = "x";
        int line = 10;
        int column = 5;
        MissingDeclarationError error = new MissingDeclarationError(name, line, column);
        assertEquals("Variable x used but not declared", error.toString());
        assertEquals(name, error.getName());
        assertEquals(line, error.getLine());
        assertEquals(column, error.getColumn());
    }
}
