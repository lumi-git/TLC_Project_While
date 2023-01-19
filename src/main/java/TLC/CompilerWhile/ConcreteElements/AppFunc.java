package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

import java.util.ArrayList;

public class AppFunc extends TreeNode {


  String name;

  int ArgCount;

  ArrayList<String> args ;


  public AppFunc(CommonTree astNode) {

    super(astNode);
    name = astNode.getChild(0).getText();

    args = new ArrayList<String>();

    for (int i = 1; i < astNode.getChildCount(); i++) {

      args.add(astNode.getChild(i).getChild(0).getText()+astNode.getChild(i).getChild(0).getLine());
    }

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

    public ArrayList<String> getArgs(){
      return args;
    }

}
