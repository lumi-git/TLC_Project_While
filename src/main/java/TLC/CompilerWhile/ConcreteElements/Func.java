package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import java.util.ArrayList;
import org.antlr.runtime.tree.CommonTree;

/**
 * This class is used to represent the token Func found in the AST
 */
public class Func extends TreeNode {

  String name;

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
  /**
   * This method will call the methode corresponding to a function declaration depending on the visitor
   * @param v the visitor
   */
  @Override
  public void accept(Visitor v) {
    v.VisitFunc(this);
  }


  /**
   * This method will return the name of the function
   * @return the name of the function
   */
  public String getName() {
    return name;
  }

  /**
   * This method will return the list of arguments of the function
   * @return the list of arguments of the function
   */
  public ArrayList<String> getArgs() {
    return args;
  }

  /**
   * This method will return the list of return values of the function
   * @return the list of return values of the function
   */
  public ArrayList<String> getReturns() {
    return returns;
  }

}
