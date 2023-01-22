package TLC.CompilerWhile.ThreeAdresseElements;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class VarElementTest {
    @Test
    public void TestVarElementAddElement() {
        VarElement varElement = new VarElement("a");
        VarElement varElement2 = new VarElement("b");
        varElement.addElement(varElement2);
        String expected = "a";
        assertEquals(expected, varElement.Build());
    }

    @Test
    public void TestVarElementBuild() {
        VarElement varElement = new VarElement("a");
        String expected = "a";
        assertEquals(expected, varElement.Build());
    }

    @Test
    public void TestVarElementToJava() {
        VarElement varElement = new VarElement("a");
        String expected = "\"a\"";
        assertEquals(expected, varElement.toJava());
    }
}
