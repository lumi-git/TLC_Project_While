package TLC.CompilerWhile;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BlockTest {

    @Test
    public void testAddChild() {
        Block parent = new Block("parent", "", null);
        Block child = new Block("child", "", parent);
        assertEquals(1, parent.getChildCount());
    }

    @Test
    public void testGetName() {
        Block block = new Block("block", "", null);
        assertEquals("block", block.getName());

        Block blockFalse = new Block("blockfalse", "", null);
        assertFalse("block" == blockFalse.getName());

    }

    @Test
    public void testGetTab() {
        Block block = new Block("block", "", null);
        assertEquals(0, block.getTab().size());
    }


    @Test
    public void testFindSymbol() {
        Block block = new Block("block", "", null);
        SymbolElement symbol = new SymbolElement("x", "var", "int",0,0,0);
        block.getTab().add(symbol);
        assertEquals(symbol, block.findSymbol("x"));

        SymbolElement symbolNotExist = block.findSymbol("y");
        assertNull(symbolNotExist);
    }

    @Test
    public void testFindSymbolInParent() {
        Block parent = new Block("parent", "", null);
        SymbolElement symbol = new SymbolElement("x", "var", "int",0,0,0);
        parent.getTab().add(symbol);
        Block child = new Block("child", "", parent);
        assertEquals(symbol, child.findSymbolInParent("x"));

        Block grandChild = new Block("grandChild", "", child);
        SymbolElement symbolNotExist = grandChild.findSymbolInParent("y");
        assertNull(symbolNotExist);
    }
}
