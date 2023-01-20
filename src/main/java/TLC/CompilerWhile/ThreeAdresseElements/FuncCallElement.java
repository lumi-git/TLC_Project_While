package TLC.CompilerWhile.ThreeAdresseElements;
/**
 * This class is extending the ThreeAdressElement class, which is used to create ThreeAdressCode
 *  Based on the AST and the following method, it will generate the ThreeAdressCode of a FunCallElement
 **/
public class FuncCallElement extends ThreeAdressElement{

    private String funcName;

    public FuncCallElement(String funcName_){
        funcName = funcName_;

    }
    /**
     * This method will Build the ast code based on his name and
     * the children build method
     * @return the ThreeAdressCode of the call of a function
     **/
    @Override
    public String Build() {
        String s = " Call " + funcName + "(" ;

        for (ThreeAdressElement e : children)
            s += e.Build() +" ";

        s +=")\n";

        return s;
    }

    /**
    * This method adds children in the list of children which will be build later
    **/
    @Override
    public void addElement(ThreeAdressElement e) {
        children.add(e);


    }

    @Override
    public String toCpp() {
        return null;
    }
}
