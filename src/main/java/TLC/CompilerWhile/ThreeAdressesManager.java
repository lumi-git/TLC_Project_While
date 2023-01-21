package TLC.CompilerWhile;

import TLC.CompilerWhile.ThreeAdresseElements.IfElement;
import TLC.CompilerWhile.ThreeAdresseElements.SourceElement;
import TLC.CompilerWhile.ThreeAdresseElements.ThreeAdressElement;

import java.io.FileWriter;
import java.io.IOException;

/**
 * This class is used to manage the three adress code, this class is a singleton
 */
public class ThreeAdressesManager {

    private ThreeAdressElement program ;

    static ThreeAdressesManager instance = null;

    private ThreeAdressElement currentElement ;

    int labelIDs =0;
    /**
     * This method will return the instance of the three adress manager
     * @return the instance of the three adress manager
     */
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

    /**
     * This method will link a three adress element to the current element
     * @param e the three adress element to link
     */
    public void addElement(ThreeAdressElement e) {

        e.setParent(currentElement);
        currentElement.addElement(e);
        currentElement = e;
    }

    /**
     * This method will change this element into the parent of the current element
     */
    public void back() {
        currentElement = currentElement.getParent();
    }

    /**
     * This method will increment labelIDs and return the new value
     * @return an unique labelID
     */
    public int getUniqLabelID(){
        labelIDs+=1;
        return labelIDs;
    }

    /**
     * This method will build the current element into a ThreeAdressCode string
     * @return the ThreeAdressCode of the current element
     */
    public String Build() {
        return program.Build();
    }

    /**
     * This method will build the current element into a C++ string
     * @return the C++ code of the current element
     */
    public String ToCpp(){
        return program.toCpp();
    }

    /**
     * This method will write the C++ code into a file
     */
    public void printToFileCPP(){
        try {
            FileWriter myWriter = new FileWriter("src/main/java/TLC/CompilerWhile/CPPOUT/programmcpp.txt");

            String programString = ToCpp();
            myWriter.write(programString);

            myWriter.close();
            System.out.println("Succesfully generated diagram of the symbol table at src/main/java/TLC/CompilerWhile/GeneratedDiagrams/SymbolTable.md");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }

    /**
     * This method will return the current element
     * @return the current element
     */
    public ThreeAdressElement getCurrentElement() {
        return currentElement;
    }

}
