package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;
/**
 * This class is used to represent the token FunctionBody found in the AST
 */
public class FunctionBody extends TreeNode {


  public FunctionBody(CommonTree astNode) {
    super(astNode);
  }

  /**
   * This method will call the methode corresponding to a function body depending on the visitor
   * @param v the visitor
   */
  @Override
  public void accept(Visitor v) {
    v.VisitFunctionBody(this);
  }
}
