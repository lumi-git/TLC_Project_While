package TLC.CompilerWhile.ThreeAdresseElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HdElementTest {
    @Test
    public void TestHdElementAddElement() {
        HdElement hdElement = new HdElement();
        hdElement.addElement(new VarElement("a"));
        String expected = "getRight a";
        assertEquals(expected, hdElement.Build());
    }

    @Test
    public void TestHdElementBuild() {
        HdElement hdElement = new HdElement();
        String expected = "getRight ";
        assertEquals(expected, hdElement.Build());
    }

    @Test
    public void TestHdElementToJava() {
        HdElement hdElement = new HdElement();
        hdElement.addElement(new VarElement("a"));
        String expected = "node.getRight(\"a\").getHead()";
        assertEquals(expected, hdElement.toJava().replace(" ", ""));
    }
}
