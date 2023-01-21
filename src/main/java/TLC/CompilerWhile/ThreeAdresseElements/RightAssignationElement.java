package TLC.CompilerWhile.ThreeAdresseElements;

import java.util.ArrayList;

public class RightAssignationElement extends ThreeAdressElement{


    public RightAssignationElement() {}


    public ArrayList<FuncCallElement> funcs = new ArrayList<>();

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

        if(e instanceof FuncCallElement){
            funcs.add((FuncCallElement)e);
        }

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
                s += "new node(" + e.toCpp() + "), ";
            else
                s += "new node(" + e.toCpp() + ")";
        }
        return s;
    }

    public String[] toCppArray() {
        String[] s = new String[children.size()];
        int i = 0;
        for (ThreeAdressElement e : children) {
            s[i] = e.toCpp();
            i++;
        }
        return s;
    }

}
