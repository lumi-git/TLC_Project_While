package TLC.CompilerWhile.ThreeAdresseElements;
import TLC.CompilerWhile.ThreeAdressesManager;

import java.util.ArrayList;

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




}
