package TLC.CompilerWhile;
import TLC.CompilerWhile.Errors.ErrorSender;
import TLC.CompilerWhile.Errors.StackOverflowError;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Stack {

  private int id=0;
  static Stack m_instance;
  static int maxDepth = 100000;

  private int index = 1;

  public static void setRecurtionDepth(int depth){
    maxDepth = depth;
  }

  public static Stack getInstance() {

    if (m_instance == null) {
      m_instance = new Stack();
    }

    return m_instance;
  }


  private ArrayList<Block> stack;

  private Block currentBlock;

  private Stack(){
    this.stack = new ArrayList<Block>();
  }

  public boolean VerifyArgsCount(String name, int argsCount) {
    return findSymbolInCurrentPath(name).getParamCount() == argsCount;
  }


  public void addBlock(String name,String symbolName){

    if(stack.size() < maxDepth) {

      int childrenCnt = 0;
      if (currentBlock != null) {
        childrenCnt = currentBlock.getChildCount();
      }

      Block b = new Block("ID" + stack.size() + "_" + name + "_" + childrenCnt, symbolName,
          currentBlock);
      this.stack.add(b);
      currentBlock = b;
    }
    else {
      ErrorSender.sendError(new StackOverflowError("maximum stack depth reached"),true);
    }
  }

  public void addTracedSymbol(SymbolElement s){
    if(Stack.getInstance().findSymbolInCurrentPath(s.getName()) == null) {
      currentBlock.getTab().add(s);
      id++;
    }

  }

  public String getAdressOfSymbol(String name){
    if (findSymbolInCurrentPath(name) != null) {

      return "SYM_" + findSymbolInCurrentPath(name).getUniqueID();
    }
    else {
      return "nil";
    }
  }

  public boolean ExistMain(){
    SymbolElement main = findSymbol("main");

    if(main != null){
      if (main.getkind() == "func"){
        return true;
      }



    }
    return false;

  }


  public int getUniqueID(){
    return this.id;
  }


  public void addSymbol(SymbolElement s){

      currentBlock.getTab().add(s);
      id++;
  }


  public void pop(){
    this.stack.remove(this.stack.size()-1);
  }

  public void next(){
    currentBlock = stack.get(this.index);
    this.index+=1;
  }

  public void back(){

    currentBlock = currentBlock.getParent();

  }


  public String toString(){

    String s = "Symbol Table of : \n";
    for (Block block : stack) {
      s += block + "\n";
    }
    return s;

  }

  public void PrintStackAsMD(){
    //open a file at and write hello world in it
    //close the file
    try {
      FileWriter myWriter = new FileWriter("src/main/java/TLC/CompilerWhile/GeneratedDiagrams/SymbolTable.md");

      String s = "```mermaid\nclassDiagram \n";

      for (Block block : stack) {
        s += block.BlockToMD()+"\n";
      }

      for (Block block : stack) {
        if(block.getParent() != null){
          s += block.getParent().getName() + " --|> " + block.getName() + "\n\n";
        }
      }

      s+="```\n";
      myWriter.write(s);

      myWriter.close();
      System.out.println("Succesfully generated diagram of the symbol table at src/main/java/TLC/CompilerWhile/GeneratedDiagrams/SymbolTable.md");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  public SymbolElement findSymbol(String name){
    for (Block block : stack) {
      SymbolElement s = block.findSymbol(name);
      if (s !=null){
        return s;
      }
    }
    return new SymbolElement("NIL","NIL","var",0,0,0);
  }

  public SymbolElement findSymbolInCurrentBlock(String name){
    return currentBlock.findSymbol(name);
  }


  public SymbolElement findSymbolInCurrentPath(String name){
    if(currentBlock != null){
      return currentBlock.findSymbolInParent(name);
    }
    return new SymbolElement("NIL","NIL","var",0,0,0);
  }

}
