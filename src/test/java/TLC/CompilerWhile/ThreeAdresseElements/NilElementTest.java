package TLC.CompilerWhile.ThreeAdresseElements;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class NilElementTest {
    @Test
    public void TestNilElementAddElement() {
        NilElement nilElement = new NilElement();
        nilElement.addElement(new VarElement("a"));
        String expected = "nil ";
        assertEquals(expected, nilElement.Build());
    }

    @Test
    public void TestNilElementBuild() {
        NilElement nilElement = new NilElement();
        String expected = "nil ";
        assertEquals(expected, nilElement.Build());
    }

    @Test
    public void TestNilElementToJava() {
        NilElement nilElement = new NilElement();
        String expected = "new node()";
        assertEquals(expected, nilElement.toJava());
    }
}
