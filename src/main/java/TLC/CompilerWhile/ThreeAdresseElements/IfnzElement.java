package TLC.CompilerWhile.ThreeAdresseElements;

import TLC.CompilerWhile.ThreeAdressesManager;

import java.util.ArrayList;
/**
 * This class is extending the ThreeAdressElement class, which is used to create ThreeAdressCode
 *  Based on the AST and the following method, it will generate the ThreeAdressCode of an If not element
 **/
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
        super();
        uniquID = ThreeAdressesManager.getInstance().getUniqLabelID();
        hasElse = hasElse_;
        then = true;
    }

    /**
     * This method will return the condition of the If not element
     * @return the condition of the If not element
     */
    public CondElement getCondElement() {
        return condition;
    }

    /**
     * This method will set the condition of the IfnzElement
     * @param cond the condition of the IfnzElement
     */
    public void setCondElement(CondElement cond) {
        condition = cond;
    }

    /**
     * This method will set the then of the IfnzElement
     * @param then_ the then of the IfnzElement
     */
    public void setThen(boolean then_) {
        then = then_;
    }
    /**
     * This method will Build the ThreeAdress code based on his label and the condition and then build methode
     * @return the ThreeAdressCode of the if element
     **/
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
    /**
     * This method creates the condition of the if with CondElement
     * It also creates the then and else of the if with ThenElement and ElseElement
     * @param e a ThreeAdressElement which will be a CondElement, ThenElement or ElseElement
     */
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
    /**
     * This method will return nothing because we don't need to translate it in java
     * @return null
     */
    public String toJava() {
        return null;
    }

    /**
     * This method will return the unique label of the IfnzElement
     * @return the unique label of the IfnzElement
     */
    public String getUniqID() {
        return Integer.toString(uniquID);
    }

}
