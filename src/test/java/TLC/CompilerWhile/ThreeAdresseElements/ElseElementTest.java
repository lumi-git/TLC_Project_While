package TLC.CompilerWhile.ThreeAdresseElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElseElementTest {
    @Test
    public void ElseElementAddElementTest() {
        ElseElement elseElement = new ElseElement();
        AffecationElement affecationElement = new AffecationElement();

        LeftAssignationElement leftAssignationElement = new LeftAssignationElement();
        leftAssignationElement.addElement(new VarElement("a"));

        RightAssignationElement rightAssignationElement = new RightAssignationElement();
        rightAssignationElement.addElement(new VarElement("b"));

        affecationElement.addElement(leftAssignationElement);
        affecationElement.addElement(rightAssignationElement);

        elseElement.addElement(affecationElement);

        String expected = """
                  a = b \n
                """;

        assertEquals(expected, elseElement.Build());
    }

    @Test
    public void ElseElementBuildTest() {
        ElseElement elseElement = new ElseElement();

        String expected = "";

        assertEquals(expected, elseElement.Build());
    }

    @Test
    public void ElseElementToJavaTest() {
        ElseElement elseElement = new ElseElement();
        AffecationElement affecationElement = new AffecationElement();

        LeftAssignationElement leftAssignationElement = new LeftAssignationElement();
        leftAssignationElement.addElement(new VarElement("a"));

        RightAssignationElement rightAssignationElement = new RightAssignationElement();
        rightAssignationElement.addElement(new VarElement("b"));

        affecationElement.addElement(leftAssignationElement);
        affecationElement.addElement(rightAssignationElement);

        elseElement.addElement(affecationElement);

        String expected = "map.put(\"a\" , map.get(\"b\"));\n";

        assertEquals(expected, elseElement.toJava());
    }
}
