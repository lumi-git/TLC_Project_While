package TLC.CompilerWhile;

import static TLC.CompilerWhile.App.print;

import TLC.CompilerWhile.ConcreteElements.Affectation;
import TLC.CompilerWhile.ConcreteElements.ArgDeclaration;
import TLC.CompilerWhile.ConcreteElements.ArgReturn;
import TLC.CompilerWhile.ConcreteElements.CONSdeclaration;
import TLC.CompilerWhile.ConcreteElements.ConditionIF;
import TLC.CompilerWhile.ConcreteElements.ElseDeclaration;
import TLC.CompilerWhile.ConcreteElements.ExpCond;
import TLC.CompilerWhile.ConcreteElements.ForDeclaration;
import TLC.CompilerWhile.ConcreteElements.ForeachDeclaration;
import TLC.CompilerWhile.ConcreteElements.Func;
import TLC.CompilerWhile.ConcreteElements.FunctionBody;
import TLC.CompilerWhile.ConcreteElements.ProgrammDeclaration;
import TLC.CompilerWhile.ConcreteElements.WhileDeclaration;
import TLC.CompilerWhile.ConcreteElements.symbolDeclaration;
import TLC.CompilerWhile.ConcreteElements.typeDeclaration;
import TLC.CompilerWhile.ConcreteElements.varDeclaration;
import TLC.CompilerWhile.Errors.ErrorSender;
import TLC.CompilerWhile.Errors.FunctionDeclarationDuplicateError;
import TLC.CompilerWhile.Errors.MissingDeclarationError;
import java.util.ArrayList;
import org.antlr.runtime.tree.CommonTree;

public class SymbolTableCreatorVisitor extends Visitor {

  SymbolTableCreatorVisitor(CommonTree tree) {
    super(tree);
  }

  public void VisitTypeDeclaration(typeDeclaration t) {

    visitTree(t);
  }

  public void VisitFunc(Func f) {

    SymbolElement se = Stack.getInstance().findSymbolInCurrentBlock(f.getName());

    if (se != null) {
      ErrorSender.sendError(new FunctionDeclarationDuplicateError(f.getName(),
          f.getLine(), f.getColumn(), se.getLine(), se.getColumn()), false);
    }

    Stack.getInstance()
        .addSymbol(new SymbolElement(f.getName(), "func", "tree", f.getLine(), f.getColumn()));

    Stack.getInstance().addBlock("FUNC", f.getName());
    visitTree(f);
    Stack.getInstance().back();
  }

  public void VisitAffectation(Affectation aff) {
    for (CommonTree t : aff.getRight()) {
      if (Stack.getInstance().findSymbolInCurrentPath(t.toString()) == null) {
        //Not initialized
      }
    }

    Stack.getInstance().addSymbol(
        new SymbolElement(aff.getLeft().toString(), "var", "tree", aff.getLine(), aff.getColumn()));

    visitTree(aff);
  }

  public void VisitFunctionBody(FunctionBody def) {
    visitTree(def);
  }

  public void visitArgDeclaration(ArgDeclaration argD) {
    for (CommonTree t : argD.getArgs()) {
      Stack.getInstance().addSymbol(
          new SymbolElement(t.getText(), "var", "tree", argD.getLine(), argD.getColumn()));
    }
    visitTree(argD);
  }

  public void visitArgReturn(ArgReturn argR) {
    //verify if the args are declared
    for (CommonTree t : argR.getArgs()) {
      if (Stack.getInstance().findSymbolInCurrentPath(t.toString()) == null) {
        //Not initialized
        }
    }

    visitTree(argR);

  }

  public void visitForDeclaration(ForDeclaration forD) {
    Stack.getInstance().addBlock("FOR", "ForLoop");
    visitTree(forD);
    Stack.getInstance().back();
  }

  public void visitForeachDeclaration(ForeachDeclaration foreachD) {

    Stack.getInstance().addBlock("FOREACH", "ForEachLoop");

    Stack.getInstance().addSymbol(
        new SymbolElement(foreachD.getVar().toString(), "var", "tree", foreachD.getLine(),
            foreachD.getColumn()));

    visitTree(foreachD);

    Stack.getInstance().back();


  }

  public void visitWhileDeclaration(WhileDeclaration whileD) {
    Stack.getInstance().addBlock("WHILE", "WhileLoop");
    visitTree(whileD);

    Stack.getInstance().back();
  }


  public void visitExpCond(ExpCond expC) {

    if (Stack.getInstance().findSymbolInCurrentPath(expC.getLeft().toString()) == null) {
      //Not initialized
    }

    if (Stack.getInstance().findSymbolInCurrentPath(expC.getRight().toString()) == null) {
      //Not initialized
    }

    visitTree(expC);
  }

  public void visitProgrammDeclaration(ProgrammDeclaration progD) {

    Stack.getInstance().addBlock("START", "globalProgram");
    visitTree(progD);
    Stack.getInstance().back();

  }

  public void visitConditionIF(ConditionIF condIF) {
    Stack.getInstance().addBlock("IF", "if");
    visitTree(condIF);
    Stack.getInstance().back();

  }

  public void visitSymDeclaration(symbolDeclaration symD) {
    visitTree(symD);
  }

  public void visitCons(CONSdeclaration consD) {
    visitTree(consD);
  }

  public void visitVarDeclaration(varDeclaration varD) {
    visitTree(varD);
  }

  public void visitElseDeclaration(ElseDeclaration elseD) {
    Stack.getInstance().addBlock("ELSE", "else");
    visitTree(elseD);
    Stack.getInstance().back();
  }


}

