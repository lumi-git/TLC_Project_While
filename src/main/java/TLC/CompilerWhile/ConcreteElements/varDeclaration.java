package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

public class varDeclaration extends TreeNode {

  public varDeclaration(CommonTree astNode) {
    super(astNode);
  }


  public void accept(Visitor v) {
    v.visitVarDeclaration(this);
  }


}
