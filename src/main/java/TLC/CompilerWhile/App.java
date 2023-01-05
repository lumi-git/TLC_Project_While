package TLC.CompilerWhile;

import TLC.CompilerWhile.AntLRFiles.WhileLexer;
import TLC.CompilerWhile.AntLRFiles.WhileParser;
import TLC.CompilerWhile.Errors.ErrorG;
import TLC.CompilerWhile.Errors.ErrorSender;

import java.util.concurrent.Callable;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;

public class App {

  public static void main(String[] a) {

    try {

      String WorkspacePath = "src/main/java/TLC/CompilerWhile/examples/";
      String fileName = "programm.while";

      String text = readFileAsString(WorkspacePath + fileName);

      CharStream stream = new ANTLRStringStream(text);

      WhileLexer lexer = new WhileLexer(stream);

      TokenStream tk = new CommonTokenStream(lexer);

      WhileParser parser = new WhileParser(tk);

      try {

        CommonTree ct = (CommonTree) parser.start().getTree();

        //declaration of the visitors
        SymbolTableCreatorVisitor visitorSymbolTable = new SymbolTableCreatorVisitor(ct);

        TestSymbolTableVisitor testSymbolTable = new TestSymbolTableVisitor(ct);

        PrinterVisitor printerVisitor = new PrinterVisitor(ct);


        //uses of the visitors
        //visitorSymbolTable.parse();
        testSymbolTable.parse();

        Stack.getInstance().PrintStackAsMD();

        printerVisitor.parse();

        //Tranform the tree into 3 address code using




      } catch (Exception e) {
        System.out.println(e.getMessage());
      }

    } catch (Exception e) {
      System.out.println("Error while lexing");
    }
  }

  static void print(String s) {
    System.out.println(s);
  }


  public static String readFileAsString(String fileName) {
    String data = "";

    try {
      data = new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(fileName)));
    } catch (Exception e) {

      ErrorSender.sendError(new ErrorG("File error at " + e.getMessage()), true);
      System.exit(1);
    }
    return data;
  }


}
