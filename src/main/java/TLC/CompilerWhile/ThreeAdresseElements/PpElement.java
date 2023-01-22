package TLC.CompilerWhile.ThreeAdresseElements;
/**
 * This class is extending the ThreeAdressElement class, which is used to create ThreeAdressCode
 * Based on the AST and the following method, it will generate the ThreeAdressCode of a PpElement (Printer)
 */
public class PpElement extends ThreeAdressElement{
    public PpElement() {
        super();
    }

    /**
     * This method will Build the ThreeAdress code based on the children build method
     * @return the ThreeAdressCode of the PpElement
     */
    @Override
    public String Build() {
        String s = "PRINT ";
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
     * This method will generate the Java code of the PpElement
     * @return the Java code of the PpElement
     */

    @Override
    public String toJava() {

        ThreeAdressElement e = children.get(0);

        String s = "Logger.log(";

        if(e instanceof VarElement){
            s+= ((VarElement)e).fromMap() +"+\"\"";
        }
        else{
            s+= e.toJava()+"+\"\"";
        }


        s+= ");\n";

        return s;
    }
}
