package TLC.CompilerWhile.ThreeAdresseElements;

public class LeftAssignationElement extends ThreeAdressElement{


    public LeftAssignationElement() {

    }

    @Override
    public String Build() {
        String s = "";

        for (ThreeAdressElement e : children)
            s += e.Build() + " ";
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
