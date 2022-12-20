package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.AntLRFiles.WhileParser;
import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import java.util.ArrayList;
import org.antlr.runtime.tree.CommonTree;

public class ArgDeclaration extends TreeNode {

  ArrayList<CommonTree> m_args;


  public ArgDeclaration(CommonTree astNode) {
    super(astNode);

    m_args = new ArrayList<>();
    for (int i = 0; i < astNode.getChildCount(); i++) {

      m_args.add((CommonTree) astNode.getChild(i).getChild(0));

    }
  }

  @Override
  public void accept(Visitor v) {
    v.visitArgDeclaration(this);
  }

  public ArrayList<CommonTree> getArgs() {
    return m_args;
  }


}
