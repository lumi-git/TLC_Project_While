package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

/**
 * This class is used to represent the token LeftCondDeclaration found in the AST
 */
public class LeftCondDeclaration extends TreeNode{

    public LeftCondDeclaration(CommonTree ct){
        super(ct);

    }

    /**
     * This method will call the methode corresponding to a left condition declaration depending on the visitor
     * @param v the visitor
     */
    @Override
    public void accept(Visitor v) {
        v.VisitLeftCondDeclaration(this);
    }
}
