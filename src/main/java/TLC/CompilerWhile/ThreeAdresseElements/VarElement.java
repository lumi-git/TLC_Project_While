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
         * This method will generate the Java code of the VarElement which is the variable name
         * @return the Java code of the VarElement
         */
        @Override
        public String toJava() {
                return "\""+variable+"\"";
        }

        /**
         * This method will return the name of the variable without the quotes
         * @return the name of the variable
         */
        public String raw(){
                return variable;
        }

        /**
         * This method permits from map to recover the value of a variable from the java map of the compiled program
         * @return the value of the variable from the java map of the compiled program
         */
        public String fromMap(){

                return "map.get("+"\""+variable+"\""+")";

        }

        /**
         * This methode permits to add the variable to the map of the compiled program
         * @param var2 the variable to add
         * @return The variable with a node to add it to the map
         */
        public String toMap(VarElement var2){
                return "map.put("+"\""+variable+"\""+","+var2.raw()+")";
        }


}
