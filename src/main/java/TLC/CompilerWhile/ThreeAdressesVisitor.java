package TLC.CompilerWhile;

import TLC.CompilerWhile.ConcreteElements.*;
import TLC.CompilerWhile.ConcreteElements.IfDeclaration;
import TLC.CompilerWhile.ThreeAdresseElements.*;
import org.antlr.runtime.tree.CommonTree;

/**
 * This class is a ThreeAdressCode version of the visitor pattern, it will help generate the ThreeAdressCode
 */
public class ThreeAdressesVisitor extends Visitor{

  public ThreeAdressesVisitor(CommonTree tree) {
    super(tree);
  }
  public void VisitTypeDeclaration(typeDeclaration t) {

    visitTree(t);
  }

  /**
   * This method will add the function, visit the function, and go back to the parent of the function in the tree
   * @param f the function
   */
  public void VisitFunc(Func f) {

    Stack.getInstance().next();


    Function func = new Function(f.getName());

    ThreeAdressesManager.getInstance().addElement(func);
    visitTree(f);
    ThreeAdressesManager.getInstance().back();


  }

  /**
   * This method will add the affectation, visit the affectation, and go back to the parent of the affectation in the tree
   * @param aff the affectation object
   */
  public void VisitAffectation(Affectation aff) {

    //declare a new affecation

    AffecationElement affecationElement = new AffecationElement();

    ThreeAdressesManager.getInstance().addElement(affecationElement);
    visitTree(aff);

    ThreeAdressesManager.getInstance().back();

  }

  /**
   * This method will visit the function body
   * @param def the function body
   */
  public void VisitFunctionBody(FunctionBody def) {
    visitTree(def);
  }

  /**
   * This method will add the argument declaration, visit the argument declaration, and go back to the parent of the argument declaration in the tree
   * @param argD the arguments declaration of a function
   */
  public void visitArgDeclaration(ArgDeclaration argD) {

    ArgDeclarationElement argDeclarationElement = new ArgDeclarationElement();

    ThreeAdressesManager.getInstance().addElement(argDeclarationElement);

    visitTree(argD);

    ThreeAdressesManager.getInstance().back();

  }

  /**
   * This method will add a new return element, visit the for declaration, and go back to the parent of the argument return in the tree
   * @param argR the return arguments of a function
   */
  public void visitArgReturn(ArgReturn argR) {

    ReturnElement returnElement = new ReturnElement();

    ThreeAdressesManager.getInstance().addElement(returnElement);

    visitTree(argR);

    ThreeAdressesManager.getInstance().back();

  }

  /**
   * This method will add a new for element, visit the for declaration, and go back to the parent of the for declaration in the tree
   * @param forD the for declaration
   */
  public void visitForDeclaration(ForDeclaration forD) {


    ThreeAdressesManager.getInstance().addElement(new ForElement());

    visitTree(forD);

    ThreeAdressesManager.getInstance().back();

  }

  /**
   * This method will add a new while element, visit the while declaration, and go back to the parent of the while declaration in the tree
   * @param whileD the while declaration
   */
  public void visitWhileDeclaration(WhileDeclaration whileD) {
    ThreeAdressesManager.getInstance().addElement(new WhileElement());

    visitTree(whileD);

    ThreeAdressesManager.getInstance().back();

  }

  /**
   * This method will add a new ForEach element, visit the ForEach declaration, and go back to the parent of the ForEach declaration in the tree
   * @param foreachD the foreach declaration
   */
  public void visitForeachDeclaration(ForeachDeclaration foreachD) {

    Stack.getInstance().next();

    ForEachElement forEachElement = new ForEachElement();

    ThreeAdressesManager.getInstance().addElement(forEachElement);

    visitTree(foreachD);

    ThreeAdressesManager.getInstance().back();


  }

  /**
   * This method will add the call to a function, visit the call to a function, and go back to the parent of the call to a function in the tree
   * @param appF the call to a function
   */
  public void visitAppFunc(AppFunc appF) {

    FuncCallElement funcCallElement = new FuncCallElement(appF.getName());

    ThreeAdressesManager.getInstance().addElement(funcCallElement);
    visitTree(appF);

    ThreeAdressesManager.getInstance().back();


  }


  /**
   * This method will add the conditional element, visit the conditional, and go back to the parent of the conditional in the tree
   * @param expC a conditional statement
   */
  public void visitExpCond(ExpCond expC) {

    ThreeAdressesManager.getInstance().addElement(new CondElement());

    visitTree(expC);

    ThreeAdressesManager.getInstance().back();
  }

  /**
   * This method will visit the program declaration
   * @param progD the program declaration
   */
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


        ThreeAdressesManager.getInstance().addElement(new LeftCondElement());

        visitTree(leftD);

        ThreeAdressesManager.getInstance().back();
    }

  public void VisitRightCondDeclaration(RightCondDeclaration rightcond) {

        ThreeAdressesManager.getInstance().addElement(new RightCondElement());

        visitTree(rightcond);

        ThreeAdressesManager.getInstance().back();


  }


}
