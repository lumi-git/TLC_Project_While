package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

public class ExpCond extends TreeNode {

  private CommonTree cond;

  public ExpCond(CommonTree astNode) {
    super(astNode);

    this.cond = (CommonTree) astNode.getChild(0);



  }

  @Override
  public void accept(Visitor v) {
    v.visitExpCond(this);
  }

  public CommonTree getCond() {
    return cond;
  }



}
