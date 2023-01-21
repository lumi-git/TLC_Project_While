package TLC.CompilerWhile.Errors;

/**
 * This class is used to represent a missing main error found in the AST
 */
public class MissingMainError extends ErrorG{

    public MissingMainError() {
        super("");
        super.m_message = "Compilation Error : Missing main function";
    }
}
