package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

/**
 * This class is used to represent the token RightDefinition found in the AST
 */
public class RightDefinition extends TreeNode {
    public RightDefinition(CommonTree astNode) {
        super(astNode);
    }

    /**
     * This method will call the methode corresponding to a right definition depending on the visitor
     * @param v the visitor
     */
    @Override
    public void accept(Visitor v) {
        v.VisitRightDeclaration(this);
    }
}
