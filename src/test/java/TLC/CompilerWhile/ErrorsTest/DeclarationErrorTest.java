package TLC.CompilerWhile.ErrorsTest;

import TLC.CompilerWhile.Errors.DeclarationError;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeclarationErrorTest {

    @Test
    public void testDeclarationError() {
        DeclarationError error = new DeclarationError("x", 5, 6);
        assertEquals("Variable x already declared", error.getMessage());
    }

    @Test
    public void testDeclarationErrorLine(){
        DeclarationError error = new DeclarationError("x", 5, 6);
        assertEquals(5, error.getLine());
    }

    @Test
    public void testDeclarationErrorColumn(){
        DeclarationError error = new DeclarationError("x", 5, 6);
        assertEquals(6, error.getColumn());
    }
    @Test
    public void testDeclarationErrorName(){
        DeclarationError error = new DeclarationError("x", 5, 6);
        assertEquals("x", error.getName());
    }

}