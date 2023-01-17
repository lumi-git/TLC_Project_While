package TLC.CompilerWhile.Errors;

public class UnexistingSymbolError extends WhileError{

    private String m_name;

    public UnexistingSymbolError(String name, int line, int column) {
        super("Unknown symbol : " + name+"\n"
                + "Did you forget to declare it ?", line, column);
        m_name = name;
    }

    public String getName() {
        return m_name;
    }

}
