package TLC.CompilerWhile.ThreeAdresseElements;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class SourceElementTest {
    @Test
    public void TestSourceElementAddElement() {
        SourceElement sourceElement = new SourceElement();
        sourceElement.addElement(new VarElement("a"));
        String expected = "a";
        assertEquals(expected, sourceElement.Build());
    }

    @Test
    public void TestSourceElementBuild() {
        SourceElement sourceElement = new SourceElement();
        String expected = "";
        assertEquals(expected, sourceElement.Build());
    }

    @Test
    public void TestSourceElementToJava() {
        SourceElement sourceElement = new SourceElement();
        sourceElement.addElement(new VarElement("a"));
        sourceElement.addElement(new VarElement("b"));
        sourceElement.addElement(new VarElement("c"));
        String expected = """
                package TLC.CompilerWhile.JAVAOUT;
                import java.util.ArrayDeque;
                import java.util.Deque;
                import java.util.HashMap;
                import java.util.Map;
                import java.util.Arrays;
                public class main {
                    static Deque<node> stack = new ArrayDeque<>();
                    static Map<String,node> map = new HashMap<>();
                "a""b""c"}
                """;
        assertEquals(expected, sourceElement.toJava());
    }
}
