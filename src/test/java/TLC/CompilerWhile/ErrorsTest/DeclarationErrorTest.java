package TLC.CompilerWhile.ErrorsTest;

import TLC.CompilerWhile.Errors.DeclarationError;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeclarationErrorTest {

    @Test
    public void testDeclarationError() {
        DeclarationError error = new DeclarationError("x", 5, 6);
        assertEquals("Variable x already declared", error.getMessage());
        assertEquals(5, error.getLine());
        assertEquals(6, error.getColumn());
        assertEquals("x", error.getName());
    }

}