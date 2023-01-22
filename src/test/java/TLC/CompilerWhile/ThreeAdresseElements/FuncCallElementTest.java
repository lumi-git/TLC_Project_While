package TLC.CompilerWhile.ThreeAdresseElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncCallElementTest {
    @Test
    public void TestFuncCallElementAddElement() {
        FuncCallElement funcCallElement = new FuncCallElement("f");
        funcCallElement.addElement(new VarElement("a"));
        funcCallElement.addElement(new VarElement("b"));
        String expected = " Call f(a b )\n";
        assertEquals(expected, funcCallElement.Build());
    }

    @Test
    void TestFuncCallElementBuildEmpty() {
        FuncCallElement funcCallElement = new FuncCallElement("f");
        String expected = " Call f()\n";
        assertEquals(expected, funcCallElement.Build());
    }

    @Test
    void TestFuncCallElementToJava() {
        FuncCallElement funcCallElement = new FuncCallElement("f");
        funcCallElement.addElement(new VarElement("a"));
        funcCallElement.addElement(new VarElement("b"));
        String expected = "f(map.get(\"a\"),map.get(\"b\"))";
        assertEquals(expected, funcCallElement.toJava().replace(" ", ""));
    }

    @Test
    void TestFuncCallElementToJavaCons() {
        FuncCallElement funcCallElement = new FuncCallElement("f");
        ConsElement consElement = new ConsElement();
        consElement.addElement(new VarElement("a"));
        consElement.addElement(new VarElement("b"));

        funcCallElement.addElement(consElement);
        String expected = "f(node.Cons(map.get(\"a\"),map.get(\"b\")))";
        assertEquals(expected, funcCallElement.toJava().replace(" ", ""));
    }

}
