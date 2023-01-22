package TLC.CompilerWhile.ErrorsTest;

import TLC.CompilerWhile.Errors.ErrorG;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ErorrGTest {
    @Test
    public void testErrorG() {
        String message = "An error occurred";
        ErrorG errorG = new ErrorG(message);
        assertEquals(message, errorG.getMessage());
        assertEquals(message, errorG.toString());
    }
}
