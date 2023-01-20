package TLC.CompilerWhile.ThreeAdresseElements;

import TLC.CompilerWhile.ThreeAdressesManager;
/**
 * This class is extending the ThreeAdressElement class, which is used to create ThreeAdressCode
 *  Based on the AST and the following method, it will generate the ThreeAdressCode of a For element
 **/
public class ForElement extends ThreeAdressElement{

        private VarElement variable;
        int recieve = 0;

        private String ForLabel = "FOR_";

        private IfnzElement Condition;

        private int uniquID;

    public ForElement() {

        uniquID = ThreeAdressesManager.getInstance().getUniqLabelID();


        Condition = new IfnzElement(false);


        Condition.addElement(new GotoElement(ForLabel+uniquID));
    }
    /**
     * This method will Build the ThreeAdress code based on the forLabel with a unique id and
     * the children and condition build method
     * @return the ThreeAdressCode of the for element
     **/
    @Override
    public String Build() {
        String s = "";
        s += ForLabel+ uniquID + ":\n";

        for (ThreeAdressElement e : children)
            s += e.Build();

        s += Condition.Build();
        return s;
    }
    /**
     * This method adds children in the list of children which will be build later
     * The method adds ThreeAdressElement until it adds an instance of CondElement created with a VarElement (receive=0)
     * Then it adds the following ThreeAdressElement instance
     * @param e a ThreeAdressElement
     **/
    @Override
    public void addElement(ThreeAdressElement e) {
        if (recieve == 0){
            if(e instanceof VarElement){
                CondElement cond =new CondElement();

                cond.addElement((VarElement) e);

                Condition.setCondElement(cond);

                recieve++;
            }
            else{
                children.add(e);
            }
        }
        else
            children.add(e);

    }

    @Override
    public String toCpp() {
        return null;
    }
}
