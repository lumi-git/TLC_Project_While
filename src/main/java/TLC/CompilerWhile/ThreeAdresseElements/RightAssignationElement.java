package TLC.CompilerWhile.ThreeAdresseElements;

public class RightAssignationElement extends ThreeAdressElement{


    public RightAssignationElement() {

    }

    @Override
    public String Build() {
        String s = "";

        for (ThreeAdressElement e : children)
            s += e.Build() + " ";
        s+="\n";


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
