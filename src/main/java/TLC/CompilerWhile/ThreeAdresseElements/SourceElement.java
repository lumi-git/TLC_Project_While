package TLC.CompilerWhile.ThreeAdresseElements;

public class SourceElement extends ThreeAdressElement{

    public SourceElement() {
        super();

    }

    @Override
    public String Build() {
        StringBuilder s = new StringBuilder();
        for (ThreeAdressElement e : children)
            s.append(e.Build());
        return s.toString();
    }

    @Override
    public void addElement(ThreeAdressElement e) {
        children.add(e);
    }

}
