package TLC.CompilerWhile;

import java.util.ArrayList;

/**
 * This class is used to represent a block of the AST
 */
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

  /**
   * This method will add a child to the block
   * @param b the child to add
   */
  public void addChild(Block b) {
    m_children.add(b);
  }

  /**
   * This method will return the number of child of the block
   * @return the number of child of the block
   */
  public int getChildCount() {
    return m_children.size();
  }

  /**
   * This method will return the name of the block
   * @return the name of the block
   */
  public String getName() {
    return name;
  }

  /**
   * This method will return the symbolTable of the current block
   * @return the symbolTable of the current block
   */
  public ArrayList<SymbolElement> getTab() {
    return tab;
  }

  /**
   * This method will return the parent of the current block
   * @return the parent of the current block
   */
  public Block getParent() {
    return m_parent;
  }

  /**
   * This method will return the symbol element corresponding to the name given in parameter by searching
   * in the symbolTable of the current block
   * @param name the name of the symbol element to find
   * @return the symbol element corresponding to the name given in parameter, null if not found
   */
  public SymbolElement findSymbol(String name) {
    for (SymbolElement s : tab) {
      if (s.getName().equals(name)) {
        return s;
      }
    }
    return null;
  }

  /**
   * This method will return the symbol element corresponding to the name given in parameter by searching in
   * his symbolTable and in his parent symbolTable.
   * @param name the name of the symbol element to find
   * @return the symbol element corresponding to the name given in parameter, null if not found
   */
  public SymbolElement findSymbolInParent(String name) {


      if (findSymbol(name) != null) {
        return findSymbol(name);
      } else if (m_parent != null) {
        return m_parent.findSymbolInParent(name);
      }

    return null;
  }

  /**
   * This method will return a representation of the block and his children
   * @return a representation of the block
   */
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

  /**
   * This method will return a representation of the block and his children
   * @return a representation of the block
   */
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
