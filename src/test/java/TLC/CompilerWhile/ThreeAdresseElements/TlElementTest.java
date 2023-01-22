package TLC.CompilerWhile.ThreeAdresseElements;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class TlElementTest {
    @Test
    public void TestTlElementAddElement() {
        TlElement tlElement = new TlElement();
        tlElement.addElement(new VarElement("a"));
        String expected = "getLeft a";
        assertEquals(expected, tlElement.Build());
    }

    @Test
    public void TestTlElementBuild() {
        TlElement tlElement = new TlElement();
        String expected = "getLeft ";
        assertEquals(expected, tlElement.Build());
    }

    @Test
    public void TestTlElementToJava() {
        TlElement tlElement = new TlElement();
        tlElement.addElement(new VarElement("a"));
        tlElement.addElement(new VarElement("b"));
        tlElement.addElement(new VarElement("c"));
        String expected = "(\"a\" \"b\" \"c\" ).getTail()";
        assertEquals(expected, tlElement.toJava());
    }
}
