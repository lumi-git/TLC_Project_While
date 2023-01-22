package TLC.CompilerWhile.ThreeAdresseElements;
/**
 * This class is extending the ThreeAdressElement class, which is used to create ThreeAdressCode
 *  Based on the AST and the following method, it will generate the ThreeAdressCode of an Else element
 **/
public class ElseElement extends ThreeAdressElement{

    public ElseElement() {
        super();
    }
    /**
     * This method will Build the ThreeAdress code based on the children build method
     * @return the ThreeAdressCode of the else element
     **/
    @Override
    public String Build() {
        String s = "";

        for (ThreeAdressElement e : children)
            s += "  " + e.Build();

        return s;
    }
    /**
     * The method adds a child in the list of children which will be build later
     * @param e a ThreeAdressElement
     **/
    @Override
    public void addElement(ThreeAdressElement e) {
        children.add(e);
    }
    /**
     * This method will return the equivalent of an else in Java
     * @return the equivalent of an else in Java
     */
    @Override
    public String toJava() {
        String s = "";
        for (ThreeAdressElement e : children)
            s += e.toJava();
        return s;
    }
}
