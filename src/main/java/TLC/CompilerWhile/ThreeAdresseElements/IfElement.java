package TLC.CompilerWhile.ThreeAdresseElements;
import TLC.CompilerWhile.ThreeAdressesManager;

import java.util.ArrayList;
/**
 * This class is extending the ThreeAdressElement class, which is used to create ThreeAdressCode
 *  Based on the AST and the following method, it will generate the ThreeAdressCode of an If element
 **/
public class IfElement extends ThreeAdressElement{

    private CondElement condition;


    private int uniquID;
    private boolean hasElse;

    private String labelEnd = "EndIf_label_";

    private String labelTrue = "True_label_";

    private ElseElement Else = null;

    private ThenElement Then = null;

    public IfElement(boolean hasElse_){
        uniquID = ThreeAdressesManager.getInstance().getUniqLabelID();
        hasElse = hasElse_;
    }

    /**
     * This method will Build the ThreeAdress code based on his label and the condition, then and else build
     * @return the ThreeAdressCode of the if element
     **/
    public String Build() {

        String s = "";
        s += "ifz " + condition.Build() + " goto " + labelTrue + (uniquID) + "\n";

        if(hasElse)
            s += Else.Build();

        s += "goto " + labelEnd + (uniquID) + " :\n";

        if(hasElse){
            s += labelTrue+(uniquID)+":\n";
            s += Then.Build();
        }

        s+= labelEnd+(uniquID)+" :\n";

        return s;

    }

    /**
     * This method creates the condition of the if with CondElement
     * It also creates the then and else of the if with ThenElement and ElseElement
     * @param e a ThreeAdressElement which will be a CondElement, ThenElement or ElseElement
     */
    public void addElement(ThreeAdressElement e) {

        if(e instanceof CondElement){
            CondElement cond = (CondElement) e;
            condition = cond;
        }

        else if (e instanceof ThenElement) {
            Then = (ThenElement) e;

        }

        else if (e instanceof ElseElement) {
            Else = (ElseElement) e;
        }
    }

    /**
     * this method is used to convert the ThreeAdresseCode to Java
     * @return the Java code of the if element
     */
    @Override
    public String toJava() {
        String s = "";
        s += "if(" + condition.toJava() + "){\n";
        s += Then.toJava();
        s += "}else{\n";
        if(Else != null)
            s += Else.toJava();
        s += "}\n";
        return s;
    }

    /**
     * This method is used to get the unique id of the if element
     * @return the unique id of the if element
     */
    public String getUniqID(){
        return uniquID+"";
    }


}
