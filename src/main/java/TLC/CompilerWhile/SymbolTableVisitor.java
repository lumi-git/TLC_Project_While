package TLC.CompilerWhile;

import TLC.CompilerWhile.ConcreteElements.*;
import TLC.CompilerWhile.Errors.*;
import org.antlr.runtime.tree.CommonTree;

import java.util.ArrayList;

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
            f.getArgs().size(),f.getReturns().size()));

    Stack.getInstance().addBlock("FUNC", f.getName());
    visitTree(f);
    Stack.getInstance().back();
  }

  public void VisitAffectation(Affectation aff) {


    for (CommonTree ct : (ArrayList<CommonTree>) aff.getLeft().getChildren()){
      Stack.getInstance().addTracedSymbol(
              new SymbolElement(ct.getChild(0).toString(), "var", "tree", aff.getLine(),
                      aff.getColumn(),0,1));

    }


    visitTree(aff);
  }


  public void VisitFunctionBody(FunctionBody def) {
    visitTree(def);
  }


  public void VisitThenDeclaration(ThenDefinition thenD) {
    visitTree(thenD);
  }


  public void visitArgDeclaration(ArgDeclaration argD) {
    for (CommonTree t : argD.getArgs()) {
      //if the var is not already declared in the path, we declare it in this block
        Stack.getInstance().addTracedSymbol(
            new SymbolElement(t.getText(), "var", "tree", argD.getLine(), argD.getColumn(),0,1));

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
            foreachD.getColumn(),0,1));
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

    if(!Stack.getInstance().ExistMain()){
      ErrorSender.sendError(new MissingMainError(), false);
    }

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

  public void VisitLeftDeclaration(LeftDefinition leftD) {
    visitTree(leftD);
  }

    public void VisitRightDeclaration(RightDefinition rightD) {
        visitTree(rightD);
    }

    public void VisitListDeclaration(ListDeclaration listD) {
        visitTree(listD);
    }

}
