package TLC.CompilerWhile.ThreeAdresseElements;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class ListElementTest {
    @Test
    public void TestListElementAddElement() {
        ListElement listElement = new ListElement();
        listElement.addElement(new VarElement("a"));
        String expected = "a ";
        assertEquals(expected, listElement.Build());
    }

    @Test
    public void TestListElementBuild() {
        ListElement listElement = new ListElement();
        String expected = "";
        assertEquals(expected, listElement.Build());
    }

    @Test
    public void TestListElementToJava() {
        ListElement listElement = new ListElement();
        listElement.addElement(new VarElement("a"));
        listElement.addElement(new VarElement("b"));
        String expected = "node.newFromList(Arrays.asList(map.get(\"a\"),map.get(\"b\")))";
        assertEquals(expected, listElement.toJava());
    }
}
