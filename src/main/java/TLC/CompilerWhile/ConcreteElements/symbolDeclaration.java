package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

public class symbolDeclaration extends TreeNode {

  public symbolDeclaration(CommonTree astNode) {
    super(astNode);
  }

  @Override
  public void accept(Visitor v) {
    v.visitSymDeclaration(this);
  }
}
