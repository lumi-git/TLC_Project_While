package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

public class NilDeclaration extends TreeNode {

    public NilDeclaration(CommonTree ct){
        super(ct);
    }

    @Override
    public void accept(Visitor v) {
        v.VisitNilDeclaration(this);
    }
}
