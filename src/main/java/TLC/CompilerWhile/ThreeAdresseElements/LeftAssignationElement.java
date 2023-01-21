package TLC.CompilerWhile.ThreeAdresseElements;

import java.util.ArrayList;

/**
 * This class is extending the ThreeAdressElement class, which is used to create ThreeAdressCode
 *  Based on the AST and the following method, it will generate the ThreeAdressCode of a LeftAssignationElement
 **/
public class LeftAssignationElement extends ThreeAdressElement {


    public LeftAssignationElement() {

    }

    /**
     * This method will Build the ThreeAdress code based on the children build method
     * @return the ThreeAdressCode of the LeftAssignationElement
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
     * @param e the threeAdressElement to add
     */
    @Override
    public void addElement(ThreeAdressElement e) {
        children.add(e);

    }

    /**
     * This method will generate the C++ code of the LeftAssignationElement
     * @return the C++ code of the LeftAssignationElement
     */
    @Override
    public String toCpp() {
        String s = "";

        for (ThreeAdressElement e : children) {
            if (children.get(children.size() - 1) != e)
                s += e.toCpp() + ", ";
            else
                s += e.toCpp();
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
