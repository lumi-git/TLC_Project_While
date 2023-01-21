package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

import java.util.ArrayList;

/**
 * This class is used to represent the token AppFunc found in the AST
 */
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
  /**
   * This method will call the methode corresponding to a function call depending on the visitor
   * @param v the visitor
   */
  @Override
  public void accept(Visitor v) {
    v.visitAppFunc(this);
  }

  /**
   * This method will return the name of the function
   * @return the name of the function
   */
    public String getName() {
        return name;
    }

  /**
   * This method will return the number of arguments of the function
   * @return the number of arguments of the function
   */
    public int getArgCount() {
        return ArgCount;
    }

  /**
   * This method will return the arguments of the function
   * @return the arguments of the function
   */
    public ArrayList<String> getArgs(){
      return args;
    }

}
