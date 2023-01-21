package TLC.CompilerWhile.ThreeAdresseElements;

/**
 * This class is extending the ThreeAdressElement class, which is used to create ThreeAdressCode
 * Based on the AST and the following method, it will generate the ThreeAdressCode of a SourceElement
 **/
public class SourceElement extends ThreeAdressElement {

    public SourceElement() {
        super();

    }

    /**
     * This method will Build the ThreeAdress code based on the children build method
     *
     * @return the ThreeAdressCode of the SourceElement
     **/
    @Override
    public String Build() {
        StringBuilder s = new StringBuilder();
        for (ThreeAdressElement e : children)
            s.append(e.Build());
        return s.toString();
    }

    /**
     * This method will add a child in the list of children which will be build later
     *
     * @param e the threeAdressElement to add
     **/
    @Override
    public void addElement(ThreeAdressElement e) {
        children.add(e);
    }

    /**
     * This method will generate the C++ code of the SourceElement
     *
     * @return the C++ code of the SourceElement
     **/
    @Override
    public String toCpp() {
        String s = """
package TLC.CompilerWhile.CPPOUT;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
public class main {
    static Deque<node> stack = new ArrayDeque<>();
    static Map<String,node> map = new HashMap<>();
                """;

        for (ThreeAdressElement e : children)
            s += e.toCpp();

        s += """
        }
        """;
        return s;
    }

}
