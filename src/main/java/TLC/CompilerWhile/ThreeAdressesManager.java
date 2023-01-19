package TLC.CompilerWhile;

import TLC.CompilerWhile.ThreeAdresseElements.IfElement;
import TLC.CompilerWhile.ThreeAdresseElements.SourceElement;
import TLC.CompilerWhile.ThreeAdresseElements.ThreeAdressElement;

public class ThreeAdressesManager {

    private ThreeAdressElement program ;

    static ThreeAdressesManager instance = null;

    private ThreeAdressElement currentElement ;

    int labelIDs =0;

    public static ThreeAdressesManager getInstance() {
        if (instance == null) {
            instance = new ThreeAdressesManager();
        }
        return instance;
    }

    public ThreeAdressesManager() {
        program = new SourceElement();
        currentElement = program;
    }

    public void addElement(ThreeAdressElement e) {

        e.setParent(currentElement);
        currentElement.addElement(e);
        currentElement = e;
    }

    public void back() {

        currentElement = currentElement.getParent();

    }

    public int getUniqLabelID(){
        labelIDs+=1;
        return labelIDs;
    }

    public String Build() {
        return program.Build();
    }


    public ThreeAdressElement getCurrentElement() {
        return currentElement;
    }

}
