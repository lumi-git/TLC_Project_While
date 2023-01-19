package TLC.CompilerWhile.ThreeAdresseElements;

public class GotoElement extends ThreeAdressElement{

    private String label;
    public GotoElement(String label) {

        super();
        this.label = label;

    }

    @Override
    public String Build() {
        return "goto " + label + "\n";
    }
}
