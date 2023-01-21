package TLC.CompilerWhile.ThreeAdresseElements;

import TLC.CompilerWhile.Stack;

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

    public String getFuncName(){
        return funcName;
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
        String s = funcName + "(" ;

        for (ThreeAdressElement e : children){

            if (e instanceof FuncCallElement){
                Befor += e.toCpp()+";\n";
                int count = Stack.getInstance().findSymbol(((FuncCallElement) e).funcName).getReturnCount();
                for(int i = 0; i <count;i++){
                    if(i <count-1 || children.get(children.size()-1) != e ){
                        s += "stack.pop(),";
                    }
                    else
                        s += "stack.pop()";


                }
            }
            else if (children.get(children.size()-1) == e){
                if (e instanceof VarElement){
                    s += "map.get("+e.toCpp()+")";
                }
                else{
                    s += e.toCpp();
                }
            }
            else{
                if (e instanceof VarElement){
                    s += "map.get("+e.toCpp()+") , ";
                }
                else{
                    s += e.toCpp()+" , ";
                }
            }
        }

        s +=")";

        s = Befor+s;

        return s;
    }
}
