package TLC.CompilerWhile.Errors;

public class DeclarationError extends WhileError {

  private String m_name;

  public DeclarationError(String name, int line, int column) {
    super("Variable " + name + " already declared", line, column);
    m_name = name;
  }

  public String getName() {
    return m_name;
  }

}

