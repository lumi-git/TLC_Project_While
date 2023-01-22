package TLC.CompilerWhile.ThreeAdresseElements;

import java.util.ArrayList;

/**
 * This class is an abstract class created to be extended by all the ThreeAdressElements
 * It contains a list of children which will be used to build the ThreeAdressCode
 * It also contains the methods to navigate in the list of children
 */
public abstract class ThreeAdressElement {
    ThreeAdressElement parent;
    ArrayList<ThreeAdressElement> children;

    String Befor ="";
    String After = "";

    public void setBefor(String befor){
        Befor = befor;
    }
    public void setAfter(String after){
        After = after;

    }


    public ThreeAdressElement() {
        children = new ArrayList<ThreeAdressElement>();
    }

    /**
     * This method will add a child in the list of children which will be build later
     * @param child the threeAdressElement to add
     */
    public void addChild(ThreeAdressElement child) {
        children.add(child);
    }

    /**
     * This method will set the parent of the current ThreeAdressElement
     * @param parent the parent of the current ThreeAdressElement
     */
    public void setParent(ThreeAdressElement parent) {
        this.parent = parent;
    }
    /**
     * This method will return the parent of the current ThreeAdressElement
     * @return the parent of the current ThreeAdressElement
     */
    public ThreeAdressElement getParent() {
        return parent;
    }
    /**
     * This method will return the list of children of the current ThreeAdressElement
     * @return the list of children of the current ThreeAdressElement
     */
    public ArrayList<ThreeAdressElement> getChildren() {
        return children;
    }
    /**
     * This abstract method should build the current ThreeAdressElement into a ThreeAdressCode String
     * @return the String representing the ThreeAdressCode of the current ThreeAdressElement
     */
    public abstract String Build();

    /**
     * This abstract method should add an element in the list of children to build of the current ThreeAdressElement
     * @param e the ThreeAdressElement to add
     */
    public abstract void addElement(ThreeAdressElement e);

    /**
     * This abstract method should generate the Java code of the current ThreeAdressElement
     * @return the Java code of the current ThreeAdressElement
     */
    public abstract String toJava();


}
