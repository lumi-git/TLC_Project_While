package TLC.CompilerWhile;

import TLC.CompilerWhile.AntLRFiles.WhileLexer;
import TLC.CompilerWhile.AntLRFiles.WhileParser;
import TLC.CompilerWhile.ConcreteElements.Affectation;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class VisitorTest {
    @Test
    public void testVisitStart() {
        String text = " function addArbres :\n" +
                "read A1,A2\n" +
                "%\n" +
                "%\n" +
                "write Ret1";

        //creating a stream of char représentative of the source code
        CharStream stream = new ANTLRStringStream(text);


        //creating a lexer with the stream of char
        WhileLexer lexer = new WhileLexer(stream);

        //creating a token stream with the lexer
        TokenStream tk = new CommonTokenStream(lexer);

        //creating a parser with the token stream
        WhileParser parser = new WhileParser(tk);


        try {

            //the common tree is a representation of the AST
            CommonTree ct = (CommonTree) parser.start().getTree();
            //Création d'un objet TestVisitor pour tester la méthode VisitAffectation
            TestVisitor visitor = new TestVisitor(ct);
            visitor.parse();
            //Vérification que la méthode VisitAffectation a été appelée

            assertTrue(visitor.pgVisited);

        }catch (Exception e){}
    }

    @Test
    public void testVisitDefinition() {
        String text = " function addArbres :\n" +
                "read A1,A2\n" +
                "%\n" +
                "%\n" +
                "write Ret1";

        //creating a stream of char représentative of the source code
        CharStream stream = new ANTLRStringStream(text);


        //creating a lexer with the stream of char
        WhileLexer lexer = new WhileLexer(stream);

        //creating a token stream with the lexer
        TokenStream tk = new CommonTokenStream(lexer);

        //creating a parser with the token stream
        WhileParser parser = new WhileParser(tk);


        try {

            //the common tree is a representation of the AST
            CommonTree ct = (CommonTree) parser.start().getTree();
            //Création d'un objet TestVisitor pour tester la méthode VisitAffectation
            TestVisitor visitor = new TestVisitor(ct);
            visitor.parse();
            //Vérification que la méthode VisitAffectation a été appelée

            assertTrue(visitor.DefVisited);

        }catch (Exception e){}
    }

    @Test
    public void testVisitFunc() {
        String text = " function addArbres :\n" +
                "read A1,A2\n" +
                "%\n" +
                "%\n" +
                "write Ret1";

        //creating a stream of char représentative of the source code
        CharStream stream = new ANTLRStringStream(text);


        //creating a lexer with the stream of char
        WhileLexer lexer = new WhileLexer(stream);

        //creating a token stream with the lexer
        TokenStream tk = new CommonTokenStream(lexer);

        //creating a parser with the token stream
        WhileParser parser = new WhileParser(tk);


        try {

            //the common tree is a representation of the AST
            CommonTree ct = (CommonTree) parser.start().getTree();
            //Création d'un objet TestVisitor pour tester la méthode VisitAffectation
            TestVisitor visitor = new TestVisitor(ct);
            visitor.parse();
            //Vérification que la méthode VisitAffectation a été appelée

            assertTrue(visitor.FuncVisited);

        }catch (Exception e){}
    }

    @Test
    public void testVisitInput() {
        String text = " function addArbres :\n" +
                "read A1,A2\n" +
                "%\n" +
                "%\n" +
                "write Ret1";

        //creating a stream of char représentative of the source code
        CharStream stream = new ANTLRStringStream(text);


        //creating a lexer with the stream of char
        WhileLexer lexer = new WhileLexer(stream);

        //creating a token stream with the lexer
        TokenStream tk = new CommonTokenStream(lexer);

        //creating a parser with the token stream
        WhileParser parser = new WhileParser(tk);


        try {

            //the common tree is a representation of the AST
            CommonTree ct = (CommonTree) parser.start().getTree();
            //Création d'un objet TestVisitor pour tester la méthode VisitAffectation
            TestVisitor visitor = new TestVisitor(ct);
            visitor.parse();
            //Vérification que la méthode VisitAffectation a été appelée

            assertTrue(visitor.InputVisited);

        }catch (Exception e){}
    }

    @Test
    public void testVisitOutput() {
        String text = " function addArbres :\n" +
                "read A1,A2\n" +
                "%\n" +
                "%\n" +
                "write Ret1";

        //creating a stream of char représentative of the source code
        CharStream stream = new ANTLRStringStream(text);


        //creating a lexer with the stream of char
        WhileLexer lexer = new WhileLexer(stream);

        //creating a token stream with the lexer
        TokenStream tk = new CommonTokenStream(lexer);

        //creating a parser with the token stream
        WhileParser parser = new WhileParser(tk);


        try {

            //the common tree is a representation of the AST
            CommonTree ct = (CommonTree) parser.start().getTree();
            //Création d'un objet TestVisitor pour tester la méthode VisitAffectation
            TestVisitor visitor = new TestVisitor(ct);
            visitor.parse();
            //Vérification que la méthode VisitAffectation a été appelée

            assertTrue(visitor.OutputVisited);

        }catch (Exception e){}
    }

    @Test
    public void testVisitorIf(){
        String text = " function other:\n" +
                        "read Arg1,Arg2,Arg3\n" +
                        "%\n" +
                        "    TAP := Arg1;\n" +
                        "\n" +
                        "    if(not Op1)then\n" +
                        "        Result := nil\n" +
                        "    else\n" +
                        "        Result := nil\n" +
                        "    fi\n" +
                        "%\n" +
                        "write Result";


        //creating a stream of char représentative of the source code
        CharStream stream = new ANTLRStringStream(text);
        //creating a lexer with the stream of char
        WhileLexer lexer = new WhileLexer(stream);
        //creating a token stream with the lexer
        TokenStream tk = new CommonTokenStream(lexer);
        //creating a parser with the token stream
        WhileParser parser = new WhileParser(tk);

        try {
            //the common tree is a representation of the AST
            CommonTree ct = (CommonTree) parser.start().getTree();
            //Création d'un objet TestVisitor pour tester la méthode VisitAffectation
            TestVisitor visitor = new TestVisitor(ct);
            visitor.parse();
            //PrinterVisitor printerVisitor = new PrinterVisitor(ct);
            //printerVisitor.parse();
            //Vérification que la méthode VisitAffectation a été appelée
            assertTrue(visitor.IfVisited);
        }catch (Exception e){}
    }

    @Test
    public void testVisitorElse(){
        String text = " function other:\n" +
                "read Arg1,Arg2,Arg3\n" +
                "%\n" +
                "    TAP := Arg1;\n" +
                "\n" +
                "    if(not Op1)then\n" +
                "        Result := nil\n" +
                "    else\n" +
                "        Result := nil\n" +
                "    fi\n" +
                "%\n" +
                "write Result";


        //creating a stream of char représentative of the source code
        CharStream stream = new ANTLRStringStream(text);
        //creating a lexer with the stream of char
        WhileLexer lexer = new WhileLexer(stream);
        //creating a token stream with the lexer
        TokenStream tk = new CommonTokenStream(lexer);
        //creating a parser with the token stream
        WhileParser parser = new WhileParser(tk);

        try {
            //the common tree is a representation of the AST
            CommonTree ct = (CommonTree) parser.start().getTree();
            //Création d'un objet TestVisitor pour tester la méthode VisitAffectation
            TestVisitor visitor = new TestVisitor(ct);
            visitor.parse();
            //PrinterVisitor printerVisitor = new PrinterVisitor(ct);
            //printerVisitor.parse();
            //Vérification que la méthode VisitAffectation a été appelée
            assertTrue(visitor.IfVisited);
        }catch (Exception e){}
    }

    @Test
    public void testVisitorThen(){
        String text = " function other:\n" +
                "read Arg1,Arg2,Arg3\n" +
                "%\n" +
                "    TAP := Arg1;\n" +
                "\n" +
                "    if(not Op1)then\n" +
                "        Result := nil\n" +
                "    else\n" +
                "        Result := nil\n" +
                "    fi\n" +
                "%\n" +
                "write Result";


        //creating a stream of char représentative of the source code
        CharStream stream = new ANTLRStringStream(text);
        //creating a lexer with the stream of char
        WhileLexer lexer = new WhileLexer(stream);
        //creating a token stream with the lexer
        TokenStream tk = new CommonTokenStream(lexer);
        //creating a parser with the token stream
        WhileParser parser = new WhileParser(tk);

        try {
            //the common tree is a representation of the AST
            CommonTree ct = (CommonTree) parser.start().getTree();
            //Création d'un objet TestVisitor pour tester la méthode VisitAffectation
            TestVisitor visitor = new TestVisitor(ct);
            visitor.parse();
            //PrinterVisitor printerVisitor = new PrinterVisitor(ct);
            //printerVisitor.parse();
            //Vérification que la méthode VisitAffectation a été appelée
            assertTrue(visitor.ThenVisited);
        }catch (Exception e){}
    }

    @Test
    public void testVisitorVar(){
        String text = " function other:\n" +
                "read Arg1,Arg2,Arg3\n" +
                "%\n" +
                "    TAP := Arg1;\n" +
                "\n" +
                "    if(not Op1)then\n" +
                "        Result := nil\n" +
                "    else\n" +
                "        Result := nil\n" +
                "    fi\n" +
                "%\n" +
                "write Result";


        //creating a stream of char représentative of the source code
        CharStream stream = new ANTLRStringStream(text);
        //creating a lexer with the stream of char
        WhileLexer lexer = new WhileLexer(stream);
        //creating a token stream with the lexer
        TokenStream tk = new CommonTokenStream(lexer);
        //creating a parser with the token stream
        WhileParser parser = new WhileParser(tk);

        try {
            //the common tree is a representation of the AST
            CommonTree ct = (CommonTree) parser.start().getTree();
            //Création d'un objet TestVisitor pour tester la méthode VisitAffectation
            TestVisitor visitor = new TestVisitor(ct);
            visitor.parse();
            //PrinterVisitor printerVisitor = new PrinterVisitor(ct);
            //printerVisitor.parse();
            //Vérification que la méthode VisitAffectation a été appelée
            assertTrue(visitor.VarVisited);
        }catch (Exception e){}
    }

    @Test
    public void testVisitorAffection(){
        String text = " function other:\n" +
                "read Arg1,Arg2,Arg3\n" +
                "%\n" +
                "    TAP := Arg1;\n" +
                "\n" +
                "    if(not Op1)then\n" +
                "        Result := nil\n" +
                "    else\n" +
                "        Result := nil\n" +
                "    fi\n" +
                "%\n" +
                "write Result";


        //creating a stream of char représentative of the source code
        CharStream stream = new ANTLRStringStream(text);
        //creating a lexer with the stream of char
        WhileLexer lexer = new WhileLexer(stream);
        //creating a token stream with the lexer
        TokenStream tk = new CommonTokenStream(lexer);
        //creating a parser with the token stream
        WhileParser parser = new WhileParser(tk);

        try {
            //the common tree is a representation of the AST
            CommonTree ct = (CommonTree) parser.start().getTree();
            //Création d'un objet TestVisitor pour tester la méthode VisitAffectation
            TestVisitor visitor = new TestVisitor(ct);
            visitor.parse();
            //PrinterVisitor printerVisitor = new PrinterVisitor(ct);
            //printerVisitor.parse();
            //Vérification que la méthode VisitAffectation a été appelée
            assertTrue(visitor.AffectionVisited);
        }catch (Exception e){}
    }

    @Test
    public void testVisitorExpr(){
        String text = " function other:\n" +
                "read Arg1,Arg2,Arg3\n" +
                "%\n" +
                "    TAP := Arg1;\n" +
                "\n" +
                "    if(not Op1)then\n" +
                "        Result := nil\n" +
                "    else\n" +
                "        Result := nil\n" +
                "    fi\n" +
                "%\n" +
                "write Result";


        //creating a stream of char représentative of the source code
        CharStream stream = new ANTLRStringStream(text);
        //creating a lexer with the stream of char
        WhileLexer lexer = new WhileLexer(stream);
        //creating a token stream with the lexer
        TokenStream tk = new CommonTokenStream(lexer);
        //creating a parser with the token stream
        WhileParser parser = new WhileParser(tk);

        try {
            //the common tree is a representation of the AST
            CommonTree ct = (CommonTree) parser.start().getTree();
            //Création d'un objet TestVisitor pour tester la méthode VisitAffectation
            TestVisitor visitor = new TestVisitor(ct);
            visitor.parse();
            //PrinterVisitor printerVisitor = new PrinterVisitor(ct);
            //printerVisitor.parse();
            //Vérification que la méthode VisitAffectation a été appelée
            assertTrue(visitor.ExprVisited);
        }catch (Exception e){}
    }

    @Test
    public void testVisitorSymbol(){
        String text = " function other:\n" +
                "read Arg1,Arg2,Arg3\n" +
                "%\n" +
                "    TAP := Arg1;\n" +
                "\n" +
                "    if(not Op1)then\n" +
                "        Result := nil\n" +
                "    else\n" +
                "        Result := nil\n" +
                "    fi\n" +
                "%\n" +
                "write Result";


        //creating a stream of char représentative of the source code
        CharStream stream = new ANTLRStringStream(text);
        //creating a lexer with the stream of char
        WhileLexer lexer = new WhileLexer(stream);
        //creating a token stream with the lexer
        TokenStream tk = new CommonTokenStream(lexer);
        //creating a parser with the token stream
        WhileParser parser = new WhileParser(tk);

        try {
            //the common tree is a representation of the AST
            CommonTree ct = (CommonTree) parser.start().getTree();
            //Création d'un objet TestVisitor pour tester la méthode VisitAffectation
            TestVisitor visitor = new TestVisitor(ct);
            visitor.parse();
            //PrinterVisitor printerVisitor = new PrinterVisitor(ct);
            //printerVisitor.parse();
            //Vérification que la méthode VisitAffectation a été appelée
            assertTrue(visitor.SymbVisited);
        }catch (Exception e){}
    }

    @Test
    public void testVisitorFor(){
        String text = "function and:\n" +
                "read Op1,Op2\n" +
                "%\n" +
                "    for Op2 do\n" +
                "        Result := (tl Result)\n" +
                "    od\n" +
                "\n" +
                "%\n" +
                "write Result";


        //creating a stream of char représentative of the source code
        CharStream stream = new ANTLRStringStream(text);
        //creating a lexer with the stream of char
        WhileLexer lexer = new WhileLexer(stream);
        //creating a token stream with the lexer
        TokenStream tk = new CommonTokenStream(lexer);
        //creating a parser with the token stream
        WhileParser parser = new WhileParser(tk);

        try {
            //the common tree is a representation of the AST
            CommonTree ct = (CommonTree) parser.start().getTree();
            //Création d'un objet TestVisitor pour tester la méthode VisitAffectation
            TestVisitor visitor = new TestVisitor(ct);
            visitor.parse();
            //Vérification que la méthode VisitAffectation a été appelée
            assertTrue(visitor.ForVisited);
        }catch (Exception e){}
    }

    @Test
    public void testVisitorNil(){
        String text = "function main :\n" +
                "read\n" +
                "%\n" +
                "Ret1 := nil \n" +
                "%\n" +
                "write Ret1";


        //creating a stream of char représentative of the source code
        CharStream stream = new ANTLRStringStream(text);
        //creating a lexer with the stream of char
        WhileLexer lexer = new WhileLexer(stream);
        //creating a token stream with the lexer
        TokenStream tk = new CommonTokenStream(lexer);
        //creating a parser with the token stream
        WhileParser parser = new WhileParser(tk);

        try {
            //the common tree is a representation of the AST
            CommonTree ct = (CommonTree) parser.start().getTree();
            //Création d'un objet TestVisitor pour tester la méthode VisitAffectation
            TestVisitor visitor = new TestVisitor(ct);
            visitor.parse();
            //PrinterVisitor printerVisitor = new PrinterVisitor(ct);
            //printerVisitor.parse();
            //Vérification que la méthode VisitAffectation a été appelée
            assertTrue(visitor.NilVisited);
        }catch (Exception e){}
    }

    @Test
    public void testVisitorCons(){
        String text = " function true : read " +
                "%" +
                "Result := (cons nil nil) " +
                "% " +
                "write Result";


        //creating a stream of char représentative of the source code
        CharStream stream = new ANTLRStringStream(text);
        //creating a lexer with the stream of char
        WhileLexer lexer = new WhileLexer(stream);
        //creating a token stream with the lexer
        TokenStream tk = new CommonTokenStream(lexer);
        //creating a parser with the token stream
        WhileParser parser = new WhileParser(tk);

        try {
            //the common tree is a representation of the AST
            CommonTree ct = (CommonTree) parser.start().getTree();
            //Création d'un objet TestVisitor pour tester la méthode VisitAffectation
            TestVisitor visitor = new TestVisitor(ct);
            visitor.parse();
            //PrinterVisitor printerVisitor = new PrinterVisitor(ct);
            //printerVisitor.parse();
            //Vérification que la méthode VisitAffectation a été appelée
            assertTrue(visitor.ConstVisited);
        }catch (Exception e){}
    }

    @Test
    public void testVisitorList(){
        String text = " function main :\n" +
                "        read A,B,C,D\n" +
                "        %\n" +
                "\n" +
                "        for A do\n" +
                "        Liste := (list (cons A B) A B C )\n" +
                "        od;\n" +
                "\n" +
                "        Liste := (tl A )\n" +
                "\n" +
                "        %\n" +
                "        write Liste";


        //creating a stream of char représentative of the source code
        CharStream stream = new ANTLRStringStream(text);
        //creating a lexer with the stream of char
        WhileLexer lexer = new WhileLexer(stream);
        //creating a token stream with the lexer
        TokenStream tk = new CommonTokenStream(lexer);
        //creating a parser with the token stream
        WhileParser parser = new WhileParser(tk);

        try {
            //the common tree is a representation of the AST
            CommonTree ct = (CommonTree) parser.start().getTree();
            //Création d'un objet TestVisitor pour tester la méthode VisitAffectation
            TestVisitor visitor = new TestVisitor(ct);
            visitor.parse();
            //PrinterVisitor printerVisitor = new PrinterVisitor(ct);
            //printerVisitor.parse();
            //Vérification que la méthode VisitAffectation a été appelée
            assertTrue(visitor.ListVisited);
        }catch (Exception e){}
    }

    @Test
    public void testVisitorWhile(){
        String text = "function main :\n" +
                "read\n" +
                "%\n" +
                "\n" +
                "\n" +
                "    while Ret1 do\n" +
                "        Ret1 := nil\n" +
                "    od\n" +
                "\n" +
                "\n" +
                "%\n" +
                "write Ret1";


        //creating a stream of char représentative of the source code
        CharStream stream = new ANTLRStringStream(text);
        //creating a lexer with the stream of char
        WhileLexer lexer = new WhileLexer(stream);
        //creating a token stream with the lexer
        TokenStream tk = new CommonTokenStream(lexer);
        //creating a parser with the token stream
        WhileParser parser = new WhileParser(tk);

        try {
            //the common tree is a representation of the AST
            CommonTree ct = (CommonTree) parser.start().getTree();
            //Création d'un objet TestVisitor pour tester la méthode VisitAffectation
            TestVisitor visitor = new TestVisitor(ct);
            visitor.parse();
            //PrinterVisitor printerVisitor = new PrinterVisitor(ct);
            //printerVisitor.parse();
            //Vérification que la méthode VisitAffectation a été appelée
            assertTrue(visitor.WhileVisited);
        }catch (Exception e){}
    }

    @Test
    public void testVisitorHead(){
        String text = "function main :\n" +
                "read\n" +
                "%\n" +
                "Ret1 := (hd nil )\n" +
                "%\n" +
                "write Ret1";


        //creating a stream of char représentative of the source code
        CharStream stream = new ANTLRStringStream(text);
        //creating a lexer with the stream of char
        WhileLexer lexer = new WhileLexer(stream);
        //creating a token stream with the lexer
        TokenStream tk = new CommonTokenStream(lexer);
        //creating a parser with the token stream
        WhileParser parser = new WhileParser(tk);

        try {
            //the common tree is a representation of the AST
            CommonTree ct = (CommonTree) parser.start().getTree();
            //Création d'un objet TestVisitor pour tester la méthode VisitAffectation
            TestVisitor visitor = new TestVisitor(ct);
            visitor.parse();
            //PrinterVisitor printerVisitor = new PrinterVisitor(ct);
            //printerVisitor.parse();
            //Vérification que la méthode VisitAffectation a été appelée
            assertTrue(visitor.TeteVisited);
        }catch (Exception e){}
    }

    @Test
    public void testVisitorTail(){
        String text = "function main :\n" +
                "read\n" +
                "%\n" +
                "Ret1 := (tl nil )\n" +
                "%\n" +
                "write Ret1";


        //creating a stream of char représentative of the source code
        CharStream stream = new ANTLRStringStream(text);
        //creating a lexer with the stream of char
        WhileLexer lexer = new WhileLexer(stream);
        //creating a token stream with the lexer
        TokenStream tk = new CommonTokenStream(lexer);
        //creating a parser with the token stream
        WhileParser parser = new WhileParser(tk);

        try {
            //the common tree is a representation of the AST
            CommonTree ct = (CommonTree) parser.start().getTree();
            //Création d'un objet TestVisitor pour tester la méthode VisitAffectation
            TestVisitor visitor = new TestVisitor(ct);
            visitor.parse();
            //PrinterVisitor printerVisitor = new PrinterVisitor(ct);
            //printerVisitor.parse();
            //Vérification que la méthode VisitAffectation a été appelée
            assertTrue(visitor.QueueVisited);
        }catch (Exception e){}
    }

}



