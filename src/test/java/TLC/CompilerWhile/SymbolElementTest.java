package TLC.CompilerWhile;

import org.junit.Test;
import static org.junit.Assert.*;

public class SymbolElementTest {
    @Test
    public void testGetName() {
        SymbolElement symbol = new SymbolElement("x", "variable", "int", 1, 2,0);
        assertEquals("x", symbol.getName());
    }

    @Test
    public void testGetKind() {
        SymbolElement symbol = new SymbolElement("x", "variable", "int", 1, 2,0);
        assertEquals("variable", symbol.getkind());
    }

    @Test
    public void testGetType() {
        SymbolElement symbol = new SymbolElement("x", "variable", "int", 1, 2,0);
        assertEquals("int", symbol.getType());
    }

    @Test
    public void testGetLine() {
        SymbolElement symbol = new SymbolElement("x", "variable", "int", 1, 2,0);
        assertEquals(1, symbol.getLine());
    }

    @Test
    public void testGetColumn() {
        SymbolElement symbol = new SymbolElement("x", "variable", "int", 1, 2,0);
        assertEquals(2, symbol.getColumn());
    }

    @Test
    public void testGetUniqueID() {
        SymbolElement symbol = new SymbolElement("x", "variable", "int", 1, 2,0);
        assertNotNull(symbol.getUniqueID());
    }

    @Test
    public void testGetParamCount() {
        SymbolElement symbol = new SymbolElement("x", "variable", "int", 1, 2,3);
        assertEquals(3, symbol.getParamCount());
    }

    @Test
    public void testToString() {
        SymbolElement symbol = new SymbolElement("x", "variable", "int", 1, 2,0);
        assertEquals("| x | variable | int |", symbol.toString());
    }
    @Test
    public void testToMD() {
        SymbolElement symbol = new SymbolElement("x", "variable", "int", 1, 2,0);
        assertTrue(symbol.ToMD().contains("->   x , int , variable , 0 , UniqueID: "));
    }

}
