package TLC.CompilerWhile.ConcreteElements;

import TLC.CompilerWhile.TreeNode;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.tree.CommonTree;

/**
 * This class is used to represent the token NilDeclaration found in the AST
 */
public class NilDeclaration extends TreeNode {

    public NilDeclaration(CommonTree ct){
        super(ct);
    }

    /**
     * This method will call the methode corresponding to a nil declaration depending on the visitor
     * @param v the visitor
     */
    @Override
    public void accept(Visitor v) {
        v.VisitNilDeclaration(this);
    }

}
