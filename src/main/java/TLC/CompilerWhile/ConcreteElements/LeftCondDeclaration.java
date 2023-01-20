package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

public class LeftCondDeclaration extends TreeNode{

    public LeftCondDeclaration(CommonTree ct){
        super(ct);

    }

    @Override
    public void accept(Visitor v) {
        v.VisitLeftCondDeclaration(this);
    }


}
