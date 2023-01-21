package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

/**
 * This class is used to represent the token ForeachDeclaration found in the AST
 */
public class ForeachDeclaration extends TreeNode {

  CommonTree var;
  CommonTree iterVar;
  CommonTree body;

  public ForeachDeclaration(CommonTree astNode) {
    super(astNode);
    this.body = (CommonTree) astNode.getChild(2).getChild(0);
    this.var = (CommonTree) astNode.getChild(0).getChild(0);
    this.iterVar = (CommonTree) astNode.getChild(1).getChild(0);

  }

  /**
   * This method will call the methode corresponding to a foreach declaration depending on the visitor
   * @param v the visitor
   */
  @Override
  public void accept(Visitor v) {
    v.visitForeachDeclaration(this);
  }

  /**
   * This method will return the variable associate to the ForeachDeclaration
   * @return the variable
   */
  public CommonTree getVar() {
    return var;
  }
}
