package TLC.CompilerWhile.JAVAOUT;
import java.util.List;

/**
 * This class represents a node in a tree of the language Java.
 */
public class node {

    private node left;
    private node right;


    public node() {
        left = null;
        right = null;
    }

    /**
     * This method returns the node of a cons
     * @param n1 the left node
     * @param n2 the right node
     * @return the node associate of the cons
     */
    public static node Cons(node n1, node n2) {
        return new node(n1, n2);
    }

    /**
     * This method returns a copy of a node
     * @param n the node to copy
     */
    public node(node n) {
        if (n == null) {
            this.left = null;
            this.right = null;
        } else {
            this.left = n.left;
            this.right = n.right;
        }

    }

    /**
     * This method create a node with two nodes
     * @param left the left node
     * @param right the right node
     */
    public node(node left, node right) {
        this.left = left;
        this.right = right;

    }

    /**
     * This method returns if the node is empty
     * @return true if the node is empty, false otherwise
     */
    public boolean isNotEmpty() {
        return !(this.left == null && this.right == null);
    }

    /**
     * This method returns the count of the node
     * @return the count of the node
     */
    public int toInt() {
        return count();
    }

    /**
     * This method returns the count of the node
     * @return the count of the node
     */
    public int count() {
        if (this.left == null && this.right == null) {
            return 0;
        } else {
            return 1 + Math.max( (this.left == null )? 0 : this.left.count() , (this.right == null )? 0 : this.right.count());
        }
    }

    /**
     * This method will return the head of the node (the left part)
     * @return the head of the node
     */
    public node getHead(){
        return this.left;
    }

    /**
     * This method will return the tail of the node (the right part)
     * @return the tail of the node
     */
    public node getTail(){
        return this.right;
    }

    /**
     * This method will return the value of the node
     * @return the value of the node
     */
    public String toString(){
        return this.toInt()+"";
    }

    /**
     * This method will return a node representing the list of node passed as parameter
     * @param liste the list to represent
     * @return last the node filled
     */
    public static node newFromList(List<node> liste){
        node last = new node();
        for( node n : liste){
            last = new node(n, last);
        }
        return last;
    }

}
