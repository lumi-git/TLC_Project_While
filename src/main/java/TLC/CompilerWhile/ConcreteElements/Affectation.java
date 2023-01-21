package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.AntLRFiles.WhileParser;
import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import java.util.ArrayList;
import org.antlr.runtime.tree.CommonTree;

/**
 * This class is used to represent the token Affectation found in the AST
 */
public class Affectation extends TreeNode {

  CommonTree right;
  CommonTree left;

  public Affectation(CommonTree astNode) {
    super(astNode);


    line = astNode.getLine();
    column = astNode.getCharPositionInLine();
    left = (CommonTree) astNode.getChild(0);
    right = (CommonTree) astNode.getChild(1);

  }
  /**
   * This method will call the methode corresponding to an affectation depending on the visitor
   * @param v the visitor
   */
  @Override
  public void accept(Visitor v) {
    v.VisitAffectation(this);
  }
  /**
   * This method will return the AST of the left part of the affectation
   * @return the AST of the left part of the affectation
   */
  public CommonTree getLeft() {
    return left;
  }

  /**
   * This method will return the AST of the right part of the affectation
   * @return the AST of the right part of the affectation
   */
  public CommonTree getRight() {
    return right;
  }


}
