// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g 2022-12-16 17:23:52

package TLC.CompilerWhile.AntLRFiles;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class WhileParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FONCTION", "DEFINITION", "INPUTSUB", "INPUT", "OUTPUT", "COMMANDS", "COMMAND", "VARS", "IF", "FOR", "WHILE", "FOREACH", "AFF", "ELSE", "CONS", "LIST", "HD", "TL", "SYM", "COMP", "EXPCOND", "START", "APPFUNC", "WS", "COMMENT", "Symbol", "Variable", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'if'", "'then'", "'else'", "'fi'", "'while'", "'do'", "'od'", "'for'", "'foreach'", "'in'", "'nil'", "'('", "'cons'", "')'", "'list'", "'hd'", "'tl'", "'=?'"
    };
    public static final int EOF=-1;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
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
    public static final int WS=27;
    public static final int COMMENT=28;
    public static final int Symbol=29;
    public static final int Variable=30;

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
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:44:1: start : t1= program -> ^( START $t1) ;
    public final WhileParser.start_return start() throws RecognitionException {
        WhileParser.start_return retval = new WhileParser.start_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        WhileParser.program_return t1 = null;


        RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:44:7: (t1= program -> ^( START $t1) )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:44:9: t1= program
            {
            pushFollow(FOLLOW_program_in_start248);
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
            // 44:20: -> ^( START $t1)
            {
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:44:23: ^( START $t1)
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
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:45:1: program : function ( program )? ;
    public final WhileParser.program_return program() throws RecognitionException {
        WhileParser.program_return retval = new WhileParser.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        WhileParser.function_return function1 = null;

        WhileParser.program_return program2 = null;



        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:45:9: ( function ( program )? )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:45:11: function ( program )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_function_in_program264);
            function1=function();

            state._fsp--;

            adaptor.addChild(root_0, function1.getTree());
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:45:20: ( program )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==31) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:45:21: program
                    {
                    pushFollow(FOLLOW_program_in_program267);
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
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:46:1: function : 'function' t1= Symbol ':' t2= definition -> ^( FONCTION $t1 $t2) ;
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
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:46:9: ( 'function' t1= Symbol ':' t2= definition -> ^( FONCTION $t1 $t2) )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:46:12: 'function' t1= Symbol ':' t2= definition
            {
            string_literal3=(Token)match(input,31,FOLLOW_31_in_function276);  
            stream_31.add(string_literal3);

            t1=(Token)match(input,Symbol,FOLLOW_Symbol_in_function280);  
            stream_Symbol.add(t1);

            char_literal4=(Token)match(input,32,FOLLOW_32_in_function282);  
            stream_32.add(char_literal4);

            pushFollow(FOLLOW_definition_in_function286);
            t2=definition();

            state._fsp--;

            stream_definition.add(t2.getTree());


            // AST REWRITE
            // elements: t1, t2
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
            // 46:51: -> ^( FONCTION $t1 $t2)
            {
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:46:54: ^( FONCTION $t1 $t2)
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
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:47:1: definition : 'read' t1= input '%' t2= commands '%' 'write' t3= output -> ^( DEFINITION ( $t1)? $t2 $t3) ;
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
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
        RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:47:11: ( 'read' t1= input '%' t2= commands '%' 'write' t3= output -> ^( DEFINITION ( $t1)? $t2 $t3) )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:47:14: 'read' t1= input '%' t2= commands '%' 'write' t3= output
            {
            string_literal5=(Token)match(input,33,FOLLOW_33_in_definition305);  
            stream_33.add(string_literal5);

            pushFollow(FOLLOW_input_in_definition309);
            t1=input();

            state._fsp--;

            stream_input.add(t1.getTree());
            char_literal6=(Token)match(input,34,FOLLOW_34_in_definition311);  
            stream_34.add(char_literal6);

            pushFollow(FOLLOW_commands_in_definition315);
            t2=commands();

            state._fsp--;

            stream_commands.add(t2.getTree());
            char_literal7=(Token)match(input,34,FOLLOW_34_in_definition317);  
            stream_34.add(char_literal7);

            string_literal8=(Token)match(input,35,FOLLOW_35_in_definition319);  
            stream_35.add(string_literal8);

            pushFollow(FOLLOW_output_in_definition323);
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
            // 47:68: -> ^( DEFINITION ( $t1)? $t2 $t3)
            {
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:47:71: ^( DEFINITION ( $t1)? $t2 $t3)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFINITION, "DEFINITION"), root_1);

                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:47:84: ( $t1)?
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
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:49:1: input : (t1= inputSub )? -> ^( INPUT ( $t1)? ) ;
    public final WhileParser.input_return input() throws RecognitionException {
        WhileParser.input_return retval = new WhileParser.input_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        WhileParser.inputSub_return t1 = null;


        RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:49:7: ( (t1= inputSub )? -> ^( INPUT ( $t1)? ) )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:49:9: (t1= inputSub )?
            {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:49:11: (t1= inputSub )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Variable) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:49:11: t1= inputSub
                    {
                    pushFollow(FOLLOW_inputSub_in_input349);
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
            // 49:22: -> ^( INPUT ( $t1)? )
            {
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:49:25: ^( INPUT ( $t1)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_1);

                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:49:33: ( $t1)?
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
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:50:1: inputSub : t1= variable ( ',' t2= inputSub )? -> $t1 ( $t2)? ;
    public final WhileParser.inputSub_return inputSub() throws RecognitionException {
        WhileParser.inputSub_return retval = new WhileParser.inputSub_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal9=null;
        WhileParser.variable_return t1 = null;

        WhileParser.inputSub_return t2 = null;


        Object char_literal9_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:50:9: (t1= variable ( ',' t2= inputSub )? -> $t1 ( $t2)? )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:50:11: t1= variable ( ',' t2= inputSub )?
            {
            pushFollow(FOLLOW_variable_in_inputSub368);
            t1=variable();

            state._fsp--;

            stream_variable.add(t1.getTree());
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:50:23: ( ',' t2= inputSub )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==36) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:50:24: ',' t2= inputSub
                    {
                    char_literal9=(Token)match(input,36,FOLLOW_36_in_inputSub371);  
                    stream_36.add(char_literal9);

                    pushFollow(FOLLOW_inputSub_in_inputSub375);
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
            // 50:42: -> $t1 ( $t2)?
            {
                adaptor.addChild(root_0, stream_t1.nextTree());
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:50:49: ( $t2)?
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
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:51:1: output : (t1= outputSub )? -> ^( OUTPUT ( $t1)? ) ;
    public final WhileParser.output_return output() throws RecognitionException {
        WhileParser.output_return retval = new WhileParser.output_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        WhileParser.outputSub_return t1 = null;


        RewriteRuleSubtreeStream stream_outputSub=new RewriteRuleSubtreeStream(adaptor,"rule outputSub");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:51:8: ( (t1= outputSub )? -> ^( OUTPUT ( $t1)? ) )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:51:10: (t1= outputSub )?
            {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:51:12: (t1= outputSub )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Variable) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:51:12: t1= outputSub
                    {
                    pushFollow(FOLLOW_outputSub_in_output395);
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
            // 51:24: -> ^( OUTPUT ( $t1)? )
            {
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:51:27: ^( OUTPUT ( $t1)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_1);

                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:51:36: ( $t1)?
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
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:52:1: outputSub : t1= variable ( ',' t2= outputSub )? -> $t1 ( $t2)? ;
    public final WhileParser.outputSub_return outputSub() throws RecognitionException {
        WhileParser.outputSub_return retval = new WhileParser.outputSub_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal10=null;
        WhileParser.variable_return t1 = null;

        WhileParser.outputSub_return t2 = null;


        Object char_literal10_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_outputSub=new RewriteRuleSubtreeStream(adaptor,"rule outputSub");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:52:10: (t1= variable ( ',' t2= outputSub )? -> $t1 ( $t2)? )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:52:12: t1= variable ( ',' t2= outputSub )?
            {
            pushFollow(FOLLOW_variable_in_outputSub414);
            t1=variable();

            state._fsp--;

            stream_variable.add(t1.getTree());
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:52:24: ( ',' t2= outputSub )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==36) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:52:25: ',' t2= outputSub
                    {
                    char_literal10=(Token)match(input,36,FOLLOW_36_in_outputSub417);  
                    stream_36.add(char_literal10);

                    pushFollow(FOLLOW_outputSub_in_outputSub421);
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
            // 52:44: -> $t1 ( $t2)?
            {
                adaptor.addChild(root_0, stream_t1.nextTree());
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:52:51: ( $t2)?
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
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:55:1: commands : t1= command ( ';' t2= commands )? -> $t1 ( $t2)? ;
    public final WhileParser.commands_return commands() throws RecognitionException {
        WhileParser.commands_return retval = new WhileParser.commands_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal11=null;
        WhileParser.command_return t1 = null;

        WhileParser.commands_return t2 = null;


        Object char_literal11_tree=null;
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:55:9: (t1= command ( ';' t2= commands )? -> $t1 ( $t2)? )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:55:11: t1= command ( ';' t2= commands )?
            {
            pushFollow(FOLLOW_command_in_commands442);
            t1=command();

            state._fsp--;

            stream_command.add(t1.getTree());
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:55:21: ( ';' t2= commands )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==37) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:55:22: ';' t2= commands
                    {
                    char_literal11=(Token)match(input,37,FOLLOW_37_in_commands444);  
                    stream_37.add(char_literal11);

                    pushFollow(FOLLOW_commands_in_commands448);
                    t2=commands();

                    state._fsp--;

                    stream_commands.add(t2.getTree());

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
            // 55:41: -> $t1 ( $t2)?
            {
                adaptor.addChild(root_0, stream_t1.nextTree());
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:55:48: ( $t2)?
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
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:57:1: command : ( 'nop' | (t1= vars ':=' t2= exprs ) -> ^( AFF $t1 $t2) | ( 'if' t3= expression 'then' t4= commands ( 'else' t5= commands ) 'fi' ) -> ^( IF ^( EXPCOND $t3) $t4 ( ^( ELSE $t5) )? ) | ( 'while' t6= expression 'do' t7= commands 'od' ) -> ^( WHILE ^( EXPCOND $t6) $t7) | ( 'for' t8= expression 'do' t9= commands 'od' ) -> ^( FOR $t8 $t9) | ( 'foreach' t10= variable 'in' t11= expression 'do' t12= commands 'od' ) -> ^( FOREACH $t10 $t11 $t12) );
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
        WhileParser.vars_return t1 = null;

        WhileParser.exprs_return t2 = null;

        WhileParser.expression_return t3 = null;

        WhileParser.commands_return t4 = null;

        WhileParser.commands_return t5 = null;

        WhileParser.expression_return t6 = null;

        WhileParser.commands_return t7 = null;

        WhileParser.expression_return t8 = null;

        WhileParser.commands_return t9 = null;

        WhileParser.variable_return t10 = null;

        WhileParser.expression_return t11 = null;

        WhileParser.commands_return t12 = null;


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
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
        RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:57:9: ( 'nop' | (t1= vars ':=' t2= exprs ) -> ^( AFF $t1 $t2) | ( 'if' t3= expression 'then' t4= commands ( 'else' t5= commands ) 'fi' ) -> ^( IF ^( EXPCOND $t3) $t4 ( ^( ELSE $t5) )? ) | ( 'while' t6= expression 'do' t7= commands 'od' ) -> ^( WHILE ^( EXPCOND $t6) $t7) | ( 'for' t8= expression 'do' t9= commands 'od' ) -> ^( FOR $t8 $t9) | ( 'foreach' t10= variable 'in' t11= expression 'do' t12= commands 'od' ) -> ^( FOREACH $t10 $t11 $t12) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt7=1;
                }
                break;
            case Variable:
                {
                alt7=2;
                }
                break;
            case 40:
                {
                alt7=3;
                }
                break;
            case 44:
                {
                alt7=4;
                }
                break;
            case 47:
                {
                alt7=5;
                }
                break;
            case 48:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:57:11: 'nop'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal12=(Token)match(input,38,FOLLOW_38_in_command468); 
                    string_literal12_tree = (Object)adaptor.create(string_literal12);
                    adaptor.addChild(root_0, string_literal12_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:58:3: (t1= vars ':=' t2= exprs )
                    {
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:58:3: (t1= vars ':=' t2= exprs )
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:58:4: t1= vars ':=' t2= exprs
                    {
                    pushFollow(FOLLOW_vars_in_command476);
                    t1=vars();

                    state._fsp--;

                    stream_vars.add(t1.getTree());
                    string_literal13=(Token)match(input,39,FOLLOW_39_in_command478);  
                    stream_39.add(string_literal13);

                    pushFollow(FOLLOW_exprs_in_command482);
                    t2=exprs();

                    state._fsp--;

                    stream_exprs.add(t2.getTree());

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
                    // 58:26: -> ^( AFF $t1 $t2)
                    {
                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:58:28: ^( AFF $t1 $t2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFF, "AFF"), root_1);

                        adaptor.addChild(root_1, stream_t1.nextTree());
                        adaptor.addChild(root_1, stream_t2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:59:3: ( 'if' t3= expression 'then' t4= commands ( 'else' t5= commands ) 'fi' )
                    {
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:59:3: ( 'if' t3= expression 'then' t4= commands ( 'else' t5= commands ) 'fi' )
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:59:4: 'if' t3= expression 'then' t4= commands ( 'else' t5= commands ) 'fi'
                    {
                    string_literal14=(Token)match(input,40,FOLLOW_40_in_command499);  
                    stream_40.add(string_literal14);

                    pushFollow(FOLLOW_expression_in_command503);
                    t3=expression();

                    state._fsp--;

                    stream_expression.add(t3.getTree());
                    string_literal15=(Token)match(input,41,FOLLOW_41_in_command505);  
                    stream_41.add(string_literal15);

                    pushFollow(FOLLOW_commands_in_command509);
                    t4=commands();

                    state._fsp--;

                    stream_commands.add(t4.getTree());
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:59:42: ( 'else' t5= commands )
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:59:43: 'else' t5= commands
                    {
                    string_literal16=(Token)match(input,42,FOLLOW_42_in_command512);  
                    stream_42.add(string_literal16);

                    pushFollow(FOLLOW_commands_in_command516);
                    t5=commands();

                    state._fsp--;

                    stream_commands.add(t5.getTree());

                    }

                    string_literal17=(Token)match(input,43,FOLLOW_43_in_command519);  
                    stream_43.add(string_literal17);


                    }



                    // AST REWRITE
                    // elements: t5, t3, t4
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
                    // 59:68: -> ^( IF ^( EXPCOND $t3) $t4 ( ^( ELSE $t5) )? )
                    {
                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:59:70: ^( IF ^( EXPCOND $t3) $t4 ( ^( ELSE $t5) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:59:76: ^( EXPCOND $t3)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPCOND, "EXPCOND"), root_2);

                        adaptor.addChild(root_2, stream_t3.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_t4.nextTree());
                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:59:95: ( ^( ELSE $t5) )?
                        if ( stream_t5.hasNext() ) {
                            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:59:95: ^( ELSE $t5)
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
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:60:3: ( 'while' t6= expression 'do' t7= commands 'od' )
                    {
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:60:3: ( 'while' t6= expression 'do' t7= commands 'od' )
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:60:4: 'while' t6= expression 'do' t7= commands 'od'
                    {
                    string_literal18=(Token)match(input,44,FOLLOW_44_in_command550);  
                    stream_44.add(string_literal18);

                    pushFollow(FOLLOW_expression_in_command554);
                    t6=expression();

                    state._fsp--;

                    stream_expression.add(t6.getTree());
                    string_literal19=(Token)match(input,45,FOLLOW_45_in_command556);  
                    stream_45.add(string_literal19);

                    pushFollow(FOLLOW_commands_in_command560);
                    t7=commands();

                    state._fsp--;

                    stream_commands.add(t7.getTree());
                    string_literal20=(Token)match(input,46,FOLLOW_46_in_command562);  
                    stream_46.add(string_literal20);


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
                    // 60:49: -> ^( WHILE ^( EXPCOND $t6) $t7)
                    {
                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:60:52: ^( WHILE ^( EXPCOND $t6) $t7)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);

                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:60:60: ^( EXPCOND $t6)
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
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:61:3: ( 'for' t8= expression 'do' t9= commands 'od' )
                    {
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:61:3: ( 'for' t8= expression 'do' t9= commands 'od' )
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:61:4: 'for' t8= expression 'do' t9= commands 'od'
                    {
                    string_literal21=(Token)match(input,47,FOLLOW_47_in_command585);  
                    stream_47.add(string_literal21);

                    pushFollow(FOLLOW_expression_in_command589);
                    t8=expression();

                    state._fsp--;

                    stream_expression.add(t8.getTree());
                    string_literal22=(Token)match(input,45,FOLLOW_45_in_command591);  
                    stream_45.add(string_literal22);

                    pushFollow(FOLLOW_commands_in_command595);
                    t9=commands();

                    state._fsp--;

                    stream_commands.add(t9.getTree());
                    string_literal23=(Token)match(input,46,FOLLOW_46_in_command597);  
                    stream_46.add(string_literal23);


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
                    // 61:47: -> ^( FOR $t8 $t9)
                    {
                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:61:50: ^( FOR $t8 $t9)
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
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:62:3: ( 'foreach' t10= variable 'in' t11= expression 'do' t12= commands 'od' )
                    {
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:62:3: ( 'foreach' t10= variable 'in' t11= expression 'do' t12= commands 'od' )
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:62:4: 'foreach' t10= variable 'in' t11= expression 'do' t12= commands 'od'
                    {
                    string_literal24=(Token)match(input,48,FOLLOW_48_in_command616);  
                    stream_48.add(string_literal24);

                    pushFollow(FOLLOW_variable_in_command620);
                    t10=variable();

                    state._fsp--;

                    stream_variable.add(t10.getTree());
                    string_literal25=(Token)match(input,49,FOLLOW_49_in_command622);  
                    stream_49.add(string_literal25);

                    pushFollow(FOLLOW_expression_in_command626);
                    t11=expression();

                    state._fsp--;

                    stream_expression.add(t11.getTree());
                    string_literal26=(Token)match(input,45,FOLLOW_45_in_command628);  
                    stream_45.add(string_literal26);

                    pushFollow(FOLLOW_commands_in_command632);
                    t12=commands();

                    state._fsp--;

                    stream_commands.add(t12.getTree());
                    string_literal27=(Token)match(input,46,FOLLOW_46_in_command634);  
                    stream_46.add(string_literal27);


                    }



                    // AST REWRITE
                    // elements: t11, t12, t10
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
                    // 62:70: -> ^( FOREACH $t10 $t11 $t12)
                    {
                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:62:73: ^( FOREACH $t10 $t11 $t12)
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
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:64:1: vars : t1= variable ( ',' t2= vars )? -> $t1 ( $t2)? ;
    public final WhileParser.vars_return vars() throws RecognitionException {
        WhileParser.vars_return retval = new WhileParser.vars_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal28=null;
        WhileParser.variable_return t1 = null;

        WhileParser.vars_return t2 = null;


        Object char_literal28_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:64:6: (t1= variable ( ',' t2= vars )? -> $t1 ( $t2)? )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:64:8: t1= variable ( ',' t2= vars )?
            {
            pushFollow(FOLLOW_variable_in_vars661);
            t1=variable();

            state._fsp--;

            stream_variable.add(t1.getTree());
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:64:20: ( ',' t2= vars )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==36) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:64:21: ',' t2= vars
                    {
                    char_literal28=(Token)match(input,36,FOLLOW_36_in_vars664);  
                    stream_36.add(char_literal28);

                    pushFollow(FOLLOW_vars_in_vars668);
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
            // 64:36: -> $t1 ( $t2)?
            {
                adaptor.addChild(root_0, stream_t1.nextTree());
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:64:43: ( $t2)?
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
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:65:1: exprs : expression ( ',' exprs )? ;
    public final WhileParser.exprs_return exprs() throws RecognitionException {
        WhileParser.exprs_return retval = new WhileParser.exprs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal30=null;
        WhileParser.expression_return expression29 = null;

        WhileParser.exprs_return exprs31 = null;


        Object char_literal30_tree=null;

        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:65:7: ( expression ( ',' exprs )? )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:65:9: expression ( ',' exprs )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_exprs687);
            expression29=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression29.getTree());
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:65:20: ( ',' exprs )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==36) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:65:21: ',' exprs
                    {
                    char_literal30=(Token)match(input,36,FOLLOW_36_in_exprs690); 
                    char_literal30_tree = (Object)adaptor.create(char_literal30);
                    adaptor.addChild(root_0, char_literal30_tree);

                    pushFollow(FOLLOW_exprs_in_exprs692);
                    exprs31=exprs();

                    state._fsp--;

                    adaptor.addChild(root_0, exprs31.getTree());

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
    // $ANTLR end "exprs"

    public static class exprBase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprBase"
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:67:1: exprBase : ( 'nil' | variable | Symbol | '(' 'cons' t1= lexpr ')' -> CONS $t1 | '(' 'list' t2= lexpr ')' -> LIST $t2 | '(' 'hd' t3= exprBase ')' -> HD $t3 | '(' 'tl' t4= exprBase ')' -> TL $t4 | '(' t5= Symbol t6= lexpr ')' -> ^( APPFUNC $t5 ( $t6)? ) );
    public final WhileParser.exprBase_return exprBase() throws RecognitionException {
        WhileParser.exprBase_return retval = new WhileParser.exprBase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token t5=null;
        Token string_literal32=null;
        Token Symbol34=null;
        Token char_literal35=null;
        Token string_literal36=null;
        Token char_literal37=null;
        Token char_literal38=null;
        Token string_literal39=null;
        Token char_literal40=null;
        Token char_literal41=null;
        Token string_literal42=null;
        Token char_literal43=null;
        Token char_literal44=null;
        Token string_literal45=null;
        Token char_literal46=null;
        Token char_literal47=null;
        Token char_literal48=null;
        WhileParser.lexpr_return t1 = null;

        WhileParser.lexpr_return t2 = null;

        WhileParser.exprBase_return t3 = null;

        WhileParser.exprBase_return t4 = null;

        WhileParser.lexpr_return t6 = null;

        WhileParser.variable_return variable33 = null;


        Object t5_tree=null;
        Object string_literal32_tree=null;
        Object Symbol34_tree=null;
        Object char_literal35_tree=null;
        Object string_literal36_tree=null;
        Object char_literal37_tree=null;
        Object char_literal38_tree=null;
        Object string_literal39_tree=null;
        Object char_literal40_tree=null;
        Object char_literal41_tree=null;
        Object string_literal42_tree=null;
        Object char_literal43_tree=null;
        Object char_literal44_tree=null;
        Object string_literal45_tree=null;
        Object char_literal46_tree=null;
        Object char_literal47_tree=null;
        Object char_literal48_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
        RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:67:9: ( 'nil' | variable | Symbol | '(' 'cons' t1= lexpr ')' -> CONS $t1 | '(' 'list' t2= lexpr ')' -> LIST $t2 | '(' 'hd' t3= exprBase ')' -> HD $t3 | '(' 'tl' t4= exprBase ')' -> TL $t4 | '(' t5= Symbol t6= lexpr ')' -> ^( APPFUNC $t5 ( $t6)? ) )
            int alt10=8;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:67:11: 'nil'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal32=(Token)match(input,50,FOLLOW_50_in_exprBase701); 
                    string_literal32_tree = (Object)adaptor.create(string_literal32);
                    adaptor.addChild(root_0, string_literal32_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:68:3: variable
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_exprBase707);
                    variable33=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable33.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:69:3: Symbol
                    {
                    root_0 = (Object)adaptor.nil();

                    Symbol34=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase712); 
                    Symbol34_tree = (Object)adaptor.create(Symbol34);
                    adaptor.addChild(root_0, Symbol34_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:70:3: '(' 'cons' t1= lexpr ')'
                    {
                    char_literal35=(Token)match(input,51,FOLLOW_51_in_exprBase717);  
                    stream_51.add(char_literal35);

                    string_literal36=(Token)match(input,52,FOLLOW_52_in_exprBase719);  
                    stream_52.add(string_literal36);

                    pushFollow(FOLLOW_lexpr_in_exprBase723);
                    t1=lexpr();

                    state._fsp--;

                    stream_lexpr.add(t1.getTree());
                    char_literal37=(Token)match(input,53,FOLLOW_53_in_exprBase725);  
                    stream_53.add(char_literal37);



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
                    // 70:26: -> CONS $t1
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(CONS, "CONS"));
                        adaptor.addChild(root_0, stream_t1.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:71:3: '(' 'list' t2= lexpr ')'
                    {
                    char_literal38=(Token)match(input,51,FOLLOW_51_in_exprBase736);  
                    stream_51.add(char_literal38);

                    string_literal39=(Token)match(input,54,FOLLOW_54_in_exprBase738);  
                    stream_54.add(string_literal39);

                    pushFollow(FOLLOW_lexpr_in_exprBase742);
                    t2=lexpr();

                    state._fsp--;

                    stream_lexpr.add(t2.getTree());
                    char_literal40=(Token)match(input,53,FOLLOW_53_in_exprBase744);  
                    stream_53.add(char_literal40);



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
                    // 71:26: -> LIST $t2
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(LIST, "LIST"));
                        adaptor.addChild(root_0, stream_t2.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:72:3: '(' 'hd' t3= exprBase ')'
                    {
                    char_literal41=(Token)match(input,51,FOLLOW_51_in_exprBase755);  
                    stream_51.add(char_literal41);

                    string_literal42=(Token)match(input,55,FOLLOW_55_in_exprBase757);  
                    stream_55.add(string_literal42);

                    pushFollow(FOLLOW_exprBase_in_exprBase761);
                    t3=exprBase();

                    state._fsp--;

                    stream_exprBase.add(t3.getTree());
                    char_literal43=(Token)match(input,53,FOLLOW_53_in_exprBase763);  
                    stream_53.add(char_literal43);



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
                    // 72:27: -> HD $t3
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(HD, "HD"));
                        adaptor.addChild(root_0, stream_t3.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:73:3: '(' 'tl' t4= exprBase ')'
                    {
                    char_literal44=(Token)match(input,51,FOLLOW_51_in_exprBase774);  
                    stream_51.add(char_literal44);

                    string_literal45=(Token)match(input,56,FOLLOW_56_in_exprBase776);  
                    stream_56.add(string_literal45);

                    pushFollow(FOLLOW_exprBase_in_exprBase780);
                    t4=exprBase();

                    state._fsp--;

                    stream_exprBase.add(t4.getTree());
                    char_literal46=(Token)match(input,53,FOLLOW_53_in_exprBase782);  
                    stream_53.add(char_literal46);



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
                    // 73:27: -> TL $t4
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TL, "TL"));
                        adaptor.addChild(root_0, stream_t4.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:74:3: '(' t5= Symbol t6= lexpr ')'
                    {
                    char_literal47=(Token)match(input,51,FOLLOW_51_in_exprBase793);  
                    stream_51.add(char_literal47);

                    t5=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase797);  
                    stream_Symbol.add(t5);

                    pushFollow(FOLLOW_lexpr_in_exprBase801);
                    t6=lexpr();

                    state._fsp--;

                    stream_lexpr.add(t6.getTree());
                    char_literal48=(Token)match(input,53,FOLLOW_53_in_exprBase803);  
                    stream_53.add(char_literal48);



                    // AST REWRITE
                    // elements: t6, t5
                    // token labels: t5
                    // rule labels: t6, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_t5=new RewriteRuleTokenStream(adaptor,"token t5",t5);
                    RewriteRuleSubtreeStream stream_t6=new RewriteRuleSubtreeStream(adaptor,"rule t6",t6!=null?t6.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 74:29: -> ^( APPFUNC $t5 ( $t6)? )
                    {
                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:74:31: ^( APPFUNC $t5 ( $t6)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(APPFUNC, "APPFUNC"), root_1);

                        adaptor.addChild(root_1, stream_t5.nextNode());
                        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:74:45: ( $t6)?
                        if ( stream_t6.hasNext() ) {
                            adaptor.addChild(root_1, stream_t6.nextTree());

                        }
                        stream_t6.reset();

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
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:76:1: expression : t1= exprBase ( '=?' t2= exprBase )? -> $t1 ( $t2)? ;
    public final WhileParser.expression_return expression() throws RecognitionException {
        WhileParser.expression_return retval = new WhileParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal49=null;
        WhileParser.exprBase_return t1 = null;

        WhileParser.exprBase_return t2 = null;


        Object string_literal49_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:77:2: (t1= exprBase ( '=?' t2= exprBase )? -> $t1 ( $t2)? )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:77:4: t1= exprBase ( '=?' t2= exprBase )?
            {
            pushFollow(FOLLOW_exprBase_in_expression827);
            t1=exprBase();

            state._fsp--;

            stream_exprBase.add(t1.getTree());
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:77:15: ( '=?' t2= exprBase )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==57) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:77:16: '=?' t2= exprBase
                    {
                    string_literal49=(Token)match(input,57,FOLLOW_57_in_expression829);  
                    stream_57.add(string_literal49);

                    pushFollow(FOLLOW_exprBase_in_expression833);
                    t2=exprBase();

                    state._fsp--;

                    stream_exprBase.add(t2.getTree());

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
            // 77:35: -> $t1 ( $t2)?
            {
                adaptor.addChild(root_0, stream_t1.nextTree());
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:77:42: ( $t2)?
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
    // $ANTLR end "expression"

    public static class lexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lexpr"
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:79:1: lexpr : (t1= exprBase )* -> ( $t1)* ;
    public final WhileParser.lexpr_return lexpr() throws RecognitionException {
        WhileParser.lexpr_return retval = new WhileParser.lexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        WhileParser.exprBase_return t1 = null;


        RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:79:7: ( (t1= exprBase )* -> ( $t1)* )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:79:9: (t1= exprBase )*
            {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:79:11: (t1= exprBase )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=Symbol && LA12_0<=Variable)||(LA12_0>=50 && LA12_0<=51)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:79:11: t1= exprBase
            	    {
            	    pushFollow(FOLLOW_exprBase_in_lexpr855);
            	    t1=exprBase();

            	    state._fsp--;

            	    stream_exprBase.add(t1.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);



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
            // 79:21: -> ( $t1)*
            {
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:79:23: ( $t1)*
                while ( stream_t1.hasNext() ) {
                    adaptor.addChild(root_0, stream_t1.nextTree());

                }
                stream_t1.reset();

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
    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:80:1: variable : t1= Variable -> ^( VARS $t1) ;
    public final WhileParser.variable_return variable() throws RecognitionException {
        WhileParser.variable_return retval = new WhileParser.variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token t1=null;

        Object t1_tree=null;
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

        try {
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:80:9: (t1= Variable -> ^( VARS $t1) )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:80:11: t1= Variable
            {
            t1=(Token)match(input,Variable,FOLLOW_Variable_in_variable868);  
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
            // 80:23: -> ^( VARS $t1)
            {
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:80:26: ^( VARS $t1)
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


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\12\uffff";
    static final String DFA10_eofS =
        "\12\uffff";
    static final String DFA10_minS =
        "\1\35\3\uffff\1\35\5\uffff";
    static final String DFA10_maxS =
        "\1\63\3\uffff\1\70\5\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10";
    static final String DFA10_specialS =
        "\12\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\3\1\2\23\uffff\1\1\1\4",
            "",
            "",
            "",
            "\1\11\26\uffff\1\5\1\uffff\1\6\1\7\1\10",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "67:1: exprBase : ( 'nil' | variable | Symbol | '(' 'cons' t1= lexpr ')' -> CONS $t1 | '(' 'list' t2= lexpr ')' -> LIST $t2 | '(' 'hd' t3= exprBase ')' -> HD $t3 | '(' 'tl' t4= exprBase ')' -> TL $t4 | '(' t5= Symbol t6= lexpr ')' -> ^( APPFUNC $t5 ( $t6)? ) );";
        }
    }
 

    public static final BitSet FOLLOW_program_in_start248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_program264 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_program_in_program267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_function276 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_Symbol_in_function280 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_function282 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_definition_in_function286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_definition305 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_input_in_definition309 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_definition311 = new BitSet(new long[]{0x0001914040000000L});
    public static final BitSet FOLLOW_commands_in_definition315 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_definition317 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_definition319 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_output_in_definition323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputSub_in_input349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_inputSub368 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_inputSub371 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_inputSub_in_inputSub375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outputSub_in_output395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_outputSub414 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_outputSub417 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_outputSub_in_outputSub421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_in_commands442 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_commands444 = new BitSet(new long[]{0x0001914040000000L});
    public static final BitSet FOLLOW_commands_in_commands448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_command468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vars_in_command476 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_command478 = new BitSet(new long[]{0x000C000060000000L});
    public static final BitSet FOLLOW_exprs_in_command482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_command499 = new BitSet(new long[]{0x000C000060000000L});
    public static final BitSet FOLLOW_expression_in_command503 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_command505 = new BitSet(new long[]{0x0001914040000000L});
    public static final BitSet FOLLOW_commands_in_command509 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_command512 = new BitSet(new long[]{0x0001914040000000L});
    public static final BitSet FOLLOW_commands_in_command516 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_command519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_command550 = new BitSet(new long[]{0x000C000060000000L});
    public static final BitSet FOLLOW_expression_in_command554 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_command556 = new BitSet(new long[]{0x0001914040000000L});
    public static final BitSet FOLLOW_commands_in_command560 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_command562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_command585 = new BitSet(new long[]{0x000C000060000000L});
    public static final BitSet FOLLOW_expression_in_command589 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_command591 = new BitSet(new long[]{0x0001914040000000L});
    public static final BitSet FOLLOW_commands_in_command595 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_command597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_command616 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_variable_in_command620 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_command622 = new BitSet(new long[]{0x000C000060000000L});
    public static final BitSet FOLLOW_expression_in_command626 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_command628 = new BitSet(new long[]{0x0001914040000000L});
    public static final BitSet FOLLOW_commands_in_command632 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_command634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_vars661 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_vars664 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_vars_in_vars668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_exprs687 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_exprs690 = new BitSet(new long[]{0x000C000060000000L});
    public static final BitSet FOLLOW_exprs_in_exprs692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_exprBase701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_exprBase707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Symbol_in_exprBase712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_exprBase717 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_exprBase719 = new BitSet(new long[]{0x002C000060000000L});
    public static final BitSet FOLLOW_lexpr_in_exprBase723 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_exprBase725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_exprBase736 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_exprBase738 = new BitSet(new long[]{0x002C000060000000L});
    public static final BitSet FOLLOW_lexpr_in_exprBase742 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_exprBase744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_exprBase755 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_exprBase757 = new BitSet(new long[]{0x000C000060000000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase761 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_exprBase763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_exprBase774 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_exprBase776 = new BitSet(new long[]{0x000C000060000000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase780 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_exprBase782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_exprBase793 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_Symbol_in_exprBase797 = new BitSet(new long[]{0x002C000060000000L});
    public static final BitSet FOLLOW_lexpr_in_exprBase801 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_exprBase803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase_in_expression827 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_expression829 = new BitSet(new long[]{0x000C000060000000L});
    public static final BitSet FOLLOW_exprBase_in_expression833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase_in_lexpr855 = new BitSet(new long[]{0x000C000060000002L});
    public static final BitSet FOLLOW_Variable_in_variable868 = new BitSet(new long[]{0x0000000000000002L});

}