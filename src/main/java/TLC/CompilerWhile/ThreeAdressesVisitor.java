package TLC.CompilerWhile;

import TLC.CompilerWhile.ConcreteElements.*;
import TLC.CompilerWhile.ConcreteElements.IfDeclaration;
import org.antlr.runtime.tree.CommonTree;

public class ThreeAdressesVisitor extends Visitor{

  public ThreeAdressesVisitor(CommonTree tree) {
    super(tree);
  }
  public void VisitTypeDeclaration(typeDeclaration t) {

    visitTree(t);
  }

  public void VisitFunc(Func f) {



    //ThreeAdressesManager.getInstance().addFunction( new function(f.getName(), f.getArgs()) );
    visitTree(f);


  }

  public void VisitAffectation(Affectation aff) {


    visitTree(aff);
  }

  public void VisitFunctionBody(FunctionBody def) {
    visitTree(def);
  }

  public void visitArgDeclaration(ArgDeclaration argD) {

    visitTree(argD);
  }

  public void visitArgReturn(ArgReturn argR) {


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

    visitTree(foreachD);


  }

  public void visitAppFunc(AppFunc appF) {
    visitTree(appF);
  }



  public void visitExpCond(ExpCond expC) {


    visitTree(expC);
  }

  public void visitProgrammDeclaration(ProgrammDeclaration progD) {

    visitTree(progD);


  }

  public void visitConditionIF(IfDeclaration condIF) {
    //ThreeAdressesManager.getInstance().setbaliseIf(condIF.getCond());
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

    visitTree(elseD);
  }

}
