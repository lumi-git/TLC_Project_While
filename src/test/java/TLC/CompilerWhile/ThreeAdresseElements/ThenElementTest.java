package TLC.CompilerWhile.ThreeAdresseElements;

import org.junit.jupiter.api.Test;
import static junit.framework.Assert.assertEquals;
public class ThenElementTest {
    @Test
    public void TestThenElementAddElement() {
        ThenElement thenElement = new ThenElement();
        thenElement.addElement(new VarElement("a"));
        String expected = "a";
        assertEquals(expected, thenElement.Build());
    }

    @Test
    public void TestThenElementBuild() {
        ThenElement thenElement = new ThenElement();
        String expected = "";
        assertEquals(expected, thenElement.Build());
    }

    @Test
    public void TestThenElementToJava() {
        ThenElement thenElement = new ThenElement();
        thenElement.addElement(new VarElement("a"));
        thenElement.addElement(new VarElement("b"));
        thenElement.addElement(new VarElement("c"));
        String expected = "\"a\"\"b\"\"c\"";
        assertEquals(expected, thenElement.toJava());
    }
}
