package TLC.CompilerWhile.ThreeAdresseElements;

public class RightCondElement extends ThreeAdressElement{

    public RightCondElement() {
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
        children.add(e);
    }

    @Override
    public String toJava() {
        String s ="" ;

        for (ThreeAdressElement tae : this.getChildren()) {
            s += tae.toJava() + " ";
        }

        return s;
    }
}
