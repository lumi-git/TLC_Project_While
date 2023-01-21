package TLC.CompilerWhile.Errors;
/**
 * This class is used to represent a function declaration error found in the AST
 */
public class FunctionDeclarationDuplicateError extends WhileError {

  private String m_name;

  public FunctionDeclarationDuplicateError(String name, int line, int column, int oLine,
      int oColumn) {
    super("Duplicate function " + name + "\n| Other declaration here at line " + oLine + " column "
        + oColumn, line, column);
    m_name = name;
  }
  /**
   * This method will return the name of the function already declared
   * @return the name of the function already declared
   */
  public String getName() {
    return m_name;
  }

}
