package TLC.CompilerWhile.ThreeAdresseElements;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class LeftAssignationElementTest {
    @Test
    public void LeftAssignationElementAddElementTest() {
        LeftAssignationElement leftAssignationElement = new LeftAssignationElement();
        leftAssignationElement.addElement(new VarElement("a"));
        String expected = "a ";
        assertEquals(expected, leftAssignationElement.Build());
    }

    @Test
    public void LeftAssignationElementBuildTest() {
        LeftAssignationElement leftAssignationElement = new LeftAssignationElement();
        String expected = "";
        assertEquals(expected, leftAssignationElement.Build());
    }

    @Test
    public void LeftAssignationElementToJavaTest() {
        LeftAssignationElement leftAssignationElement = new LeftAssignationElement();
        leftAssignationElement.addElement(new VarElement("a"));
        leftAssignationElement.addElement(new VarElement("b"));
        String expected = "\"a\", \"b\"";
        assertEquals(expected, leftAssignationElement.toJava());
    }

    @Test
    public void LeftAssignationElementToJavaTest2() {
        LeftAssignationElement leftAssignationElement = new LeftAssignationElement();
        ConsElement consElement = new ConsElement();
        consElement.addElement(new VarElement("a"));
        consElement.addElement(new VarElement("b"));
        ConsElement consElement2 = new ConsElement();
        consElement2.addElement(new VarElement("c"));
        consElement2.addElement(new VarElement("d"));

        leftAssignationElement.addElement(consElement);
        leftAssignationElement.addElement(consElement2);
        String expected = "node.Cons(map.get(\"a\") , map.get(\"b\")), node.Cons(map.get(\"c\") , map.get(\"d\"))";
        assertEquals(expected, leftAssignationElement.toJava());
    }
}
