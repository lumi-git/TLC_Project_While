package TLC.CompilerWhile.ErrorsTest;

import TLC.CompilerWhile.Errors.InsufisantArgCountError;
import TLC.CompilerWhile.Stack;
import TLC.CompilerWhile.SymbolElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsufisantArgCoutErrorTest {

    @Test
    public void testInsufisantArgCountErrorName(){

        InsufisantArgCountError error = new InsufisantArgCountError("testFunc", 2, 2);
        assertEquals("testFunc", error.getName());
    }

    @Test
    public void testInsufisantArgCountErrorLine(){

        InsufisantArgCountError error = new InsufisantArgCountError("testFunc", 2, 2);
        assertEquals(2, error.getLine()-1);
    }

    @Test
    public void testInsufisantArgCountErrorColumn(){

        InsufisantArgCountError error = new InsufisantArgCountError("testFunc", 2, 2);
        assertEquals(2, error.getColumn());
    }
}
