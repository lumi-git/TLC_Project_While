package TLC.CompilerWhile;

import TLC.CompilerWhile.AntLRFiles.WhileLexer;
import TLC.CompilerWhile.AntLRFiles.WhileParser;
import TLC.CompilerWhile.Errors.ErrorG;
import TLC.CompilerWhile.Errors.ErrorSender;

import TLC.CompilerWhile.Errors.WhileError;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;

import java.io.File;

/**
 * This class is the principle class of the compiler,
 * it is responsible to recover the main file of source code.
 * With help of a parser and a lexer, this class will create a tree representative of the source code.
 * Then with the use of a visitor pattern, we will verify the code and convert it to a new language.
 */

public class App {

  public static void main(String[] a) {

    try {

      //recovering the files we will work on
      String WorkspacePath = "src/main/java/TLC/CompilerWhile/examples/";

      String fileName = "programmSimple.while";

      //the std lib, containing the classical function of our language
      String LibPath = "src/main/java/TLC/CompilerWhile/Libs/";

      String StdLib = "StdLib.while";

      String text = "";

      text = readFileAsString(LibPath + StdLib);

      //offset due to the adding of the lib at the top of the code
      int libOffset = text.lines().toList().size();
      WhileError.OFFSET = libOffset;


      text += readFileAsString(WorkspacePath + fileName);

      //creating a stream of char représentative of the source code
      CharStream stream = new ANTLRStringStream(text);


        //creating a lexer with the stream of char
      WhileLexer lexer = new WhileLexer(stream);

        //creating a token stream with the lexer
      TokenStream tk = new CommonTokenStream(lexer);

        //creating a parser with the token stream
      WhileParser parser = new WhileParser(tk);



      try {

        //the common tree is a representation of the AST
        CommonTree ct = (CommonTree) parser.start().getTree();


        System.out.println(ct.toStringTree());

        //creating a visitor to create the simbole table with the common tree
        SymbolTableVisitor symbolTableVisitor = new SymbolTableVisitor(ct);

        //this vsitor is only to print the
        PrinterVisitor printerVisitor = new PrinterVisitor(ct);

        //creating a visitor to convert the verified code to a new simpler language
        ThreeAdressesVisitor threeAdressesVisitor = new ThreeAdressesVisitor(ct);

        symbolTableVisitor.parse();

        //printerVisitor.parse();

        //this prints the stack in a md file located in the GeneratedDiagrams folder of the project
        Stack.getInstance().PrintStackAsMD();

        threeAdressesVisitor.parse();

        System.out.println(ThreeAdressesManager.getInstance().Build());

        ThreeAdressesManager.getInstance().printToFileCPP();

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

  /**
   * This method is used to read a file as a string and detect error in it using the ErrorSender class
   * @param fileName the name of the file we want to read
   * @return the content of the file as a string
   */
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
