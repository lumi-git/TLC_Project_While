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
     * this method is used to convert the ThreeAdressCode to C++
     * @return the C++ code of the if element
     */
    @Override
    public String toCpp() {
        String s = "";
        s += "if(" + condition.toCpp() + "){\n";
        s += Then.toCpp();
        s += "}else{\n";
        s += Else.toCpp();
        s += "}\n";
        return s;
    }


}
