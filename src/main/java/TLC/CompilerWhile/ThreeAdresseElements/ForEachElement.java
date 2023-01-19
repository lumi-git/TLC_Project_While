package TLC.CompilerWhile.ThreeAdresseElements;

import TLC.CompilerWhile.ThreeAdressesManager;

public class ForEachElement extends ThreeAdressElement{


    private VarElement variableLoop;

    private VarElement variable;


    int recieve = 0;

    private String ForEachLabel = "FOR_EACH";

    private IfnzElement Condition;

    private int uniquID;

    public ForEachElement() {

        uniquID = ThreeAdressesManager.getInstance().getUniqLabelID();

        Condition = new IfnzElement(false);

        Condition.addElement(new GotoElement(ForEachLabel+uniquID));


    }

    @Override
    public String Build() {
        CondElement cnd = new CondElement();

        cnd.addElement(variable);

        Condition.setCondElement(cnd);

        String s = "";
        s += ForEachLabel+ uniquID + ":\n";

        for (ThreeAdressElement e : children)
            s += e.Build();

        s += Condition.Build();
        return s;
    }

    @Override
    public void addElement(ThreeAdressElement e) {
        if (recieve == 0){
            if(e instanceof VarElement){
                variableLoop = (VarElement) e;
                recieve++;
            }
            else{
                children.add(e);
            }
        }
        else if ( recieve == 1){
            if(e instanceof VarElement){
                variable = (VarElement) e;
                recieve++;
            }
            else{
                children.add(e);
            }
        }
        else
            children.add(e);


    }
}
