package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

public class ForDeclaration extends TreeNode {

  CommonTree var;

  CommonTree m_astNode;

  public ForDeclaration(CommonTree astNode) {
    super(astNode);
    m_astNode = astNode;
    this.var = (CommonTree) astNode.getChild(1).getChild(0);

  }

  @Override
  public void accept(Visitor v) {
    v.visitForDeclaration(this);
  }

  public CommonTree getVar() {
    return var;
  }

}
