package TLC.CompilerWhile.ThreeAdresseElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CondElementTest {
    @Test
    public void TestCondElementAddElement() {
        CondElement condElement = new CondElement();

        LeftCondElement leftCondElement = new LeftCondElement();
        leftCondElement.addElement(new VarElement("a"));
        condElement.addElement(leftCondElement);
        RightCondElement rightCondElement = new RightCondElement();
        rightCondElement.addElement(new VarElement("b"));
        condElement.addElement(rightCondElement);

        String expected = "a ==b ";
        assertEquals(expected, condElement.Build());
    }

    @Test
    void TestCondElementBuildEmpty() {
        CondElement condElement = new CondElement();
        String expected = "";
        assertEquals(expected, condElement.Build());
    }

    @Test
    void TestCondElementToJava() {
        CondElement condElement = new CondElement();
        LeftCondElement leftCondElement = new LeftCondElement();
        leftCondElement.addElement(new VarElement("a"));
        condElement.addElement(leftCondElement);
        RightCondElement rightCondElement = new RightCondElement();
        rightCondElement.addElement(new VarElement("b"));
        condElement.addElement(rightCondElement);
        String expected = "map.get(\"a\").equals(\"b\")";
        assertEquals(expected, condElement.toJava().replace(" ", ""));
    }

    @Test
    void TestCondElementToJavaOneVar() {
        CondElement condElement = new CondElement();
        LeftCondElement leftCondElement = new LeftCondElement();
        leftCondElement.addElement(new VarElement("a"));
        condElement.addElement(leftCondElement);
        String expected = "map.get(\"a\").isNotEmpty()";
        assertEquals(expected, condElement.toJava().replace(" ", ""));
    }
}
