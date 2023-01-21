package TLC.CompilerWhile;

import org.antlr.runtime.tree.CommonTree;
/**
 * This class is used to represent the tokens of the program declaration found in the AST
 */
public abstract class TreeNode {

  private String name;
  protected CommonTree node;
  protected int line;
  protected int column;

  public TreeNode(CommonTree astNode) {
    this.node = astNode;
    this.line = astNode.getLine();
    this.column = astNode.getCharPositionInLine();
  }

  /**
   * This method will return the column of the tree node
   * @return the column of the tree node
   */
  public int getColumn() {
    return column;
  }

  /**
   * This method will return the line of the tree node
   * @return the line of the tree node
   */
  public int getLine() {
    return line;
  }

  /**
   * This method will return this node
   * @return this node
   */
  public CommonTree getNode() {
    return node;
  }

  /**
   * This method will call the methode corresponding depending on the visitor
   * @param v the visitor
   */
  public abstract void accept(Visitor v);

}
