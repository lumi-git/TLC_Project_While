package TLC.CompilerWhile.Errors;

/**
 * This class is used to represent a missing declaration error found in the AST
 */
public class MissingDeclarationError extends WhileError {

  private String m_name;

  public MissingDeclarationError(String name, int line, int column) {
    super("Variable " + name + " used but not declared", line, column);
    m_name = name;
  }

  /**
   * This method will return the name of the variable used but not declared
   * @return the name of the variable used but not declared
   */
  public String getName() {
    return m_name;
  }

}

