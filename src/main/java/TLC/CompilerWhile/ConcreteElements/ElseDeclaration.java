package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

/**
 * This class is used to represent the token ElseDeclaration found in the AST
 */
public class ElseDeclaration extends TreeNode {

  public ElseDeclaration(CommonTree astNode) {
    super(astNode);
  }

  /**
   * This method will call the methode corresponding to an else declaration depending on the visitor
   * @param v the visitor
   */
  @Override
  public void accept(Visitor v) {
    v.visitElseDeclaration(this);
  }

}
