package TLC.CompilerWhile;

import static TLC.CompilerWhile.App.print;

import TLC.CompilerWhile.ConcreteElements.Affectation;
import TLC.CompilerWhile.ConcreteElements.AppFunc;
import TLC.CompilerWhile.ConcreteElements.ArgDeclaration;
import TLC.CompilerWhile.ConcreteElements.ArgReturn;
import TLC.CompilerWhile.ConcreteElements.ConditionIF;
import TLC.CompilerWhile.ConcreteElements.ExpCond;
import TLC.CompilerWhile.ConcreteElements.ForDeclaration;
import TLC.CompilerWhile.ConcreteElements.ForeachDeclaration;
import TLC.CompilerWhile.ConcreteElements.Func;
import TLC.CompilerWhile.ConcreteElements.FunctionBody;
import TLC.CompilerWhile.ConcreteElements.ProgrammDeclaration;
import TLC.CompilerWhile.ConcreteElements.WhileDeclaration;
import TLC.CompilerWhile.ConcreteElements.symbolDeclaration;
import TLC.CompilerWhile.ConcreteElements.typeDeclaration;
import TLC.CompilerWhile.Errors.ErrorSender;
import TLC.CompilerWhile.Errors.FunctionDeclarationDuplicateError;
import TLC.CompilerWhile.Errors.MissingDeclarationError;
import java.util.ArrayList;
import org.antlr.runtime.tree.CommonTree;

public class PrinterVisitor extends Visitor {

  public PrinterVisitor(CommonTree tree) {
    super(tree);
  }

  public void VisitTypeDeclaration(typeDeclaration t) {

    visitTree(t);

    print("Type Declaration visited : " + t.getName());
  }

  public void VisitFunc(Func f) {

    visitTree(f);

    print("Func visited : " + f.getName());
  }

  public void VisitAffectation(Affectation aff) {
    visitTree(aff);
    print("Affectation visited : " + aff.getLeft() + " = " + aff.getRight());
  }

  public void VisitFunctionBody(FunctionBody def) {
    visitTree(def);
    print("Starting visiting Function body");
  }

  public void visitArgDeclaration(ArgDeclaration argD) {

    visitTree(argD);

    print("ArgDeclaration visited :" + argD.getArgs().toString());
  }

  public void visitArgReturn(ArgReturn argR) {

    visitTree(argR);

    print("ArgReturn visited :" + argR.getArgs().toString());
  }

  public void visitForDeclaration(ForDeclaration forD) {
    print("ForDeclaration visited, loop on variable :" + forD.getVar());
    visitTree(forD);
  }

  public void visitForeachDeclaration(ForeachDeclaration foreachD) {

    print("ForeachDeclaration visited, loop on variable :" + foreachD.getVar());
    visitTree(foreachD);


  }

  public void visitWhileDeclaration(WhileDeclaration whileD) {
    String s = "";
    for (CommonTree t : (ArrayList<CommonTree>) whileD.getCond().getChildren()) {
      s += t.getChild(0).toString();
    }
    print("WhileDeclaration visited, loop on condition :" + s);
    visitTree(whileD);

  }


  public void visitExpCond(ExpCond expC) {

    visitTree(expC);
    print("ExpCond visited :" + expC.getLeft() + " =? " + expC.getRight());
  }

  public void visitProgrammDeclaration(ProgrammDeclaration progD) {

    visitTree(progD);
    print("ProgrammDeclaration visited");
  }

  public void visitConditionIF(ConditionIF condIF) {
    print("ConditionIF visited");
    visitTree(condIF);
  }


  public void visitAppFunc(AppFunc f) {
    print("FuncCall visited"+f.getNode().getChild(0).toString());
    visitTree(f);
  }

  public void visitSymDeclaration(symbolDeclaration symD) {
    print("symbol visited");
  }

}
