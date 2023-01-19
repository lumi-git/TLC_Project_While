package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import java.util.ArrayList;
import org.antlr.runtime.tree.CommonTree;

public class Func extends TreeNode {

  String name;
  String type;
  ArrayList<String> args;

  ArrayList<String> returns;



  public Func(CommonTree astNode) {



    super(astNode);

    this.args = new ArrayList<>();

    CommonTree DefNode = (CommonTree) astNode.getChild(1);
    CommonTree ArgsNode = (CommonTree) DefNode.getChild(0);
    CommonTree ReturnNode = (CommonTree) DefNode.getChild(DefNode.getChildCount()-1);


    for (int i = 0; i < ArgsNode.getChildCount(); i++) {
      this.args.add(ArgsNode.getChild(i).getChild(0).getText());
    }

    this.returns = new ArrayList<>();

    for (int i = 0; i < ReturnNode.getChildCount(); i++) {
      this.returns.add(ReturnNode.getChild(i).getChild(0).getText());
    }


    this.name = astNode.getChild(0).toString();


  }

  @Override
  public void accept(Visitor v) {
    v.VisitFunc(this);
  }

  //getter setters

  public String getName() {
    return name;
  }


  public String getType() {
    return type;
  }


  public ArrayList<String> getArgs() {
    return args;
  }

  public ArrayList<String> getReturns() {
    return returns;
  }

}
