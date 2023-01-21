package TLC.CompilerWhile;

public class SymbolElement {

  String name;
  String kind;
  String type;
  String UniqueID;
  int line;
  int column;

  int paramCount;
  int returnCount;

  public SymbolElement(String name, String kind, String type, int line, int column,int paramCount,int returnCount) {
    this.name = name;
    this.kind = kind;
    this.type = type;
    this.line = line;
    this.column = column;
    this.paramCount =paramCount ;
    this.returnCount = returnCount;
    this.UniqueID = Stack.getInstance().getUniqueID()+"";


  }

  public int getParamCount() {
    return paramCount;
  }

  public int getLine() {
    return line;
  }

  public int getColumn() {
    return column;
  }

  public String getName() {
    return name;
  }

  public String getUniqueID() {
    return UniqueID;
  }

  public int getReturnCount(){
    return returnCount;
  }


  public String getkind() {
    return kind;
  }


  public String getType() {
    return type;
  }


  public String toString() {

    return "| " + name + " | " + kind + " | " + type + " |";

  }

  public String ToMD() {
    return "->   " + name + " , " + type + " , " + kind + " , " + paramCount +" , "+ returnCount + " , UniqueID: "+getUniqueID()+"\n";

  }


}
