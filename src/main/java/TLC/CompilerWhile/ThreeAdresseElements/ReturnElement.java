package TLC.CompilerWhile.ThreeAdresseElements;

/**
 * This class is extending the ThreeAdressElement class, which is used to create ThreeAdressCode
 * Based on the AST and the following method, it will generate the ThreeAdressCode of a ReturnElement
 */
public class ReturnElement extends ThreeAdressElement {

    public ReturnElement() {
        super();
    }

    /**
     * This method will Build the ThreeAdress code based on the children build method
     *
     * @return the ThreeAdressCode of the ReturnElement
     */
    @Override
    public String Build() {
        String s = "";
        for (ThreeAdressElement e : children)
            s += e.Build() + " ";
        return s;
    }

    /**
     * This method will add a child in the list of children which will be build later
     *
     * @param e the threeAdressElement to add
     */
    @Override
    public void addElement(ThreeAdressElement e) {
        children.add(e);

    }

    /**
     * This method will generate the Java code of the ReturnElement
     * @return the Java code of the ReturnElement
     */
    @Override
    public String toJava() {
        String s = "";
        for (ThreeAdressElement e : children) {
            if (children.get(children.size() - 1) == e) {
                s += "stack.push(" + " map.get( "+e.toJava() + " ))";
            } else {
                s += "stack.push(" + " map.get(  "+e.toJava() + " ));";
            }

        }

        return s;
    }

}
