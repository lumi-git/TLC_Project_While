package TLC.CompilerWhile.ThreeAdresseElements;

import TLC.CompilerWhile.ThreeAdressesManager;

/**
 * This class is extending the ThreeAdressElement class, which is used to create ThreeAdressCode
 * Based on the AST and the following method, it will generate the ThreeAdressCode of a WhileElement
 */
public class WhileElement extends ThreeAdressElement {

    private CondElement cond;
    int recieve = 0;

    private String WhileLabel = "WHILE_";

    private IfnzElement Condition;

    private int uniquID;

    public WhileElement() {
        super();

        uniquID = ThreeAdressesManager.getInstance().getUniqLabelID();


        Condition = new IfnzElement(false);


        Condition.addElement(new GotoElement(WhileLabel + uniquID));


    }

    /**
     * This method will Build the ThreeAdress code based on the WhiteLabel, the children build method and the Condition Build Method
     *
     * @return the ThreeAdressCode of the WhileElement
     */
    @Override
    public String Build() {
        String s = "";
        s += WhileLabel + uniquID + ":\n";

        for (ThreeAdressElement e : children)
            s += e.Build();

        s += Condition.Build();
        return s;
    }

    /**
     * This method adds children in the list of children which will be build later
     * The method adds ThreeAdressElement until it sets an instance of CondElement if it receives one
     * Then it adds the following ThreeAdressElement instance
     *
     * @param e a ThreeAdressElement
     **/
    @Override
    public void addElement(ThreeAdressElement e) {
        if (recieve == 0) {
            if (e instanceof CondElement) {
                Condition.setCondElement((CondElement) e);
                recieve++;
            } else {
                children.add(e);
            }
        } else
            children.add(e);

    }

    /**
     * This method will set the context before the WhileElement
     * @param befor some instructions before the WhileElement
     */
    @Override
    public void setBefor(String befor) {
        Befor = befor;
    }

    /**
     * This method will generate the Java code of the While
     * @return the Java code of the While
     */
    @Override
    public String toJava() {
        String s = Befor;
        s += "while(" + Condition.getCondElement().toJava() + "){\n";

        for (ThreeAdressElement e : children)
            s += e.toJava();

        s += "}\n";
        return s;
    }

    /**
     * This method will return the unique label of the While
     * @return the unique label of the While
     */
    public String getuniquID() {
        return uniquID + "";
    }

    /**
     * This method will return the unique label of the IfnzElement in the While
     * @return the unique label of the IfnzElement in the While
     */
    public String getUniqueIDIfnz() {
        return Condition.getUniqID();
    }
}
