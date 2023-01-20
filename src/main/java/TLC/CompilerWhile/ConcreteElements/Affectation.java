package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.AntLRFiles.WhileParser;
import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import java.util.ArrayList;
import org.antlr.runtime.tree.CommonTree;

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

  @Override
  public void accept(Visitor v) {
    v.VisitAffectation(this);
  }

  public CommonTree getLeft() {
    return left;
  }

  public CommonTree getRight() {
    return right;
  }


}
