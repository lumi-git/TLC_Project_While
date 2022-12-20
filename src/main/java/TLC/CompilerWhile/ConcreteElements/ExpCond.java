package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

public class ExpCond extends TreeNode {

  private CommonTree left;
  private CommonTree right;

  public ExpCond(CommonTree astNode) {
    super(astNode);
    this.left = (CommonTree) astNode.getChild(0).getChild(0);
    this.right = (CommonTree) astNode.getChild(1).getChild(0);


  }

  @Override
  public void accept(Visitor v) {
    v.visitExpCond(this);
  }

  public CommonTree getLeft() {
    return left;
  }

  public CommonTree getRight() {
    return right;
  }


}
