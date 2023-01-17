package TLC.CompilerWhile.Errors;

public class WhileError extends ErrorG {

  public static int OFFSET;

  private int m_line;
  private int m_column;

  public WhileError(String message, int line, int column) {
    super(message);
    m_line = line - OFFSET;
    m_column = column ;
  }

  public int getLine() {
    return m_line - OFFSET+1;
  }

  public int getColumn() {
    return m_column ;
  }

  @Override
  public String toString() {
    return "Compile Error -> Error at line " + m_line + " column " + m_column + " : " + m_message;
  }

}

