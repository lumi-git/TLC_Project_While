package TLC.CompilerWhile.Errors;
/**
 * This class is used to represent a declaration error found in the AST
 */
public class DeclarationError extends WhileError {

  private String m_name;

  public DeclarationError(String name, int line, int column) {
    super("Variable " + name + " already declared", line, column);
    m_name = name;
  }

  /**
   * This method will return the name of the variable already declared
   * @return the name of the variable already declared
   */
  public String getName() {
    return m_name;
  }

}

