package TLC.CompilerWhile.ThreeAdresseElements;

import TLC.CompilerWhile.Stack;

public class ConsElement extends ThreeAdressElement {

    public ConsElement() {
        super();
    }

    @Override
    public String Build() {
        String s = "CONS ";

        for (ThreeAdressElement tae : this.getChildren()) {
            s += tae.Build();
        }
        return s;
    }

    @Override
    public void addElement(ThreeAdressElement e) {
        children.add(e);
    }

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
