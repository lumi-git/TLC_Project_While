package TLC.CompilerWhile.ThreeAdresseElements;

public class ThenElement extends ThreeAdressElement{

    public ThenElement() {
        super();
    }

    @Override
    public String Build() {

        String s = "";

        for (ThreeAdressElement e : children) {
            s += e.Build();
        }

        return s;
    }

    @Override
    public void addElement(ThreeAdressElement e) {
        children.add(e);
    }

    @Override
    public String toCpp() {
        return null;
    }
}
