package TLC.CompilerWhile;

public class SymbolElement {

  String name;
  String kind;
  String type;
  String UniqueID;
  int line;
  int column;

  public SymbolElement(String name, String kind, String type, int line, int column) {
    this.name = name;
    this.kind = kind;
    this.type = type;
    this.line = line;
    this.column = column;

    this.UniqueID = Stack.getInstance().getUniqueID()+"";


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
    return "->   " + name + " , " + type + " , " + kind + " , UniqueID: "+getUniqueID()+"\n";

  }


}
