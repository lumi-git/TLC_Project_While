package TLC.CompilerWhile.ErrorsTest;

import TLC.CompilerWhile.Errors.MissingDeclarationError;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingDeclarationErrorTest {


    @Test
    public void testMissingDeclarationErrorName() {
        String name = "x";
        int line = 10;
        int column = 5;
        MissingDeclarationError error = new MissingDeclarationError(name, line, column);
        assertEquals(name, error.getName());

    }

    @Test
    public void testMissingDeclarationErrorLine() {
        String name = "x";
        int line = 10;
        int column = 5;
        MissingDeclarationError error = new MissingDeclarationError(name, line, column);
        assertEquals(line, error.getLine());
    }

    @Test
    public void testMissingDeclarationErrorColumn() {
        String name = "x";
        int line = 10;
        int column = 5;
        MissingDeclarationError error = new MissingDeclarationError(name, line, column);
        assertEquals(column, error.getColumn());
    }
}
