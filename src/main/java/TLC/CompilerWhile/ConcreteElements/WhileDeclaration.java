package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

/**
 * This class is used to represent the token WhileDeclaration found in the AST
 */
public class WhileDeclaration extends TreeNode {

  CommonTree cond;

  public WhileDeclaration(CommonTree astNode) {
    super(astNode);
    this.cond = (CommonTree) astNode.getChild(0);
  }

  /**
   * This method will call the methode corresponding to a while declaration depending on the visitor
   * @param v the visitor
   */
  @Override
  public void accept(Visitor v) {
    v.visitWhileDeclaration(this);
  }

  /**
   * This method returns the condition of the while declaration
   * @return the condition of the while declaration
   */
  public CommonTree getCond() {
    return cond;
  }

}
