package TLC.CompilerWhile.ThreeAdresseElements;

/**
 * This class is extending the ThreeAdressElement class, which is used to create ThreeAdressCode
 *  Based on the AST and the following method, it will generate the ThreeAdressCode of a conditional element
 **/
public class CondElement extends ThreeAdressElement{

    LeftCondElement leftCondElement = new LeftCondElement();

    RightCondElement rightCondElement = new RightCondElement();

    public CondElement() {
        super();
    }
    /**
     * This method will Build the ThreeAdress code based on the children build method
     * @return s the ThreeAdressCode of the conditional element
     **/
    @Override
    public String Build() {
        String s = "" ;

        s += leftCondElement.Build() ;

        if (rightCondElement.getChildren().size() > 0){
            s += "==";
            s += rightCondElement.Build() ;
        }



        return s;
    }
    /**
     * This method adds a child in the list of children which will be build later
     * @param e a ThreeAdressElement
     **/
    @Override
    public void addElement(ThreeAdressElement e) {
        if(e instanceof LeftCondElement)
            leftCondElement = (LeftCondElement) e;
        else if(e instanceof RightCondElement)
            rightCondElement = (RightCondElement) e;

    }

    @Override
    public String toCpp() {
        String s = "" ;
        s += leftCondElement.toCpp() ;
        if (rightCondElement.getChildren().size() > 0){
            s += "==";
            s += rightCondElement.toCpp() ;
        }


        return s;

    }


}
