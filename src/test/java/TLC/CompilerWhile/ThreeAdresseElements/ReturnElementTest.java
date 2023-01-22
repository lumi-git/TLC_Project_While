package TLC.CompilerWhile.ThreeAdresseElements;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class ReturnElementTest {
    @Test
    public void TestReturnElementAddElement() {
        ReturnElement returnElement = new ReturnElement();
        returnElement.addElement(new VarElement("a"));
        String expected = "a ";
        assertEquals(expected, returnElement.Build());
    }

    @Test
    public void TestReturnElementBuild() {
        ReturnElement returnElement = new ReturnElement();
        String expected = "";
        assertEquals(expected, returnElement.Build());
    }

    @Test
    public void TestReturnElementToJava() {
        ReturnElement returnElement = new ReturnElement();
        returnElement.addElement(new VarElement("a"));
        returnElement.addElement(new VarElement("b"));
        returnElement.addElement(new VarElement("c"));
        String expected = "stack.push( map.get(  \"a\" ));stack.push( map.get(  \"b\" ));stack.push( map.get( \"c\" ))";
        assertEquals(expected, returnElement.toJava());
    }
}
