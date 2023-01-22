package TLC.CompilerWhile.ThreeAdresseElements;

import org.junit.jupiter.api.Test;

import java.security.cert.TrustAnchor;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

public class IfnzElementTest {
    @Test
    public void TestIfnzElementAddElement() {
        IfnzElement ifnzElement = new IfnzElement(false);

        CondElement condElement = new CondElement();
        LeftCondElement leftCondElement = new LeftCondElement();
        leftCondElement.addElement(new VarElement("a"));
        RightCondElement rightCondElement = new RightCondElement();
        rightCondElement.addElement(new VarElement("b"));

        condElement.addElement(leftCondElement);
        condElement.addElement(rightCondElement);

        ifnzElement.addElement(condElement);

        AffecationElement affecationElement = new AffecationElement();
        LeftAssignationElement leftAssignationElement = new LeftAssignationElement();
        leftAssignationElement.addElement(new VarElement("c"));
        RightAssignationElement rightAssignationElement = new RightAssignationElement();
        rightAssignationElement.addElement(new VarElement("d"));
        affecationElement.addElement(leftAssignationElement);
        affecationElement.addElement(rightAssignationElement);
        ifnzElement.addElement(affecationElement);


        String expected = """
                ifnz a ==b  goto False_label_%s
                c = d\s
                
                goto EndIf_label_%s :
                False_label_%s:
                EndIf_label_%s :
                """.formatted(ifnzElement.getUniqID(), ifnzElement.getUniqID(), ifnzElement.getUniqID(), ifnzElement.getUniqID());


        assertEquals(expected, ifnzElement.Build());

    }

    @Test
    public void TestIfnzElementGetAndSetCond() {
        IfnzElement ifnzElement = new IfnzElement(false);
        CondElement condElement = new CondElement();
        LeftCondElement leftCondElement = new LeftCondElement();
        leftCondElement.addElement(new VarElement("a"));
        RightCondElement rightCondElement = new RightCondElement();
        rightCondElement.addElement(new VarElement("b"));

        condElement.addElement(leftCondElement);
        condElement.addElement(rightCondElement);

        ifnzElement.setCondElement(condElement);
        assertEquals(condElement, ifnzElement.getCondElement());
    }

    @Test
    public void TestIfnzElementBuild() {
        IfnzElement ifnzElement = new IfnzElement(true);
        CondElement condElement = new CondElement();
        LeftCondElement leftCondElement = new LeftCondElement();
        leftCondElement.addElement(new VarElement("a"));
        RightCondElement rightCondElement = new RightCondElement();
        rightCondElement.addElement(new VarElement("b"));
        condElement.addElement(leftCondElement);
        condElement.addElement(rightCondElement);
        ifnzElement.addElement(condElement);

        AffecationElement affecationElement = new AffecationElement();
        LeftAssignationElement leftAssignationElement = new LeftAssignationElement();
        leftAssignationElement.addElement(new VarElement("c"));
        RightAssignationElement rightAssignationElement = new RightAssignationElement();
        rightAssignationElement.addElement(new VarElement("d"));
        affecationElement.addElement(leftAssignationElement);
        affecationElement.addElement(rightAssignationElement);
        ifnzElement.addElement(affecationElement);

        ifnzElement.setThen(false);

        AffecationElement affecationElement2 = new AffecationElement();
        LeftAssignationElement leftAssignationElement2 = new LeftAssignationElement();
        leftAssignationElement2.addElement(new VarElement("e"));
        RightAssignationElement rightAssignationElement2 = new RightAssignationElement();
        rightAssignationElement2.addElement(new VarElement("f"));
        affecationElement2.addElement(leftAssignationElement2);
        affecationElement2.addElement(rightAssignationElement2);
        ifnzElement.addElement(affecationElement2);

        String expected = """
                ifnz a ==b  goto False_label_%s
                c = d\s
                
                goto EndIf_label_%s :
                False_label_%s:
                e = f\s
                
                EndIf_label_%s :
                """.formatted(ifnzElement.getUniqID(), ifnzElement.getUniqID(), ifnzElement.getUniqID(), ifnzElement.getUniqID());

        assertEquals(expected, ifnzElement.Build());


    }

    @Test
    public void TestIfnzElementToJava() {
        IfnzElement ifnzElement = new IfnzElement(true);
        CondElement condElement = new CondElement();
        LeftCondElement leftCondElement = new LeftCondElement();
        leftCondElement.addElement(new VarElement("a"));
        RightCondElement rightCondElement = new RightCondElement();
        rightCondElement.addElement(new VarElement("b"));
        condElement.addElement(leftCondElement);
        condElement.addElement(rightCondElement);
        ifnzElement.addElement(condElement);

        assertNull(ifnzElement.toJava());
    }
}
