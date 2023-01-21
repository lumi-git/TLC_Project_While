package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

/**
 * This class is used to represent the token ThenDefinition found in the AST
 */
public class ThenDefinition extends TreeNode {

    public ThenDefinition(CommonTree treeNode) {
        super(treeNode);
    }

    /**
     * This method will call the methode corresponding to a then definition depending on the visitor
     * @param v the visitor
     */
    @Override
    public void accept(Visitor v) {

        v.VisitThenDeclaration(this);

    }
}
