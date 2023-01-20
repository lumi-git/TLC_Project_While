package TLC.CompilerWhile.ThreeAdresseElements;

/**
 * This class is extending the ThreeAdressElement class, which is used to create ThreeAdressCode
 *  Based on the AST and the following method, it will generate the ThreeAdressCode of a conditional element
 **/
public class CondElement extends ThreeAdressElement{


    public CondElement() {
    }
    /**
     * This method will Build the ThreeAdress code based on the children build method
     * @return s the ThreeAdressCode of the conditional element
     **/
    @Override
    public String Build() {
        String s = "" ;
        for (ThreeAdressElement e : children)
            s += e.Build() + " ";

        return s;
    }
    /**
     * This method adds a child in the list of children which will be build later
     * @param e a ThreeAdressElement
     **/
    @Override
    public void addElement(ThreeAdressElement e) {
        children.add(e);
    }

    @Override
    public String toCpp() {
        //return children.get(0).toCpp() + " == " + children.get(1).toCpp();
        return "";
    }


}
