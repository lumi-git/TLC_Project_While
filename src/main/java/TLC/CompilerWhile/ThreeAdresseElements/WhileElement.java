package TLC.CompilerWhile.ThreeAdresseElements;

import TLC.CompilerWhile.ThreeAdressesManager;

public class WhileElement extends ThreeAdressElement{

    private CondElement cond;
    int recieve = 0;

    private String WhileLabel = "WHILE_";

    private IfnzElement Condition;

    private int uniquID;

    public WhileElement() {

        uniquID = ThreeAdressesManager.getInstance().getUniqLabelID();


        Condition = new IfnzElement(false);


        Condition.addElement(new GotoElement(WhileLabel+uniquID));


    }

    @Override
    public String Build() {
        String s = "";
        s += WhileLabel+ uniquID + ":\n";

        for (ThreeAdressElement e : children)
            s += e.Build();

        s += Condition.Build();
        return s;
    }

    @Override
    public void addElement(ThreeAdressElement e) {
        if (recieve == 0){
            if(e instanceof CondElement){

                Condition.setCondElement((CondElement) e);

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
