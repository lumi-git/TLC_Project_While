package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

/**
 * This class is used to represent the token RightCondDeclaration found in the AST
 */
public class RightCondDeclaration extends TreeNode {

  public RightCondDeclaration(CommonTree ct) {
    super(ct);
  }

  /**
   * This method will call the methode corresponding to a right condition declaration depending on the visitor
   * @param v the visitor
   */
  @Override
  public void accept(Visitor v) {
    v.VisitRightCondDeclaration(this);
  }
}
