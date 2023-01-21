package TLC.CompilerWhile.CPPOUT;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class node {

    private node left;
    private node right;


    public node() {
        left = null;
        right = null;
    }

    public static node Cons(node n1, node n2) {
        return new node(n1, n2);
    }


    public node(node n) {
        if (n == null) {
            this.left = null;
            this.right = null;
        } else {
            this.left = n.left;
            this.right = n.right;
        }

    }


    public node(node left, node right) {
        this.left = left;
        this.right = right;

    }

    public boolean isNotEmpty() {
        return !(this.left == null && this.right == null);
    }

    public int toInt() {
        return count();
    }


    public int count() {
        if (this.left == null && this.right == null) {
            return 0;
        } else {
            return 1 + Math.max( (this.left == null )? 0 : this.left.count() , (this.right == null )? 0 : this.right.count());
        }
    }

    public node getHead(){
        return this.left;
    }

    public node getTail(){
        return this.right;
    }

    public String toString(){
        return this.toInt()+"";
    }

    public static node newFromList(List<node> liste){
        node last = new node();
        for( node n : liste){
            last = new node(n, last);
        }
        return last;
    }

}
