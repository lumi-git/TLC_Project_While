package TLC.CompilerWhile.ThreeAdresseElements;

public class TlElement extends ThreeAdressElement{

    public TlElement(){

    }
    @Override
    public String Build() {
        String s = "getLeft ";
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
