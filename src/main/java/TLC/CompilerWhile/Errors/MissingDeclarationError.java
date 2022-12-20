package TLC.CompilerWhile.Errors;

public class MissingDeclarationError extends WhileError {

  private String m_name;

  public MissingDeclarationError(String name, int line, int column) {
    super("Variable " + name + " used but not declared", line, column);
    m_name = name;
  }

  public String getName() {
    return m_name;
  }

}

