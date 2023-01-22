package TLC.CompilerWhile.ThreeAdresseElements;

import TLC.CompilerWhile.ConcreteElements.LeftCondDeclaration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForElementTest {
    @Test
    public void ForElementAddElementTest() {
        ForElement forElement = new ForElement();
        ConsElement consElement = new ConsElement();
        consElement.addElement(new VarElement("a"));
        consElement.addElement(new VarElement("b"));

        forElement.addElement(consElement);

        AffecationElement affecationElement = new AffecationElement();
        LeftAssignationElement leftAssignationElement = new LeftAssignationElement();
        leftAssignationElement.addElement(new VarElement("a"));
        affecationElement.addElement(leftAssignationElement);

        RightAssignationElement rightAssignationElement = new RightAssignationElement();
        rightAssignationElement.addElement(new VarElement("b"));
        affecationElement.addElement(rightAssignationElement);

        forElement.addElement(affecationElement);


        String expected = """
                FOR_7:
                a = b\s
                                
                ifnz  goto False_label_8
                goto FOR_7
                goto EndIf_label_8 :
                False_label_8:
                EndIf_label_8 :
                """;

        assertEquals(expected, forElement.Build());
    }

    @Test
    public void ForElementAddElement2Test() {
        ForElement forElement = new ForElement();
        ConsElement consElement = new ConsElement();
        consElement.addElement(new VarElement("a"));
        consElement.addElement(new VarElement("b"));


        AffecationElement affecationElement = new AffecationElement();
        LeftAssignationElement leftAssignationElement = new LeftAssignationElement();
        leftAssignationElement.addElement(new VarElement("a"));
        affecationElement.addElement(leftAssignationElement);

        RightAssignationElement rightAssignationElement = new RightAssignationElement();
        rightAssignationElement.addElement(new VarElement("b"));
        affecationElement.addElement(rightAssignationElement);

        forElement.addElement(affecationElement);
        forElement.addElement(consElement);


        String expected = """
                FOR_%s:
                a = b \n
                ifnz  goto False_label_%s
                goto FOR_%s
                goto EndIf_label_%s :
                False_label_%s:
                EndIf_label_%s :
                """.formatted(forElement.getUniqID(), forElement.getUniqueIDIfnz(), forElement.getUniqID(), forElement.getUniqueIDIfnz(), forElement.getUniqueIDIfnz(), forElement.getUniqueIDIfnz());

        assertEquals(expected, forElement.Build());
    }

    @Test
    public void ForElementBuildEmptyTest() {
        ForElement forElement = new ForElement();
        VarElement varElement = new VarElement("a");
        forElement.addElement(varElement);

        String expected = """
                FOR_%s:
                ifnz  goto False_label_%s
                goto FOR_%s
                goto EndIf_label_%s :
                False_label_%s:
                EndIf_label_%s :
                """.formatted(forElement.getUniqID(), forElement.getUniqueIDIfnz(), forElement.getUniqID(), forElement.getUniqueIDIfnz(), forElement.getUniqueIDIfnz(), forElement.getUniqueIDIfnz());

        assertEquals(expected, forElement.Build());
    }


    @Test
    public void ForElementToJava() {
        ForElement forElement = new ForElement();
        ConsElement consElement = new ConsElement();
        consElement.addElement(new VarElement("a"));
        consElement.addElement(new VarElement("b"));

        forElement.addElement(consElement);

        AffecationElement affecationElement = new AffecationElement();
        LeftAssignationElement leftAssignationElement = new LeftAssignationElement();
        leftAssignationElement.addElement(new VarElement("a"));
        affecationElement.addElement(leftAssignationElement);

        RightAssignationElement rightAssignationElement = new RightAssignationElement();
        rightAssignationElement.addElement(new VarElement("b"));
        affecationElement.addElement(rightAssignationElement);

        forElement.addElement(affecationElement);

        String get = forElement.toJava();
        String expected = """
                for( int %s =0; %s<node.Cons(map.get("a") , map.get("b")).toInt();%s++){\s
                map.put("a" , map.get("b"));
                }
                """.formatted(forElement.getUniqueIForJava(), forElement.getUniqueIForJava(), forElement.getUniqueIForJava());
        assertEquals(expected, get);
    }

}
