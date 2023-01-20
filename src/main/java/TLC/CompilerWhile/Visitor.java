package TLC.CompilerWhile;

import TLC.CompilerWhile.AntLRFiles.WhileParser;
import TLC.CompilerWhile.ConcreteElements.*;
import TLC.CompilerWhile.ConcreteElements.IfDeclaration;

import java.util.ArrayList;
import org.antlr.runtime.tree.CommonTree;


/**
 * This class is an abstract class that is used to visit a CommonTree
 * Based on the tokens of the tree, it will redirect the call of the visit method to the right method
 *
 * the visitor works with other classes representing the tokens
 *
 * @see TLC.CompilerWhile.ConcreteElements
 *
 *
 *
 */
public class Visitor {


  private CommonTree m_tree;

  public Visitor(CommonTree tree) {
    this.m_tree = tree;

  }


  /**
   * calling this methode will visit and execute the actions of the visitor
   */
  public void parse() {
    visitTreeRecursive(m_tree);

  }


  /**
   *
   * @param ct the AST
   * This methode will choose between the right case based on the type of the entrance token
   *           it will then create a new class, implementing TreeNode
   * @see TLC.CompilerWhile.TreeNode
   */
  public void visitTreeRecursive(CommonTree ct) {



    switch (ct.getType()) {

      case WhileParser.START -> {
        ProgrammDeclaration p = new ProgrammDeclaration(ct);
        p.accept(this);

      }

      case WhileParser.FOR -> {

        ForDeclaration forD = new ForDeclaration(ct);
        forD.accept(this);

      }

      case WhileParser.FOREACH -> {

        ForeachDeclaration foreachD = new ForeachDeclaration((CommonTree) ct);
        foreachD.accept(this);

      }

      case WhileParser.INPUT -> {
        if (ct.getChildCount() != 0) {
          ArgDeclaration argD = new ArgDeclaration((CommonTree) ct);
          argD.accept(this);

        }
      }

      case WhileParser.OUTPUT -> {

        ArgReturn argR = new ArgReturn((CommonTree) ct);
        argR.accept(this);

      }

      case WhileParser.DEFINITION -> {

        FunctionBody fb = new FunctionBody((CommonTree) ct);
        fb.accept(this);


      }

      case WhileParser.FONCTION -> {

        Func f = new Func((CommonTree) ct);
        f.accept(this);

      }

      case WhileParser.CONS -> {

        CONSdeclaration con = new CONSdeclaration(ct);
        con.accept(this);
      }

      case WhileParser.Symbol -> {

        symbolDeclaration symD = new symbolDeclaration(ct);
        symD.accept(this);


      }

      case WhileParser.VARS -> {

        varDeclaration varD = new varDeclaration(ct);
        varD.accept(this);

      }

      case WhileParser.IF -> {
        IfDeclaration condIF = new IfDeclaration((CommonTree) ct);
        condIF.accept(this);
      }

      case WhileParser.ELSE -> {

        ElseDeclaration elseD = new ElseDeclaration((CommonTree) ct);
        elseD.accept(this);

      }

      //case WhileParser.COMP -> print("COMP recognized");

      case WhileParser.EXPCOND -> {

        ExpCond expCond = new ExpCond((CommonTree) ct);
        expCond.accept(this);

      }

      case WhileParser.AFF -> {
        Affectation aff = new Affectation((CommonTree) ct);
        aff.accept(this);

      }

      case WhileParser.WHILE -> {

        WhileDeclaration whileD = new WhileDeclaration((CommonTree) ct);
        whileD.accept(this);

      }

      case WhileParser.APPFUNC -> {
        AppFunc appF = new AppFunc((CommonTree) ct);
        appF.accept(this);
      }

      case WhileParser.LEFT -> {
        LeftDefinition left = new LeftDefinition((CommonTree) ct);
        left.accept(this);
      }

        case WhileParser.RIGHT -> {
          RightDefinition right = new RightDefinition((CommonTree) ct);
            right.accept(this);
        }

        case WhileParser.THEN -> {
          ThenDefinition then = new ThenDefinition((CommonTree) ct);
          then.accept(this);
        }

        case WhileParser.LIST ->{
        ListDeclaration list = new ListDeclaration((CommonTree) ct);
        list.accept(this);

        }

        case WhileParser.NIL -> {
          NilDeclaration nil = new NilDeclaration((CommonTree) ct);
          nil.accept(this);
        }

        case WhileParser.HD -> {
          HeadDeclaration head = new HeadDeclaration((CommonTree) ct);
          head.accept(this);
        }

        case WhileParser.TL -> {

          TailDeclaration tail = new TailDeclaration((CommonTree) ct);
          tail.accept(this);
        }

      case WhileParser.RIGHTCOND -> {
        RightCondDeclaration rightcond = new RightCondDeclaration((CommonTree) ct);
        rightcond.accept(this);
      }

      case WhileParser.LEFTCOND -> {
        LeftCondDeclaration leftcond = new LeftCondDeclaration((CommonTree) ct);
        leftcond.accept(this);


      }

    }

  }

  public void VisitLeftCondDeclaration(LeftCondDeclaration leftcond) {

  }

    public void VisitRightCondDeclaration(RightCondDeclaration rightcond) {

    }

  public void VisitTLDeclaration(TailDeclaration head){

  }

  public void VisitHDDeclaration(HeadDeclaration tail){

  }


    public void VisitNilDeclaration(NilDeclaration nilD) {

    }
    public void VisitListDeclaration(ListDeclaration list){

    }

  /**
   *
   * @param left left side of the affectation
   */

  public void VisitLeftDeclaration(LeftDefinition left) {

  }

  /**
   *
   * @param then then block of a if statement
   */
  public void VisitThenDeclaration(ThenDefinition then) {

  }

  /**
   *
   * @param right right side of the affectation
   */
  public void VisitRightDeclaration(RightDefinition right) {

  }


  public void VisitTypeDeclaration(typeDeclaration t) {

  }

    /**
     *
     * @param func the function
     */
  public void VisitFunc(Func func) {

  }

  /**
   *
   * @param aff the affectation object
   */
  public void VisitAffectation(Affectation aff) {

  }

  /**
   *
   * @param def the function body
   */

  public void VisitFunctionBody(FunctionBody def) {

  }


  /**
   *
   * @param argD the arguments declaration of a function
   */
  public void visitArgDeclaration(ArgDeclaration argD) {

  }

  /**
   *
   * @param forD the for declaration
   */
  public void visitForDeclaration(ForDeclaration forD) {

  }

  /**
   *
   * @param foreachD the foreach declaration
   */
  public void visitForeachDeclaration(ForeachDeclaration foreachD) {

  }


  /**
   *
   * @param argR the return arguments of a function
   */
  public void visitArgReturn(ArgReturn argR) {

  }

  /**
   *
   * @param whileD the while declaration
   */
  public void visitWhileDeclaration(WhileDeclaration whileD) {

  }


  /**
   *
   * @param condIF the if declaration
   */
  public void visitConditionIF(IfDeclaration condIF) {

  }


  /**
   *
   * @param expCond a conditional statment
   */
  public void visitExpCond(ExpCond expCond) {

  }

  /**
   *
   * @param progD the program declaration
   */
  public void visitProgrammDeclaration(ProgrammDeclaration progD) {

  }

    /**
     *
     * @param ElsD the else declaration of a if statement
     */
  public void visitElseDeclaration(ElseDeclaration ElsD) {

  }


  /**
   *
   * @param symD the symbol declaration
   */

  public void visitSymDeclaration(symbolDeclaration symD) {

  }

  /**
   *
   * @param consD the cons declaration
   */
  public void visitCons(CONSdeclaration consD) {

  }

  /**
   *
   * @param varD the var declaration
   */
  public void visitVarDeclaration(varDeclaration varD) {

  }

  /**
   *
   * @param appF the call to a function
   */
  public void visitAppFunc(AppFunc appF) {

  }


  /**
   *
   * @param tn
   */
  public void visitTree(TreeNode tn) {
    if (tn.getNode().getChildren() != null) {
      for (CommonTree node : (ArrayList<CommonTree>) tn.getNode().getChildren()) {
        visitTreeRecursive((CommonTree) node);
      }
    }
  }

  public void print(String s) {
    System.out.println(s);
  }

}
/*
public class thread extends Thread{

  static int count = 0 ;

  public thread(){

  }

    public void run(){
          for(int i = 0 ; i < 1000000 ; i++){
            count++;
          }
    }

}
    */
