package TLC.CompilerWhile.ThreeAdresseElements;

public class FuncCallElement extends ThreeAdressElement{

        private String funcName;

        public FuncCallElement(String funcName_){
            funcName = funcName_;

        }

        @Override
        public String Build() {
            String s =  " Call " + funcName + "(" ;

            for (ThreeAdressElement e : children)
                s += e.Build() +" ";

            s +=")\n";

            return s;
        }

        @Override
        public void addElement(ThreeAdressElement e) {
            children.add(e);


        }
}
