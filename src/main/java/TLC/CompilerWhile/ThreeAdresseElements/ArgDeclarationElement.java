package TLC.CompilerWhile.ThreeAdresseElements;

/**
 * This class is extending the ThreeAdressElement class, which is used to create ThreeAdressCode
 * Based on the AST and the following method, it will generate the ThreeAdressCode of an argument declaration
 **/
public class ArgDeclarationElement extends ThreeAdressElement {

    public ArgDeclarationElement() {
        super();
    }

    /**
     * This method will Build the ThreeAdress code based on the children build method
     *
     * @return the ThreeAdressCode of the argument declaration
     **/
    @Override
    public String Build() {
        String s = "";
        for (ThreeAdressElement e : children)
            s += e.Build() + " ";

        return s;
    }

    /**
     * The method adds a child in the list of children which will be build later
     *
     * @param e a ThreeAdressElement
     **/
    @Override
    public void addElement(ThreeAdressElement e) {
        children.add(e);

    }

    /**
     * This method will return the equivalent of an assignation in Java
     *
     * @return the equivalent of an assignation in Java
     */
    @Override
    public String toJava() {
        String s = "";
        for (ThreeAdressElement e : children){
            if (children.get(children.size() - 1) == e)
                s += "node " + ((VarElement)e).raw();
            else
                s += "node " + ((VarElement)e).raw() + ", ";


        }


        return s;
    }
}
