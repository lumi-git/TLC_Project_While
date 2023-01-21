package TLC.CompilerWhile.Errors;

/**
 * This class is used to represent an error found in the AST
 */
public class ErrorG {
  protected String m_message;

  public ErrorG(String message) {
    m_message = message;
  }

  /**
   * This method will return the message of the error
   * @return the message of the error
   */
  public String toString() {
    return m_message;
  }
  /**
   * This method will return the message of the error
   * @return the message of the error
   */
  public String getMessage() {
    return m_message;
  }

}
