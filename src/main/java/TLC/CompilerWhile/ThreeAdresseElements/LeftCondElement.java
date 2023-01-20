package TLC.CompilerWhile.ThreeAdresseElements;

public class LeftCondElement extends ThreeAdressElement{

    public LeftCondElement() {
        super();
    }

    @Override
    public String Build() {
        String s ="" ;

        for (ThreeAdressElement tae : this.getChildren()) {
            s += tae.Build() + " ";
        }

        return s;
    }

    @Override
    public void addElement(ThreeAdressElement e) {
        System.out.println(e);
        children.add(e);
    }

    @Override
    public String toCpp() {
        String s ="" ;

        for (ThreeAdressElement tae : this.getChildren()) {
            s += tae.Build() + " ";
        }

        return s;
    }
}
