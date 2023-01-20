package TLC.CompilerWhile.ThreeAdresseElements;
import java.util.ArrayList;

/**
 * This class is extending the ThreeAdressElement class, which is used to create ThreeAdressCode
 *  Based on the AST and the following method, it will generate the ThreeAdressCode of a function
 **/
public class Function extends ThreeAdressElement {

    private String name;
    private ArgDeclarationElement parameters = new ArgDeclarationElement();

    private ReturnElement returnElement = new ReturnElement();

    public Function(String name) {

        super();
        this.name = name;



    }
    /**
     * This method will Build the ThreeAdress code based on his name and
     * the paramaters, children  and return build method.
     * @return the ThreeAdressCode of the function
     **/
    @Override
    public String Build() {
        String s = "\n";
        s += "function " + name + " " + parameters.Build() +"\n";

        for (ThreeAdressElement e : children)
            s += e.Build();

        s+= "returns "+ returnElement.Build() +"\n";
        s += "endFunc \n";
        return s;

    }
    /**
     * This method creates the parameters of the function with ArgDeclarationElement
     * It also creates the return of the function with ReturnElement
     * Finally it adds children in the list of children which will be build later
     * @param e a ThreeAdressElement
     **/
    @Override
    public void addElement(ThreeAdressElement e) {
        if(e instanceof ArgDeclarationElement)
            parameters = (ArgDeclarationElement) e;
        else if(e instanceof ReturnElement)
            returnElement = (ReturnElement) e;
        else
            children.add(e);
    }

    @Override
    public String toCpp() {
        String s = "\n";
        s += "public void " + name + "( " + parameters.toCpp() +"){\n";

        for (ThreeAdressElement e : children)
            s += e.toCpp();

        s+= "return "+ returnElement.toCpp() +";\n";
        s += "} \n";
        return s;
    }
}
