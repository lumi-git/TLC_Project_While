package TLC.CompilerWhile.ThreeAdresseElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IfElementTest {
    @Test
    public void TestIfElementAddElement() {
        IfElement ifElement = new IfElement(true);
        ifElement.addElement(new CondElement());
        ifElement.addElement(new ThenElement());
        ifElement.addElement(new ElseElement());
        String expected = """
                ifz  goto True_label_%s
                goto EndIf_label_%s :
                True_label_%s:
                EndIf_label_%s :
                """.formatted(ifElement.getUniqID(), ifElement.getUniqID(), ifElement.getUniqID(), ifElement.getUniqID());
        assertEquals(expected, ifElement.Build());
    }
    @Test
    public void TestIfElementAddElementNoElse() {
        IfElement ifElement = new IfElement(false);
        ifElement.addElement(new CondElement());
        ifElement.addElement(new ThenElement());
        String expected = """
                ifz  goto True_label_%s
                goto EndIf_label_%s :
                EndIf_label_%S :
                """.formatted(ifElement.getUniqID(), ifElement.getUniqID(), ifElement.getUniqID());
        assertEquals(expected, ifElement.Build());
    }

    @Test
    public void TestIfElementAddElementToJava() {
        IfElement ifElement = new IfElement(true);
        CondElement condElement = new CondElement();
        LeftCondElement leftCondElement = new LeftCondElement();
        leftCondElement.addElement(new VarElement("a"));
        RightCondElement rightCondElement = new RightCondElement();
        rightCondElement.addElement(new VarElement("b"));
        condElement.addElement(leftCondElement);
        condElement.addElement(rightCondElement);
        ifElement.addElement(condElement);

        ThenElement thenElement = new ThenElement();
        AffecationElement affecationElement = new AffecationElement();
        LeftAssignationElement leftAssignationElement = new LeftAssignationElement();
        leftAssignationElement.addElement(new VarElement("c"));
        RightAssignationElement rightAssignationElement = new RightAssignationElement();
        rightAssignationElement.addElement(new VarElement("d"));
        affecationElement.addElement(leftAssignationElement);
        affecationElement.addElement(rightAssignationElement);
        thenElement.addElement(affecationElement);
        ifElement.addElement(thenElement);

        ElseElement elseElement = new ElseElement();
        AffecationElement affecationElement2 = new AffecationElement();
        LeftAssignationElement leftAssignationElement2 = new LeftAssignationElement();
        leftAssignationElement2.addElement(new VarElement("e"));
        RightAssignationElement rightAssignationElement2 = new RightAssignationElement();
        rightAssignationElement2.addElement(new VarElement("f"));
        affecationElement2.addElement(leftAssignationElement2);
        affecationElement2.addElement(rightAssignationElement2);
        elseElement.addElement(affecationElement2);

        ifElement.addElement(elseElement);
        String expected = """
                if(map.get("a" ).equals("b" )){
                map.put("c" , map.get("d"));
                }else{
                map.put("e" , map.get("f"));
                }
                """;
        assertEquals(expected, ifElement.toJava());
    }
}
