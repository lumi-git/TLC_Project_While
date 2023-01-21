package TLC.CompilerWhile.Errors;

/**
 * This class is used to represent an error of a symbol, which has not been declared, found in the AST
 */
public class UnexistingSymbolError extends WhileError{

    private String m_name;

    public UnexistingSymbolError(String name, int line, int column) {
        super("Unknown symbol : " + name+"\n"
                + "Did you forget to declare it ?", line, column);
        m_name = name;
    }

    /**
     * This method will return the name of the symbol, which has not been declared
     * @return the name of the symbol, which has not been declared
     */
    public String getName() {
        return m_name;
    }

}
