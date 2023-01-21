package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

/**
 * This class is used to represent the token LeftDefinition found in the AST
 */
public class LeftDefinition extends TreeNode {
    public LeftDefinition(CommonTree astNode) {
        super(astNode);
    }

    /**
     * This method will call the methode corresponding to a left definition depending on the visitor
     * @param v the visitor
     */
    @Override
    public void accept(Visitor v) {
        v.VisitLeftDeclaration(this);
    }
}
