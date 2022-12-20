package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import java.util.ArrayList;
import org.antlr.runtime.tree.CommonTree;

public class ArgReturn extends TreeNode {

  ArrayList<CommonTree> m_args;

  public ArgReturn(CommonTree astNode) {
    super(astNode);
    m_args = new ArrayList<>();

    for (int i = 0; i < astNode.getChildCount(); i++) {
      m_args.add((CommonTree) astNode.getChild(i).getChild(0));
    }

  }

  @Override
  public void accept(Visitor v) {
    v.visitArgReturn(this);
  }

  public ArrayList<CommonTree> getArgs() {
    return m_args;
  }

}
