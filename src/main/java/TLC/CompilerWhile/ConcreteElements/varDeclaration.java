package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

public class varDeclaration extends TreeNode {

  private String name;
  public varDeclaration(CommonTree astNode) {

    super(astNode);
    this.name = astNode.getChild(0).toString();


  }
    public String getName() {
        return name;
    }


  public void accept(Visitor v) {
    v.visitVarDeclaration(this);
  }


}
