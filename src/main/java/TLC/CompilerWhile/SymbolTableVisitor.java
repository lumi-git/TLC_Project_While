package TLC.CompilerWhile;

import TLC.CompilerWhile.ConcreteElements.Affectation;
import TLC.CompilerWhile.ConcreteElements.AppFunc;
import TLC.CompilerWhile.ConcreteElements.ArgDeclaration;
import TLC.CompilerWhile.ConcreteElements.ArgReturn;
import TLC.CompilerWhile.ConcreteElements.CONSdeclaration;
import TLC.CompilerWhile.ConcreteElements.IfDeclaration;
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
import TLC.CompilerWhile.Errors.InsufisantArgCountError;
import TLC.CompilerWhile.Errors.UnexistingSymbolError;
import org.antlr.runtime.tree.CommonTree;

public class SymbolTableVisitor extends Visitor {

  SymbolTableVisitor(CommonTree tree) {
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
        .addSymbol(new SymbolElement(f.getName(), "func", "tree", f.getLine(), f.getColumn(),
            f.getArgs().size()));

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
    Stack.getInstance().addTracedSymbol(
        new SymbolElement(aff.getLeft().toString(), "var", "tree", aff.getLine(),
            aff.getColumn(),0));

    visitTree(aff);
  }

  public void VisitFunctionBody(FunctionBody def) {
    visitTree(def);
  }

  public void visitArgDeclaration(ArgDeclaration argD) {
    for (CommonTree t : argD.getArgs()) {

      //if the var is not allready declared in the path, we declare it in this block

        Stack.getInstance().addTracedSymbol(
            new SymbolElement(t.getText(), "var", "tree", argD.getLine(), argD.getColumn(),0));

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
    //Stack.getInstance().addBlock("FOR", "ForLoop");
    visitTree(forD);
    //Stack.getInstance().back();
  }

  public void visitWhileDeclaration(WhileDeclaration whileD) {
    //Stack.getInstance().addBlock("WHILE", "WhileLoop");
    visitTree(whileD);
    //Stack.getInstance().back();
  }

  public void visitForeachDeclaration(ForeachDeclaration foreachD) {

    Stack.getInstance().addBlock("FOREACH", "ForEachLoop");

    Stack.getInstance().addSymbol(
        new SymbolElement(foreachD.getVar().toString(), "var", "tree", foreachD.getLine(),
            foreachD.getColumn(),0));
    Stack.getInstance().back();

    visitTree(foreachD);


  }

  public void visitAppFunc(AppFunc appF) {




    if (Stack.getInstance().findSymbolInCurrentPath(appF.getName()) == null ){
      ErrorSender.sendError(new UnexistingSymbolError(appF.getName(), appF.getLine(), appF.getColumn()), false);



    }
    else if(! Stack.getInstance().VerifyArgsCount(appF.getName(), appF.getArgCount())){
      ErrorSender.sendError(new InsufisantArgCountError(appF.getName(), appF.getLine(), appF.getColumn()), false);
    }





    visitTree(appF);


  }



  public void visitExpCond(ExpCond expC) {

    if (Stack.getInstance().findSymbolInCurrentPath(expC.getCond().toString()) == null) {
      //Not initialized
    }

    visitTree(expC);
  }

  public void visitProgrammDeclaration(ProgrammDeclaration progD) {

    Stack.getInstance().addBlock("START", "globalProgram");
    visitTree(progD);
    Stack.getInstance().back();

  }

  public void visitConditionIF(IfDeclaration condIF) {
    //Stack.getInstance().addBlock("IF", "if");
    visitTree(condIF);
    //Stack.getInstance().back();

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
    //Stack.getInstance().addBlock("ELSE", "else");
    visitTree(elseD);
    //Stack.getInstance().back();
  }


}
