package TLC.CompilerWhile.ThreeAdresseElements;
public class AffecationElement extends ThreeAdressElement{



    private LeftAssignationElement left;

    private RightAssignationElement right;


    private boolean visitRight;
    public AffecationElement() {

        left = new LeftAssignationElement();

        right = new RightAssignationElement();

        visitRight = false;

    }

    public void setRight(boolean state){
        visitRight = state;
    }

    @Override
    public String Build() {

        String s = left.Build() + "= " ;

        s += right.Build();

        s+="\n";

        return s;
    }

    @Override
    public void addElement(ThreeAdressElement e) {
        if (e instanceof RightAssignationElement){
            right = (RightAssignationElement) e;
        }
        else if (e instanceof LeftAssignationElement){
            left = (LeftAssignationElement) e;
        }

    }
}
