package TLC.CompilerWhile;

import TLC.CompilerWhile.ConcreteElements.*;
import TLC.CompilerWhile.ConcreteElements.IfDeclaration;
import TLC.CompilerWhile.ThreeAdresseElements.*;
import org.antlr.runtime.tree.CommonTree;

public class ThreeAdressesVisitor extends Visitor{

  public ThreeAdressesVisitor(CommonTree tree) {
    super(tree);
  }
  public void VisitTypeDeclaration(typeDeclaration t) {

    visitTree(t);
  }

  public void VisitFunc(Func f) {

    Stack.getInstance().next();


    Function func = new Function(f.getName());

    ThreeAdressesManager.getInstance().addElement(func);
    visitTree(f);
    ThreeAdressesManager.getInstance().back();


  }

  public void VisitAffectation(Affectation aff) {

    //declare a new affecation

    AffecationElement affecationElement = new AffecationElement();

    ThreeAdressesManager.getInstance().addElement(affecationElement);
    visitTree(aff);

    ThreeAdressesManager.getInstance().back();

  }

  public void VisitFunctionBody(FunctionBody def) {
    visitTree(def);
  }

  public void visitArgDeclaration(ArgDeclaration argD) {

    ArgDeclarationElement argDeclarationElement = new ArgDeclarationElement();

    ThreeAdressesManager.getInstance().addElement(argDeclarationElement);

    visitTree(argD);

    ThreeAdressesManager.getInstance().back();

  }

  public void visitArgReturn(ArgReturn argR) {

    ReturnElement returnElement = new ReturnElement();

    ThreeAdressesManager.getInstance().addElement(returnElement);

    visitTree(argR);

    ThreeAdressesManager.getInstance().back();

  }

  public void visitForDeclaration(ForDeclaration forD) {


    ThreeAdressesManager.getInstance().addElement(new ForElement());

    visitTree(forD);

    ThreeAdressesManager.getInstance().back();

  }

  public void visitWhileDeclaration(WhileDeclaration whileD) {
    ThreeAdressesManager.getInstance().addElement(new WhileElement());

    visitTree(whileD);

    ThreeAdressesManager.getInstance().back();

  }

  public void visitForeachDeclaration(ForeachDeclaration foreachD) {

    Stack.getInstance().next();

    ForEachElement forEachElement = new ForEachElement();

    ThreeAdressesManager.getInstance().addElement(forEachElement);

    visitTree(foreachD);

    ThreeAdressesManager.getInstance().back();


  }

  public void visitAppFunc(AppFunc appF) {

    FuncCallElement funcCallElement = new FuncCallElement(appF.getName());

    ThreeAdressesManager.getInstance().addElement(funcCallElement);
    visitTree(appF);

    ThreeAdressesManager.getInstance().back();


  }



  public void visitExpCond(ExpCond expC) {

    ThreeAdressesManager.getInstance().addElement(new CondElement());

    visitTree(expC);

    ThreeAdressesManager.getInstance().back();
  }

  public void visitProgrammDeclaration(ProgrammDeclaration progD) {

    visitTree(progD);

  }

  public void visitConditionIF(IfDeclaration condIF) {

    IfElement ifz = new IfElement(condIF.hasElse());

    ThreeAdressesManager.getInstance().addElement(ifz);

    visitTree(condIF);

    ThreeAdressesManager.getInstance().back();

  }


  public void visitSymDeclaration(symbolDeclaration symD) {

    visitTree(symD);
  }

  public void visitCons(CONSdeclaration consD) {

    ThreeAdressesManager.getInstance().addElement(new ConsElement());

    visitTree(consD);

    ThreeAdressesManager.getInstance().back();

  }

  public void visitVarDeclaration(varDeclaration varD) {

    String var = Stack.getInstance().getAdressOfSymbol( varD.getName());

    ThreeAdressesManager.getInstance().addElement(new VarElement(var));

    visitTree(varD);

    ThreeAdressesManager.getInstance().back();
  }


  public void visitElseDeclaration(ElseDeclaration elseD) {

    ThreeAdressesManager.getInstance().addElement(new ElseElement());

    visitTree(elseD);

    ThreeAdressesManager.getInstance().back();
  }

  public void VisitThenDeclaration(ThenDefinition then) {

    ThreeAdressesManager.getInstance().addElement(new ThenElement());

    visitTree(then);

    ThreeAdressesManager.getInstance().back();

  }


  public void VisitLeftDeclaration(LeftDefinition leftD) {

    ThreeAdressesManager.getInstance().addElement(new LeftAssignationElement());

    visitTree(leftD);

    ThreeAdressesManager.getInstance().back();
  }

  public void VisitRightDeclaration(RightDefinition rightD) {

    ThreeAdressesManager.getInstance().addElement(new RightAssignationElement());

    visitTree(rightD);

    ThreeAdressesManager.getInstance().back();
  }

  public void VisitListDeclaration(ListDeclaration listD) {

    ThreeAdressesManager.getInstance().addElement(new ListElement());

    visitTree(listD);

    ThreeAdressesManager.getInstance().back();
  }

  public void VisitNilDeclaration(NilDeclaration nilD) {

    ThreeAdressesManager.getInstance().addElement(new NilElement());

    visitTree(nilD);

    ThreeAdressesManager.getInstance().back();
  }

    public void VisitHDDeclaration(HeadDeclaration headD) {

        ThreeAdressesManager.getInstance().addElement(new HdElement());

        visitTree(headD);

        ThreeAdressesManager.getInstance().back();
    }

    public void VisitTLDeclaration(TailDeclaration tailD) {

        ThreeAdressesManager.getInstance().addElement(new TlElement());

        visitTree(tailD);

        ThreeAdressesManager.getInstance().back();
    }


    public void VisitLeftCondDeclaration(LeftCondDeclaration leftD) {

        ThreeAdressesManager.getInstance().addElement(new LeftAssignationElement());

        visitTree(leftD);

        ThreeAdressesManager.getInstance().back();
    }

  public void VisitRightCondDeclaration(RightCondDeclaration rightcond) {

        ThreeAdressesManager.getInstance().addElement(new RightAssignationElement());

        visitTree(rightcond);

        ThreeAdressesManager.getInstance().back();


  }


}
