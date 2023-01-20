package TLC.CompilerWhile.ThreeAdresseElements;
/**
 * This class is extending the ThreeAdressElement class, which is used to create ThreeAdressCode
 *  Based on the AST and the following method, it will generate the ThreeAdressCode of a Hd element
 **/

public class HdElement extends ThreeAdressElement{

    public HdElement(){
        super();
    }

    /**
     * This method will Build the ThreeAdress code based on the children build method
     * @return the ThreeAdressCode of the HdElement
     */
    @Override
    public String Build() {
        String s = "getRight ";
        for (ThreeAdressElement tae : this.getChildren()) {
            s += tae.Build();
        }
        return s;
    }
    /**
     * This method will add a child in the list of children which will be build later
     * @param e the threeAdressElement to add
     */
    @Override
    public void addElement(ThreeAdressElement e) {
        children.add(e);
    }

    /**
     * This method will generate the C++ code of the HdElement
     * @return the C++ code of the HdElement
     */
    @Override
    public String toCpp() {
        String s = "getRight( ";
        for (ThreeAdressElement tae : this.getChildren()) {
            s += tae.toCpp()+" ";
        }
        s += ")";

        return s;
    }
}

