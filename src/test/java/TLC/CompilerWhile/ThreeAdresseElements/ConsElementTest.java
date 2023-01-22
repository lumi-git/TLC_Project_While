package TLC.CompilerWhile.ThreeAdresseElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsElementTest {
    @Test
    public void TestConsElementBuild() {
        ConsElement consElement = new ConsElement();
        consElement.addElement(new VarElement("a"));
        consElement.addElement(new VarElement("b"));
        String expected = "CONS ab";
        assertEquals(expected, consElement.Build());
    }

    @Test
    public void TestConsElementToJavaEmpty() {
        ConsElement consElement = new ConsElement();
        String expected = "node.Cons()";
        assertEquals(expected, consElement.toJava());
    }

    @Test
    public void TestConsElementToJavaMultiple() {
        ConsElement consElement = new ConsElement();

        VarElement varElement = new VarElement("a");
        VarElement varElement2 = new VarElement("b");

        consElement.addElement(varElement);
        consElement.addElement(varElement2);

        String expected = "node.Cons(map.get(\"a\") , map.get(\"b\"))";
        assertEquals(expected, consElement.toJava());
    }

    @Test
    public void TestConsElementToJavaOneNil() {
        ConsElement consElement = new ConsElement();

        NilElement nilElement = new NilElement();

        consElement.addElement(nilElement);

        String expected = "node.Cons(new node())";
        assertEquals(expected, consElement.toJava());

    }
}
