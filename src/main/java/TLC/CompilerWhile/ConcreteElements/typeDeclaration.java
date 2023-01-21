package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import java.util.ArrayList;
import org.antlr.runtime.tree.CommonTree;

/**
 * This class is used to represent the token TypeDeclaration found in the AST
 */
public class typeDeclaration extends TreeNode {

  String name;
  ArrayList<String> args;

  public typeDeclaration(CommonTree astNode, String name) {
    super(astNode);
    this.args = new ArrayList<String>();
    this.name = name;
  }

  /**
   * This method will call the methode corresponding to a type declaration depending on the visitor
   * @param v the visitor
   */
  @Override
  public void accept(Visitor v) {
    v.VisitTypeDeclaration(this);
  }

  /**
   * This method will return the name of the variable declared
   * @return the name of the variable declared
   */
  public String getName() {
    return name;
  }

  /**
   * This method will return the arguments of the right side of the declaration
   * @return the arguments of the right side of the declaration
   */
  public ArrayList<String> getArgs() {
    return args;
  }


}
