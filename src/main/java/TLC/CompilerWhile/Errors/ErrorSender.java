package TLC.CompilerWhile.Errors;

/**
 * This class is used to print the message of the error in red and exit the program
 */
public class ErrorSender {

  public static void sendError(ErrorG error,boolean exit){
    //print a red message
    System.out.println("\033[0;31m"+error.toString()+"\033[0m");
    if(exit)
      System.exit(1);
  }


}
