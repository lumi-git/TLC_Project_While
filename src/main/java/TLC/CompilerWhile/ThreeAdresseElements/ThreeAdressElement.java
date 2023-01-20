package TLC.CompilerWhile.ThreeAdresseElements;

import java.util.ArrayList;

public abstract class ThreeAdressElement {
    ThreeAdressElement parent;
    ArrayList<ThreeAdressElement> children;

    public ThreeAdressElement() {
        children = new ArrayList<ThreeAdressElement>();
    }

    public void addChild(ThreeAdressElement child) {
        children.add(child);
    }

    public void setParent(ThreeAdressElement parent) {
        this.parent = parent;
    }

    public ThreeAdressElement getParent() {
        return parent;
    }

    public ArrayList<ThreeAdressElement> getChildren() {
        return children;
    }

    public abstract String Build();

    public abstract void addElement(ThreeAdressElement e);

    public abstract String toCpp();


}
