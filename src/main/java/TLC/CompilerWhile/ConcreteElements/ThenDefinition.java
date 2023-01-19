package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

public class ThenDefinition extends TreeNode {

    public ThenDefinition(CommonTree treeNode) {
        super(treeNode);
    }

    @Override
    public void accept(Visitor v) {

        v.VisitThenDeclaration(this);

    }
}
