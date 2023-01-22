package TLC.CompilerWhile.ThreeAdresseElements;

import TLC.CompilerWhile.Stack;

public class ConsElement extends ThreeAdressElement {

    public ConsElement() {
        super();
    }
    /**
     * This method will Build the ThreeAdresseCode based on the children build method
     *
     * @return s the ThreeAdresseCode of the conditional element
     **/
    @Override
    public String Build() {
        String s = "CONS ";

        for (ThreeAdressElement tae : this.getChildren()) {
            s += tae.Build();
        }
        return s;
    }

    /**
     * This method adds a child in the list of children which will be build later
     *
     * @param e a ThreeAdressElement
     **/
    @Override
    public void addElement(ThreeAdressElement e) {
        children.add(e);
    }
    /**
     * This method will return the equivalent of a cons element in Java
     * @return the equivalent of a cons element in Java
     */
    @Override
    public String toJava() {
        String s = "";
        String left = "";
        String right = "";


        if (children.size() > 0) {
            ThreeAdressElement taeLeft = children.get(0);
            if (taeLeft instanceof VarElement) {
                left = ((VarElement) taeLeft).fromMap();
            } else
                left += taeLeft.toJava();

        }

        if (children.size() > 1) {
            ThreeAdressElement taeRight = children.get(1);
            if (taeRight instanceof VarElement) {
                right = ((VarElement) taeRight).fromMap();
            } else
                right += taeRight.toJava();
            right = " , " + right;
        }


        s = "node.Cons(" + left + right + ")";

        return s;

    }
}
