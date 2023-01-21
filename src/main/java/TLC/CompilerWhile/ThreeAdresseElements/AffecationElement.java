package TLC.CompilerWhile.ThreeAdresseElements;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * This class is extending the ThreeAdressElement class, which is used to create ThreeAdressCode
 * Based on the AST and the following method, it will generate the ThreeAdressCode of an assignation
 **/

public class AffecationElement extends ThreeAdressElement {


    private LeftAssignationElement left;

    private RightAssignationElement right;

    private static final ArrayList<String> Vars = new ArrayList<String>();

    private boolean visitRight;

    public AffecationElement() {

        left = new LeftAssignationElement();

        right = new RightAssignationElement();

        visitRight = false;

    }

    /**
     * This method will Build the ThreeAdressCode code based on the build on the left and right side build method.
     *
     * @return the ThreeAdressCode of an affectation
     **/

    @Override
    public String Build() {

        String s = left.Build() + "= ";

        s += right.Build();

        s += "\n";

        return s;
    }

    /**
     * Depending on the instance (Left or RightAssignationElement), the method will set the attribut right or left
     *
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
     *
     * @return the equivalent of an assignation in c++
     */
    @Override
    public String toCpp() {
        String s = "";


        if (right.funcs.size() >0){
            for(ThreeAdressElement e : right.children ){

                if (e instanceof FuncCallElement){
                    s += e.toCpp()+";\n";
                }
            }
            for(ThreeAdressElement e : left.children){
                if(e instanceof VarElement) {
                    s += "map.put("+e.toCpp() +","+ "stack.pop());\n";
                }
            }
        }

        else{
            for(int i = 0;i<right.children.size() ;i++){

                if (right.getChildren().get(i) instanceof VarElement){
                    s+= "map.put("+left.getChildren().get(i).toCpp() + " , "+ ((VarElement)right.getChildren().get(i)).fromMap()+");\n";
                }
                else {
                    s+= "map.put("+left.getChildren().get(i).toCpp() + " , "+ (right.getChildren().get(i)).toCpp()+");\n";
                }

            }


        }


        return s;
    }
}
