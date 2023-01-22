package TLC.CompilerWhile;

import org.antlr.runtime.tree.CommonTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TreeNodeTest {
    /*
    @Test
    public void testGetColumn() {
        CommonTree astNode = new CommonTree();
        astNode.setCharPositionInLine(5);
        TreeNode node = new TreeNodeMock(astNode);
        assertEquals(5, node.getColumn());
    }

    @Test
    public void testGetLine() {
        CommonTree astNode = new CommonTree();
        astNode.setLine(3);
        TreeNode node = new TreeNodeMock(astNode);
        assertEquals(3, node.getLine());
    }

    @Test
    public void testGetNode() {
        CommonTree astNode = new CommonTree();
        TreeNode node = new TreeNodeMock(astNode);
        assertEquals(astNode, node.getNode());
    }

    @Test
    public void testAccept() {
        VisitorMock visitor = new VisitorMock();
        TreeNode node = new TreeNodeMock(new CommonTree());
        node.accept(visitor);
        assertTrue(visitor.visitTreeNodeCalled);
    }
}

class TreeNodeMock extends TreeNode {
    public TreeNodeMock(CommonTree astNode) {
        super(astNode);
    }

    @Override
    public void accept(Visitor v) {
        v.visitTreeNode(this);
    }
}

class VisitorMock extends Visitor {
    public boolean visitTreeNodeCalled = false;

    public VisitorMock(CommonTree tree) {
        super(tree);
    }
    public void visitTreeNode(TreeNode node) {
        visitTreeNodeCalled = true;
    }
    */

}

