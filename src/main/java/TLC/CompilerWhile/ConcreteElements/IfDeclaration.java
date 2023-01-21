package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.AntLRFiles.WhileParser;
import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

/**
 * This class is used to represent the token IfDeclaration found in the AST
 */
public class IfDeclaration extends TreeNode {

  CommonTree m_condition;

  boolean m_hasElse;

  public IfDeclaration(CommonTree astNode) {

    super(astNode);

    m_hasElse = astNode.getChild(astNode.getChildCount()-1).getType() == WhileParser.ELSE;

    m_condition =  (CommonTree) astNode.getChild(0);
  }

  /**
   * This method will call the methode corresponding to an if declaration depending on the visitor
   * @param v the visitor
   */
  @Override
  public void accept(Visitor v) {
    v.visitConditionIF(this);
  }

  /**
   * This method will return the condition associate to the IfDeclaration
   * @return the condition
   */
  public CommonTree getCond(){
    return m_condition;
  }

  /**
   * This method will return true if the ifDeclaration has an else, false otherwise
   * @return true if the ifDeclaration has an else, false otherwise
   */
  public boolean hasElse(){
    return m_hasElse;
  }

}

