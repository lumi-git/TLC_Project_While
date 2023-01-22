package TLC.CompilerWhile.ErrorsTest;

import TLC.CompilerWhile.Errors.FunctionDeclarationDuplicateError;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionDeclarationDuplicateErrorTest {
    @Test
    public void testGetName() {
        FunctionDeclarationDuplicateError error = new FunctionDeclarationDuplicateError("test", 10, 20, 5, 10);
        assertEquals("test", error.getName());
    }

    @Test
    public void testToString() {
        FunctionDeclarationDuplicateError error = new FunctionDeclarationDuplicateError("test", 10, 20, 5, 10);
        assertEquals("Compile Error -> Error at line 10 column 20 : Duplicate function test\n" +
                "| Other declaration here at line 5 column 10", error.toString());
    }
}
