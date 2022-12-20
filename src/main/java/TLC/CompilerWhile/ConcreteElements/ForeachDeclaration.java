package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

public class ForeachDeclaration extends TreeNode {

  CommonTree var;
  CommonTree iterVar;
  CommonTree body;

  public ForeachDeclaration(CommonTree astNode) {
    super(astNode);
    this.body = (CommonTree) astNode.getChild(2).getChild(0);
    this.var = (CommonTree) astNode.getChild(0).getChild(0);
    this.iterVar = (CommonTree) astNode.getChild(1).getChild(0);

  }


  @Override
  public void accept(Visitor v) {
    v.visitForeachDeclaration(this);
  }


  public CommonTree getVar() {
    return var;
  }
}
