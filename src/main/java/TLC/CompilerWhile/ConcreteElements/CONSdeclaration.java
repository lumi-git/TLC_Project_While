package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;
/**
 * This class is used to represent the token CONSdeclaration found in the AST
 */
public class CONSdeclaration extends TreeNode {


  public CONSdeclaration(CommonTree astNode) {

    super(astNode);

  }

  /**
   * This method will call the methode corresponding to a cons declaration depending on the visitor
   * @param v the visitor
   */
  @Override
  public void accept(Visitor v) {

    v.visitCons(this);

  }
}
