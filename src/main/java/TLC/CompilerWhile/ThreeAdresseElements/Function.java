package TLC.CompilerWhile.ThreeAdresseElements;
import java.util.ArrayList;


public class Function extends ThreeAdressElement {

    private String name;
    private ArgDeclarationElement parameters;

    private ReturnElement returnElement;

    public Function(String name) {

        super();
        this.name = name;



    }

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

    @Override
    public void addElement(ThreeAdressElement e) {
        if(e instanceof ArgDeclarationElement)
            parameters = (ArgDeclarationElement) e;
        else if(e instanceof ReturnElement)
            returnElement = (ReturnElement) e;
        else
            children.add(e);
    }
}
