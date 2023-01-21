package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

/**
 * This class is used to represent the token ForDeclaration found in the AST
 */
public class ForDeclaration extends TreeNode {

  CommonTree var;

  CommonTree m_astNode;

  public ForDeclaration(CommonTree astNode) {
    super(astNode);
    m_astNode = astNode;
    this.var = (CommonTree) astNode.getChild(0).getChild(0);

  }

  /**
   * This method will call the methode corresponding to a for declaration depending on the visitor
   * @param v the visitor
   */
  @Override
  public void accept(Visitor v) {
    v.visitForDeclaration(this);
  }

  /**
   * This method will return the variable associate to the ForDeclaration
   * @return the variable
   */
  public CommonTree getVar() {
    return var;
  }

}
