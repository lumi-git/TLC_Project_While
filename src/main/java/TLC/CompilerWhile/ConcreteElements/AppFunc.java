package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

public class AppFunc extends TreeNode {


  String name;

  int ArgCount;


  public AppFunc(CommonTree astNode) {

    super(astNode);
    name = astNode.getChild(0).getText();
    ArgCount = astNode.getChildren().size()-1;

  }

  @Override
  public void accept(Visitor v) {
    v.visitAppFunc(this);
  }

    public String getName() {
        return name;
    }

    public int getArgCount() {
        return ArgCount;
    }


}
