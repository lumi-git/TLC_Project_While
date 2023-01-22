package TLC.CompilerWhile.ThreeAdresseElements;

import TLC.CompilerWhile.ConcreteElements.ArgDeclaration;
import TLC.CompilerWhile.ConcreteElements.Func;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionTest {
    @Test
    public void FunctionAddElementTest() {
        ArgDeclarationElement argDeclarationElement = new ArgDeclarationElement();
        argDeclarationElement.addElement(new VarElement("a"));
        argDeclarationElement.addElement(new VarElement("b"));

        ReturnElement returnElement = new ReturnElement();
        returnElement.addElement(new VarElement("c"));
        returnElement.addElement(new VarElement("d"));

        AffecationElement affecationElement = new AffecationElement();
        LeftAssignationElement leftAssignationElement = new LeftAssignationElement();
        leftAssignationElement.addElement(new VarElement("a"));
        RightAssignationElement rightAssignationElement = new RightAssignationElement();
        rightAssignationElement.addElement(new VarElement("b"));
        affecationElement.addElement(leftAssignationElement);
        affecationElement.addElement(rightAssignationElement);

        Function function = new Function("test");
        function.addElement(argDeclarationElement);
        function.addElement(returnElement);
        function.addElement(affecationElement);

        String expected = """
                                
                function test a b\s
                a = b\s
                                
                returns c d\s
                endFunc\s         
                """;
        assertEquals(expected, function.Build());
    }

    @Test
    public void FunctionBuildEmptyTest() {
        Function function = new Function("test");
        String expected = """
                                
                function test\s            
                returns\s
                endFunc\s         
                """;
        assertEquals(expected, function.Build());
    }

    @Test
    public void FunctionToJavaMain() {
        Function function = new Function("main");

        String expected = """
                
                public static void main( String[] args){
                map.put("NULL",new node());
                ;
                }
                """;
        assertEquals(expected, function.toJava());
    }

    @Test
    public void FunctionToJava() {
        Function function = new Function("test");
        ArgDeclarationElement argDeclarationElement = new ArgDeclarationElement();
        argDeclarationElement.addElement(new VarElement("a"));
        argDeclarationElement.addElement(new VarElement("b"));
        function.addElement(argDeclarationElement);

        AffecationElement affecationElement = new AffecationElement();
        LeftAssignationElement leftAssignationElement = new LeftAssignationElement();
        leftAssignationElement.addElement(new VarElement("a"));
        RightAssignationElement rightAssignationElement = new RightAssignationElement();
        rightAssignationElement.addElement(new VarElement("b"));
        affecationElement.addElement(leftAssignationElement);
        affecationElement.addElement(rightAssignationElement);
        function.addElement(affecationElement);


        String expected = """
                
                public static void test( node a, node b){
                map.put("a",a);
                map.put("b",b);
                map.put("a" , map.get("b"));
                ;
                }
                """;
        assertEquals(expected, function.toJava());
    }
}
