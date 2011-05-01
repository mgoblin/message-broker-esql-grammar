// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g 2011-05-01 11:32:51

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class esqlParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATOMIC", "ATTACH", "BEGIN", "CALL", "CASE", "CATALOG", "CONSTANT", "CONTINUE", "CREATE", "DECLARE", "DELETE", "DETACH", "DO", "DOMAIN", "ELSE", "ELSEIF", "END", "ESCAPE", "EVAL", "EVENT", "EXCEPTION", "EXIT", "EXTERNAL", "FOR", "FIELD", "FIRSTCHILD", "FULL", "FUNCTION", "HANDLER", "IDENTITY", "IF", "IN", "INSERT", "INTO", "IS", "ITERATE", "INOUT", "LASTCHILD", "LEAVE", "LIKE", "LOG", "LOOP", "MESSAGE", "MODULE", "MOVE", "NAMESPACE", "NEXTSIBLING", "OF", "OUT", "PARENT", "PARSE", "PASSTHRU", "PREVIOUSSIBLING", "PROCEDURE", "PROPAGATE", "REFERENCE", "REPEAT", "RESIGNAL", "RETURNS", "RETURN", "SCHEMA", "SET", "SEVERITY", "SHARED", "TERMINAL", "THEN", "THROW", "TRACE", "TO", "VALUE", "VALUES", "WHEN", "WHILE", "UNTIL", "UPDATE", "USER", "BOOLEAN", "DATE", "TIME", "GMTTIME", "TIMESTAMP", "GMTTIMESTAMP", "CHAR", "DECIMAL", "FLOAT", "INTEGER", "ROW", "ID", "COMMENT", "WS", "ESC_SEQ", "STRING", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC"
    };
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
    public static final int INSERT=36;
    public static final int ESCAPE=21;
    public static final int BEGIN=6;
    public static final int LOOP=45;
    public static final int RETURN=63;
    public static final int GMTTIME=83;
    public static final int COMMENT=92;
    public static final int PASSTHRU=55;
    public static final int ATTACH=5;
    public static final int INTO=37;
    public static final int HANDLER=32;
    public static final int PROPAGATE=58;
    public static final int EXCEPTION=24;
    public static final int EXIT=25;
    public static final int SHARED=67;
    public static final int ELSE=18;
    public static final int CATALOG=9;
    public static final int DELETE=14;
    public static final int VALUE=73;
    public static final int OF=51;
    public static final int NAMESPACE=49;
    public static final int RESIGNAL=61;
    public static final int WS=93;
    public static final int EVAL=22;
    public static final int OUT=52;
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
    public static final int MOVE=48;
    public static final int WHEN=75;
    public static final int DECLARE=13;
    public static final int DATE=81;
    public static final int STRING=95;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", 
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public esqlParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public esqlParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public esqlParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return esqlParser.tokenNames; }
    public String getGrammarFileName() { return "/home/mike/IdeaProjects/ESQL Grammar/grammar/esql.g"; }



    // Delegated rules


 

}