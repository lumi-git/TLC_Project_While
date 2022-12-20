package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

public class AppFunc extends TreeNode {


  public AppFunc(CommonTree astNode) {
    super(astNode);
  }

  @Override
  public void accept(Visitor v) {
    v.visitAppFunc(this);
  }

}
