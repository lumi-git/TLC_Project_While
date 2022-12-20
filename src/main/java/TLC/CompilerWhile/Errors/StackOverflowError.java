package TLC.CompilerWhile.Errors;

public class StackOverflowError extends ErrorG {

  public StackOverflowError(String message) {
    super(message);
  }

  @Override
  public String toString() {
    return "Stack Overflow : " + getMessage();
  }
}

