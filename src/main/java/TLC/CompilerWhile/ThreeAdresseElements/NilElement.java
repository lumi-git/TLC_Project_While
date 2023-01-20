package TLC.CompilerWhile.ThreeAdresseElements;

public class NilElement extends ThreeAdressElement{
    public NilElement(){
        super();
    }

    @Override
    public String Build() {
        return "nil ";
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
