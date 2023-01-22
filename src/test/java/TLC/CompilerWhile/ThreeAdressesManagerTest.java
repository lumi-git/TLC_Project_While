package TLC.CompilerWhile;

import TLC.CompilerWhile.ThreeAdresseElements.ThreeAdressElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class ThreeAdressesManagerTest {
    /*
    @Test
    public void testGetInstance() {
        ThreeAdressesManager instance1 = ThreeAdressesManager.getInstance();
        ThreeAdressesManager instance2 = ThreeAdressesManager.getInstance();
        assertEquals(instance1, instance2);
    }

    @Test
    public void testAddElement() {
        ThreeAdressesManager manager = ThreeAdressesManager.getInstance();
        ThreeAdressElement element = new ThreeAdressElementMock();
        manager.addElement(element);
        assertEquals(manager.getCurrentElement(), element);
    }

    @Test
    public void testBack() {
        ThreeAdressesManager manager = ThreeAdressesManager.getInstance();
        ThreeAdressElement parent = new ThreeAdressElementMock();
        ThreeAdressElement child = new ThreeAdressElementMock();
        //manager.currentElement = child;
        //child.parent = parent;
        manager.back();
        assertEquals(manager.getCurrentElement(), parent);
    }

    @Test
    public void testGetUniqLabelID() {
        ThreeAdressesManager manager = ThreeAdressesManager.getInstance();
        int label1 = manager.getUniqLabelID();
        int label2 = manager.getUniqLabelID();
        assertNotEquals(label1, label2);
    }

    @Test
    public void testBuild() {
        ThreeAdressesManager manager = ThreeAdressesManager.getInstance();
        ThreeAdressElement element = new ThreeAdressElementMock();
        manager.addElement(element);
        String result = manager.Build();
        assertEquals(result, "MockBuild");
    }

    @Test
    public void testToCpp() {
        ThreeAdressesManager manager = ThreeAdressesManager.getInstance();
        ThreeAdressElement element = new ThreeAdressElementMock();
        manager.addElement(element);
        String result = manager.ToCpp();
        assertEquals(result, "MockToCpp");
    }

    @Test
    public void testPrintToFileCPP() {
        ThreeAdressesManager manager = ThreeAdressesManager.getInstance();
        manager.printToFileCPP();
        //File file = new File("src/main/java/TLC/CompilerWhile/CPPOUT/programmcpp.txt");
        //assertTrue(file.exists());
    }*/
}

/*
class ThreeAdressElementMock extends ThreeAdressElement {
    @Override
    public String Build() {
        return "MockBuild";
    }

    @Override
    public String toCpp() {
        return "MockToCpp";
    }
}*/
