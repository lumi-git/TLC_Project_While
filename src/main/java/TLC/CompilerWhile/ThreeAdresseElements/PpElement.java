package TLC.CompilerWhile.ThreeAdresseElements;

public class PpElement extends ThreeAdressElement{
    public PpElement() {
        super();
    }

    /**
     * This method will Build the ThreeAdress code based on the children build method
     *
     * @return the ThreeAdressCode of the ReturnElement
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
     * This method will generate the C++ code of the ReturnElement
     *
     * @return the C++ code of the ReturnElement
     */

    @Override
    public String toCpp() {

        ThreeAdressElement e = children.get(0);



        String s = "Logger.log(";

        if(e instanceof VarElement){
            s+= ((VarElement)e).fromMap() +"+\"\"";
        }
        else{
            s+= e.toCpp()+"+\"\"";
        }


        s+= ");\n";

        return s;
    }
}
