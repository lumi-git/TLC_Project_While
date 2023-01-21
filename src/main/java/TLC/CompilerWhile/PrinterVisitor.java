package TLC.CompilerWhile;

import TLC.CompilerWhile.ConcreteElements.Affectation;
import TLC.CompilerWhile.ConcreteElements.AppFunc;
import TLC.CompilerWhile.ConcreteElements.ArgDeclaration;
import TLC.CompilerWhile.ConcreteElements.ArgReturn;
import TLC.CompilerWhile.ConcreteElements.IfDeclaration;
import TLC.CompilerWhile.ConcreteElements.ExpCond;
import TLC.CompilerWhile.ConcreteElements.ForDeclaration;
import TLC.CompilerWhile.ConcreteElements.ForeachDeclaration;
import TLC.CompilerWhile.ConcreteElements.Func;
import TLC.CompilerWhile.ConcreteElements.FunctionBody;
import TLC.CompilerWhile.ConcreteElements.ProgrammDeclaration;
import TLC.CompilerWhile.ConcreteElements.WhileDeclaration;
import TLC.CompilerWhile.ConcreteElements.symbolDeclaration;
import TLC.CompilerWhile.ConcreteElements.typeDeclaration;
import java.util.ArrayList;
import org.antlr.runtime.tree.CommonTree;

/**
 * This class is a printer version of the visitor pattern, it will print the tree visited
 */
public class PrinterVisitor extends Visitor {

  public PrinterVisitor(CommonTree tree) {
    super(tree);
  }

  /**
   * This method will print the type declaration visited and continue the visit
   * @param t the type declaration visited
   */
  public void VisitTypeDeclaration(typeDeclaration t) {

    visitTree(t);

    print("Type Declaration visited : " + t.getName());

  }

  /**
   * This method will print the function visited and continue the visit
   * @param f the function visited
   */
  public void VisitFunc(Func f) {

    visitTree(f);

    print("Func visited : " + f.getName());

  }

  /**
   * This method will print the affectation visited and continue the visit
   * @param aff the affectation visited
   */
  public void VisitAffectation(Affectation aff) {

    visitTree(aff);
    print("Affectation visited : " + aff.getLeft() + " = " + aff.getRight());

  }

  /**
   * This method will print an indication that the visitor start visiting the function body and continue the visit
   * @param def the function body
   */
  public void VisitFunctionBody(FunctionBody def) {

    visitTree(def);
    print("Starting visiting Function body");

  }

  /**
   * This method will print the argument declaration visited and continue the visit
   * @param argD the arguments declaration visited
   */
  public void visitArgDeclaration(ArgDeclaration argD) {

    visitTree(argD);

    print("ArgDeclaration visited :" + argD.getArgs().toString());
  }

  /**
   * This method will print the returned argument visited and continue the visit
   * @param argR the returned arguments of a function
   */
  public void visitArgReturn(ArgReturn argR) {

    visitTree(argR);

    print("ArgReturn visited :" + argR.getArgs().toString());
  }

  /**
   * This method will print the for declaration visited and continue the visit
   * @param forD the for declaration
   */
  public void visitForDeclaration(ForDeclaration forD) {

    print("ForDeclaration visited, loop on variable :" + forD.getVar());
    visitTree(forD);

  }

  /**
   * This method will print the foreach declaration visited and continue the visit
   * @param foreachD the foreach declaration
   */
  public void visitForeachDeclaration(ForeachDeclaration foreachD) {

    print("ForeachDeclaration visited, loop on variable :" + foreachD.getVar());
    visitTree(foreachD);

  }

  /**
   * This method will print the while declaration visited and continue the visit
   * @param whileD the while declaration
   */
  public void visitWhileDeclaration(WhileDeclaration whileD) {

    String s = "";
    for (CommonTree t : (ArrayList<CommonTree>) whileD.getCond().getChildren()) {
      s += t.getChild(0).toString();
    }
    print("WhileDeclaration visited, loop on condition :" + s);
    visitTree(whileD);

  }

  /**
   * This method will print the expression of the condition visited and continue the visit
   * @param expC the condition visited
   */
  public void visitExpCond(ExpCond expC) {

    visitTree(expC);
    print("ExpCond visited :" + expC.getCond());

  }

  /**
   * This method will print the program visited and continue the visit
   * @param progD the program declaration
   */
  public void visitProgrammDeclaration(ProgrammDeclaration progD) {

    visitTree(progD);
    print("ProgrammDeclaration visited");

  }

  /**
   * This method will print "IfDeclaration visited" on a IfDeclaration and continue the visit
   * @param condIF the if declaration
   */
  public void visitConditionIF(IfDeclaration condIF) {
    print("IfDeclaration visited");
    visitTree(condIF);
  }

  /**
   * This method will print the function visited, his arguments and continue the visit
   * @param f the call to a function
   */
  public void visitAppFunc(AppFunc f) {


    print("FuncCall visited "+f.getNode().getChild(0).toString());

    print("ARGUMENTS : "+f.getNode().getChildren().toString());

    visitTree(f);
  }

  /**
   * This method will print the symbol declaration visited and continue the visit
   * @param symD the symbol declaration
   */
  public void visitSymDeclaration(symbolDeclaration symD) {
    print("symbol visited");
  }

}
