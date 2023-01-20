package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

public class RightCondDeclaration extends TreeNode {

  public RightCondDeclaration(CommonTree ct) {
    super(ct);

  }

  @Override
  public void accept(Visitor v) {
    v.VisitRightCondDeclaration(this);
  }

}
