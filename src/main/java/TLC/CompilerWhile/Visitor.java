package TLC.CompilerWhile;

import static TLC.CompilerWhile.App.print;

import TLC.CompilerWhile.AntLRFiles.WhileParser;
import TLC.CompilerWhile.ConcreteElements.Affectation;
import TLC.CompilerWhile.ConcreteElements.AppFunc;
import TLC.CompilerWhile.ConcreteElements.ArgDeclaration;
import TLC.CompilerWhile.ConcreteElements.ArgReturn;
import TLC.CompilerWhile.ConcreteElements.CONSdeclaration;
import TLC.CompilerWhile.ConcreteElements.ConditionIF;
import TLC.CompilerWhile.ConcreteElements.ElseDeclaration;
import TLC.CompilerWhile.ConcreteElements.ExpCond;
import TLC.CompilerWhile.ConcreteElements.ForDeclaration;
import TLC.CompilerWhile.ConcreteElements.ForeachDeclaration;
import TLC.CompilerWhile.ConcreteElements.FunctionBody;
import TLC.CompilerWhile.ConcreteElements.Func;
import TLC.CompilerWhile.ConcreteElements.ProgrammDeclaration;
import TLC.CompilerWhile.ConcreteElements.WhileDeclaration;
import TLC.CompilerWhile.ConcreteElements.symbolDeclaration;
import TLC.CompilerWhile.ConcreteElements.typeDeclaration;
import TLC.CompilerWhile.ConcreteElements.varDeclaration;
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

        Func f = new Func((CommonTree) ct, ((CommonTree) ct.getChild(0)).toString());
        f.accept(this);

      }

      case WhileParser.CONS -> {

        for (int i = 0; i < ct.getChildCount(); i++) {
          visitTreeRecursive((CommonTree) ct.getChild(i));
        }
      }

      case WhileParser.Symbol -> {

        symbolDeclaration symD = new symbolDeclaration(ct);
        symD.accept(this);


      }

      case WhileParser.Variable -> {

        varDeclaration varD = new varDeclaration(ct);
        varD.accept(this);

      }

      case WhileParser.IF -> {
        ConditionIF condIF = new ConditionIF((CommonTree) ct);
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


    }

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

  public void visitConditionIF(ConditionIF condIF) {

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
