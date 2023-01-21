package TLC.CompilerWhile.ErrorsTest;

import TLC.CompilerWhile.Errors.MissingMainError;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingMainErrorTest {
    @Test
    public void testMissingMainError() {
        MissingMainError error = new MissingMainError();
        assertEquals("Compilation Error : Missing main function", error.getMessage());
    }
}
