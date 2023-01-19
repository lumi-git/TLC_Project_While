package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.AntLRFiles.WhileParser;
import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

public class IfDeclaration extends TreeNode {

  CommonTree m_condition;

  boolean m_hasElse;

  public IfDeclaration(CommonTree astNode) {

    super(astNode);

    m_hasElse = astNode.getChild(astNode.getChildCount()-1).getType() == WhileParser.ELSE;

    m_condition =  (CommonTree) astNode.getChild(0);
  }

  @Override
  public void accept(Visitor v) {
    v.visitConditionIF(this);
  }

  public CommonTree getCond(){
    return m_condition;
  }

  public boolean hasElse(){
    return m_hasElse;
  }

}

