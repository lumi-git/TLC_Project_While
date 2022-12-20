package TLC.CompilerWhile.Errors;

public class FunctionDeclarationDuplicateError extends WhileError {

  private String m_name;

  public FunctionDeclarationDuplicateError(String name, int line, int column, int oLine,
      int oColumn) {
    super("Duplicate function " + name + "\n| Other declaration here at line " + oLine + " column "
        + oColumn, line, column);
    m_name = name;
  }

  public String getName() {
    return m_name;
  }

}
