package TLC.CompilerWhile.ThreeAdresseElements;

import TLC.CompilerWhile.ThreeAdressesManager;

public class ForElement extends ThreeAdressElement{

        private VarElement variable;
        int recieve = 0;

        private String ForLabel = "FOR_";

        private IfnzElement Condition;

        private int uniquID;

    public ForElement() {

        uniquID = ThreeAdressesManager.getInstance().getUniqLabelID();


        Condition = new IfnzElement(false);


        Condition.addElement(new GotoElement(ForLabel+uniquID));


    }

        @Override
        public String Build() {
            String s = "";
            s += ForLabel+ uniquID + ":\n";

            for (ThreeAdressElement e : children)
                s += e.Build();

            s += Condition.Build();
            return s;
        }

        @Override
        public void addElement(ThreeAdressElement e) {
            if (recieve == 0){
                if(e instanceof VarElement){

                    CondElement cond =new CondElement();

                    cond.addElement((VarElement) e);

                    Condition.setCondElement(cond);

                    recieve++;
                }
                else{
                    children.add(e);
                }
            }
            else
                children.add(e);

        }
}
