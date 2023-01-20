package TLC.CompilerWhile.ThreeAdresseElements;

public class ListElement extends ThreeAdressElement{


    @Override
    public String Build() {
        String s ="" ;//"{";

        for (ThreeAdressElement tae : this.getChildren()) {
            s += tae.Build()+" ";
        }
        //s+="}";


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
