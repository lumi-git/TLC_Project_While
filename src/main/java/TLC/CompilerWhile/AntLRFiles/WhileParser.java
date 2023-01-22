package TLC.CompilerWhile.AntLRFiles;// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g 2023-01-21 18:36:31

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class WhileParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FONCTION", "DEFINITION", "INPUTSUB", "INPUT", "OUTPUT", "COMMANDS", "COMMAND", "VARS", "IF", "FOR", "WHILE", "FOREACH", "AFF", "ELSE", "CONS", "LIST", "HD", "TL", "SYM", "COMP", "EXPCOND", "START", "APPFUNC", "RIGHTAFF", "LEFTAFF", "RIGHT", "LEFT", "THEN", "NIL", "PP", "WS", "COMMENT", "Symbol", "Nil", "Variable", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'if'", "'then'", "'else'", "'fi'", "'while'", "'do'", "'od'", "'for'", "'foreach'", "'in'", "'pp('", "')'", "'('", "'cons'", "'list'", "'hd'", "'tl'", "'=?'"
    };
    public static final int EOF=-1;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int FONCTION=4;
    public static final int DEFINITION=5;
    public static final int INPUTSUB=6;
    public static final int INPUT=7;
    public static final int OUTPUT=8;
    public static final int COMMANDS=9;
    public static final int COMMAND=10;
    public static final int VARS=11;
    public static final int IF=12;
    public static final int FOR=13;
    public static final int WHILE=14;
    public static final int FOREACH=15;
    public static final int AFF=16;
    public static final int ELSE=17;
    public static final int CONS=18;
    public static final int LIST=19;
    public static final int HD=20;
    public static final int TL=21;
    public static final int SYM=22;
    public static final int COMP=23;
    public static final int EXPCOND=24;
    public static final int START=25;
    public static final int APPFUNC=26;
    public static final int RIGHTAFF=27;
    public static final int LEFTAFF=28;
    public static final int RIGHT=29;
    public static final int LEFT=30;
    public static final int THEN=31;
    public static final int NIL=32;
    public static final int PP=33;
    public static final int WS=34;
    public static final int COMMENT=35;
    public static final int Symbol=36;
    public static final int Nil=37;
    public static final int Variable=38;

    // delegates
    // delegators


        public WhileParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public WhileParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return WhileParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g"; }


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:51:1: start : t1= program -> ^( START $t1) ;
    public final WhileParser.start_return start() throws RecognitionException {
        WhileParser.start_return retval = new WhileParser.start_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        WhileParser.program_return t1 = null;


        RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:51:7: (t1= program -> ^( START $t1) )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:51:9: t1= program
            {
            pushFollow(FOLLOW_program_in_start276);
            t1=program();

            state._fsp--;

            stream_program.add(t1.getTree());


            // AST REWRITE
            // elements: t1
            // token labels: 
            // rule labels: t1, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_t1=new RewriteRuleSubtreeStream(adaptor,"rule t1",t1!=null?t1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 51:20: -> ^( START $t1)
            {
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:51:23: ^( START $t1)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(START, "START"), root_1);

                adaptor.addChild(root_1, stream_t1.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "start"

    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:52:1: program : function ( program )? ;
    public final WhileParser.program_return program() throws RecognitionException {
        WhileParser.program_return retval = new WhileParser.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        WhileParser.function_return function1 = null;

        WhileParser.program_return program2 = null;



        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:52:9: ( function ( program )? )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:52:11: function ( program )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_function_in_program292);
            function1=function();

            state._fsp--;

            adaptor.addChild(root_0, function1.getTree());
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:52:20: ( program )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==39) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:52:21: program
                    {
                    pushFollow(FOLLOW_program_in_program295);
                    program2=program();

                    state._fsp--;

                    adaptor.addChild(root_0, program2.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function"
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:53:1: function : 'function' t1= Symbol ':' t2= definition -> ^( FONCTION $t1 $t2) ;
    public final WhileParser.function_return function() throws RecognitionException {
        WhileParser.function_return retval = new WhileParser.function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token t1=null;
        Token string_literal3=null;
        Token char_literal4=null;
        WhileParser.definition_return t2 = null;


        Object t1_tree=null;
        Object string_literal3_tree=null;
        Object char_literal4_tree=null;
        RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:53:9: ( 'function' t1= Symbol ':' t2= definition -> ^( FONCTION $t1 $t2) )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:53:12: 'function' t1= Symbol ':' t2= definition
            {
            string_literal3=(Token)match(input,39,FOLLOW_39_in_function304);  
            stream_39.add(string_literal3);

            t1=(Token)match(input,Symbol,FOLLOW_Symbol_in_function308);  
            stream_Symbol.add(t1);

            char_literal4=(Token)match(input,40,FOLLOW_40_in_function310);  
            stream_40.add(char_literal4);

            pushFollow(FOLLOW_definition_in_function314);
            t2=definition();

            state._fsp--;

            stream_definition.add(t2.getTree());


            // AST REWRITE
            // elements: t2, t1
            // token labels: t1
            // rule labels: t2, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_t1=new RewriteRuleTokenStream(adaptor,"token t1",t1);
            RewriteRuleSubtreeStream stream_t2=new RewriteRuleSubtreeStream(adaptor,"rule t2",t2!=null?t2.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 53:51: -> ^( FONCTION $t1 $t2)
            {
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:53:54: ^( FONCTION $t1 $t2)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FONCTION, "FONCTION"), root_1);

                adaptor.addChild(root_1, stream_t1.nextNode());
                adaptor.addChild(root_1, stream_t2.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function"

    public static class definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definition"
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:54:1: definition : 'read' t1= input '%' t2= commands '%' 'write' t3= output -> ^( DEFINITION ( $t1)? $t2 $t3) ;
    public final WhileParser.definition_return definition() throws RecognitionException {
        WhileParser.definition_return retval = new WhileParser.definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal5=null;
        Token char_literal6=null;
        Token char_literal7=null;
        Token string_literal8=null;
        WhileParser.input_return t1 = null;

        WhileParser.commands_return t2 = null;

        WhileParser.output_return t3 = null;


        Object string_literal5_tree=null;
        Object char_literal6_tree=null;
        Object char_literal7_tree=null;
        Object string_literal8_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
        RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:54:11: ( 'read' t1= input '%' t2= commands '%' 'write' t3= output -> ^( DEFINITION ( $t1)? $t2 $t3) )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:54:14: 'read' t1= input '%' t2= commands '%' 'write' t3= output
            {
            string_literal5=(Token)match(input,41,FOLLOW_41_in_definition333);  
            stream_41.add(string_literal5);

            pushFollow(FOLLOW_input_in_definition337);
            t1=input();

            state._fsp--;

            stream_input.add(t1.getTree());
            char_literal6=(Token)match(input,42,FOLLOW_42_in_definition339);  
            stream_42.add(char_literal6);

            pushFollow(FOLLOW_commands_in_definition343);
            t2=commands();

            state._fsp--;

            stream_commands.add(t2.getTree());
            char_literal7=(Token)match(input,42,FOLLOW_42_in_definition345);  
            stream_42.add(char_literal7);

            string_literal8=(Token)match(input,43,FOLLOW_43_in_definition347);  
            stream_43.add(string_literal8);

            pushFollow(FOLLOW_output_in_definition351);
            t3=output();

            state._fsp--;

            stream_output.add(t3.getTree());


            // AST REWRITE
            // elements: t1, t2, t3
            // token labels: 
            // rule labels: t1, t2, retval, t3
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_t1=new RewriteRuleSubtreeStream(adaptor,"rule t1",t1!=null?t1.tree:null);
            RewriteRuleSubtreeStream stream_t2=new RewriteRuleSubtreeStream(adaptor,"rule t2",t2!=null?t2.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_t3=new RewriteRuleSubtreeStream(adaptor,"rule t3",t3!=null?t3.tree:null);

            root_0 = (Object)adaptor.nil();
            // 54:68: -> ^( DEFINITION ( $t1)? $t2 $t3)
            {
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:54:71: ^( DEFINITION ( $t1)? $t2 $t3)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFINITION, "DEFINITION"), root_1);

                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:54:84: ( $t1)?
                if ( stream_t1.hasNext() ) {
                    adaptor.addChild(root_1, stream_t1.nextTree());

                }
                stream_t1.reset();
                adaptor.addChild(root_1, stream_t2.nextTree());
                adaptor.addChild(root_1, stream_t3.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "definition"

    public static class input_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "input"
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:56:1: input : (t1= inputSub )? -> ^( INPUT ( $t1)? ) ;
    public final WhileParser.input_return input() throws RecognitionException {
        WhileParser.input_return retval = new WhileParser.input_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        WhileParser.inputSub_return t1 = null;


        RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:56:7: ( (t1= inputSub )? -> ^( INPUT ( $t1)? ) )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:56:9: (t1= inputSub )?
            {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:56:11: (t1= inputSub )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Variable) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:56:11: t1= inputSub
                    {
                    pushFollow(FOLLOW_inputSub_in_input377);
                    t1=inputSub();

                    state._fsp--;

                    stream_inputSub.add(t1.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: t1
            // token labels: 
            // rule labels: t1, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_t1=new RewriteRuleSubtreeStream(adaptor,"rule t1",t1!=null?t1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 56:22: -> ^( INPUT ( $t1)? )
            {
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:56:25: ^( INPUT ( $t1)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_1);

                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:56:33: ( $t1)?
                if ( stream_t1.hasNext() ) {
                    adaptor.addChild(root_1, stream_t1.nextTree());

                }
                stream_t1.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "input"

    public static class inputSub_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inputSub"
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:57:1: inputSub : t1= variable ( ',' t2= inputSub )? -> $t1 ( $t2)? ;
    public final WhileParser.inputSub_return inputSub() throws RecognitionException {
        WhileParser.inputSub_return retval = new WhileParser.inputSub_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal9=null;
        WhileParser.variable_return t1 = null;

        WhileParser.inputSub_return t2 = null;


        Object char_literal9_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:57:9: (t1= variable ( ',' t2= inputSub )? -> $t1 ( $t2)? )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:57:11: t1= variable ( ',' t2= inputSub )?
            {
            pushFollow(FOLLOW_variable_in_inputSub396);
            t1=variable();

            state._fsp--;

            stream_variable.add(t1.getTree());
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:57:23: ( ',' t2= inputSub )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==44) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:57:24: ',' t2= inputSub
                    {
                    char_literal9=(Token)match(input,44,FOLLOW_44_in_inputSub399);  
                    stream_44.add(char_literal9);

                    pushFollow(FOLLOW_inputSub_in_inputSub403);
                    t2=inputSub();

                    state._fsp--;

                    stream_inputSub.add(t2.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: t2, t1
            // token labels: 
            // rule labels: t1, t2, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_t1=new RewriteRuleSubtreeStream(adaptor,"rule t1",t1!=null?t1.tree:null);
            RewriteRuleSubtreeStream stream_t2=new RewriteRuleSubtreeStream(adaptor,"rule t2",t2!=null?t2.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 57:42: -> $t1 ( $t2)?
            {
                adaptor.addChild(root_0, stream_t1.nextTree());
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:57:49: ( $t2)?
                if ( stream_t2.hasNext() ) {
                    adaptor.addChild(root_0, stream_t2.nextTree());

                }
                stream_t2.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "inputSub"

    public static class output_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "output"
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:58:1: output : (t1= outputSub )? -> ^( OUTPUT ( $t1)? ) ;
    public final WhileParser.output_return output() throws RecognitionException {
        WhileParser.output_return retval = new WhileParser.output_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        WhileParser.outputSub_return t1 = null;


        RewriteRuleSubtreeStream stream_outputSub=new RewriteRuleSubtreeStream(adaptor,"rule outputSub");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:58:8: ( (t1= outputSub )? -> ^( OUTPUT ( $t1)? ) )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:58:10: (t1= outputSub )?
            {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:58:12: (t1= outputSub )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Variable) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:58:12: t1= outputSub
                    {
                    pushFollow(FOLLOW_outputSub_in_output423);
                    t1=outputSub();

                    state._fsp--;

                    stream_outputSub.add(t1.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: t1
            // token labels: 
            // rule labels: t1, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_t1=new RewriteRuleSubtreeStream(adaptor,"rule t1",t1!=null?t1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 58:24: -> ^( OUTPUT ( $t1)? )
            {
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:58:27: ^( OUTPUT ( $t1)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_1);

                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:58:36: ( $t1)?
                if ( stream_t1.hasNext() ) {
                    adaptor.addChild(root_1, stream_t1.nextTree());

                }
                stream_t1.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "output"

    public static class outputSub_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "outputSub"
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:59:1: outputSub : t1= variable ( ',' t2= outputSub )? -> $t1 ( $t2)? ;
    public final WhileParser.outputSub_return outputSub() throws RecognitionException {
        WhileParser.outputSub_return retval = new WhileParser.outputSub_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal10=null;
        WhileParser.variable_return t1 = null;

        WhileParser.outputSub_return t2 = null;


        Object char_literal10_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleSubtreeStream stream_outputSub=new RewriteRuleSubtreeStream(adaptor,"rule outputSub");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:59:10: (t1= variable ( ',' t2= outputSub )? -> $t1 ( $t2)? )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:59:12: t1= variable ( ',' t2= outputSub )?
            {
            pushFollow(FOLLOW_variable_in_outputSub442);
            t1=variable();

            state._fsp--;

            stream_variable.add(t1.getTree());
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:59:24: ( ',' t2= outputSub )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==44) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:59:25: ',' t2= outputSub
                    {
                    char_literal10=(Token)match(input,44,FOLLOW_44_in_outputSub445);  
                    stream_44.add(char_literal10);

                    pushFollow(FOLLOW_outputSub_in_outputSub449);
                    t2=outputSub();

                    state._fsp--;

                    stream_outputSub.add(t2.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: t2, t1
            // token labels: 
            // rule labels: t1, t2, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_t1=new RewriteRuleSubtreeStream(adaptor,"rule t1",t1!=null?t1.tree:null);
            RewriteRuleSubtreeStream stream_t2=new RewriteRuleSubtreeStream(adaptor,"rule t2",t2!=null?t2.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 59:44: -> $t1 ( $t2)?
            {
                adaptor.addChild(root_0, stream_t1.nextTree());
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:59:51: ( $t2)?
                if ( stream_t2.hasNext() ) {
                    adaptor.addChild(root_0, stream_t2.nextTree());

                }
                stream_t2.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "outputSub"

    public static class commands_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commands"
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:62:1: commands : t1= command ( ';' t2= commands )? -> $t1 ( $t2)? ;
    public final WhileParser.commands_return commands() throws RecognitionException {
        WhileParser.commands_return retval = new WhileParser.commands_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal11=null;
        WhileParser.command_return t1 = null;

        WhileParser.commands_return t2 = null;


        Object char_literal11_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:62:9: (t1= command ( ';' t2= commands )? -> $t1 ( $t2)? )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:62:11: t1= command ( ';' t2= commands )?
            {
            pushFollow(FOLLOW_command_in_commands470);
            t1=command();

            state._fsp--;

            stream_command.add(t1.getTree());
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:62:21: ( ';' t2= commands )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==45) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:62:22: ';' t2= commands
                    {
                    char_literal11=(Token)match(input,45,FOLLOW_45_in_commands472);  
                    stream_45.add(char_literal11);

                    pushFollow(FOLLOW_commands_in_commands476);
                    t2=commands();

                    state._fsp--;

                    stream_commands.add(t2.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: t1, t2
            // token labels: 
            // rule labels: t1, t2, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_t1=new RewriteRuleSubtreeStream(adaptor,"rule t1",t1!=null?t1.tree:null);
            RewriteRuleSubtreeStream stream_t2=new RewriteRuleSubtreeStream(adaptor,"rule t2",t2!=null?t2.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 62:41: -> $t1 ( $t2)?
            {
                adaptor.addChild(root_0, stream_t1.nextTree());
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:62:48: ( $t2)?
                if ( stream_t2.hasNext() ) {
                    adaptor.addChild(root_0, stream_t2.nextTree());

                }
                stream_t2.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "commands"

    public static class command_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:64:1: command : ( 'nop' | (t1= vars ':=' t2= exprs ) -> ^( AFF ^( LEFTAFF $t1) ^( RIGHTAFF $t2) ) | ( 'if' t3= condition 'then' t4= commands ( 'else' t5= commands ) 'fi' ) -> ^( IF ^( EXPCOND $t3) ^( THEN $t4) ( ^( ELSE $t5) )? ) | ( 'while' t6= condition 'do' t7= commands 'od' ) -> ^( WHILE ^( EXPCOND $t6) $t7) | ( 'for' t8= conditionSimple 'do' t9= commands 'od' ) -> ^( FOR $t8 $t9) | ( 'foreach' t10= variable 'in' t11= expression 'do' t12= commands 'od' ) -> ^( FOREACH $t10 $t11 $t12) | ( 'pp(' expression ')' -> ^( PP expression ) ) );
    public final WhileParser.command_return command() throws RecognitionException {
        WhileParser.command_return retval = new WhileParser.command_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal12=null;
        Token string_literal13=null;
        Token string_literal14=null;
        Token string_literal15=null;
        Token string_literal16=null;
        Token string_literal17=null;
        Token string_literal18=null;
        Token string_literal19=null;
        Token string_literal20=null;
        Token string_literal21=null;
        Token string_literal22=null;
        Token string_literal23=null;
        Token string_literal24=null;
        Token string_literal25=null;
        Token string_literal26=null;
        Token string_literal27=null;
        Token string_literal28=null;
        Token char_literal30=null;
        WhileParser.vars_return t1 = null;

        WhileParser.exprs_return t2 = null;

        WhileParser.condition_return t3 = null;

        WhileParser.commands_return t4 = null;

        WhileParser.commands_return t5 = null;

        WhileParser.condition_return t6 = null;

        WhileParser.commands_return t7 = null;

        WhileParser.conditionSimple_return t8 = null;

        WhileParser.commands_return t9 = null;

        WhileParser.variable_return t10 = null;

        WhileParser.expression_return t11 = null;

        WhileParser.commands_return t12 = null;

        WhileParser.expression_return expression29 = null;


        Object string_literal12_tree=null;
        Object string_literal13_tree=null;
        Object string_literal14_tree=null;
        Object string_literal15_tree=null;
        Object string_literal16_tree=null;
        Object string_literal17_tree=null;
        Object string_literal18_tree=null;
        Object string_literal19_tree=null;
        Object string_literal20_tree=null;
        Object string_literal21_tree=null;
        Object string_literal22_tree=null;
        Object string_literal23_tree=null;
        Object string_literal24_tree=null;
        Object string_literal25_tree=null;
        Object string_literal26_tree=null;
        Object string_literal27_tree=null;
        Object string_literal28_tree=null;
        Object char_literal30_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_conditionSimple=new RewriteRuleSubtreeStream(adaptor,"rule conditionSimple");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
        RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:64:9: ( 'nop' | (t1= vars ':=' t2= exprs ) -> ^( AFF ^( LEFTAFF $t1) ^( RIGHTAFF $t2) ) | ( 'if' t3= condition 'then' t4= commands ( 'else' t5= commands ) 'fi' ) -> ^( IF ^( EXPCOND $t3) ^( THEN $t4) ( ^( ELSE $t5) )? ) | ( 'while' t6= condition 'do' t7= commands 'od' ) -> ^( WHILE ^( EXPCOND $t6) $t7) | ( 'for' t8= conditionSimple 'do' t9= commands 'od' ) -> ^( FOR $t8 $t9) | ( 'foreach' t10= variable 'in' t11= expression 'do' t12= commands 'od' ) -> ^( FOREACH $t10 $t11 $t12) | ( 'pp(' expression ')' -> ^( PP expression ) ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt7=1;
                }
                break;
            case Variable:
                {
                alt7=2;
                }
                break;
            case 48:
                {
                alt7=3;
                }
                break;
            case 52:
                {
                alt7=4;
                }
                break;
            case 55:
                {
                alt7=5;
                }
                break;
            case 56:
                {
                alt7=6;
                }
                break;
            case 58:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:64:11: 'nop'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal12=(Token)match(input,46,FOLLOW_46_in_command496); 
                    string_literal12_tree = (Object)adaptor.create(string_literal12);
                    adaptor.addChild(root_0, string_literal12_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:65:3: (t1= vars ':=' t2= exprs )
                    {
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:65:3: (t1= vars ':=' t2= exprs )
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:65:4: t1= vars ':=' t2= exprs
                    {
                    pushFollow(FOLLOW_vars_in_command504);
                    t1=vars();

                    state._fsp--;

                    stream_vars.add(t1.getTree());
                    string_literal13=(Token)match(input,47,FOLLOW_47_in_command506);  
                    stream_47.add(string_literal13);

                    pushFollow(FOLLOW_exprs_in_command510);
                    t2=exprs();

                    state._fsp--;

                    stream_exprs.add(t2.getTree());

                    }



                    // AST REWRITE
                    // elements: t2, t1
                    // token labels: 
                    // rule labels: t1, t2, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_t1=new RewriteRuleSubtreeStream(adaptor,"rule t1",t1!=null?t1.tree:null);
                    RewriteRuleSubtreeStream stream_t2=new RewriteRuleSubtreeStream(adaptor,"rule t2",t2!=null?t2.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 65:26: -> ^( AFF ^( LEFTAFF $t1) ^( RIGHTAFF $t2) )
                    {
                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:65:28: ^( AFF ^( LEFTAFF $t1) ^( RIGHTAFF $t2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFF, "AFF"), root_1);

                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:65:34: ^( LEFTAFF $t1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(LEFTAFF, "LEFTAFF"), root_2);

                        adaptor.addChild(root_2, stream_t1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:65:49: ^( RIGHTAFF $t2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RIGHTAFF, "RIGHTAFF"), root_2);

                        adaptor.addChild(root_2, stream_t2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:66:3: ( 'if' t3= condition 'then' t4= commands ( 'else' t5= commands ) 'fi' )
                    {
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:66:3: ( 'if' t3= condition 'then' t4= commands ( 'else' t5= commands ) 'fi' )
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:66:4: 'if' t3= condition 'then' t4= commands ( 'else' t5= commands ) 'fi'
                    {
                    string_literal14=(Token)match(input,48,FOLLOW_48_in_command535);  
                    stream_48.add(string_literal14);

                    pushFollow(FOLLOW_condition_in_command539);
                    t3=condition();

                    state._fsp--;

                    stream_condition.add(t3.getTree());
                    string_literal15=(Token)match(input,49,FOLLOW_49_in_command541);  
                    stream_49.add(string_literal15);

                    pushFollow(FOLLOW_commands_in_command545);
                    t4=commands();

                    state._fsp--;

                    stream_commands.add(t4.getTree());
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:66:41: ( 'else' t5= commands )
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:66:42: 'else' t5= commands
                    {
                    string_literal16=(Token)match(input,50,FOLLOW_50_in_command548);  
                    stream_50.add(string_literal16);

                    pushFollow(FOLLOW_commands_in_command552);
                    t5=commands();

                    state._fsp--;

                    stream_commands.add(t5.getTree());

                    }

                    string_literal17=(Token)match(input,51,FOLLOW_51_in_command555);  
                    stream_51.add(string_literal17);


                    }



                    // AST REWRITE
                    // elements: t3, t4, t5
                    // token labels: 
                    // rule labels: t4, t5, retval, t3
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_t4=new RewriteRuleSubtreeStream(adaptor,"rule t4",t4!=null?t4.tree:null);
                    RewriteRuleSubtreeStream stream_t5=new RewriteRuleSubtreeStream(adaptor,"rule t5",t5!=null?t5.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_t3=new RewriteRuleSubtreeStream(adaptor,"rule t3",t3!=null?t3.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 66:67: -> ^( IF ^( EXPCOND $t3) ^( THEN $t4) ( ^( ELSE $t5) )? )
                    {
                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:66:69: ^( IF ^( EXPCOND $t3) ^( THEN $t4) ( ^( ELSE $t5) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:66:75: ^( EXPCOND $t3)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPCOND, "EXPCOND"), root_2);

                        adaptor.addChild(root_2, stream_t3.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:66:90: ^( THEN $t4)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);

                        adaptor.addChild(root_2, stream_t4.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:66:102: ( ^( ELSE $t5) )?
                        if ( stream_t5.hasNext() ) {
                            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:66:102: ^( ELSE $t5)
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_2);

                            adaptor.addChild(root_2, stream_t5.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_t5.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:67:3: ( 'while' t6= condition 'do' t7= commands 'od' )
                    {
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:67:3: ( 'while' t6= condition 'do' t7= commands 'od' )
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:67:4: 'while' t6= condition 'do' t7= commands 'od'
                    {
                    string_literal18=(Token)match(input,52,FOLLOW_52_in_command590);  
                    stream_52.add(string_literal18);

                    pushFollow(FOLLOW_condition_in_command594);
                    t6=condition();

                    state._fsp--;

                    stream_condition.add(t6.getTree());
                    string_literal19=(Token)match(input,53,FOLLOW_53_in_command596);  
                    stream_53.add(string_literal19);

                    pushFollow(FOLLOW_commands_in_command600);
                    t7=commands();

                    state._fsp--;

                    stream_commands.add(t7.getTree());
                    string_literal20=(Token)match(input,54,FOLLOW_54_in_command602);  
                    stream_54.add(string_literal20);


                    }



                    // AST REWRITE
                    // elements: t6, t7
                    // token labels: 
                    // rule labels: t6, t7, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_t6=new RewriteRuleSubtreeStream(adaptor,"rule t6",t6!=null?t6.tree:null);
                    RewriteRuleSubtreeStream stream_t7=new RewriteRuleSubtreeStream(adaptor,"rule t7",t7!=null?t7.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 67:48: -> ^( WHILE ^( EXPCOND $t6) $t7)
                    {
                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:67:51: ^( WHILE ^( EXPCOND $t6) $t7)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);

                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:67:59: ^( EXPCOND $t6)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPCOND, "EXPCOND"), root_2);

                        adaptor.addChild(root_2, stream_t6.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_t7.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:68:3: ( 'for' t8= conditionSimple 'do' t9= commands 'od' )
                    {
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:68:3: ( 'for' t8= conditionSimple 'do' t9= commands 'od' )
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:68:4: 'for' t8= conditionSimple 'do' t9= commands 'od'
                    {
                    string_literal21=(Token)match(input,55,FOLLOW_55_in_command625);  
                    stream_55.add(string_literal21);

                    pushFollow(FOLLOW_conditionSimple_in_command629);
                    t8=conditionSimple();

                    state._fsp--;

                    stream_conditionSimple.add(t8.getTree());
                    string_literal22=(Token)match(input,53,FOLLOW_53_in_command631);  
                    stream_53.add(string_literal22);

                    pushFollow(FOLLOW_commands_in_command635);
                    t9=commands();

                    state._fsp--;

                    stream_commands.add(t9.getTree());
                    string_literal23=(Token)match(input,54,FOLLOW_54_in_command637);  
                    stream_54.add(string_literal23);


                    }



                    // AST REWRITE
                    // elements: t9, t8
                    // token labels: 
                    // rule labels: t8, t9, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_t8=new RewriteRuleSubtreeStream(adaptor,"rule t8",t8!=null?t8.tree:null);
                    RewriteRuleSubtreeStream stream_t9=new RewriteRuleSubtreeStream(adaptor,"rule t9",t9!=null?t9.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 68:52: -> ^( FOR $t8 $t9)
                    {
                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:68:55: ^( FOR $t8 $t9)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);

                        adaptor.addChild(root_1, stream_t8.nextTree());
                        adaptor.addChild(root_1, stream_t9.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:69:3: ( 'foreach' t10= variable 'in' t11= expression 'do' t12= commands 'od' )
                    {
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:69:3: ( 'foreach' t10= variable 'in' t11= expression 'do' t12= commands 'od' )
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:69:4: 'foreach' t10= variable 'in' t11= expression 'do' t12= commands 'od'
                    {
                    string_literal24=(Token)match(input,56,FOLLOW_56_in_command656);  
                    stream_56.add(string_literal24);

                    pushFollow(FOLLOW_variable_in_command660);
                    t10=variable();

                    state._fsp--;

                    stream_variable.add(t10.getTree());
                    string_literal25=(Token)match(input,57,FOLLOW_57_in_command662);  
                    stream_57.add(string_literal25);

                    pushFollow(FOLLOW_expression_in_command666);
                    t11=expression();

                    state._fsp--;

                    stream_expression.add(t11.getTree());
                    string_literal26=(Token)match(input,53,FOLLOW_53_in_command668);  
                    stream_53.add(string_literal26);

                    pushFollow(FOLLOW_commands_in_command672);
                    t12=commands();

                    state._fsp--;

                    stream_commands.add(t12.getTree());
                    string_literal27=(Token)match(input,54,FOLLOW_54_in_command674);  
                    stream_54.add(string_literal27);


                    }



                    // AST REWRITE
                    // elements: t10, t11, t12
                    // token labels: 
                    // rule labels: t10, t12, t11, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_t10=new RewriteRuleSubtreeStream(adaptor,"rule t10",t10!=null?t10.tree:null);
                    RewriteRuleSubtreeStream stream_t12=new RewriteRuleSubtreeStream(adaptor,"rule t12",t12!=null?t12.tree:null);
                    RewriteRuleSubtreeStream stream_t11=new RewriteRuleSubtreeStream(adaptor,"rule t11",t11!=null?t11.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 69:70: -> ^( FOREACH $t10 $t11 $t12)
                    {
                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:69:73: ^( FOREACH $t10 $t11 $t12)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);

                        adaptor.addChild(root_1, stream_t10.nextTree());
                        adaptor.addChild(root_1, stream_t11.nextTree());
                        adaptor.addChild(root_1, stream_t12.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:70:3: ( 'pp(' expression ')' -> ^( PP expression ) )
                    {
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:70:3: ( 'pp(' expression ')' -> ^( PP expression ) )
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:70:4: 'pp(' expression ')'
                    {
                    string_literal28=(Token)match(input,58,FOLLOW_58_in_command695);  
                    stream_58.add(string_literal28);

                    pushFollow(FOLLOW_expression_in_command697);
                    expression29=expression();

                    state._fsp--;

                    stream_expression.add(expression29.getTree());
                    char_literal30=(Token)match(input,59,FOLLOW_59_in_command699);  
                    stream_59.add(char_literal30);



                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 70:24: -> ^( PP expression )
                    {
                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:70:27: ^( PP expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PP, "PP"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "command"

    public static class vars_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vars"
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:72:1: vars : t1= variable ( ',' t2= vars )? -> $t1 ( $t2)? ;
    public final WhileParser.vars_return vars() throws RecognitionException {
        WhileParser.vars_return retval = new WhileParser.vars_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal31=null;
        WhileParser.variable_return t1 = null;

        WhileParser.vars_return t2 = null;


        Object char_literal31_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:72:6: (t1= variable ( ',' t2= vars )? -> $t1 ( $t2)? )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:72:8: t1= variable ( ',' t2= vars )?
            {
            pushFollow(FOLLOW_variable_in_vars719);
            t1=variable();

            state._fsp--;

            stream_variable.add(t1.getTree());
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:72:20: ( ',' t2= vars )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==44) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:72:21: ',' t2= vars
                    {
                    char_literal31=(Token)match(input,44,FOLLOW_44_in_vars722);  
                    stream_44.add(char_literal31);

                    pushFollow(FOLLOW_vars_in_vars726);
                    t2=vars();

                    state._fsp--;

                    stream_vars.add(t2.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: t2, t1
            // token labels: 
            // rule labels: t1, t2, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_t1=new RewriteRuleSubtreeStream(adaptor,"rule t1",t1!=null?t1.tree:null);
            RewriteRuleSubtreeStream stream_t2=new RewriteRuleSubtreeStream(adaptor,"rule t2",t2!=null?t2.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 72:36: -> $t1 ( $t2)?
            {
                adaptor.addChild(root_0, stream_t1.nextTree());
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:72:43: ( $t2)?
                if ( stream_t2.hasNext() ) {
                    adaptor.addChild(root_0, stream_t2.nextTree());

                }
                stream_t2.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "vars"

    public static class exprs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprs"
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:73:1: exprs : expression ( ',' exprs )? -> expression ( exprs )? ;
    public final WhileParser.exprs_return exprs() throws RecognitionException {
        WhileParser.exprs_return retval = new WhileParser.exprs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal33=null;
        WhileParser.expression_return expression32 = null;

        WhileParser.exprs_return exprs34 = null;


        Object char_literal33_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:73:7: ( expression ( ',' exprs )? -> expression ( exprs )? )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:73:9: expression ( ',' exprs )?
            {
            pushFollow(FOLLOW_expression_in_exprs745);
            expression32=expression();

            state._fsp--;

            stream_expression.add(expression32.getTree());
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:73:20: ( ',' exprs )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==44) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:73:21: ',' exprs
                    {
                    char_literal33=(Token)match(input,44,FOLLOW_44_in_exprs748);  
                    stream_44.add(char_literal33);

                    pushFollow(FOLLOW_exprs_in_exprs750);
                    exprs34=exprs();

                    state._fsp--;

                    stream_exprs.add(exprs34.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: expression, exprs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 73:33: -> expression ( exprs )?
            {
                adaptor.addChild(root_0, stream_expression.nextTree());
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:73:47: ( exprs )?
                if ( stream_exprs.hasNext() ) {
                    adaptor.addChild(root_0, stream_exprs.nextTree());

                }
                stream_exprs.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprs"

    public static class exprBase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprBase"
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:75:1: exprBase : ( Nil -> ^( NIL ) | variable | Symbol | '(' 'cons' lexpr ')' -> ^( CONS lexpr ) | '(' 'list' t2= lexpr ')' -> ^( LIST $t2) | '(' 'hd' t3= exprBase ')' -> ^( HD $t3) | '(' 'tl' t4= exprBase ')' -> ^( TL $t4) | '(' t5= Symbol ( exprBase )+ ')' -> ^( APPFUNC $t5 ( exprBase )+ ) );
    public final WhileParser.exprBase_return exprBase() throws RecognitionException {
        WhileParser.exprBase_return retval = new WhileParser.exprBase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token t5=null;
        Token Nil35=null;
        Token Symbol37=null;
        Token char_literal38=null;
        Token string_literal39=null;
        Token char_literal41=null;
        Token char_literal42=null;
        Token string_literal43=null;
        Token char_literal44=null;
        Token char_literal45=null;
        Token string_literal46=null;
        Token char_literal47=null;
        Token char_literal48=null;
        Token string_literal49=null;
        Token char_literal50=null;
        Token char_literal51=null;
        Token char_literal53=null;
        WhileParser.lexpr_return t2 = null;

        WhileParser.exprBase_return t3 = null;

        WhileParser.exprBase_return t4 = null;

        WhileParser.variable_return variable36 = null;

        WhileParser.lexpr_return lexpr40 = null;

        WhileParser.exprBase_return exprBase52 = null;


        Object t5_tree=null;
        Object Nil35_tree=null;
        Object Symbol37_tree=null;
        Object char_literal38_tree=null;
        Object string_literal39_tree=null;
        Object char_literal41_tree=null;
        Object char_literal42_tree=null;
        Object string_literal43_tree=null;
        Object char_literal44_tree=null;
        Object char_literal45_tree=null;
        Object string_literal46_tree=null;
        Object char_literal47_tree=null;
        Object char_literal48_tree=null;
        Object string_literal49_tree=null;
        Object char_literal50_tree=null;
        Object char_literal51_tree=null;
        Object char_literal53_tree=null;
        RewriteRuleTokenStream stream_Nil=new RewriteRuleTokenStream(adaptor,"token Nil");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
        RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:75:9: ( Nil -> ^( NIL ) | variable | Symbol | '(' 'cons' lexpr ')' -> ^( CONS lexpr ) | '(' 'list' t2= lexpr ')' -> ^( LIST $t2) | '(' 'hd' t3= exprBase ')' -> ^( HD $t3) | '(' 'tl' t4= exprBase ')' -> ^( TL $t4) | '(' t5= Symbol ( exprBase )+ ')' -> ^( APPFUNC $t5 ( exprBase )+ ) )
            int alt11=8;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:75:11: Nil
                    {
                    Nil35=(Token)match(input,Nil,FOLLOW_Nil_in_exprBase766);  
                    stream_Nil.add(Nil35);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 75:14: -> ^( NIL )
                    {
                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:75:16: ^( NIL )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NIL, "NIL"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:76:3: variable
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_exprBase775);
                    variable36=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable36.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:77:3: Symbol
                    {
                    root_0 = (Object)adaptor.nil();

                    Symbol37=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase780); 
                    Symbol37_tree = (Object)adaptor.create(Symbol37);
                    adaptor.addChild(root_0, Symbol37_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:78:3: '(' 'cons' lexpr ')'
                    {
                    char_literal38=(Token)match(input,60,FOLLOW_60_in_exprBase785);  
                    stream_60.add(char_literal38);

                    string_literal39=(Token)match(input,61,FOLLOW_61_in_exprBase787);  
                    stream_61.add(string_literal39);

                    pushFollow(FOLLOW_lexpr_in_exprBase789);
                    lexpr40=lexpr();

                    state._fsp--;

                    stream_lexpr.add(lexpr40.getTree());
                    char_literal41=(Token)match(input,59,FOLLOW_59_in_exprBase791);  
                    stream_59.add(char_literal41);



                    // AST REWRITE
                    // elements: lexpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 78:23: -> ^( CONS lexpr )
                    {
                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:78:26: ^( CONS lexpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONS, "CONS"), root_1);

                        adaptor.addChild(root_1, stream_lexpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:79:3: '(' 'list' t2= lexpr ')'
                    {
                    char_literal42=(Token)match(input,60,FOLLOW_60_in_exprBase803);  
                    stream_60.add(char_literal42);

                    string_literal43=(Token)match(input,62,FOLLOW_62_in_exprBase805);  
                    stream_62.add(string_literal43);

                    pushFollow(FOLLOW_lexpr_in_exprBase809);
                    t2=lexpr();

                    state._fsp--;

                    stream_lexpr.add(t2.getTree());
                    char_literal44=(Token)match(input,59,FOLLOW_59_in_exprBase811);  
                    stream_59.add(char_literal44);



                    // AST REWRITE
                    // elements: t2
                    // token labels: 
                    // rule labels: t2, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_t2=new RewriteRuleSubtreeStream(adaptor,"rule t2",t2!=null?t2.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 79:26: -> ^( LIST $t2)
                    {
                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:79:29: ^( LIST $t2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

                        adaptor.addChild(root_1, stream_t2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:80:3: '(' 'hd' t3= exprBase ')'
                    {
                    char_literal45=(Token)match(input,60,FOLLOW_60_in_exprBase824);  
                    stream_60.add(char_literal45);

                    string_literal46=(Token)match(input,63,FOLLOW_63_in_exprBase826);  
                    stream_63.add(string_literal46);

                    pushFollow(FOLLOW_exprBase_in_exprBase830);
                    t3=exprBase();

                    state._fsp--;

                    stream_exprBase.add(t3.getTree());
                    char_literal47=(Token)match(input,59,FOLLOW_59_in_exprBase832);  
                    stream_59.add(char_literal47);



                    // AST REWRITE
                    // elements: t3
                    // token labels: 
                    // rule labels: retval, t3
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_t3=new RewriteRuleSubtreeStream(adaptor,"rule t3",t3!=null?t3.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 80:27: -> ^( HD $t3)
                    {
                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:80:30: ^( HD $t3)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HD, "HD"), root_1);

                        adaptor.addChild(root_1, stream_t3.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:81:3: '(' 'tl' t4= exprBase ')'
                    {
                    char_literal48=(Token)match(input,60,FOLLOW_60_in_exprBase845);  
                    stream_60.add(char_literal48);

                    string_literal49=(Token)match(input,64,FOLLOW_64_in_exprBase847);  
                    stream_64.add(string_literal49);

                    pushFollow(FOLLOW_exprBase_in_exprBase851);
                    t4=exprBase();

                    state._fsp--;

                    stream_exprBase.add(t4.getTree());
                    char_literal50=(Token)match(input,59,FOLLOW_59_in_exprBase853);  
                    stream_59.add(char_literal50);



                    // AST REWRITE
                    // elements: t4
                    // token labels: 
                    // rule labels: t4, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_t4=new RewriteRuleSubtreeStream(adaptor,"rule t4",t4!=null?t4.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 81:27: -> ^( TL $t4)
                    {
                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:81:30: ^( TL $t4)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TL, "TL"), root_1);

                        adaptor.addChild(root_1, stream_t4.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:82:3: '(' t5= Symbol ( exprBase )+ ')'
                    {
                    char_literal51=(Token)match(input,60,FOLLOW_60_in_exprBase866);  
                    stream_60.add(char_literal51);

                    t5=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase870);  
                    stream_Symbol.add(t5);

                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:82:17: ( exprBase )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=Symbol && LA10_0<=Variable)||LA10_0==60) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:82:17: exprBase
                    	    {
                    	    pushFollow(FOLLOW_exprBase_in_exprBase872);
                    	    exprBase52=exprBase();

                    	    state._fsp--;

                    	    stream_exprBase.add(exprBase52.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    char_literal53=(Token)match(input,59,FOLLOW_59_in_exprBase875);  
                    stream_59.add(char_literal53);



                    // AST REWRITE
                    // elements: t5, exprBase
                    // token labels: t5
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_t5=new RewriteRuleTokenStream(adaptor,"token t5",t5);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 82:30: -> ^( APPFUNC $t5 ( exprBase )+ )
                    {
                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:82:32: ^( APPFUNC $t5 ( exprBase )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(APPFUNC, "APPFUNC"), root_1);

                        adaptor.addChild(root_1, stream_t5.nextNode());
                        if ( !(stream_exprBase.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_exprBase.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprBase.nextTree());

                        }
                        stream_exprBase.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprBase"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:84:1: expression : exprBase ;
    public final WhileParser.expression_return expression() throws RecognitionException {
        WhileParser.expression_return retval = new WhileParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        WhileParser.exprBase_return exprBase54 = null;



        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:85:2: ( exprBase )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:85:4: exprBase
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exprBase_in_expression897);
            exprBase54=exprBase();

            state._fsp--;

            adaptor.addChild(root_0, exprBase54.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class conditionSimple_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionSimple"
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:87:1: conditionSimple : exprBase ;
    public final WhileParser.conditionSimple_return conditionSimple() throws RecognitionException {
        WhileParser.conditionSimple_return retval = new WhileParser.conditionSimple_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        WhileParser.exprBase_return exprBase55 = null;



        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:88:2: ( exprBase )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:88:4: exprBase
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exprBase_in_conditionSimple906);
            exprBase55=exprBase();

            state._fsp--;

            adaptor.addChild(root_0, exprBase55.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditionSimple"

    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition"
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:89:1: condition : exprBase ( '=?' exprBase )? -> ^( LEFT exprBase ) ( ^( RIGHT exprBase ) )? ;
    public final WhileParser.condition_return condition() throws RecognitionException {
        WhileParser.condition_return retval = new WhileParser.condition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal57=null;
        WhileParser.exprBase_return exprBase56 = null;

        WhileParser.exprBase_return exprBase58 = null;


        Object string_literal57_tree=null;
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:90:2: ( exprBase ( '=?' exprBase )? -> ^( LEFT exprBase ) ( ^( RIGHT exprBase ) )? )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:90:4: exprBase ( '=?' exprBase )?
            {
            pushFollow(FOLLOW_exprBase_in_condition915);
            exprBase56=exprBase();

            state._fsp--;

            stream_exprBase.add(exprBase56.getTree());
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:90:13: ( '=?' exprBase )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==65) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:90:14: '=?' exprBase
                    {
                    string_literal57=(Token)match(input,65,FOLLOW_65_in_condition918);  
                    stream_65.add(string_literal57);

                    pushFollow(FOLLOW_exprBase_in_condition920);
                    exprBase58=exprBase();

                    state._fsp--;

                    stream_exprBase.add(exprBase58.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: exprBase, exprBase
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 90:30: -> ^( LEFT exprBase ) ( ^( RIGHT exprBase ) )?
            {
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:90:33: ^( LEFT exprBase )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LEFT, "LEFT"), root_1);

                adaptor.addChild(root_1, stream_exprBase.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:90:50: ( ^( RIGHT exprBase ) )?
                if ( stream_exprBase.hasNext() ) {
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:90:50: ^( RIGHT exprBase )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RIGHT, "RIGHT"), root_1);

                    adaptor.addChild(root_1, stream_exprBase.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_exprBase.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condition"

    public static class lexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lexpr"
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:92:1: lexpr : ( exprBase )* -> ( exprBase )* ;
    public final WhileParser.lexpr_return lexpr() throws RecognitionException {
        WhileParser.lexpr_return retval = new WhileParser.lexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        WhileParser.exprBase_return exprBase59 = null;


        RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:92:7: ( ( exprBase )* -> ( exprBase )* )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:92:9: ( exprBase )*
            {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:92:9: ( exprBase )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=Symbol && LA13_0<=Variable)||LA13_0==60) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:92:9: exprBase
            	    {
            	    pushFollow(FOLLOW_exprBase_in_lexpr946);
            	    exprBase59=exprBase();

            	    state._fsp--;

            	    stream_exprBase.add(exprBase59.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);



            // AST REWRITE
            // elements: exprBase
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 92:18: -> ( exprBase )*
            {
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:92:20: ( exprBase )*
                while ( stream_exprBase.hasNext() ) {
                    adaptor.addChild(root_0, stream_exprBase.nextTree());

                }
                stream_exprBase.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lexpr"

    public static class variable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:93:1: variable : t1= Variable -> ^( VARS $t1) ;
    public final WhileParser.variable_return variable() throws RecognitionException {
        WhileParser.variable_return retval = new WhileParser.variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token t1=null;

        Object t1_tree=null;
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:93:9: (t1= Variable -> ^( VARS $t1) )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:93:11: t1= Variable
            {
            t1=(Token)match(input,Variable,FOLLOW_Variable_in_variable958);  
            stream_Variable.add(t1);



            // AST REWRITE
            // elements: t1
            // token labels: t1
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_t1=new RewriteRuleTokenStream(adaptor,"token t1",t1);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 93:23: -> ^( VARS $t1)
            {
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:93:26: ^( VARS $t1)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARS, "VARS"), root_1);

                adaptor.addChild(root_1, stream_t1.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\12\uffff";
    static final String DFA11_eofS =
        "\12\uffff";
    static final String DFA11_minS =
        "\1\44\3\uffff\1\44\5\uffff";
    static final String DFA11_maxS =
        "\1\74\3\uffff\1\100\5\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10";
    static final String DFA11_specialS =
        "\12\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\3\1\1\1\2\25\uffff\1\4",
            "",
            "",
            "",
            "\1\11\30\uffff\1\5\1\6\1\7\1\10",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "75:1: exprBase : ( Nil -> ^( NIL ) | variable | Symbol | '(' 'cons' lexpr ')' -> ^( CONS lexpr ) | '(' 'list' t2= lexpr ')' -> ^( LIST $t2) | '(' 'hd' t3= exprBase ')' -> ^( HD $t3) | '(' 'tl' t4= exprBase ')' -> ^( TL $t4) | '(' t5= Symbol ( exprBase )+ ')' -> ^( APPFUNC $t5 ( exprBase )+ ) );";
        }
    }
 

    public static final BitSet FOLLOW_program_in_start276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_program292 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_program_in_program295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_function304 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_Symbol_in_function308 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_function310 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_definition_in_function314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_definition333 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_input_in_definition337 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_definition339 = new BitSet(new long[]{0x0591404000000000L});
    public static final BitSet FOLLOW_commands_in_definition343 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_definition345 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_definition347 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_output_in_definition351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputSub_in_input377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_inputSub396 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_inputSub399 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_inputSub_in_inputSub403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outputSub_in_output423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_outputSub442 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_outputSub445 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_outputSub_in_outputSub449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_in_commands470 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_commands472 = new BitSet(new long[]{0x0591404000000000L});
    public static final BitSet FOLLOW_commands_in_commands476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_command496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vars_in_command504 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_command506 = new BitSet(new long[]{0x1000007000000000L});
    public static final BitSet FOLLOW_exprs_in_command510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_command535 = new BitSet(new long[]{0x1000007000000000L});
    public static final BitSet FOLLOW_condition_in_command539 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_command541 = new BitSet(new long[]{0x0591404000000000L});
    public static final BitSet FOLLOW_commands_in_command545 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_command548 = new BitSet(new long[]{0x0591404000000000L});
    public static final BitSet FOLLOW_commands_in_command552 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_command555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_command590 = new BitSet(new long[]{0x1000007000000000L});
    public static final BitSet FOLLOW_condition_in_command594 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_command596 = new BitSet(new long[]{0x0591404000000000L});
    public static final BitSet FOLLOW_commands_in_command600 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_command602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_command625 = new BitSet(new long[]{0x1000007000000000L});
    public static final BitSet FOLLOW_conditionSimple_in_command629 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_command631 = new BitSet(new long[]{0x0591404000000000L});
    public static final BitSet FOLLOW_commands_in_command635 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_command637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_command656 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_variable_in_command660 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_command662 = new BitSet(new long[]{0x1000007000000000L});
    public static final BitSet FOLLOW_expression_in_command666 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_command668 = new BitSet(new long[]{0x0591404000000000L});
    public static final BitSet FOLLOW_commands_in_command672 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_command674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_command695 = new BitSet(new long[]{0x1000007000000000L});
    public static final BitSet FOLLOW_expression_in_command697 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_command699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_vars719 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_vars722 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_vars_in_vars726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_exprs745 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_exprs748 = new BitSet(new long[]{0x1000007000000000L});
    public static final BitSet FOLLOW_exprs_in_exprs750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Nil_in_exprBase766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_exprBase775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Symbol_in_exprBase780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_exprBase785 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_exprBase787 = new BitSet(new long[]{0x1800007000000000L});
    public static final BitSet FOLLOW_lexpr_in_exprBase789 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_exprBase791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_exprBase803 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_exprBase805 = new BitSet(new long[]{0x1800007000000000L});
    public static final BitSet FOLLOW_lexpr_in_exprBase809 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_exprBase811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_exprBase824 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_exprBase826 = new BitSet(new long[]{0x1000007000000000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase830 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_exprBase832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_exprBase845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_exprBase847 = new BitSet(new long[]{0x1000007000000000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase851 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_exprBase853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_exprBase866 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_Symbol_in_exprBase870 = new BitSet(new long[]{0x1000007000000000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase872 = new BitSet(new long[]{0x1800007000000000L});
    public static final BitSet FOLLOW_59_in_exprBase875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase_in_expression897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase_in_conditionSimple906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase_in_condition915 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_condition918 = new BitSet(new long[]{0x1000007000000000L});
    public static final BitSet FOLLOW_exprBase_in_condition920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase_in_lexpr946 = new BitSet(new long[]{0x1000007000000002L});
    public static final BitSet FOLLOW_Variable_in_variable958 = new BitSet(new long[]{0x0000000000000002L});

}