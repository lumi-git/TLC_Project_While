package TLC.CompilerWhile.ThreeAdresseElements;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class WhileElementTest {
    @Test
    public void TestWhileElementAddElement() {
        WhileElement whileElement = new WhileElement();
        CondElement condElement = new CondElement();
        condElement.addElement(new VarElement("a"));
        whileElement.addElement(condElement);

        AffecationElement affecationElement = new AffecationElement();
        LeftAssignationElement leftAssignationElement = new LeftAssignationElement();
        leftAssignationElement.addElement(new VarElement("a"));
        affecationElement.addElement(leftAssignationElement);
        RightAssignationElement rightAssignationElement = new RightAssignationElement();
        rightAssignationElement.addElement(new VarElement("b"));
        affecationElement.addElement(rightAssignationElement);
        whileElement.addElement(affecationElement);


        String expected = """
                WHILE_%s:
                a = b\s
                                
                ifnz  goto False_label_%s
                goto WHILE_%s
                goto EndIf_label_%s :
                False_label_%s:
                EndIf_label_%s :          
                """.formatted(whileElement.getuniquID(), whileElement.getUniqueIDIfnz(), whileElement.getuniquID(), whileElement.getUniqueIDIfnz(), whileElement.getUniqueIDIfnz(), whileElement.getUniqueIDIfnz());
        assertEquals(expected, whileElement.Build());
    }

    @Test
    public void TestWhileElementAddElement2() {
        WhileElement whileElement = new WhileElement();
        CondElement condElement = new CondElement();
        condElement.addElement(new VarElement("a"));
        whileElement.addElement(condElement);

        String expected = """
                WHILE_%s:            
                ifnz  goto False_label_%s
                goto WHILE_%s
                goto EndIf_label_%s :
                False_label_%s:
                EndIf_label_%s :          
                """.formatted(whileElement.getuniquID(), whileElement.getUniqueIDIfnz(), whileElement.getuniquID(), whileElement.getUniqueIDIfnz(), whileElement.getUniqueIDIfnz(), whileElement.getUniqueIDIfnz());
        assertEquals(expected, whileElement.Build());
    }

    @Test
    public void TestWhileElementBuild() {
        WhileElement whileElement = new WhileElement();
        CondElement condElement = new CondElement();
        LeftAssignationElement leftAssignationElement = new LeftAssignationElement();
        leftAssignationElement.addElement(new VarElement("a"));
        condElement.addElement(leftAssignationElement);
        RightAssignationElement rightAssignationElement = new RightAssignationElement();
        rightAssignationElement.addElement(new VarElement("b"));
        condElement.addElement(rightAssignationElement);
        whileElement.addElement(condElement);
        String expected = """
                WHILE_%s:
                ifnz  goto False_label_%s
                goto WHILE_%s
                goto EndIf_label_%s :
                False_label_%s:
                EndIf_label_%s :          
                """.formatted(whileElement.getuniquID(), whileElement.getUniqueIDIfnz(), whileElement.getuniquID(), whileElement.getUniqueIDIfnz(), whileElement.getUniqueIDIfnz(), whileElement.getUniqueIDIfnz());

        assertEquals(expected, whileElement.Build());
    }

}
