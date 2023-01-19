package TLC.CompilerWhile;

import org.antlr.runtime.tree.CommonTree;

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
  public int getColumn() {
    return column;
  }
  public int getLine() {
    return line;
  }
  public CommonTree getNode() {
    return node;
  }

  public abstract void accept(Visitor v);

}
