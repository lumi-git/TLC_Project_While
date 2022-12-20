package TLC.CompilerWhile;

import java.util.ArrayList;

public class Block {

  Block m_parent;

  ArrayList<Block> m_children;

  ArrayList<SymbolElement> tab;
  String name;
  String symbolName;


  public Block(String name, String symbName, Block parent) {

    m_children = new ArrayList<Block>();

    if (parent != null) {
      parent.addChild(this);
    }
    this.tab = new ArrayList<SymbolElement>();
    this.name = name;
    m_parent = parent;
    symbolName = symbName;
  }

  public void addChild(Block b) {
    m_children.add(b);
  }

  public int getChildCount() {
    return m_children.size();
  }


  public String getName() {
    return name;
  }

  public ArrayList<SymbolElement> getTab() {
    return tab;
  }

  public Block getParent() {
    return m_parent;
  }

  public SymbolElement findSymbol(String name) {
    for (SymbolElement s : tab) {
      if (s.getName().equals(name)) {
        return s;
      }
    }
    return null;
  }

  public SymbolElement findSymbolInParent(String name) {
    if (m_parent != null) {

      if (findSymbol(name) != null) {
        return findSymbol(name);
      } else {
        return m_parent.findSymbolInParent(name);
      }
    }
    return null;
  }


  public String toString() {

    String s = "Table Name :" + name + "\n";

    if (m_parent != null) {
      s += "Parent : " + m_parent.getName() + "\n";
    }

    s += " _______Table________\n"
        + "| name | kind | type |\n";

    for (SymbolElement symbolElement : tab) {
      s += symbolElement + "\n";
    }

    s += " ____________________\n";
    return s;

  }


  public String BlockToMD() {
    String s = "class " + name + "{\n";
    s += "   Name : " + symbolName + "\n";
    s += "   -------------------------\n";
    s += "   | name | kind | type |\n";
    s += "   --------------------------\n";
    for (SymbolElement symbolElement : tab) {
      s += "   " + symbolElement.ToMD() + "\n";
    }
    s += "}\n";
    return s;
  }


}
