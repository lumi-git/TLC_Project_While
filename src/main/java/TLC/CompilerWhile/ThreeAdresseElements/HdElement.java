package TLC.CompilerWhile.ThreeAdresseElements;

public class HdElement extends ThreeAdressElement{

    public HdElement(){
        super();
    }

    @Override
    public String Build() {
        String s = "getRight ";
        for (ThreeAdressElement tae : this.getChildren()) {
            s += tae.Build();
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

