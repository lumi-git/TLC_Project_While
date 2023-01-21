package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

/**
 * This class is used to represent the token ExpCond found in the AST
 */
public class ExpCond extends TreeNode {

  private CommonTree cond;

  public ExpCond(CommonTree astNode) {
    super(astNode);

    this.cond = (CommonTree) astNode.getChild(0);

  }
  /**
   * This method will call the methode corresponding to an expression condition depending on the visitor
   * @param v the visitor
   */
  @Override
  public void accept(Visitor v) {
    v.visitExpCond(this);
  }

  /**
   * This method will return the condition
   * @return the condition
   */
  public CommonTree getCond() {
    return cond;
  }
}
