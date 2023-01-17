package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.AntLRFiles.WhileParser;
import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import java.util.ArrayList;
import org.antlr.runtime.tree.CommonTree;

public class Affectation extends TreeNode {

  ArrayList<CommonTree> right;
  CommonTree left;

  public Affectation(CommonTree astNode) {
    super(astNode);
    line = astNode.getLine();
    column = astNode.getCharPositionInLine();
    right = new ArrayList<>();

    left = (CommonTree) astNode.getChild(0).getChild(0);
    for (int i = 1; i < astNode.getChildCount(); i++) {
      if (astNode.getChild(i).getType() == WhileParser.VARS) {
        right.add((CommonTree) astNode.getChild(i).getChild(0));
      }
    }
  }

  @Override
  public void accept(Visitor v) {
    v.VisitAffectation(this);
  }

  public CommonTree getLeft() {
    return left;
  }

  public ArrayList<CommonTree> getRight() {
    return right;
  }


}
