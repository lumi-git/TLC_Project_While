package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import java.util.ArrayList;
import org.antlr.runtime.tree.CommonTree;

/**
 * This class is used to represent the token ArgReturn found in the AST
 */
public class ArgReturn extends TreeNode {

  ArrayList<CommonTree> m_args;

  public ArgReturn(CommonTree astNode) {
    super(astNode);
    m_args = new ArrayList<>();

    for (int i = 0; i < astNode.getChildCount(); i++) {
      m_args.add((CommonTree) astNode.getChild(i).getChild(0));
    }

  }

  /**
   * This method will call the methode corresponding to an argument return depending on the visitor
   * @param v the visitor
   */
  @Override
  public void accept(Visitor v) {
    v.visitArgReturn(this);
  }

  /**
   * This method will return the list of arguments
   * @return the list of arguments
   */
  public ArrayList<CommonTree> getArgs() {
    return m_args;
  }

}
