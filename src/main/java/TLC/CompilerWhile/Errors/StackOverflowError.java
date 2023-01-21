package TLC.CompilerWhile.Errors;

/**
 * This class is used to represent a stack overflow error found in the AST
 */
public class StackOverflowError extends ErrorG {

  public StackOverflowError(String message) {
    super(message);
  }
  /**
   * This method will return the message of the stack overflow error
   * @return the message of the stack overflow error
   */
  @Override
  public String toString() {
    return "Stack Overflow : " + getMessage();
  }
}

