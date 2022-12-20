package TLC.CompilerWhile.Errors;

public class ErrorG {
  protected String m_message;

  public ErrorG(String message) {
    m_message = message;
  }

  public String toString() {
    return m_message;
  }

  public String getMessage() {
    return m_message;
  }

}
