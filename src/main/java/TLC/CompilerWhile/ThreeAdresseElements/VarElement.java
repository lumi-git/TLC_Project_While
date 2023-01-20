package TLC.CompilerWhile.ThreeAdresseElements;

public class VarElement extends ThreeAdressElement{
        private String variable;

        public VarElement(String variable) {
            this.variable = variable;
        }

        @Override
        public String Build() {
            return variable;
        }

        @Override
        public void addElement(ThreeAdressElement e) {
        }

        @Override
        public String toCpp() {
                return variable;
        }

}
