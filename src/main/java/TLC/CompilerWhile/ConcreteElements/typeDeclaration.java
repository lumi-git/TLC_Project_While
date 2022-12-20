package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import java.util.ArrayList;
import org.antlr.runtime.tree.CommonTree;

public class typeDeclaration extends TreeNode {

  String name;
  String type;
  ArrayList<String> args;

  public typeDeclaration(CommonTree astNode, String name) {
    super(astNode);
    this.args = new ArrayList<String>();
    this.name = name;
  }


  @Override
  public void accept(Visitor v) {
    v.VisitTypeDeclaration(this);
  }

  public String getName() {
    return name;
  }


  public String getType() {
    return type;
  }


  public ArrayList<String> getArgs() {
    return args;
  }


}
