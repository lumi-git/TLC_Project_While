package TLC.CompilerWhile;

import TLC.CompilerWhile.AntLRFiles.WhileParser;
import TLC.CompilerWhile.ConcreteElements.*;
import TLC.CompilerWhile.ConcreteElements.IfDeclaration;

import java.util.ArrayList;
import org.antlr.runtime.tree.CommonTree;

public class Visitor {


  private CommonTree m_tree;

  public Visitor(CommonTree tree) {
    this.m_tree = tree;

  }


  public void parse() {
    visitTreeRecursive(m_tree);

  }


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
        ;
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


    }

  }

  public void VisitLeftDeclaration(LeftDefinition left) {

  }

  public void VisitThenDeclaration(ThenDefinition then) {

  }

  public void VisitRightDeclaration(RightDefinition right) {

  }

  public void VisitTypeDeclaration(typeDeclaration t) {

  }

  public void VisitFunc(Func func) {

  }

  public void VisitAffectation(Affectation aff) {

  }

  public void VisitFunctionBody(FunctionBody def) {

  }

  public void visitArgDeclaration(ArgDeclaration argD) {

  }

  public void visitForDeclaration(ForDeclaration forD) {

  }

  public void visitForeachDeclaration(ForeachDeclaration foreachD) {

  }


  public void visitArgReturn(ArgReturn argR) {

  }

  public void visitWhileDeclaration(WhileDeclaration whileD) {

  }

  public void visitConditionIF(IfDeclaration condIF) {

  }


  public void visitExpCond(ExpCond expCond) {

  }

  public void visitProgrammDeclaration(ProgrammDeclaration progD) {

  }

  public void visitElseDeclaration(ElseDeclaration ElsD) {

  }

  public void visitSymDeclaration(symbolDeclaration symD) {

  }

  public void visitCons(CONSdeclaration consD) {

  }

  public void visitVarDeclaration(varDeclaration varD) {

  }

  public void visitAppFunc(AppFunc appF) {

  }


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
