package TLC.CompilerWhile.Errors;

import TLC.CompilerWhile.Stack;
import TLC.CompilerWhile.SymbolElement;

/**
 * This class is used to represent an insufficient argument count error found in the AST
 */
public class InsufisantArgCountError extends WhileError {


    private String m_name;

    public InsufisantArgCountError(String name, int line, int column) {

        super("", line, column);

        m_name = name;

        SymbolElement f = Stack.getInstance().findSymbolInCurrentPath(name);


        m_message = "Missing arguments for the function : " + name + "\n| Function "+name+ " Takes "+ f.getParamCount();

    }

    /**
     * This method will return the name of the function, which lack in arguments
     * @return the name of the function, which lack in arguments
     */
    public String getName() {
        return m_name;
    }

}
