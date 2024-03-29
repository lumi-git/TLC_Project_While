package TLC.CompilerWhile.ThreeAdresseElements;
/**
 * This class is extending the ThreeAdressElement class, which is used to create ThreeAdressCode
 * Based on the AST and the following method, it will generate the ThreeAdressCode of a TlElement
 */
public class TlElement extends ThreeAdressElement{

    public TlElement(){}

    /**
     * This method will Build the ThreeAdress code based on the children build method
     * @return the ThreeAdressCode of the TlElement
     */
    @Override
    public String Build() {
        String s = "getLeft ";
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
     * This method will generate the Java code of the TlElement
     * @return the Java code of the TlElement
     */
    @Override
    public String toJava() {

        String s = "(";
        for (ThreeAdressElement tae : children) {
            s += tae.toJava()+" ";
        }
        s += ").getTail()";
        return s;
    }
}
