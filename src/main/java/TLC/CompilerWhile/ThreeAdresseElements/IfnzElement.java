package TLC.CompilerWhile.ThreeAdresseElements;

import TLC.CompilerWhile.ThreeAdressesManager;

import java.util.ArrayList;

public class IfnzElement extends ThreeAdressElement {

    private CondElement condition;

    private boolean then;

    private int uniquID;
    private boolean hasElse;

    private String labelEnd = "EndIf_label_";

    private String labelFalse = "False_label_";


    private ArrayList<ThreeAdressElement> Else = new ArrayList<ThreeAdressElement>();

    private ArrayList<ThreeAdressElement> Then = new ArrayList<ThreeAdressElement>();

    public IfnzElement(boolean hasElse_) {
        uniquID = ThreeAdressesManager.getInstance().getUniqLabelID();
        hasElse = hasElse_;
        then = true;
    }

    public CondElement getCondElement() {
        return condition;

    }

    public void setCondElement(CondElement cond) {
        condition = cond;
    }

    public void setThen(boolean then_) {
        then = then_;
    }

    public String Build() {

        String s = "";
        s += "ifnz " + condition.Build() + " goto " + labelFalse + (uniquID) + "\n";


        for (ThreeAdressElement e : Else)
            s += e.Build();

        s += "goto " + labelEnd + (uniquID) + " :\n";

        s += labelFalse + (uniquID) + ":\n";
        for (ThreeAdressElement e : Then)
            s += e.Build();

        s += labelEnd + (uniquID) + " :\n";

        return s;
    }

    public void addElement(ThreeAdressElement e) {
        if (e instanceof CondElement) {
            CondElement cond = (CondElement) e;
            condition = cond;
        } else {
            if (then)
                Else.add(e);
            else
                Then.add(e);
        }
    }

    @Override
    public String toJava() {
        return null;
    }


}
