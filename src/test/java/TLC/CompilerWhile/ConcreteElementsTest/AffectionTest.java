package TLC.CompilerWhile.ConcreteElementsTest;

import TLC.CompilerWhile.ConcreteElements.Affectation;
import TLC.CompilerWhile.Visitor;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.tree.CommonTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AffectionTest {
    /*
    @Test
    public void testAccept() {
        CommonTree astNode = new CommonTree(new CommonToken(WhileLanguageLexer.AFFECT));
        CommonTree leftNode = new CommonTree(new CommonToken(WhileLanguageLexer.ID));
        CommonTree rightNode = new CommonTree(new CommonToken(WhileLanguageLexer.PLUS));
        astNode.addChild(leftNode);
        astNode.addChild(rightNode);
        Affectation affectation = new Affectation(astNode);
        TestVisitor visitor = new TestVisitor();
        affectation.accept(visitor);
        assertTrue(visitor.wasCalled);
    }

    @Test
    public void testGetLeft() {
        CommonTree astNode = new CommonTree(new CommonToken(WhileLanguageLexer.AFFECT));
        CommonTree leftNode = new CommonTree(new CommonToken(WhileLanguageLexer.ID));
        CommonTree rightNode = new CommonTree(new CommonToken(WhileLanguageLexer.PLUS));
        astNode.addChild(leftNode);
        astNode.addChild(rightNode);
        Affectation affectation = new Affectation(astNode);
        assertEquals(leftNode, affectation.getLeft());
    }

    @Test
    public void testGetRight() {
        CommonTree astNode = new CommonTree(new CommonToken(WhileLanguageLexer.AFFECT));
        CommonTree leftNode = new CommonTree(new CommonToken(WhileLanguageLexer.ID));
        CommonTree rightNode = new CommonTree(new CommonToken(WhileLanguageLexer.PLUS));
        astNode.addChild(leftNode);
        astNode.addChild(rightNode);
        Affectation affectation = new Affectation(astNode);
        assertEquals(rightNode, affectation.getRight());
    }

    private class TestVisitor extends Visitor {
        public boolean wasCalled = false;
        @Override
        public void VisitAffectation(Affectation a) {
            wasCalled = true;
        }
    }*/
}
