package TLC.CompilerWhile;

import TLC.CompilerWhile.ConcreteElements.*;
import TLC.CompilerWhile.ThreeAdresseElements.Function;
import org.antlr.runtime.tree.CommonTree;

class TestVisitor extends Visitor {

    public boolean pgVisited = false;
    public boolean DefVisited = false;
    public boolean FuncVisited = false;
    public boolean InputVisited = false;
    public boolean OutputVisited = false;
    public boolean AffectionVisited = false;
    public boolean IfVisited = false;
    public boolean ExprVisited = false;
    public boolean SymbVisited = false;
    public boolean ForVisited = false;
    public boolean ElseVisited = false;
    public boolean NilVisited = false;
    public boolean ThenVisited = false;
    public boolean WhileVisited = false;
    public boolean ConstVisited = false;
    public boolean VarVisited = false;
    public boolean ListVisited = false;
    public boolean TeteVisited = false;
    public boolean QueueVisited = false;
    public boolean LeftVisited = false;
    public boolean RightVisited = false;
    public boolean LeftDefVisited = false;
    public boolean RightDefVisited = false;

    public TestVisitor(CommonTree tree) {
        super(tree);
    }

    public void visitProgrammDeclaration(ProgrammDeclaration pg){
        visitTree(pg);
        pgVisited = true;
    }

    public void VisitFunctionBody(FunctionBody body){
        visitTree(body);
        DefVisited = true;
    }

    public void VisitFunc(Func func){
        visitTree(func);
        FuncVisited = true;
    }

    public void visitArgDeclaration(ArgDeclaration input){
        visitTree(input);
        InputVisited = true;
    }

    public void visitArgReturn(ArgReturn output){
        visitTree(output);
        OutputVisited = true;
    }

    public void VisitAffectation(Affectation aff){
        visitTree(aff);
        AffectionVisited = true;
    }

    public void visitConditionIF(IfDeclaration if_struct){
        visitTree(if_struct);
        IfVisited = true;
    }

    public void visitElseDeclaration(ElseDeclaration else_struct){
        visitTree(else_struct);
        ElseVisited = true;
    }

    public void visitExpCond(ExpCond expr){
        visitTree(expr);
        ExprVisited = true;
    }

    public void visitSymDeclaration(symbolDeclaration symb){
        visitTree(symb);
        SymbVisited = true;
    }

    public void VisitNilDeclaration(NilDeclaration nil){

        visitTree(nil);
        NilVisited = true;
    }

    public void VisitThenDeclaration(ThenDefinition then_struct){
        visitTree(then_struct);
        ThenVisited = true;
    }

    public void visitWhileDeclaration(WhileDeclaration while_struct){
        visitTree(while_struct);
        WhileVisited = true;
    }

    public void visitCons(CONSdeclaration const_struct){
        visitTree(const_struct);
        ConstVisited = true;
    }

    public void visitVarDeclaration(varDeclaration var){
        visitTree(var);
        VarVisited = true;
    }

    public void visitForDeclaration(ForDeclaration for_struct){
        visitTree(for_struct);
        ForVisited = true;
    }

    public void VisitListDeclaration(ListDeclaration list_struct){
        visitTree(list_struct);
        ListVisited = true;
    }

    public void VisitHDDeclaration(HeadDeclaration tete){
        visitTree(tete);
        TeteVisited = true;
    }

    public void VisitTLDeclaration(TailDeclaration queue){
        visitTree(queue);
        QueueVisited = true;
    }

    public void VisitLeftCondDeclaration(LeftCondDeclaration left){
        visitTree(left);
        LeftVisited = true;
    }

    public void VisitRightCondDeclaration(RightCondDeclaration right) {
        visitTree(right);
        RightVisited = true;
    }

    public void VisitLeftDeclaration(LeftDefinition left){
        visitTree(left);
        LeftDefVisited = true;
    }

    public void VisitRightDeclaration(RightDefinition right) {
        visitTree(right);
        RightDefVisited = true;
    }
}