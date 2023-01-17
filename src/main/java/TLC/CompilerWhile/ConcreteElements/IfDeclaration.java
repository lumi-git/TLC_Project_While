package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

public class IfDeclaration extends TreeNode {

  CommonTree m_condition;

  public IfDeclaration(CommonTree astNode) {

    super(astNode);
    m_condition =  (CommonTree) astNode.getChild(0);
  }

  @Override
  public void accept(Visitor v) {
    v.visitConditionIF(this);
  }

  public CommonTree getCond(){
    return m_condition;
  }

}

