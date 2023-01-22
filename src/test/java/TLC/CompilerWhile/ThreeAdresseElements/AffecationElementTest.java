package TLC.CompilerWhile.ThreeAdresseElements;

import org.junit.jupiter.api.Test;

import javax.lang.model.element.VariableElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AffecationElementTest {
    @Test
    public void TestAffecationElementAddElement() {
        AffecationElement affecationElement = new AffecationElement();
        RightAssignationElement rightAssignationElement = new RightAssignationElement();
        rightAssignationElement.addElement(new VarElement("b"));

        LeftAssignationElement leftAssignationElement = new LeftAssignationElement();
        leftAssignationElement.addElement(new VarElement("a"));

        affecationElement.addElement(leftAssignationElement);
        affecationElement.addElement(rightAssignationElement);

        String expected = "a = b \n\n";
        assertEquals(expected, affecationElement.Build());
    }

    @Test
    public void TestAffecationElementBuild() {
        AffecationElement affecationElement = new AffecationElement();
        String expected = "= \n\n";
        assertEquals(expected, affecationElement.Build());
    }

    @Test
    public void TestAffecationElementToJavaMultiple() {
        AffecationElement affecationElement = new AffecationElement();

        RightAssignationElement rightAssignationElement = new RightAssignationElement();
        rightAssignationElement.addElement(new VarElement("a"));
        rightAssignationElement.addElement(new VarElement("b"));
        rightAssignationElement.addElement(new VarElement("c"));

        LeftAssignationElement leftAssignationElement = new LeftAssignationElement();
        leftAssignationElement.addElement(new VarElement("d"));
        leftAssignationElement.addElement(new VarElement("e"));
        leftAssignationElement.addElement(new VarElement("f"));

        affecationElement.addElement(leftAssignationElement);
        affecationElement.addElement(rightAssignationElement);

        String expected = """
                map.put("d" , map.get("a"));
                map.put("e" , map.get("b"));
                map.put("f" , map.get("c"));
                """;

        assertEquals(expected, affecationElement.toJava());
    }

    @Test
    public void TestAffecationElementToJavaEmpty() {
        AffecationElement affecationElement = new AffecationElement();
        String expected = "";
        assertEquals(expected, affecationElement.toJava());
    }

    @Test
    public void TestAffecationElementToJavaFunc() {
        AffecationElement affecationElement = new AffecationElement();

        RightAssignationElement rightAssignationElement = new RightAssignationElement();
        rightAssignationElement.addElement(new VarElement("a"));
        rightAssignationElement.addElement(new VarElement("b"));
        rightAssignationElement.addElement(new VarElement("c"));

        FuncCallElement funcCallElement = new FuncCallElement("test");
        funcCallElement.addElement(new VarElement("a"));
        funcCallElement.addElement(new VarElement("b"));
        funcCallElement.addElement(new VarElement("c"));
        FuncCallElement funcCallElement2 = new FuncCallElement("test");
        funcCallElement2.addElement(new VarElement("a"));
        funcCallElement2.addElement(new VarElement("b"));
        funcCallElement2.addElement(new VarElement("c"));

        rightAssignationElement.addElement(funcCallElement);
        rightAssignationElement.addElement(funcCallElement2);

        LeftAssignationElement leftAssignationElement = new LeftAssignationElement();
        leftAssignationElement.addElement(new VarElement("d"));
        leftAssignationElement.addElement(new VarElement("e"));
        leftAssignationElement.addElement(new VarElement("f"));
        leftAssignationElement.addElement(new VarElement("d"));
        leftAssignationElement.addElement(new VarElement("e"));
        leftAssignationElement.addElement(new VarElement("f"));

        affecationElement.addElement(leftAssignationElement);
        affecationElement.addElement(rightAssignationElement);

        String expected = """
                test(map.get("a") , map.get("b") , map.get("c"));
                test(map.get("a") , map.get("b") , map.get("c"));
                map.put("d",stack.pop());
                map.put("e",stack.pop());
                map.put("f",stack.pop());
                map.put("d",stack.pop());
                map.put("e",stack.pop());
                map.put("f",stack.pop());
                """;

        assertEquals(expected, affecationElement.toJava());
    }

}
