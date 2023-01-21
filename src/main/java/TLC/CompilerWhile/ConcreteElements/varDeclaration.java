package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

/**
 * This class is used to represent the token VarDeclaration found in the AST
 */
public class varDeclaration extends TreeNode {

  private String name;
  public varDeclaration(CommonTree astNode) {

    super(astNode);
    this.name = astNode.getChild(0).toString();
  }

  /**
   * This method will return the name of the variable declared
   * @return the name of the variable declared
   */
  public String getName() {
        return name;
    }

  /**
   * This method will call the methode corresponding to a variable declaration depending on the visitor
   * @param v the visitor
   */
  public void accept(Visitor v) {
    v.visitVarDeclaration(this);
  }


}
