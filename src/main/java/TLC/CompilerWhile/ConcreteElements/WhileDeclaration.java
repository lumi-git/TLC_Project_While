package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

public class WhileDeclaration extends TreeNode {

  CommonTree cond;

  public WhileDeclaration(CommonTree astNode) {
    super(astNode);
    this.cond = (CommonTree) astNode.getChild(0);
  }

  @Override
  public void accept(Visitor v) {
    v.visitWhileDeclaration(this);
  }

  public CommonTree getCond() {
    return cond;
  }

}
