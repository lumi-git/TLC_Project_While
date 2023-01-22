package TLC.CompilerWhile.ThreeAdresseElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArgDeclarationElementTest {
    @Test
    public void ArgDeclarationElementAddElementTest() {
        ArgDeclarationElement argDeclarationElement = new ArgDeclarationElement();
        VarElement varElement = new VarElement("a");
        argDeclarationElement.addElement(varElement);

        String expected = "a ";
        assertEquals(expected, argDeclarationElement.Build());
    }

    @Test
    public void ArgDeclarationElementBuildTest() {
        ArgDeclarationElement argDeclarationElement = new ArgDeclarationElement();
        String expected = "";
        assertEquals(expected, argDeclarationElement.Build());
    }

    @Test
    public void ArgDeclarationElementToJavaTest() {
        ArgDeclarationElement argDeclarationElement = new ArgDeclarationElement();

        argDeclarationElement.addElement(new VarElement("a"));
        argDeclarationElement.addElement(new VarElement("b"));
        argDeclarationElement.addElement(new VarElement("c"));
        String expected = "node a, node b, node c";
        assertEquals(expected, argDeclarationElement.toJava());
    }
}
