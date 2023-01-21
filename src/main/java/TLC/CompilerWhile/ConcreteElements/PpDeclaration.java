package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

public class PpDeclaration extends TreeNode {

    public PpDeclaration(CommonTree ct){
        super(ct);
    }

    @Override
    public void accept(Visitor v) {
        v.VisitPpDeclaration(this);
    }

}
