// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g 2011-05-01 11:32:51

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class esqlLexer extends Lexer {
    public static final int FUNCTION=31;
    public static final int EXTERNAL=26;
    public static final int GMTTIMESTAMP=85;
    public static final int SEVERITY=66;
    public static final int WHILE=76;
    public static final int ROW=90;
    public static final int LOG=44;
    public static final int OCTAL_ESC=98;
    public static final int CASE=8;
    public static final int TRACE=71;
    public static final int CHAR=86;
    public static final int DO=16;
    public static final int EOF=-1;
    public static final int LEAVE=42;
    public static final int CREATE=12;
    public static final int FULL=30;
    public static final int ESCAPE=21;
    public static final int INSERT=36;
    public static final int LOOP=45;
    public static final int BEGIN=6;
    public static final int RETURN=63;
    public static final int GMTTIME=83;
    public static final int COMMENT=92;
    public static final int PASSTHRU=55;
    public static final int ATTACH=5;
    public static final int PROPAGATE=58;
    public static final int HANDLER=32;
    public static final int INTO=37;
    public static final int EXCEPTION=24;
    public static final int SHARED=67;
    public static final int EXIT=25;
    public static final int ELSE=18;
    public static final int CATALOG=9;
    public static final int DELETE=14;
    public static final int VALUE=73;
    public static final int OF=51;
    public static final int NAMESPACE=49;
    public static final int RESIGNAL=61;
    public static final int WS=93;
    public static final int OUT=52;
    public static final int EVAL=22;
    public static final int UNTIL=77;
    public static final int USER=79;
    public static final int CONSTANT=10;
    public static final int FIELD=28;
    public static final int REPEAT=60;
    public static final int CALL=7;
    public static final int END=20;
    public static final int ATOMIC=4;
    public static final int THROW=70;
    public static final int TIMESTAMP=84;
    public static final int FIRSTCHILD=29;
    public static final int IDENTITY=33;
    public static final int UPDATE=78;
    public static final int FOR=27;
    public static final int FLOAT=88;
    public static final int ID=91;
    public static final int IF=34;
    public static final int INOUT=40;
    public static final int TIME=82;
    public static final int PARENT=53;
    public static final int ESC_SEQ=94;
    public static final int PREVIOUSSIBLING=56;
    public static final int BOOLEAN=80;
    public static final int LASTCHILD=41;
    public static final int IN=35;
    public static final int THEN=69;
    public static final int CONTINUE=11;
    public static final int IS=38;
    public static final int NEXTSIBLING=50;
    public static final int MESSAGE=46;
    public static final int RETURNS=62;
    public static final int LIKE=43;
    public static final int INTEGER=89;
    public static final int PARSE=54;
    public static final int TO=72;
    public static final int TERMINAL=68;
    public static final int UNICODE_ESC=97;
    public static final int VALUES=74;
    public static final int HEX_DIGIT=96;
    public static final int REFERENCE=59;
    public static final int SET=65;
    public static final int EVENT=23;
    public static final int MODULE=47;
    public static final int PROCEDURE=57;
    public static final int DOMAIN=17;
    public static final int ELSEIF=19;
    public static final int ITERATE=39;
    public static final int SCHEMA=64;
    public static final int DECIMAL=87;
    public static final int DETACH=15;
    public static final int WHEN=75;
    public static final int MOVE=48;
    public static final int DECLARE=13;
    public static final int DATE=81;
    public static final int STRING=95;

    // delegates
    // delegators

    public esqlLexer() {;} 
    public esqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public esqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g"; }

    // $ANTLR start "ATOMIC"
    public final void mATOMIC() throws RecognitionException {
        try {
            int _type = ATOMIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:10:8: ( 'ATOMIC' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:10:10: 'ATOMIC'
            {
            match("ATOMIC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ATOMIC"

    // $ANTLR start "ATTACH"
    public final void mATTACH() throws RecognitionException {
        try {
            int _type = ATTACH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:11:8: ( 'ATTACH' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:11:10: 'ATTACH'
            {
            match("ATTACH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ATTACH"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:12:8: ( 'BEGIN' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:12:10: 'BEGIN'
            {
            match("BEGIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "CALL"
    public final void mCALL() throws RecognitionException {
        try {
            int _type = CALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:13:6: ( 'CALL' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:13:8: 'CALL'
            {
            match("CALL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CALL"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:14:6: ( 'CASE' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:14:8: 'CASE'
            {
            match("CASE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "CATALOG"
    public final void mCATALOG() throws RecognitionException {
        try {
            int _type = CATALOG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:15:9: ( 'CATALOG' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:15:11: 'CATALOG'
            {
            match("CATALOG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CATALOG"

    // $ANTLR start "CONSTANT"
    public final void mCONSTANT() throws RecognitionException {
        try {
            int _type = CONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:17:10: ( 'CONSTANT' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:18:3: 'CONSTANT'
            {
            match("CONSTANT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONSTANT"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:20:10: ( 'CONTINUE' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:21:3: 'CONTINUE'
            {
            match("CONTINUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:23:8: ( 'CREATE' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:24:3: 'CREATE'
            {
            match("CREATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "DECLARE"
    public final void mDECLARE() throws RecognitionException {
        try {
            int _type = DECLARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:26:9: ( 'DECLARE' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:27:3: 'DECLARE'
            {
            match("DECLARE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECLARE"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:29:8: ( 'DELETE' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:30:3: 'DELETE'
            {
            match("DELETE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "DETACH"
    public final void mDETACH() throws RecognitionException {
        try {
            int _type = DETACH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:32:8: ( 'DETACH' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:33:3: 'DETACH'
            {
            match("DETACH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DETACH"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:35:4: ( 'DO' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:36:3: 'DO'
            {
            match("DO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "DOMAIN"
    public final void mDOMAIN() throws RecognitionException {
        try {
            int _type = DOMAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:38:8: ( 'DOMAIN' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:39:3: 'DOMAIN'
            {
            match("DOMAIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOMAIN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:41:6: ( 'ELSE' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:42:3: 'ELSE'
            {
            match("ELSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ELSEIF"
    public final void mELSEIF() throws RecognitionException {
        try {
            int _type = ELSEIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:44:8: ( 'ELSEIF' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:45:3: 'ELSEIF'
            {
            match("ELSEIF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSEIF"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:47:5: ( 'END' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:48:3: 'END'
            {
            match("END"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "ESCAPE"
    public final void mESCAPE() throws RecognitionException {
        try {
            int _type = ESCAPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:50:8: ( 'ESCAPE' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:51:3: 'ESCAPE'
            {
            match("ESCAPE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ESCAPE"

    // $ANTLR start "EVAL"
    public final void mEVAL() throws RecognitionException {
        try {
            int _type = EVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:53:6: ( 'EVAL' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:54:3: 'EVAL'
            {
            match("EVAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EVAL"

    // $ANTLR start "EVENT"
    public final void mEVENT() throws RecognitionException {
        try {
            int _type = EVENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:56:7: ( 'EVENT' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:57:3: 'EVENT'
            {
            match("EVENT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EVENT"

    // $ANTLR start "EXCEPTION"
    public final void mEXCEPTION() throws RecognitionException {
        try {
            int _type = EXCEPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:59:11: ( 'EXCEPTION' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:60:3: 'EXCEPTION'
            {
            match("EXCEPTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXCEPTION"

    // $ANTLR start "EXIT"
    public final void mEXIT() throws RecognitionException {
        try {
            int _type = EXIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:62:6: ( 'EXIT' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:63:3: 'EXIT'
            {
            match("EXIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXIT"

    // $ANTLR start "EXTERNAL"
    public final void mEXTERNAL() throws RecognitionException {
        try {
            int _type = EXTERNAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:65:10: ( 'EXTERNAL' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:66:3: 'EXTERNAL'
            {
            match("EXTERNAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTERNAL"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:68:5: ( 'FOR' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:69:3: 'FOR'
            {
            match("FOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "FIELD"
    public final void mFIELD() throws RecognitionException {
        try {
            int _type = FIELD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:71:7: ( 'FIELD' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:72:3: 'FIELD'
            {
            match("FIELD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIELD"

    // $ANTLR start "FIRSTCHILD"
    public final void mFIRSTCHILD() throws RecognitionException {
        try {
            int _type = FIRSTCHILD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:74:12: ( 'FIRSTCHILD' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:75:3: 'FIRSTCHILD'
            {
            match("FIRSTCHILD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIRSTCHILD"

    // $ANTLR start "FULL"
    public final void mFULL() throws RecognitionException {
        try {
            int _type = FULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:77:6: ( 'FULL' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:78:3: 'FULL'
            {
            match("FULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FULL"

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:80:10: ( 'FUNCTION' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:81:3: 'FUNCTION'
            {
            match("FUNCTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION"

    // $ANTLR start "HANDLER"
    public final void mHANDLER() throws RecognitionException {
        try {
            int _type = HANDLER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:83:9: ( 'HANDLER' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:84:3: 'HANDLER'
            {
            match("HANDLER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HANDLER"

    // $ANTLR start "IDENTITY"
    public final void mIDENTITY() throws RecognitionException {
        try {
            int _type = IDENTITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:86:10: ( 'IDENTITY' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:87:3: 'IDENTITY'
            {
            match("IDENTITY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTITY"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:89:4: ( 'IF' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:90:3: 'IF'
            {
            match("IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:92:4: ( 'IN' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:93:3: 'IN'
            {
            match("IN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:95:8: ( 'INSERT' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:96:3: 'INSERT'
            {
            match("INSERT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSERT"

    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:98:6: ( 'INTO' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:99:3: 'INTO'
            {
            match("INTO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTO"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:101:4: ( 'IS' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:102:3: 'IS'
            {
            match("IS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "ITERATE"
    public final void mITERATE() throws RecognitionException {
        try {
            int _type = ITERATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:104:9: ( 'ITERATE' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:105:3: 'ITERATE'
            {
            match("ITERATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ITERATE"

    // $ANTLR start "INOUT"
    public final void mINOUT() throws RecognitionException {
        try {
            int _type = INOUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:107:7: ( 'INOUT' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:108:3: 'INOUT'
            {
            match("INOUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INOUT"

    // $ANTLR start "LASTCHILD"
    public final void mLASTCHILD() throws RecognitionException {
        try {
            int _type = LASTCHILD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:110:11: ( 'LASTCHILD' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:111:3: 'LASTCHILD'
            {
            match("LASTCHILD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LASTCHILD"

    // $ANTLR start "LEAVE"
    public final void mLEAVE() throws RecognitionException {
        try {
            int _type = LEAVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:113:7: ( 'LEAVE' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:114:3: 'LEAVE'
            {
            match("LEAVE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEAVE"

    // $ANTLR start "LIKE"
    public final void mLIKE() throws RecognitionException {
        try {
            int _type = LIKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:116:6: ( 'LIKE' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:117:3: 'LIKE'
            {
            match("LIKE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIKE"

    // $ANTLR start "LOG"
    public final void mLOG() throws RecognitionException {
        try {
            int _type = LOG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:119:5: ( 'LOG' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:120:3: 'LOG'
            {
            match("LOG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOG"

    // $ANTLR start "LOOP"
    public final void mLOOP() throws RecognitionException {
        try {
            int _type = LOOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:122:6: ( 'LOOP' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:123:3: 'LOOP'
            {
            match("LOOP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOOP"

    // $ANTLR start "MESSAGE"
    public final void mMESSAGE() throws RecognitionException {
        try {
            int _type = MESSAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:125:9: ( 'MESSAGE' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:126:3: 'MESSAGE'
            {
            match("MESSAGE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MESSAGE"

    // $ANTLR start "MODULE"
    public final void mMODULE() throws RecognitionException {
        try {
            int _type = MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:128:8: ( 'MODULE' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:129:3: 'MODULE'
            {
            match("MODULE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MODULE"

    // $ANTLR start "MOVE"
    public final void mMOVE() throws RecognitionException {
        try {
            int _type = MOVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:131:6: ( 'MOVE' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:132:3: 'MOVE'
            {
            match("MOVE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOVE"

    // $ANTLR start "NAMESPACE"
    public final void mNAMESPACE() throws RecognitionException {
        try {
            int _type = NAMESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:134:11: ( 'NAMESPACE' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:135:3: 'NAMESPACE'
            {
            match("NAMESPACE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAMESPACE"

    // $ANTLR start "NEXTSIBLING"
    public final void mNEXTSIBLING() throws RecognitionException {
        try {
            int _type = NEXTSIBLING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:137:13: ( 'NEXTSIBLING' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:138:3: 'NEXTSIBLING'
            {
            match("NEXTSIBLING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEXTSIBLING"

    // $ANTLR start "OF"
    public final void mOF() throws RecognitionException {
        try {
            int _type = OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:140:4: ( 'OF' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:141:3: 'OF'
            {
            match("OF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OF"

    // $ANTLR start "OUT"
    public final void mOUT() throws RecognitionException {
        try {
            int _type = OUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:143:5: ( 'OUT' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:144:3: 'OUT'
            {
            match("OUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OUT"

    // $ANTLR start "PARENT"
    public final void mPARENT() throws RecognitionException {
        try {
            int _type = PARENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:146:8: ( 'PARENT' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:147:3: 'PARENT'
            {
            match("PARENT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARENT"

    // $ANTLR start "PARSE"
    public final void mPARSE() throws RecognitionException {
        try {
            int _type = PARSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:149:7: ( 'PARSE' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:150:3: 'PARSE'
            {
            match("PARSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARSE"

    // $ANTLR start "PASSTHRU"
    public final void mPASSTHRU() throws RecognitionException {
        try {
            int _type = PASSTHRU;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:152:10: ( 'PASSTHRU' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:153:3: 'PASSTHRU'
            {
            match("PASSTHRU"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PASSTHRU"

    // $ANTLR start "PREVIOUSSIBLING"
    public final void mPREVIOUSSIBLING() throws RecognitionException {
        try {
            int _type = PREVIOUSSIBLING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:155:17: ( 'PREVIOUSSIBLING' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:156:3: 'PREVIOUSSIBLING'
            {
            match("PREVIOUSSIBLING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PREVIOUSSIBLING"

    // $ANTLR start "PROCEDURE"
    public final void mPROCEDURE() throws RecognitionException {
        try {
            int _type = PROCEDURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:158:11: ( 'PROCEDURE' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:159:3: 'PROCEDURE'
            {
            match("PROCEDURE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROCEDURE"

    // $ANTLR start "PROPAGATE"
    public final void mPROPAGATE() throws RecognitionException {
        try {
            int _type = PROPAGATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:161:11: ( 'PROPAGATE' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:162:3: 'PROPAGATE'
            {
            match("PROPAGATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROPAGATE"

    // $ANTLR start "REFERENCE"
    public final void mREFERENCE() throws RecognitionException {
        try {
            int _type = REFERENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:164:11: ( 'REFERENCE TO' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:165:3: 'REFERENCE TO'
            {
            match("REFERENCE TO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REFERENCE"

    // $ANTLR start "REPEAT"
    public final void mREPEAT() throws RecognitionException {
        try {
            int _type = REPEAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:167:8: ( 'REPEAT' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:168:3: 'REPEAT'
            {
            match("REPEAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REPEAT"

    // $ANTLR start "RESIGNAL"
    public final void mRESIGNAL() throws RecognitionException {
        try {
            int _type = RESIGNAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:170:10: ( 'RESIGNAL' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:171:3: 'RESIGNAL'
            {
            match("RESIGNAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RESIGNAL"

    // $ANTLR start "RETURNS"
    public final void mRETURNS() throws RecognitionException {
        try {
            int _type = RETURNS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:173:9: ( 'RETURNS' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:174:3: 'RETURNS'
            {
            match("RETURNS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURNS"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:176:8: ( 'RETURN' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:177:3: 'RETURN'
            {
            match("RETURN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "SCHEMA"
    public final void mSCHEMA() throws RecognitionException {
        try {
            int _type = SCHEMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:179:8: ( 'SCHEMA' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:180:3: 'SCHEMA'
            {
            match("SCHEMA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SCHEMA"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:182:5: ( 'SET' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:183:3: 'SET'
            {
            match("SET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "SEVERITY"
    public final void mSEVERITY() throws RecognitionException {
        try {
            int _type = SEVERITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:185:10: ( 'SEVERITY' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:186:3: 'SEVERITY'
            {
            match("SEVERITY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEVERITY"

    // $ANTLR start "SHARED"
    public final void mSHARED() throws RecognitionException {
        try {
            int _type = SHARED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:188:8: ( 'SHARED' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:189:3: 'SHARED'
            {
            match("SHARED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHARED"

    // $ANTLR start "TERMINAL"
    public final void mTERMINAL() throws RecognitionException {
        try {
            int _type = TERMINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:191:10: ( 'TERMINAL' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:192:3: 'TERMINAL'
            {
            match("TERMINAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TERMINAL"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:194:6: ( 'THEN' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:195:3: 'THEN'
            {
            match("THEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "THROW"
    public final void mTHROW() throws RecognitionException {
        try {
            int _type = THROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:197:7: ( 'THROW' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:198:3: 'THROW'
            {
            match("THROW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THROW"

    // $ANTLR start "TRACE"
    public final void mTRACE() throws RecognitionException {
        try {
            int _type = TRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:200:7: ( 'TRACE' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:201:3: 'TRACE'
            {
            match("TRACE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRACE"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:203:4: ( 'TO' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:204:3: 'TO'
            {
            match("TO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "VALUE"
    public final void mVALUE() throws RecognitionException {
        try {
            int _type = VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:206:7: ( 'VALUE' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:207:3: 'VALUE'
            {
            match("VALUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VALUE"

    // $ANTLR start "VALUES"
    public final void mVALUES() throws RecognitionException {
        try {
            int _type = VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:209:8: ( 'VALUES' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:210:3: 'VALUES'
            {
            match("VALUES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VALUES"

    // $ANTLR start "WHEN"
    public final void mWHEN() throws RecognitionException {
        try {
            int _type = WHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:212:6: ( 'WHEN' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:213:3: 'WHEN'
            {
            match("WHEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHEN"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:215:7: ( 'WHILE' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:216:3: 'WHILE'
            {
            match("WHILE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "UNTIL"
    public final void mUNTIL() throws RecognitionException {
        try {
            int _type = UNTIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:218:7: ( 'UNTIL' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:219:3: 'UNTIL'
            {
            match("UNTIL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNTIL"

    // $ANTLR start "UPDATE"
    public final void mUPDATE() throws RecognitionException {
        try {
            int _type = UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:221:8: ( 'UPDATE' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:222:3: 'UPDATE'
            {
            match("UPDATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UPDATE"

    // $ANTLR start "USER"
    public final void mUSER() throws RecognitionException {
        try {
            int _type = USER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:224:6: ( 'USER' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:225:3: 'USER'
            {
            match("USER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USER"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:229:9: ( 'BOOLEAN' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:230:3: 'BOOLEAN'
            {
            match("BOOLEAN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "DATE"
    public final void mDATE() throws RecognitionException {
        try {
            int _type = DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:232:6: ( 'DATE' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:233:3: 'DATE'
            {
            match("DATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DATE"

    // $ANTLR start "TIME"
    public final void mTIME() throws RecognitionException {
        try {
            int _type = TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:235:6: ( 'TIME' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:236:3: 'TIME'
            {
            match("TIME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIME"

    // $ANTLR start "GMTTIME"
    public final void mGMTTIME() throws RecognitionException {
        try {
            int _type = GMTTIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:238:9: ( 'GMTTIME' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:239:3: 'GMTTIME'
            {
            match("GMTTIME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GMTTIME"

    // $ANTLR start "TIMESTAMP"
    public final void mTIMESTAMP() throws RecognitionException {
        try {
            int _type = TIMESTAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:241:11: ( 'TIMESTAMP' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:242:3: 'TIMESTAMP'
            {
            match("TIMESTAMP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMESTAMP"

    // $ANTLR start "GMTTIMESTAMP"
    public final void mGMTTIMESTAMP() throws RecognitionException {
        try {
            int _type = GMTTIMESTAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:244:14: ( 'GMTTIMESTAMP' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:245:3: 'GMTTIMESTAMP'
            {
            match("GMTTIMESTAMP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GMTTIMESTAMP"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:247:6: ( 'CHAR' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:248:3: 'CHAR'
            {
            match("CHAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "DECIMAL"
    public final void mDECIMAL() throws RecognitionException {
        try {
            int _type = DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:250:9: ( 'DECIMAL' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:251:3: 'DECIMAL'
            {
            match("DECIMAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:253:7: ( 'FLOAT' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:254:3: 'FLOAT'
            {
            match("FLOAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:256:9: ( 'INTEGER' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:257:3: 'INTEGER'
            {
            match("INTEGER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "ROW"
    public final void mROW() throws RecognitionException {
        try {
            int _type = ROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:259:5: ( 'ROW' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:260:3: 'ROW'
            {
            match("ROW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROW"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:263:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:263:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:263:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:270:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='/') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='/') ) {
                    alt5=1;
                }
                else if ( (LA5_1=='*') ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:270:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:270:14: (~ ( '\\n' | '\\r' ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:270:14: ~ ( '\\n' | '\\r' )
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
                    	    break loop2;
                        }
                    } while (true);

                    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:270:28: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:270:28: '\\r'
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
                    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:271:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:271:14: ( options {greedy=false; } : . )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='*') ) {
                            int LA4_1 = input.LA(2);

                            if ( (LA4_1=='/') ) {
                                alt4=2;
                            }
                            else if ( ((LA4_1>='\u0000' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='\uFFFF')) ) {
                                alt4=1;
                            }


                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:271:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:274:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:274:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:282:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:282:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:282:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\\') ) {
                    alt6=1;
                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:282:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:282:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:286:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:286:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:290:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt7=1;
                    }
                    break;
                case 'u':
                    {
                    alt7=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt7=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:290:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:291:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:292:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:297:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\\') ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>='0' && LA8_1<='3')) ) {
                    int LA8_2 = input.LA(3);

                    if ( ((LA8_2>='0' && LA8_2<='7')) ) {
                        int LA8_5 = input.LA(4);

                        if ( ((LA8_5>='0' && LA8_5<='7')) ) {
                            alt8=1;
                        }
                        else {
                            alt8=2;}
                    }
                    else {
                        alt8=3;}
                }
                else if ( ((LA8_1>='4' && LA8_1<='7')) ) {
                    int LA8_3 = input.LA(3);

                    if ( ((LA8_3>='0' && LA8_3<='7')) ) {
                        alt8=2;
                    }
                    else {
                        alt8=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:297:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:297:14: ( '0' .. '3' )
                    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:297:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:297:25: ( '0' .. '7' )
                    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:297:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:297:36: ( '0' .. '7' )
                    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:297:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:298:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:298:14: ( '0' .. '7' )
                    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:298:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:298:25: ( '0' .. '7' )
                    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:298:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:299:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:299:14: ( '0' .. '7' )
                    // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:299:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:304:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:304:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:8: ( ATOMIC | ATTACH | BEGIN | CALL | CASE | CATALOG | CONSTANT | CONTINUE | CREATE | DECLARE | DELETE | DETACH | DO | DOMAIN | ELSE | ELSEIF | END | ESCAPE | EVAL | EVENT | EXCEPTION | EXIT | EXTERNAL | FOR | FIELD | FIRSTCHILD | FULL | FUNCTION | HANDLER | IDENTITY | IF | IN | INSERT | INTO | IS | ITERATE | INOUT | LASTCHILD | LEAVE | LIKE | LOG | LOOP | MESSAGE | MODULE | MOVE | NAMESPACE | NEXTSIBLING | OF | OUT | PARENT | PARSE | PASSTHRU | PREVIOUSSIBLING | PROCEDURE | PROPAGATE | REFERENCE | REPEAT | RESIGNAL | RETURNS | RETURN | SCHEMA | SET | SEVERITY | SHARED | TERMINAL | THEN | THROW | TRACE | TO | VALUE | VALUES | WHEN | WHILE | UNTIL | UPDATE | USER | BOOLEAN | DATE | TIME | GMTTIME | TIMESTAMP | GMTTIMESTAMP | CHAR | DECIMAL | FLOAT | INTEGER | ROW | ID | COMMENT | WS | STRING )
        int alt9=91;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:10: ATOMIC
                {
                mATOMIC(); 

                }
                break;
            case 2 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:17: ATTACH
                {
                mATTACH(); 

                }
                break;
            case 3 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:24: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 4 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:30: CALL
                {
                mCALL(); 

                }
                break;
            case 5 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:35: CASE
                {
                mCASE(); 

                }
                break;
            case 6 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:40: CATALOG
                {
                mCATALOG(); 

                }
                break;
            case 7 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:48: CONSTANT
                {
                mCONSTANT(); 

                }
                break;
            case 8 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:57: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 9 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:66: CREATE
                {
                mCREATE(); 

                }
                break;
            case 10 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:73: DECLARE
                {
                mDECLARE(); 

                }
                break;
            case 11 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:81: DELETE
                {
                mDELETE(); 

                }
                break;
            case 12 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:88: DETACH
                {
                mDETACH(); 

                }
                break;
            case 13 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:95: DO
                {
                mDO(); 

                }
                break;
            case 14 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:98: DOMAIN
                {
                mDOMAIN(); 

                }
                break;
            case 15 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:105: ELSE
                {
                mELSE(); 

                }
                break;
            case 16 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:110: ELSEIF
                {
                mELSEIF(); 

                }
                break;
            case 17 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:117: END
                {
                mEND(); 

                }
                break;
            case 18 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:121: ESCAPE
                {
                mESCAPE(); 

                }
                break;
            case 19 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:128: EVAL
                {
                mEVAL(); 

                }
                break;
            case 20 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:133: EVENT
                {
                mEVENT(); 

                }
                break;
            case 21 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:139: EXCEPTION
                {
                mEXCEPTION(); 

                }
                break;
            case 22 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:149: EXIT
                {
                mEXIT(); 

                }
                break;
            case 23 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:154: EXTERNAL
                {
                mEXTERNAL(); 

                }
                break;
            case 24 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:163: FOR
                {
                mFOR(); 

                }
                break;
            case 25 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:167: FIELD
                {
                mFIELD(); 

                }
                break;
            case 26 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:173: FIRSTCHILD
                {
                mFIRSTCHILD(); 

                }
                break;
            case 27 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:184: FULL
                {
                mFULL(); 

                }
                break;
            case 28 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:189: FUNCTION
                {
                mFUNCTION(); 

                }
                break;
            case 29 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:198: HANDLER
                {
                mHANDLER(); 

                }
                break;
            case 30 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:206: IDENTITY
                {
                mIDENTITY(); 

                }
                break;
            case 31 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:215: IF
                {
                mIF(); 

                }
                break;
            case 32 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:218: IN
                {
                mIN(); 

                }
                break;
            case 33 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:221: INSERT
                {
                mINSERT(); 

                }
                break;
            case 34 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:228: INTO
                {
                mINTO(); 

                }
                break;
            case 35 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:233: IS
                {
                mIS(); 

                }
                break;
            case 36 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:236: ITERATE
                {
                mITERATE(); 

                }
                break;
            case 37 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:244: INOUT
                {
                mINOUT(); 

                }
                break;
            case 38 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:250: LASTCHILD
                {
                mLASTCHILD(); 

                }
                break;
            case 39 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:260: LEAVE
                {
                mLEAVE(); 

                }
                break;
            case 40 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:266: LIKE
                {
                mLIKE(); 

                }
                break;
            case 41 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:271: LOG
                {
                mLOG(); 

                }
                break;
            case 42 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:275: LOOP
                {
                mLOOP(); 

                }
                break;
            case 43 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:280: MESSAGE
                {
                mMESSAGE(); 

                }
                break;
            case 44 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:288: MODULE
                {
                mMODULE(); 

                }
                break;
            case 45 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:295: MOVE
                {
                mMOVE(); 

                }
                break;
            case 46 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:300: NAMESPACE
                {
                mNAMESPACE(); 

                }
                break;
            case 47 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:310: NEXTSIBLING
                {
                mNEXTSIBLING(); 

                }
                break;
            case 48 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:322: OF
                {
                mOF(); 

                }
                break;
            case 49 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:325: OUT
                {
                mOUT(); 

                }
                break;
            case 50 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:329: PARENT
                {
                mPARENT(); 

                }
                break;
            case 51 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:336: PARSE
                {
                mPARSE(); 

                }
                break;
            case 52 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:342: PASSTHRU
                {
                mPASSTHRU(); 

                }
                break;
            case 53 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:351: PREVIOUSSIBLING
                {
                mPREVIOUSSIBLING(); 

                }
                break;
            case 54 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:367: PROCEDURE
                {
                mPROCEDURE(); 

                }
                break;
            case 55 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:377: PROPAGATE
                {
                mPROPAGATE(); 

                }
                break;
            case 56 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:387: REFERENCE
                {
                mREFERENCE(); 

                }
                break;
            case 57 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:397: REPEAT
                {
                mREPEAT(); 

                }
                break;
            case 58 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:404: RESIGNAL
                {
                mRESIGNAL(); 

                }
                break;
            case 59 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:413: RETURNS
                {
                mRETURNS(); 

                }
                break;
            case 60 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:421: RETURN
                {
                mRETURN(); 

                }
                break;
            case 61 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:428: SCHEMA
                {
                mSCHEMA(); 

                }
                break;
            case 62 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:435: SET
                {
                mSET(); 

                }
                break;
            case 63 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:439: SEVERITY
                {
                mSEVERITY(); 

                }
                break;
            case 64 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:448: SHARED
                {
                mSHARED(); 

                }
                break;
            case 65 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:455: TERMINAL
                {
                mTERMINAL(); 

                }
                break;
            case 66 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:464: THEN
                {
                mTHEN(); 

                }
                break;
            case 67 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:469: THROW
                {
                mTHROW(); 

                }
                break;
            case 68 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:475: TRACE
                {
                mTRACE(); 

                }
                break;
            case 69 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:481: TO
                {
                mTO(); 

                }
                break;
            case 70 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:484: VALUE
                {
                mVALUE(); 

                }
                break;
            case 71 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:490: VALUES
                {
                mVALUES(); 

                }
                break;
            case 72 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:497: WHEN
                {
                mWHEN(); 

                }
                break;
            case 73 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:502: WHILE
                {
                mWHILE(); 

                }
                break;
            case 74 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:508: UNTIL
                {
                mUNTIL(); 

                }
                break;
            case 75 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:514: UPDATE
                {
                mUPDATE(); 

                }
                break;
            case 76 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:521: USER
                {
                mUSER(); 

                }
                break;
            case 77 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:526: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 78 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:534: DATE
                {
                mDATE(); 

                }
                break;
            case 79 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:539: TIME
                {
                mTIME(); 

                }
                break;
            case 80 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:544: GMTTIME
                {
                mGMTTIME(); 

                }
                break;
            case 81 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:552: TIMESTAMP
                {
                mTIMESTAMP(); 

                }
                break;
            case 82 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:562: GMTTIMESTAMP
                {
                mGMTTIMESTAMP(); 

                }
                break;
            case 83 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:575: CHAR
                {
                mCHAR(); 

                }
                break;
            case 84 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:580: DECIMAL
                {
                mDECIMAL(); 

                }
                break;
            case 85 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:588: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 86 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:594: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 87 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:602: ROW
                {
                mROW(); 

                }
                break;
            case 88 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:606: ID
                {
                mID(); 

                }
                break;
            case 89 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:609: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 90 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:617: WS
                {
                mWS(); 

                }
                break;
            case 91 :
                // /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g:1:620: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\24\25\4\uffff\10\25\1\134\14\25\1\156\1\162\1\163\11\25"+
        "\1\177\13\25\1\u0092\25\25\1\uffff\2\25\1\u00ad\6\25\1\u00b4\7\25"+
        "\1\uffff\3\25\2\uffff\4\25\1\u00c4\6\25\1\uffff\1\u00cb\10\25\1"+
        "\u00d6\1\25\1\u00d8\6\25\1\uffff\14\25\1\u00eb\1\u00ec\4\25\1\u00f1"+
        "\5\25\1\u00f7\1\u00f9\1\uffff\1\25\1\u00fb\2\25\1\u00fe\1\25\1\uffff"+
        "\2\25\1\u0102\5\25\1\u0108\5\25\1\u010e\1\uffff\1\u010f\2\25\1\u0112"+
        "\2\25\1\uffff\12\25\1\uffff\1\25\1\uffff\3\25\1\u0123\2\25\1\u0127"+
        "\1\25\1\u0129\3\25\1\u012d\3\25\1\u0131\1\25\2\uffff\4\25\1\uffff"+
        "\5\25\1\uffff\1\25\1\uffff\1\25\1\uffff\1\u013e\1\25\1\uffff\1\25"+
        "\1\u0141\1\25\1\uffff\1\25\1\u0144\3\25\1\uffff\1\25\1\u0149\2\25"+
        "\1\u014c\2\uffff\2\25\1\uffff\3\25\1\u0152\14\25\1\uffff\1\u015f"+
        "\1\u0160\1\25\1\uffff\1\u0163\1\uffff\1\u0164\1\u0165\1\25\1\uffff"+
        "\1\25\1\u0168\1\u0169\1\uffff\4\25\1\u016e\2\25\1\u0171\1\u0172"+
        "\1\u0173\1\u0174\1\u0175\1\uffff\2\25\1\uffff\2\25\1\uffff\2\25"+
        "\1\u017c\1\25\1\uffff\2\25\1\uffff\1\25\1\u0181\2\25\1\u0184\1\uffff"+
        "\5\25\1\u018a\1\25\1\u018d\1\u018e\1\25\1\u0190\1\25\2\uffff\1\25"+
        "\1\u0193\3\uffff\1\u0194\1\25\2\uffff\1\u0196\1\u0197\2\25\1\uffff"+
        "\1\u019a\1\u019b\5\uffff\4\25\1\u01a0\1\25\1\uffff\1\u01a2\1\u01a3"+
        "\1\25\1\u01a5\1\uffff\2\25\1\uffff\5\25\1\uffff\1\25\1\u01ae\2\uffff"+
        "\1\25\1\uffff\2\25\2\uffff\1\u01b3\2\uffff\1\u01b4\1\u01b5\2\uffff"+
        "\1\25\1\u01b7\1\25\1\u01b9\1\uffff\1\u01ba\2\uffff\1\25\1\uffff"+
        "\2\25\1\u01be\4\25\1\u01c3\1\uffff\1\u01c4\1\u01c5\2\25\3\uffff"+
        "\1\u01c8\1\uffff\1\25\2\uffff\1\u01ca\1\u01cb\1\25\1\uffff\1\25"+
        "\1\u01ce\1\u01cf\1\25\3\uffff\1\u01d1\1\25\1\uffff\1\u01d3\2\uffff"+
        "\2\25\4\uffff\1\25\1\uffff\1\u01d7\2\25\1\uffff\1\25\1\u01db\1\25"+
        "\1\uffff\1\25\1\u01de\1\uffff";
    static final String DFA9_eofS =
        "\u01df\uffff";
    static final String DFA9_minS =
        "\1\11\1\124\1\105\2\101\1\114\1\111\1\101\1\104\1\101\1\105\1\101"+
        "\1\106\1\101\1\105\1\103\1\105\1\101\1\110\1\116\1\115\4\uffff\1"+
        "\117\1\107\1\117\1\114\1\116\1\105\1\101\1\103\1\60\1\124\1\123"+
        "\1\104\1\103\1\101\1\103\1\122\1\105\1\114\1\117\1\116\1\105\3\60"+
        "\1\105\1\123\1\101\1\113\1\107\1\123\1\104\1\115\1\130\1\60\1\124"+
        "\1\122\1\105\1\106\1\127\1\110\1\124\1\101\1\122\1\105\1\101\1\60"+
        "\1\115\1\114\1\105\1\124\1\104\1\105\1\124\1\115\1\101\1\111\2\114"+
        "\1\105\1\101\1\123\1\101\1\122\1\111\1\105\2\101\1\uffff\2\105\1"+
        "\60\1\101\1\114\1\116\1\105\1\124\1\105\1\60\1\114\1\123\1\114\1"+
        "\103\1\101\1\104\1\116\1\uffff\2\105\1\125\2\uffff\1\122\1\124\1"+
        "\126\1\105\1\60\1\120\1\123\1\125\2\105\1\124\1\uffff\1\60\1\105"+
        "\1\123\1\126\1\103\2\105\1\111\1\125\1\60\1\105\1\60\1\105\1\122"+
        "\1\115\1\116\1\117\1\103\1\uffff\1\105\1\125\1\116\1\114\1\111\1"+
        "\101\1\122\1\124\1\111\1\103\1\116\1\105\2\60\1\114\1\124\1\111"+
        "\1\124\1\60\1\101\1\115\1\124\1\103\1\111\2\60\1\uffff\1\120\1\60"+
        "\1\124\1\120\1\60\1\122\1\uffff\1\104\1\124\1\60\2\124\1\114\1\124"+
        "\1\122\1\60\1\107\1\124\1\101\1\103\1\105\1\60\1\uffff\1\60\1\101"+
        "\1\114\1\60\2\123\1\uffff\1\116\1\105\1\124\1\111\1\105\1\101\1"+
        "\122\1\101\1\107\1\122\1\uffff\1\115\1\uffff\1\122\1\105\1\111\1"+
        "\60\1\127\1\105\1\60\1\105\1\60\1\105\1\114\1\124\1\60\1\111\1\103"+
        "\1\110\1\60\1\101\2\uffff\1\117\1\101\1\116\1\105\1\uffff\1\122"+
        "\1\101\1\105\1\110\1\116\1\uffff\1\106\1\uffff\1\105\1\uffff\1\60"+
        "\1\124\1\uffff\1\116\1\60\1\103\1\uffff\1\111\1\60\1\105\1\111\1"+
        "\124\1\uffff\1\105\1\60\1\124\1\110\1\60\2\uffff\1\107\1\105\1\uffff"+
        "\1\120\1\111\1\124\1\60\1\110\1\117\1\104\1\107\1\105\1\124\2\116"+
        "\1\101\1\111\1\104\1\116\1\uffff\2\60\1\124\1\uffff\1\60\1\uffff"+
        "\2\60\1\105\1\uffff\1\115\2\60\1\uffff\1\116\1\107\1\116\1\125\1"+
        "\60\1\105\1\114\5\60\1\uffff\1\111\1\101\1\uffff\1\110\1\117\1\uffff"+
        "\1\122\1\124\1\60\1\122\1\uffff\1\105\1\111\1\uffff\1\105\1\60\1"+
        "\101\1\102\1\60\1\uffff\1\122\2\125\1\101\1\116\1\60\1\101\2\60"+
        "\1\124\1\60\1\101\2\uffff\1\101\1\60\3\uffff\1\60\1\105\2\uffff"+
        "\2\60\1\124\1\105\1\uffff\2\60\5\uffff\1\117\1\114\1\111\1\116\1"+
        "\60\1\131\1\uffff\2\60\1\114\1\60\1\uffff\1\103\1\114\1\uffff\1"+
        "\125\1\123\1\122\1\124\1\103\1\uffff\1\114\1\60\2\uffff\1\131\1"+
        "\uffff\1\114\1\115\2\uffff\1\60\2\uffff\2\60\2\uffff\1\116\1\60"+
        "\1\114\1\60\1\uffff\1\60\2\uffff\1\104\1\uffff\1\105\1\111\1\60"+
        "\1\123\3\105\1\60\1\uffff\2\60\1\120\1\124\3\uffff\1\60\1\uffff"+
        "\1\104\2\uffff\2\60\1\116\1\uffff\1\111\2\60\1\40\3\uffff\1\60\1"+
        "\101\1\uffff\1\60\2\uffff\1\107\1\102\4\uffff\1\115\1\uffff\1\60"+
        "\1\114\1\120\1\uffff\1\111\1\60\1\116\1\uffff\1\107\1\60\1\uffff";
    static final String DFA9_maxS =
        "\1\172\1\124\1\117\1\122\1\117\1\130\1\125\1\101\1\124\2\117\1\105"+
        "\1\125\1\122\1\117\1\110\1\122\1\101\1\110\1\123\1\115\4\uffff\1"+
        "\124\1\107\1\117\1\124\1\116\1\105\1\101\1\124\1\172\1\124\1\123"+
        "\1\104\1\103\1\105\1\124\2\122\1\116\1\117\1\116\1\105\3\172\1\105"+
        "\1\123\1\101\1\113\1\117\1\123\1\126\1\115\1\130\1\172\1\124\1\123"+
        "\1\117\1\124\1\127\1\110\1\126\1\101\2\122\1\101\1\172\1\115\1\114"+
        "\1\111\1\124\1\104\1\105\1\124\1\115\1\101\1\111\2\114\1\105\1\101"+
        "\1\124\1\101\1\122\1\114\1\105\2\101\1\uffff\2\105\1\172\1\101\1"+
        "\114\1\116\1\105\1\124\1\105\1\172\1\114\1\123\1\114\1\103\1\101"+
        "\1\104\1\116\1\uffff\1\105\1\117\1\125\2\uffff\1\122\1\124\1\126"+
        "\1\105\1\172\1\120\1\123\1\125\2\105\1\124\1\uffff\1\172\2\123\1"+
        "\126\1\120\2\105\1\111\1\125\1\172\1\105\1\172\1\105\1\122\1\115"+
        "\1\116\1\117\1\103\1\uffff\1\105\1\125\1\116\1\114\1\111\1\101\1"+
        "\122\1\124\1\111\1\103\1\116\1\105\2\172\1\114\1\124\1\111\1\124"+
        "\1\172\1\101\1\115\1\124\1\103\1\111\2\172\1\uffff\1\120\1\172\1"+
        "\124\1\120\1\172\1\122\1\uffff\1\104\1\124\1\172\2\124\1\114\1\124"+
        "\1\122\1\172\1\107\1\124\1\101\1\103\1\105\1\172\1\uffff\1\172\1"+
        "\101\1\114\1\172\2\123\1\uffff\1\116\1\105\1\124\1\111\1\105\1\101"+
        "\1\122\1\101\1\107\1\122\1\uffff\1\115\1\uffff\1\122\1\105\1\111"+
        "\1\172\1\127\1\105\1\172\1\105\1\172\1\105\1\114\1\124\1\172\1\111"+
        "\1\103\1\110\1\172\1\101\2\uffff\1\117\1\101\1\116\1\105\1\uffff"+
        "\1\122\1\101\1\105\1\110\1\116\1\uffff\1\106\1\uffff\1\105\1\uffff"+
        "\1\172\1\124\1\uffff\1\116\1\172\1\103\1\uffff\1\111\1\172\1\105"+
        "\1\111\1\124\1\uffff\1\105\1\172\1\124\1\110\1\172\2\uffff\1\107"+
        "\1\105\1\uffff\1\120\1\111\1\124\1\172\1\110\1\117\1\104\1\107\1"+
        "\105\1\124\2\116\1\101\1\111\1\104\1\116\1\uffff\2\172\1\124\1\uffff"+
        "\1\172\1\uffff\2\172\1\105\1\uffff\1\115\2\172\1\uffff\1\116\1\107"+
        "\1\116\1\125\1\172\1\105\1\114\5\172\1\uffff\1\111\1\101\1\uffff"+
        "\1\110\1\117\1\uffff\1\122\1\124\1\172\1\122\1\uffff\1\105\1\111"+
        "\1\uffff\1\105\1\172\1\101\1\102\1\172\1\uffff\1\122\2\125\1\101"+
        "\1\116\1\172\1\101\2\172\1\124\1\172\1\101\2\uffff\1\101\1\172\3"+
        "\uffff\1\172\1\105\2\uffff\2\172\1\124\1\105\1\uffff\2\172\5\uffff"+
        "\1\117\1\114\1\111\1\116\1\172\1\131\1\uffff\2\172\1\114\1\172\1"+
        "\uffff\1\103\1\114\1\uffff\1\125\1\123\1\122\1\124\1\103\1\uffff"+
        "\1\114\1\172\2\uffff\1\131\1\uffff\1\114\1\115\2\uffff\1\172\2\uffff"+
        "\2\172\2\uffff\1\116\1\172\1\114\1\172\1\uffff\1\172\2\uffff\1\104"+
        "\1\uffff\1\105\1\111\1\172\1\123\3\105\1\172\1\uffff\2\172\1\120"+
        "\1\124\3\uffff\1\172\1\uffff\1\104\2\uffff\2\172\1\116\1\uffff\1"+
        "\111\2\172\1\40\3\uffff\1\172\1\101\1\uffff\1\172\2\uffff\1\107"+
        "\1\102\4\uffff\1\115\1\uffff\1\172\1\114\1\120\1\uffff\1\111\1\172"+
        "\1\116\1\uffff\1\107\1\172\1\uffff";
    static final String DFA9_acceptS =
        "\25\uffff\1\130\1\131\1\132\1\133\103\uffff\1\15\21\uffff\1\37\3"+
        "\uffff\1\40\1\43\13\uffff\1\60\22\uffff\1\105\32\uffff\1\21\6\uffff"+
        "\1\30\17\uffff\1\51\6\uffff\1\61\12\uffff\1\127\1\uffff\1\76\22"+
        "\uffff\1\4\1\5\4\uffff\1\123\5\uffff\1\116\1\uffff\1\17\1\uffff"+
        "\1\23\2\uffff\1\26\3\uffff\1\33\5\uffff\1\42\5\uffff\1\50\1\52\2"+
        "\uffff\1\55\20\uffff\1\102\3\uffff\1\117\1\uffff\1\110\3\uffff\1"+
        "\114\3\uffff\1\3\14\uffff\1\24\2\uffff\1\31\2\uffff\1\125\4\uffff"+
        "\1\45\2\uffff\1\47\5\uffff\1\63\14\uffff\1\103\1\104\2\uffff\1\106"+
        "\1\111\1\112\2\uffff\1\1\1\2\4\uffff\1\11\2\uffff\1\13\1\14\1\16"+
        "\1\20\1\22\6\uffff\1\41\4\uffff\1\54\2\uffff\1\62\5\uffff\1\71\2"+
        "\uffff\1\74\1\75\1\uffff\1\100\2\uffff\1\107\1\113\1\uffff\1\115"+
        "\1\6\2\uffff\1\12\1\124\4\uffff\1\35\1\uffff\1\126\1\44\1\uffff"+
        "\1\53\10\uffff\1\73\4\uffff\1\120\1\7\1\10\1\uffff\1\27\1\uffff"+
        "\1\34\1\36\3\uffff\1\64\4\uffff\1\72\1\77\1\101\2\uffff\1\25\1\uffff"+
        "\1\46\1\56\2\uffff\1\66\1\67\1\70\1\121\1\uffff\1\32\3\uffff\1\57"+
        "\3\uffff\1\122\2\uffff\1\65";
    static final String DFA9_specialS =
        "\u01df\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\27\2\uffff\1\27\22\uffff\1\27\1\uffff\1\30\14\uffff\1\26"+
            "\21\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\24\1\7\1\10\2\25\1\11\1"+
            "\12\1\13\1\14\1\15\1\25\1\16\1\17\1\20\1\23\1\21\1\22\3\25\4"+
            "\uffff\1\25\1\uffff\32\25",
            "\1\31",
            "\1\32\11\uffff\1\33",
            "\1\34\6\uffff\1\37\6\uffff\1\35\2\uffff\1\36",
            "\1\42\3\uffff\1\40\11\uffff\1\41",
            "\1\43\1\uffff\1\44\4\uffff\1\45\2\uffff\1\46\1\uffff\1\47",
            "\1\51\2\uffff\1\53\2\uffff\1\50\5\uffff\1\52",
            "\1\54",
            "\1\55\1\uffff\1\56\7\uffff\1\57\4\uffff\1\60\1\61",
            "\1\62\3\uffff\1\63\3\uffff\1\64\5\uffff\1\65",
            "\1\66\11\uffff\1\67",
            "\1\70\3\uffff\1\71",
            "\1\72\16\uffff\1\73",
            "\1\74\20\uffff\1\75",
            "\1\76\11\uffff\1\77",
            "\1\100\1\uffff\1\101\2\uffff\1\102",
            "\1\103\2\uffff\1\104\1\107\5\uffff\1\106\2\uffff\1\105",
            "\1\110",
            "\1\111",
            "\1\112\1\uffff\1\113\2\uffff\1\114",
            "\1\115",
            "",
            "",
            "",
            "",
            "\1\116\4\uffff\1\117",
            "\1\120",
            "\1\121",
            "\1\122\6\uffff\1\123\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130\10\uffff\1\131\7\uffff\1\132",
            "\12\25\7\uffff\14\25\1\133\15\25\4\uffff\1\25\1\uffff\32\25",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141\3\uffff\1\142",
            "\1\143\5\uffff\1\144\12\uffff\1\145",
            "\1\146",
            "\1\147\14\uffff\1\150",
            "\1\151\1\uffff\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\16\25\1\161\3\25\1\157\1\160\6\25\4\uffff\1"+
            "\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170\7\uffff\1\171",
            "\1\172",
            "\1\173\21\uffff\1\174",
            "\1\175",
            "\1\176",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0080",
            "\1\u0081\1\u0082",
            "\1\u0083\11\uffff\1\u0084",
            "\1\u0085\11\uffff\1\u0086\2\uffff\1\u0087\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b\1\uffff\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f\14\uffff\1\u0090",
            "\1\u0091",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095\3\uffff\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a7\2\uffff\1\u00a6",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "\1\u00be\11\uffff\1\u00bd",
            "\1\u00bf",
            "",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00cc\15\uffff\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0\14\uffff\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00d7",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\10\25\1\u00f8\21\25\4\uffff\1\25\1\uffff\32"+
            "\25",
            "",
            "\1\u00fa",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00fc",
            "\1\u00fd",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00ff",
            "",
            "\1\u0100",
            "\1\u0101",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0110",
            "\1\u0111",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0113",
            "\1\u0114",
            "",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "",
            "\1\u011f",
            "",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0124",
            "\1\u0125",
            "\12\25\7\uffff\22\25\1\u0126\7\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0128",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0132",
            "",
            "",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "",
            "\1\u013c",
            "",
            "\1\u013d",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u013f",
            "",
            "\1\u0140",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0142",
            "",
            "\1\u0143",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "",
            "\1\u0148",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u014a",
            "\1\u014b",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\1\u014d",
            "\1\u014e",
            "",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0161",
            "",
            "\12\25\7\uffff\22\25\1\u0162\7\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0166",
            "",
            "\1\u0167",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u016f",
            "\1\u0170",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\u0176",
            "\1\u0177",
            "",
            "\1\u0178",
            "\1\u0179",
            "",
            "\1\u017a",
            "\1\u017b",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u017d",
            "",
            "\1\u017e",
            "\1\u017f",
            "",
            "\1\u0180",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0182",
            "\1\u0183",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u018b",
            "\12\25\7\uffff\22\25\1\u018c\7\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u018f",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0191",
            "",
            "",
            "\1\u0192",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0195",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0198",
            "\1\u0199",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "",
            "",
            "",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u01a1",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u01a4",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\u01a6",
            "\1\u01a7",
            "",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "",
            "\1\u01ad",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\1\u01af",
            "",
            "\1\u01b0",
            "\1\u01b1",
            "",
            "",
            "\12\25\7\uffff\22\25\1\u01b2\7\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\1\u01b6",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u01b8",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\1\u01bb",
            "",
            "\1\u01bc",
            "\1\u01bd",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u01c6",
            "\1\u01c7",
            "",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\u01c9",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u01cc",
            "",
            "\1\u01cd",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u01d0",
            "",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u01d2",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\1\u01d4",
            "\1\u01d5",
            "",
            "",
            "",
            "",
            "\1\u01d6",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u01d8",
            "\1\u01d9",
            "",
            "\1\u01da",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u01dc",
            "",
            "\1\u01dd",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
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
            return "1:1: Tokens : ( ATOMIC | ATTACH | BEGIN | CALL | CASE | CATALOG | CONSTANT | CONTINUE | CREATE | DECLARE | DELETE | DETACH | DO | DOMAIN | ELSE | ELSEIF | END | ESCAPE | EVAL | EVENT | EXCEPTION | EXIT | EXTERNAL | FOR | FIELD | FIRSTCHILD | FULL | FUNCTION | HANDLER | IDENTITY | IF | IN | INSERT | INTO | IS | ITERATE | INOUT | LASTCHILD | LEAVE | LIKE | LOG | LOOP | MESSAGE | MODULE | MOVE | NAMESPACE | NEXTSIBLING | OF | OUT | PARENT | PARSE | PASSTHRU | PREVIOUSSIBLING | PROCEDURE | PROPAGATE | REFERENCE | REPEAT | RESIGNAL | RETURNS | RETURN | SCHEMA | SET | SEVERITY | SHARED | TERMINAL | THEN | THROW | TRACE | TO | VALUE | VALUES | WHEN | WHILE | UNTIL | UPDATE | USER | BOOLEAN | DATE | TIME | GMTTIME | TIMESTAMP | GMTTIMESTAMP | CHAR | DECIMAL | FLOAT | INTEGER | ROW | ID | COMMENT | WS | STRING );";
        }
    }
 

}