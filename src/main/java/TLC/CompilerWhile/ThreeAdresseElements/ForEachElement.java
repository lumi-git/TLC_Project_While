package TLC.CompilerWhile.ThreeAdresseElements;

import TLC.CompilerWhile.ThreeAdressesManager;

/**
 * This class is extending the ThreeAdressElement class, which is used to create ThreeAdressCode
 * Based on the AST and the following method, it will generate the ThreeAdressCode of a ForEach element
 */
public class ForEachElement extends ThreeAdressElement {

    private VarElement variableLoop;

    private VarElement variable;

    int receive = 0;

    private String ForEachLabel = "FOR_EACH";

    private IfnzElement Condition;

    private int uniquID;

    public ForEachElement() {

        uniquID = ThreeAdressesManager.getInstance().getUniqLabelID();

        Condition = new IfnzElement(false);

        Condition.addElement(new GotoElement(ForEachLabel + uniquID));


    }

    /**
     * This method will Build the ThreeAdress code based on the forEachLabel with a unique id and
     * the children and condition build method
     *
     * @return the ThreeAdressCode of the for each element
     **/
    @Override
    public String Build() {
        CondElement cnd = new CondElement();

        cnd.addElement(variable);

        Condition.setCondElement(cnd);

        String s = "";
        s += ForEachLabel + uniquID + ":\n";

        for (ThreeAdressElement e : children)
            s += e.Build();

        s += Condition.Build();
        return s;
    }

    /**
     * The method adds children in the list of children which will be build later
     * The method adds in a first hand an instance of VarElement (receive=0) then adds another varElement(receive=1)
     * Finally it adds the following ThreeAdressElement instance
     *
     * @param e a ThreeAdressElement
     **/
    @Override
    public void addElement(ThreeAdressElement e) {
        if (receive == 0) {
            if (e instanceof VarElement) {
                variableLoop = (VarElement) e;
                receive++;
            } else {
                children.add(e);
            }
        } else if (receive == 1) {
            if (e instanceof VarElement) {
                variable = (VarElement) e;
                receive++;
            } else {
                children.add(e);
            }
        } else
            children.add(e);


    }

    @Override
    public String toJava() {
        return null;
    }
}
