package TLC.CompilerWhile.AntLRFiles;// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g 2023-01-21 18:36:31

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class WhileLexer extends Lexer {
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

    public WhileLexer() {;} 
    public WhileLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public WhileLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g"; }

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:3:7: ( 'function' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:3:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:4:7: ( ':' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:4:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:5:7: ( 'read' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:5:9: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:6:7: ( '%' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:6:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:7:7: ( 'write' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:7:9: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:8:7: ( ',' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:8:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:9:7: ( ';' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:9:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:10:7: ( 'nop' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:10:9: 'nop'
            {
            match("nop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:11:7: ( ':=' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:11:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:12:7: ( 'if' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:12:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:13:7: ( 'then' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:13:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:14:7: ( 'else' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:14:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:15:7: ( 'fi' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:15:9: 'fi'
            {
            match("fi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:16:7: ( 'while' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:16:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:17:7: ( 'do' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:17:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:18:7: ( 'od' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:18:9: 'od'
            {
            match("od"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:19:7: ( 'for' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:19:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:20:7: ( 'foreach' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:20:9: 'foreach'
            {
            match("foreach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:21:7: ( 'in' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:21:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:22:7: ( 'pp(' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:22:9: 'pp('
            {
            match("pp("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:23:7: ( ')' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:23:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:24:7: ( '(' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:24:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:25:7: ( 'cons' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:25:9: 'cons'
            {
            match("cons"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:26:7: ( 'list' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:26:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:27:7: ( 'hd' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:27:9: 'hd'
            {
            match("hd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:28:7: ( 'tl' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:28:9: 'tl'
            {
            match("tl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:29:7: ( '=?' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:29:9: '=?'
            {
            match("=?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:37:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:37:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:46:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='/') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='/') ) {
                    alt4=1;
                }
                else if ( (LA4_1=='*') ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:46:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:46:14: (~ ( '\\n' | '\\r' ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:46:14: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:46:28: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:46:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:47:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:47:14: ( options {greedy=false; } : . )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='*') ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1=='/') ) {
                                alt3=2;
                            }
                            else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFF')) ) {
                                alt3=1;
                            }


                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<=')')||(LA3_0>='+' && LA3_0<='\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:47:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "Nil"
    public final void mNil() throws RecognitionException {
        try {
            int _type = Nil;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:94:5: ( 'nil' )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:94:7: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Nil"

    // $ANTLR start "Variable"
    public final void mVariable() throws RecognitionException {
        try {
            int _type = Variable;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:95:9: ( 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( '!' | '?' )? )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:95:11: 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( '!' | '?' )?
            {
            matchRange('A','Z'); 
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:95:20: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:95:49: ( '!' | '?' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='!'||LA6_0=='?') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Variable"

    // $ANTLR start "Symbol"
    public final void mSymbol() throws RecognitionException {
        try {
            int _type = Symbol;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:96:9: ( 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( '!' | '?' )? )
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:96:11: 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( '!' | '?' )?
            {
            matchRange('a','z'); 
            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:96:20: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:96:49: ( '!' | '?' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='!'||LA8_0=='?') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Symbol"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:8: ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | WS | COMMENT | Nil | Variable | Symbol )
        int alt9=32;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:10: T__39
                {
                mT__39(); 

                }
                break;
            case 2 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:16: T__40
                {
                mT__40(); 

                }
                break;
            case 3 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:22: T__41
                {
                mT__41(); 

                }
                break;
            case 4 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:28: T__42
                {
                mT__42(); 

                }
                break;
            case 5 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:34: T__43
                {
                mT__43(); 

                }
                break;
            case 6 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:40: T__44
                {
                mT__44(); 

                }
                break;
            case 7 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:46: T__45
                {
                mT__45(); 

                }
                break;
            case 8 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:52: T__46
                {
                mT__46(); 

                }
                break;
            case 9 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:58: T__47
                {
                mT__47(); 

                }
                break;
            case 10 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:64: T__48
                {
                mT__48(); 

                }
                break;
            case 11 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:70: T__49
                {
                mT__49(); 

                }
                break;
            case 12 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:76: T__50
                {
                mT__50(); 

                }
                break;
            case 13 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:82: T__51
                {
                mT__51(); 

                }
                break;
            case 14 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:88: T__52
                {
                mT__52(); 

                }
                break;
            case 15 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:94: T__53
                {
                mT__53(); 

                }
                break;
            case 16 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:100: T__54
                {
                mT__54(); 

                }
                break;
            case 17 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:106: T__55
                {
                mT__55(); 

                }
                break;
            case 18 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:112: T__56
                {
                mT__56(); 

                }
                break;
            case 19 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:118: T__57
                {
                mT__57(); 

                }
                break;
            case 20 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:124: T__58
                {
                mT__58(); 

                }
                break;
            case 21 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:130: T__59
                {
                mT__59(); 

                }
                break;
            case 22 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:136: T__60
                {
                mT__60(); 

                }
                break;
            case 23 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:142: T__61
                {
                mT__61(); 

                }
                break;
            case 24 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:148: T__62
                {
                mT__62(); 

                }
                break;
            case 25 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:154: T__63
                {
                mT__63(); 

                }
                break;
            case 26 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:160: T__64
                {
                mT__64(); 

                }
                break;
            case 27 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:166: T__65
                {
                mT__65(); 

                }
                break;
            case 28 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:172: WS
                {
                mWS(); 

                }
                break;
            case 29 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:175: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 30 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:183: Nil
                {
                mNil(); 

                }
                break;
            case 31 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:187: Variable
                {
                mVariable(); 

                }
                break;
            case 32 :
                // C:\\Users\\33665\\Desktop\\TLC\\TP2\\While.g:1:196: Symbol
                {
                mSymbol(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\1\30\1\35\1\30\1\uffff\1\30\2\uffff\7\30\2\uffff\3\30"+
        "\5\uffff\1\30\1\57\1\30\2\uffff\5\30\1\66\1\67\1\30\1\71\1\30\1"+
        "\73\1\74\3\30\1\100\1\30\1\uffff\1\103\3\30\1\107\1\110\2\uffff"+
        "\1\30\1\uffff\1\30\3\uffff\2\30\1\uffff\2\30\1\uffff\1\117\2\30"+
        "\2\uffff\1\122\1\123\1\124\1\125\2\30\1\uffff\1\130\1\131\4\uffff"+
        "\2\30\2\uffff\1\30\1\135\1\136\2\uffff";
    static final String DFA9_eofS =
        "\137\uffff";
    static final String DFA9_minS =
        "\1\11\1\151\1\75\1\145\1\uffff\1\150\2\uffff\1\151\1\146\1\150"+
        "\1\154\1\157\1\144\1\160\2\uffff\1\157\1\151\1\144\5\uffff\1\156"+
        "\1\41\1\162\2\uffff\1\141\2\151\1\160\1\154\2\41\1\145\1\41\1\163"+
        "\2\41\1\50\1\156\1\163\1\41\1\143\1\uffff\1\41\1\144\1\164\1\154"+
        "\2\41\2\uffff\1\156\1\uffff\1\145\3\uffff\1\163\1\164\1\uffff\1"+
        "\164\1\141\1\uffff\1\41\2\145\2\uffff\4\41\1\151\1\143\1\uffff\2"+
        "\41\4\uffff\1\157\1\150\2\uffff\1\156\2\41\2\uffff";
    static final String DFA9_maxS =
        "\1\172\1\165\1\75\1\145\1\uffff\1\162\2\uffff\1\157\1\156\2\154"+
        "\1\157\1\144\1\160\2\uffff\1\157\1\151\1\144\5\uffff\1\156\1\172"+
        "\1\162\2\uffff\1\141\2\151\1\160\1\154\2\172\1\145\1\172\1\163\2"+
        "\172\1\50\1\156\1\163\1\172\1\143\1\uffff\1\172\1\144\1\164\1\154"+
        "\2\172\2\uffff\1\156\1\uffff\1\145\3\uffff\1\163\1\164\1\uffff\1"+
        "\164\1\141\1\uffff\1\172\2\145\2\uffff\4\172\1\151\1\143\1\uffff"+
        "\2\172\4\uffff\1\157\1\150\2\uffff\1\156\2\172\2\uffff";
    static final String DFA9_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\7\7\uffff\1\25\1\26\3\uffff\1\33\1\34"+
        "\1\35\1\37\1\40\3\uffff\1\11\1\2\21\uffff\1\15\6\uffff\1\12\1\23"+
        "\1\uffff\1\32\1\uffff\1\17\1\20\1\24\2\uffff\1\31\2\uffff\1\21\3"+
        "\uffff\1\10\1\36\6\uffff\1\3\2\uffff\1\13\1\14\1\27\1\30\2\uffff"+
        "\1\5\1\16\3\uffff\1\22\1\1";
    static final String DFA9_specialS =
        "\137\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\25\2\uffff\1\25\22\uffff\1\25\4\uffff\1\4\2\uffff\1\20\1"+
            "\17\2\uffff\1\6\2\uffff\1\26\12\uffff\1\2\1\7\1\uffff\1\24\3"+
            "\uffff\32\27\6\uffff\2\30\1\21\1\14\1\13\1\1\1\30\1\23\1\11"+
            "\2\30\1\22\1\30\1\10\1\15\1\16\1\30\1\3\1\30\1\12\2\30\1\5\3"+
            "\30",
            "\1\32\5\uffff\1\33\5\uffff\1\31",
            "\1\34",
            "\1\36",
            "",
            "\1\40\11\uffff\1\37",
            "",
            "",
            "\1\42\5\uffff\1\41",
            "\1\43\7\uffff\1\44",
            "\1\45\3\uffff\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "",
            "",
            "\1\53",
            "\1\54",
            "\1\55",
            "",
            "",
            "",
            "",
            "",
            "\1\56",
            "\1\30\16\uffff\12\30\5\uffff\1\30\1\uffff\32\30\6\uffff\32"+
            "\30",
            "\1\60",
            "",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\30\16\uffff\12\30\5\uffff\1\30\1\uffff\32\30\6\uffff\32"+
            "\30",
            "\1\30\16\uffff\12\30\5\uffff\1\30\1\uffff\32\30\6\uffff\32"+
            "\30",
            "\1\70",
            "\1\30\16\uffff\12\30\5\uffff\1\30\1\uffff\32\30\6\uffff\32"+
            "\30",
            "\1\72",
            "\1\30\16\uffff\12\30\5\uffff\1\30\1\uffff\32\30\6\uffff\32"+
            "\30",
            "\1\30\16\uffff\12\30\5\uffff\1\30\1\uffff\32\30\6\uffff\32"+
            "\30",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\30\16\uffff\12\30\5\uffff\1\30\1\uffff\32\30\6\uffff\32"+
            "\30",
            "\1\101",
            "",
            "\1\30\16\uffff\12\30\5\uffff\1\30\1\uffff\32\30\6\uffff\4"+
            "\30\1\102\25\30",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\30\16\uffff\12\30\5\uffff\1\30\1\uffff\32\30\6\uffff\32"+
            "\30",
            "\1\30\16\uffff\12\30\5\uffff\1\30\1\uffff\32\30\6\uffff\32"+
            "\30",
            "",
            "",
            "\1\111",
            "",
            "\1\112",
            "",
            "",
            "",
            "\1\113",
            "\1\114",
            "",
            "\1\115",
            "\1\116",
            "",
            "\1\30\16\uffff\12\30\5\uffff\1\30\1\uffff\32\30\6\uffff\32"+
            "\30",
            "\1\120",
            "\1\121",
            "",
            "",
            "\1\30\16\uffff\12\30\5\uffff\1\30\1\uffff\32\30\6\uffff\32"+
            "\30",
            "\1\30\16\uffff\12\30\5\uffff\1\30\1\uffff\32\30\6\uffff\32"+
            "\30",
            "\1\30\16\uffff\12\30\5\uffff\1\30\1\uffff\32\30\6\uffff\32"+
            "\30",
            "\1\30\16\uffff\12\30\5\uffff\1\30\1\uffff\32\30\6\uffff\32"+
            "\30",
            "\1\126",
            "\1\127",
            "",
            "\1\30\16\uffff\12\30\5\uffff\1\30\1\uffff\32\30\6\uffff\32"+
            "\30",
            "\1\30\16\uffff\12\30\5\uffff\1\30\1\uffff\32\30\6\uffff\32"+
            "\30",
            "",
            "",
            "",
            "",
            "\1\132",
            "\1\133",
            "",
            "",
            "\1\134",
            "\1\30\16\uffff\12\30\5\uffff\1\30\1\uffff\32\30\6\uffff\32"+
            "\30",
            "\1\30\16\uffff\12\30\5\uffff\1\30\1\uffff\32\30\6\uffff\32"+
            "\30",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | WS | COMMENT | Nil | Variable | Symbol );";
        }
    }
 

}