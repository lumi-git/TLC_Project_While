package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

public class CONSdeclaration extends TreeNode {


  public CONSdeclaration(CommonTree astNode) {

    super(astNode);

  }

  @Override
  public void accept(Visitor v) {

    v.visitCons(this);

  }
}
