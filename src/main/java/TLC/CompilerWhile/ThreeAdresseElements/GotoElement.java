package TLC.CompilerWhile.ThreeAdresseElements;
/**
 * This class is extending the ThreeAdressElement class, which is used to create ThreeAdressCode
 *  Based on the AST and the following method, it will generate the ThreeAdressCode of a GotoElement
 **/
public class GotoElement extends ThreeAdressElement{

    private String label;
    public GotoElement(String label) {

        super();
        this.label = label;

    }
    /**
     * This method will Build the ThreeAdress code based on his label
     * @return the ThreeAdressCode of the goto
     **/
    @Override
    public String Build() {
        return "goto " + label + "\n";
    }


    @Override
    public void addElement(ThreeAdressElement e) {
    }

    /**
     * c'est nul
     * @return nul
     */
    @Override
    public String toCpp() {
        return null;
    }
}
