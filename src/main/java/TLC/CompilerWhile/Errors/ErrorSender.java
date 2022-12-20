package TLC.CompilerWhile.Errors;

public class ErrorSender {

  public static void sendError(ErrorG error,boolean exit){
    //print a red message
    System.out.println("\033[0;31m"+error.toString()+"\033[0m");
    if(exit)
      System.exit(1);
  }


}
