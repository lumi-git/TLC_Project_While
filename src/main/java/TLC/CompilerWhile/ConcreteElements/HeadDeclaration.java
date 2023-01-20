package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

public class HeadDeclaration extends TreeNode {
    public HeadDeclaration(CommonTree astNode) {
        super(astNode);
    }

    @Override
    public void accept(Visitor v) {
        v.VisitHDDeclaration(this);
    }
}
