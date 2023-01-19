package TLC.CompilerWhile.Errors;

import TLC.CompilerWhile.Stack;
import TLC.CompilerWhile.SymbolElement;

public class InsufisantArgCountError extends WhileError {


    private String m_name;

    public InsufisantArgCountError(String name, int line, int column) {

        super("", line, column);

        m_name = name;

        SymbolElement f = Stack.getInstance().findSymbolInCurrentPath(name);


        m_message = "Missing arguments for the function : " + name + "\n| Function "+name+ " Takes "+ f.getParamCount();

    }



    public String getName() {
        return m_name;
    }

}
