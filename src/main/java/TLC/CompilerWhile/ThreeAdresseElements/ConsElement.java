package TLC.CompilerWhile.ThreeAdresseElements;

public class ConsElement extends ThreeAdressElement{

    public ConsElement(){
        super();
    }

    @Override
    public String Build() {
        String s = "CONS ";
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
