package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import java.util.ArrayList;
import org.antlr.runtime.tree.CommonTree;

public class ConditionIF extends TreeNode {

  public ConditionIF(CommonTree astNode) {
    super(astNode);

  }

  @Override
  public void accept(Visitor v) {
    v.visitConditionIF(this);
  }
}

