package TLC.CompilerWhile.ThreeAdresseElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GotoElementTest {
    @Test
    public void TestGotoElementAddElement() {
        GotoElement gotoElement = new GotoElement("test");
        gotoElement.addElement(new VarElement("a"));
        String expected = "goto test\n";
        assertEquals(expected, gotoElement.Build());
    }

    @Test
    public void TestGotoElementBuild() {
        GotoElement gotoElement = new GotoElement("test");
        String expected = "goto test\n";
        assertEquals(expected, gotoElement.Build());
    }

    @Test
    public void TestGotoElementToJava() {
        GotoElement gotoElement = new GotoElement("test");
        assertEquals("", gotoElement.toJava());
    }
}
