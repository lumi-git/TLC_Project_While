package TLC.CompilerWhile.ThreeAdresseElements;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class RightCondElementTest {
    @Test
    public void TestRightCondElementAddElement() {
        RightCondElement rightCondElement = new RightCondElement();
        rightCondElement.addElement(new VarElement("a"));
        String expected = "a ";
        assertEquals(expected, rightCondElement.Build());
    }

    @Test
    public void TestRightCondElementBuild() {
        RightCondElement rightCondElement = new RightCondElement();
        String expected = "";
        assertEquals(expected, rightCondElement.Build());
    }

    @Test
    public void TestRightCondElementToJava() {
        RightCondElement rightCondElement = new RightCondElement();
        rightCondElement.addElement(new VarElement("a"));
        rightCondElement.addElement(new VarElement("b"));
        rightCondElement.addElement(new VarElement("c"));
        String expected = "\"a\" \"b\" \"c\" ";
        assertEquals(expected, rightCondElement.toJava());
    }
}