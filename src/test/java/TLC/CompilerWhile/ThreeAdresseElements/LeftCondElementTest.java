package TLC.CompilerWhile.ThreeAdresseElements;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class LeftCondElementTest {
    @Test
    public void TestLeftCondElementAddElement() {
        LeftCondElement leftCondElement = new LeftCondElement();
        leftCondElement.addElement(new VarElement("a"));
        String expected = "a ";
        assertEquals(expected, leftCondElement.Build());
    }

    @Test
    public void TestLeftCondElementBuild() {
        LeftCondElement leftCondElement = new LeftCondElement();
        String expected = "";
        assertEquals(expected, leftCondElement.Build());
    }

    @Test
    public void TestLeftCondElementToJava() {
        LeftCondElement leftCondElement = new LeftCondElement();
        leftCondElement.addElement(new VarElement("a"));
        leftCondElement.addElement(new VarElement("b"));
        String expected = "\"a\" \"b\" ";
        assertEquals(expected, leftCondElement.toJava());
    }
}
