package TLC.CompilerWhile.ThreeAdresseElements;
/**
 * This class is extending the ThreeAdressElement class, which is used to create ThreeAdressCode
 *  Based on the AST and the following method, it will generate the ThreeAdressCode of a VarElement
 **/
public class VarElement extends ThreeAdressElement{
        private String variable;

        public VarElement(String variable) {
            this.variable = variable;
        }
        /**
         * This method will Build the ThreeAdress code of a variable
         * @return the variable name
         */
        @Override
        public String Build() {
            return variable;
        }

        @Override
        public void addElement(ThreeAdressElement e) {
        }

        /**
         * This method will generate the C++ code of the VarElement which is the variable name
         * @return the C++ code of the VarElement
         */
        @Override
        public String toCpp() {
                return variable;
        }

}
