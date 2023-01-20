package TLC.CompilerWhile.ThreeAdresseElements;

/**
 * This class is extending the ThreeAdressElement class, which is used to create ThreeAdressCode
 * Based on the AST and the following method, it will generate the ThreeAdressCode of an assignation
 *
 **/

public class AffecationElement extends ThreeAdressElement{



    private LeftAssignationElement left;

    private RightAssignationElement right;


    private boolean visitRight;

    public AffecationElement() {

        left = new LeftAssignationElement();

        right = new RightAssignationElement();

        visitRight = false;

    }

    /**
     * This method will Build the ThreeAdressCode code based on the build on the left and right side build method.
     * @return the ThreeAdressCode of an affectation
     **/
    @Override
    public String Build() {

        String s = left.Build() + "= " ;

        s += right.Build();

        s+="\n";

        return s;
    }

    /**
     * Depending on the instance (Left or RightAssignationElement), the method will set the attribut right or left
     * @param e a ThreeAdressElement (in this case, it will be an instance of Right or LeftAssignationElement)
     **/
    @Override
    public void addElement(ThreeAdressElement e) {
        if (e instanceof RightAssignationElement) {
            right = (RightAssignationElement) e;
        } else if (e instanceof LeftAssignationElement) {
            left = (LeftAssignationElement) e;
        }

    }

    /**
     * This method will return the equivalent of an assignation in c++
     * @return the equivalent of an assignation in c++
     */
    @Override
    public String toCpp(){
        return left.toCpp() + " = " + right.toCpp() + ";\n";
    }
}
