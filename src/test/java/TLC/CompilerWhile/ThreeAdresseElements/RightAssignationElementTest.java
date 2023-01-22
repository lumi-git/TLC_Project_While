package TLC.CompilerWhile.ThreeAdresseElements;

import org.junit.jupiter.api.Test;
import static junit.framework.Assert.assertEquals;
public class RightAssignationElementTest {
    @Test
    public void TestRightAssignationElementAddElement() {
        RightAssignationElement rightAssignationElement = new RightAssignationElement();
        rightAssignationElement.addElement(new VarElement("a"));
        String expected = "a \n";
        assertEquals(expected, rightAssignationElement.Build());
    }

    @Test
    public void TestRightAssignationElementBuild() {
        RightAssignationElement rightAssignationElement = new RightAssignationElement();
        String expected = "\n";
        assertEquals(expected, rightAssignationElement.Build());
    }

    @Test
    public void TestRightAssignationElementToJava() {
        RightAssignationElement rightAssignationElement = new RightAssignationElement();
        rightAssignationElement.addElement(new VarElement("a"));
        rightAssignationElement.addElement(new VarElement("b"));
        rightAssignationElement.addElement(new VarElement("c"));
        String expected = "new node(\"a\"), new node(\"b\"), new node(\"c\")";
        assertEquals(expected, rightAssignationElement.toJava());
    }


}
