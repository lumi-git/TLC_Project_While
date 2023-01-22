package TLC.CompilerWhile.ThreeAdresseElements;

import org.junit.jupiter.api.Test;
import static junit.framework.Assert.assertEquals;
public class PpElementTest {
    @Test
    public void TestPpElementAddElement() {
        PpElement ppElement = new PpElement();
        ppElement.addElement(new VarElement("a"));
        String expected = "PRINT a ";
        assertEquals(expected, ppElement.Build());
    }

    @Test
    public void TestPpElementBuild() {
        PpElement ppElement = new PpElement();
        String expected = "PRINT ";
        assertEquals(expected, ppElement.Build());
    }

    @Test
    public void TestPpElementToJava() {
        PpElement ppElement = new PpElement();
        ppElement.addElement(new VarElement("a"));
        String expected = "Logger.log(map.get(\"a\")+\"\");\n";
        assertEquals(expected, ppElement.toJava());
    }

    @Test
    public void TestPpElementToJava2() {
        PpElement ppElement = new PpElement();
        ConsElement consElement = new ConsElement();
        consElement.addElement(new VarElement("a"));
        consElement.addElement(new VarElement("b"));
        ppElement.addElement(consElement);
        String expected = "Logger.log(node.Cons(map.get(\"a\") , map.get(\"b\"))+\"\");\n";
        assertEquals(expected, ppElement.toJava());
    }

}
