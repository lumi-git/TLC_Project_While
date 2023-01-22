package TLC.CompilerWhile.Errors;
/**
 * This class is used to represent an error found in the AST using also the position of the error
 */
public class WhileError extends ErrorG {

  public static int OFFSET;

  private int m_line;
  private int m_column;

  public WhileError(String message, int line, int column) {
    super(message);
    m_line = line - OFFSET;
    m_column = column ;
  }

  /**
   * This method will return the line where the error was found
   * @return the line where the error was found
   */
  public int getLine() {
    return m_line - OFFSET;
  }
  /**
   * This method will return the place in the line where the error was found
   * @return the place in the line where the error was found
   */
  public int getColumn() {
    return m_column ;
  }

  /**
   * This method will return the message of the error
   * @return the message of the error
   */
  @Override
  public String toString() {
    return "Compile Error -> Error at line " + m_line + " column " + m_column + " : " + m_message;
  }

}

