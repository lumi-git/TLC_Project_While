package TLC.CompilerWhile;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SymbolElementTest {
    @Test
    public void testGetName() {
        SymbolElement symbol =  new SymbolElement("x", "variable", "int", 1, 2,0,1);
        assertEquals("x", symbol.getName());
    }

    @Test
    public void testGetKind() {
        SymbolElement symbol = new SymbolElement("x", "variable", "int", 1, 2,0,1);
        assertEquals("variable", symbol.getkind());
    }

    @Test
    public void testGetType() {
        SymbolElement symbol = new SymbolElement("x", "variable", "int", 1, 2,0,1);
        assertEquals("int", symbol.getType());
    }

    @Test
    public void testGetLine() {
        SymbolElement symbol = new SymbolElement("x", "variable", "int", 1, 2,0,1);
        assertEquals(1, symbol.getLine());
    }

    @Test
    public void testGetColumn() {
        SymbolElement symbol = new SymbolElement("x", "variable", "int", 1, 2,0,1);
        assertEquals(2, symbol.getColumn());
    }

    @Test
    public void testGetUniqueID() {
        SymbolElement symbol = new SymbolElement("x", "variable", "int", 1, 2,0,1);
        assertNotNull(symbol.getUniqueID());
    }

    @Test
    public void testGetParamCount() {
        SymbolElement symbol = new SymbolElement("x", "variable", "int", 1, 2,3,1);
        assertEquals(3, symbol.getParamCount());
    }

    @Test
    public void testToString() {
        SymbolElement symbol = new SymbolElement("x", "variable", "int", 1, 2,0,1);
        assertEquals("| x | variable | int |", symbol.toString());
    }



}
