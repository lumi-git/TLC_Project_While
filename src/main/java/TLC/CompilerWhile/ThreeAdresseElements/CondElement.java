package TLC.CompilerWhile.ThreeAdresseElements;

public class CondElement extends ThreeAdressElement{


        public CondElement() {
        }

        @Override
        public String Build() {
            String s = "" ;
            for (ThreeAdressElement e : children)
                s += e.Build() + " ";

            return s;
        }

        @Override
        public void addElement(ThreeAdressElement e) {
            children.add(e);
        }



}
