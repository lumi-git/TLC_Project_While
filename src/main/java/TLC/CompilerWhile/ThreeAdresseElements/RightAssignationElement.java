package TLC.CompilerWhile.ThreeAdresseElements;

public class RightAssignationElement extends ThreeAdressElement{


    public RightAssignationElement() {}

    /**
     * This method will Build the ThreeAdress code based on the children build method
     * @return the ThreeAdressCode of the RightAssignationElement
     */
    @Override
    public String Build() {
        String s = "";

        for (ThreeAdressElement e : children)
            s += e.Build() + " ";
        s+="\n";


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
     * This method will generate the C++ code of the RightAssignationElement
     * @return the C++ code of the RightAssignationElement
     */
    @Override
    public String toCpp() {
        String s = "";

        for (ThreeAdressElement e : children) {
            if (children.get(children.size() - 1) != e)
                s += "node(" + e.toCpp() + "), ";
            else
                s += "node(" + e.toCpp() + ")";
        }
        return s;
    }
}
