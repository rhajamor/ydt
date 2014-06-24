package org.xtext.editor.yang.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalYangLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__90=90;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=6;
    public static final int RULE_STRING=5;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=8;

    // delegates
    // delegators

    public InternalYangLexer() {;} 
    public InternalYangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalYangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:11:6: ( ';' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:11:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:12:7: ( 'binary' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:12:9: 'binary'
            {
            match("binary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:13:7: ( 'bits' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:13:9: 'bits'
            {
            match("bits"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:14:7: ( 'boolean' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:14:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:15:7: ( 'decimal64' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:15:9: 'decimal64'
            {
            match("decimal64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:16:7: ( 'empty' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:16:9: 'empty'
            {
            match("empty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:17:7: ( 'enumeration' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:17:9: 'enumeration'
            {
            match("enumeration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:18:7: ( 'identityref' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:18:9: 'identityref'
            {
            match("identityref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:19:7: ( 'instance-identifier' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:19:9: 'instance-identifier'
            {
            match("instance-identifier"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:20:7: ( 'int8' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:20:9: 'int8'
            {
            match("int8"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:21:7: ( 'int16' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:21:9: 'int16'
            {
            match("int16"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22:7: ( 'int32' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22:9: 'int32'
            {
            match("int32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:23:7: ( 'int64' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:23:9: 'int64'
            {
            match("int64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:24:7: ( 'leafref' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:24:9: 'leafref'
            {
            match("leafref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:25:7: ( 'string' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:25:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:26:7: ( 'uint8' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:26:9: 'uint8'
            {
            match("uint8"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:27:7: ( 'uint16' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:27:9: 'uint16'
            {
            match("uint16"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:28:7: ( 'uint32' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:28:9: 'uint32'
            {
            match("uint32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:29:7: ( 'uint64' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:29:9: 'uint64'
            {
            match("uint64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:30:7: ( 'union' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:30:9: 'union'
            {
            match("union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:31:7: ( 'default' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:31:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:32:7: ( 'module' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:32:9: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:33:7: ( '{' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:33:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:34:7: ( '}' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:34:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:35:7: ( 'submodule' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:35:9: 'submodule'
            {
            match("submodule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:36:7: ( 'yang-version' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:36:9: 'yang-version'
            {
            match("yang-version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:37:7: ( 'organization' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:37:9: 'organization'
            {
            match("organization"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:38:7: ( 'contact' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:38:9: 'contact'
            {
            match("contact"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:39:7: ( 'description' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:39:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:40:7: ( 'reference' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:40:9: 'reference'
            {
            match("reference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:41:7: ( 'namespace' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:41:9: 'namespace'
            {
            match("namespace"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:42:7: ( 'prefix' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:42:9: 'prefix'
            {
            match("prefix"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:43:7: ( 'require-instance' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:43:9: 'require-instance'
            {
            match("require-instance"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:44:7: ( 'path' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:44:9: 'path'
            {
            match("path"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:45:7: ( 'position' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:45:9: 'position'
            {
            match("position"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:46:7: ( 'value' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:46:9: 'value'
            {
            match("value"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:47:7: ( 'error-app-tag' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:47:9: 'error-app-tag'
            {
            match("error-app-tag"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:48:7: ( 'error-message' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:48:9: 'error-message'
            {
            match("error-message"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:49:7: ( 'units' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:49:9: 'units'
            {
            match("units"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:50:7: ( 'status' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:50:9: 'status'
            {
            match("status"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:51:7: ( 'revision-date' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:51:9: 'revision-date'
            {
            match("revision-date"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:52:7: ( 'unique' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:52:9: 'unique'
            {
            match("unique"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:53:7: ( 'key' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:53:9: 'key'
            {
            match("key"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:54:7: ( 'ordered-by' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:54:9: 'ordered-by'
            {
            match("ordered-by"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:55:7: ( 'presence' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:55:9: 'presence'
            {
            match("presence"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:56:7: ( 'mandatory' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:56:9: 'mandatory'
            {
            match("mandatory"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:57:7: ( 'config' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:57:9: 'config'
            {
            match("config"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:58:7: ( 'fraction-digits' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:58:9: 'fraction-digits'
            {
            match("fraction-digits"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:59:7: ( 'if-feature' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:59:9: 'if-feature'
            {
            match("if-feature"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:60:7: ( ':' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:60:9: ':'
            {
            match(':'); 

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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:61:7: ( 'base' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:61:9: 'base'
            {
            match("base"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:62:7: ( 'yin-element' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:62:9: 'yin-element'
            {
            match("yin-element"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:63:7: ( 'min-elements' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:63:9: 'min-elements'
            {
            match("min-elements"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:64:7: ( 'max-elements' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:64:9: 'max-elements'
            {
            match("max-elements"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:65:7: ( 'range' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:65:9: 'range'
            {
            match("range"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:66:7: ( 'pattern' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:66:9: 'pattern'
            {
            match("pattern"); 


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
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:67:7: ( 'length' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:67:9: 'length'
            {
            match("length"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:68:7: ( 'must' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:68:9: 'must'
            {
            match("must"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:69:7: ( 'rpc' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:69:9: 'rpc'
            {
            match("rpc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:70:7: ( 'input' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:70:9: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:71:7: ( 'output' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:71:9: 'output'
            {
            match("output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:72:7: ( 'notification' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:72:9: 'notification'
            {
            match("notification"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:73:7: ( 'container' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:73:9: 'container'
            {
            match("container"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:74:7: ( 'list' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:74:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:75:7: ( 'grouping' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:75:9: 'grouping'
            {
            match("grouping"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:76:7: ( 'leaf' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:76:9: 'leaf'
            {
            match("leaf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:77:7: ( 'leaf-list' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:77:9: 'leaf-list'
            {
            match("leaf-list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:78:7: ( 'choice' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:78:9: 'choice'
            {
            match("choice"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:79:7: ( 'case' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:79:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:80:7: ( 'any-xml' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:80:9: 'any-xml'
            {
            match("any-xml"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:81:7: ( 'uses' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:81:9: 'uses'
            {
            match("uses"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:82:7: ( 'augment' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:82:9: 'augment'
            {
            match("augment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:83:7: ( 'refine' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:83:9: 'refine'
            {
            match("refine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:84:7: ( 'deviation' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:84:9: 'deviation'
            {
            match("deviation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:85:7: ( 'deviate' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:85:9: 'deviate'
            {
            match("deviate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:86:7: ( 'extension' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:86:9: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:87:7: ( 'argument' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:87:9: 'argument'
            {
            match("argument"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:88:7: ( 'identity' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:88:9: 'identity'
            {
            match("identity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:89:7: ( 'feature' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:89:9: 'feature'
            {
            match("feature"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:90:7: ( 'belongs-to' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:90:9: 'belongs-to'
            {
            match("belongs-to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:91:7: ( 'typedef' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:91:9: 'typedef'
            {
            match("typedef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:92:7: ( 'type' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:92:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:93:7: ( 'bit' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:93:9: 'bit'
            {
            match("bit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:94:7: ( 'enum' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:94:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:95:7: ( 'import' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:95:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:96:7: ( 'include' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:96:9: 'include'
            {
            match("include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:97:7: ( 'when' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:97:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:98:7: ( 'revision' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:98:9: 'revision'
            {
            match("revision"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:99:7: ( '+' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:99:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22330:13: ( ( '\"' ( options {greedy=false; } : . )* '\"' | '\\'' ( options {greedy=false; } : . )* '\\'' ) )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22330:15: ( '\"' ( options {greedy=false; } : . )* '\"' | '\\'' ( options {greedy=false; } : . )* '\\'' )
            {
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22330:15: ( '\"' ( options {greedy=false; } : . )* '\"' | '\\'' ( options {greedy=false; } : . )* '\\'' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\"') ) {
                alt3=1;
            }
            else if ( (LA3_0=='\'') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22330:16: '\"' ( options {greedy=false; } : . )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22330:20: ( options {greedy=false; } : . )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='\"') ) {
                            alt1=2;
                        }
                        else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='\uFFFF')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22330:48: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22330:56: '\\'' ( options {greedy=false; } : . )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22330:61: ( options {greedy=false; } : . )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='\'') ) {
                            alt2=2;
                        }
                        else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='\uFFFF')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22330:89: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22332:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '0' .. '9' )+ )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22332:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '0' .. '9' )+
            {
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22332:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='-' && LA4_0<='.')||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22334:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22334:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22334:24: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22334:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22336:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22336:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22336:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22336:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop6;
                }
            } while (true);

            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22336:40: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22336:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22336:41: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22336:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22338:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22338:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:22338:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | RULE_STRING | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt10=94;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:63: T__18
                {
                mT__18(); 

                }
                break;
            case 11 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:69: T__19
                {
                mT__19(); 

                }
                break;
            case 12 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:75: T__20
                {
                mT__20(); 

                }
                break;
            case 13 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:81: T__21
                {
                mT__21(); 

                }
                break;
            case 14 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:87: T__22
                {
                mT__22(); 

                }
                break;
            case 15 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:93: T__23
                {
                mT__23(); 

                }
                break;
            case 16 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:99: T__24
                {
                mT__24(); 

                }
                break;
            case 17 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:105: T__25
                {
                mT__25(); 

                }
                break;
            case 18 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:111: T__26
                {
                mT__26(); 

                }
                break;
            case 19 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:117: T__27
                {
                mT__27(); 

                }
                break;
            case 20 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:123: T__28
                {
                mT__28(); 

                }
                break;
            case 21 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:129: T__29
                {
                mT__29(); 

                }
                break;
            case 22 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:135: T__30
                {
                mT__30(); 

                }
                break;
            case 23 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:141: T__31
                {
                mT__31(); 

                }
                break;
            case 24 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:147: T__32
                {
                mT__32(); 

                }
                break;
            case 25 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:153: T__33
                {
                mT__33(); 

                }
                break;
            case 26 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:159: T__34
                {
                mT__34(); 

                }
                break;
            case 27 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:165: T__35
                {
                mT__35(); 

                }
                break;
            case 28 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:171: T__36
                {
                mT__36(); 

                }
                break;
            case 29 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:177: T__37
                {
                mT__37(); 

                }
                break;
            case 30 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:183: T__38
                {
                mT__38(); 

                }
                break;
            case 31 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:189: T__39
                {
                mT__39(); 

                }
                break;
            case 32 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:195: T__40
                {
                mT__40(); 

                }
                break;
            case 33 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:201: T__41
                {
                mT__41(); 

                }
                break;
            case 34 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:207: T__42
                {
                mT__42(); 

                }
                break;
            case 35 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:213: T__43
                {
                mT__43(); 

                }
                break;
            case 36 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:219: T__44
                {
                mT__44(); 

                }
                break;
            case 37 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:225: T__45
                {
                mT__45(); 

                }
                break;
            case 38 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:231: T__46
                {
                mT__46(); 

                }
                break;
            case 39 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:237: T__47
                {
                mT__47(); 

                }
                break;
            case 40 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:243: T__48
                {
                mT__48(); 

                }
                break;
            case 41 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:249: T__49
                {
                mT__49(); 

                }
                break;
            case 42 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:255: T__50
                {
                mT__50(); 

                }
                break;
            case 43 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:261: T__51
                {
                mT__51(); 

                }
                break;
            case 44 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:267: T__52
                {
                mT__52(); 

                }
                break;
            case 45 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:273: T__53
                {
                mT__53(); 

                }
                break;
            case 46 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:279: T__54
                {
                mT__54(); 

                }
                break;
            case 47 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:285: T__55
                {
                mT__55(); 

                }
                break;
            case 48 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:291: T__56
                {
                mT__56(); 

                }
                break;
            case 49 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:297: T__57
                {
                mT__57(); 

                }
                break;
            case 50 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:303: T__58
                {
                mT__58(); 

                }
                break;
            case 51 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:309: T__59
                {
                mT__59(); 

                }
                break;
            case 52 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:315: T__60
                {
                mT__60(); 

                }
                break;
            case 53 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:321: T__61
                {
                mT__61(); 

                }
                break;
            case 54 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:327: T__62
                {
                mT__62(); 

                }
                break;
            case 55 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:333: T__63
                {
                mT__63(); 

                }
                break;
            case 56 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:339: T__64
                {
                mT__64(); 

                }
                break;
            case 57 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:345: T__65
                {
                mT__65(); 

                }
                break;
            case 58 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:351: T__66
                {
                mT__66(); 

                }
                break;
            case 59 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:357: T__67
                {
                mT__67(); 

                }
                break;
            case 60 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:363: T__68
                {
                mT__68(); 

                }
                break;
            case 61 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:369: T__69
                {
                mT__69(); 

                }
                break;
            case 62 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:375: T__70
                {
                mT__70(); 

                }
                break;
            case 63 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:381: T__71
                {
                mT__71(); 

                }
                break;
            case 64 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:387: T__72
                {
                mT__72(); 

                }
                break;
            case 65 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:393: T__73
                {
                mT__73(); 

                }
                break;
            case 66 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:399: T__74
                {
                mT__74(); 

                }
                break;
            case 67 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:405: T__75
                {
                mT__75(); 

                }
                break;
            case 68 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:411: T__76
                {
                mT__76(); 

                }
                break;
            case 69 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:417: T__77
                {
                mT__77(); 

                }
                break;
            case 70 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:423: T__78
                {
                mT__78(); 

                }
                break;
            case 71 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:429: T__79
                {
                mT__79(); 

                }
                break;
            case 72 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:435: T__80
                {
                mT__80(); 

                }
                break;
            case 73 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:441: T__81
                {
                mT__81(); 

                }
                break;
            case 74 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:447: T__82
                {
                mT__82(); 

                }
                break;
            case 75 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:453: T__83
                {
                mT__83(); 

                }
                break;
            case 76 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:459: T__84
                {
                mT__84(); 

                }
                break;
            case 77 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:465: T__85
                {
                mT__85(); 

                }
                break;
            case 78 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:471: T__86
                {
                mT__86(); 

                }
                break;
            case 79 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:477: T__87
                {
                mT__87(); 

                }
                break;
            case 80 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:483: T__88
                {
                mT__88(); 

                }
                break;
            case 81 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:489: T__89
                {
                mT__89(); 

                }
                break;
            case 82 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:495: T__90
                {
                mT__90(); 

                }
                break;
            case 83 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:501: T__91
                {
                mT__91(); 

                }
                break;
            case 84 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:507: T__92
                {
                mT__92(); 

                }
                break;
            case 85 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:513: T__93
                {
                mT__93(); 

                }
                break;
            case 86 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:519: T__94
                {
                mT__94(); 

                }
                break;
            case 87 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:525: T__95
                {
                mT__95(); 

                }
                break;
            case 88 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:531: T__96
                {
                mT__96(); 

                }
                break;
            case 89 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:537: T__97
                {
                mT__97(); 

                }
                break;
            case 90 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:543: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 91 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:555: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 92 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:563: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 93 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:579: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 94 :
                // ../org.eclipse.yang.ui/src-gen/org/xtext/editor/yang/ui/contentassist/antlr/internal/InternalYang.g:1:595: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\2\uffff\10\34\2\uffff\11\34\1\uffff\4\34\5\uffff\61\34\2\uffff"+
        "\1\34\1\u0092\54\34\1\u00c6\6\34\1\u00cf\11\34\1\u00d9\1\uffff\1"+
        "\34\1\u00db\6\34\1\u00e3\4\34\1\u00e8\7\34\1\u00f2\1\34\1\u00f4"+
        "\7\34\1\u00ff\4\34\1\u0104\10\34\1\u010d\5\34\1\uffff\4\34\1\u0117"+
        "\3\34\1\uffff\6\34\1\u0122\1\u0123\1\34\1\uffff\1\34\1\uffff\5\34"+
        "\1\u012b\1\34\1\uffff\4\34\1\uffff\1\u0131\1\u0132\1\u0133\1\u0134"+
        "\5\34\1\uffff\1\34\1\uffff\3\34\1\u013e\3\34\1\u0142\1\u0143\1\34"+
        "\1\uffff\4\34\1\uffff\10\34\1\uffff\4\34\1\u0156\4\34\1\uffff\2"+
        "\34\1\u015d\7\34\2\uffff\1\u0165\6\34\1\uffff\5\34\4\uffff\2\34"+
        "\1\u0175\2\34\1\u0178\1\u0179\1\u017a\1\34\1\uffff\1\u017c\1\u017d"+
        "\1\u017e\2\uffff\1\u017f\1\u0180\7\34\1\u0188\2\34\1\u018b\1\u018c"+
        "\1\34\1\u018e\2\34\1\uffff\2\34\1\u0193\3\34\1\uffff\7\34\1\uffff"+
        "\1\u019e\2\34\1\u01a1\2\34\1\u01a4\6\34\1\u01ab\1\34\1\uffff\1\u01ad"+
        "\1\34\3\uffff\1\34\5\uffff\7\34\1\uffff\1\u01b7\1\34\2\uffff\1\34"+
        "\1\uffff\4\34\1\uffff\1\34\1\u01bf\2\34\1\u01c2\1\34\1\u01c4\1\u01c5"+
        "\1\34\1\u01c7\1\uffff\2\34\1\uffff\2\34\1\uffff\4\34\1\u01d1\1\34"+
        "\1\uffff\1\34\1\uffff\11\34\1\uffff\3\34\1\u01e1\2\34\1\u01e4\1"+
        "\uffff\1\u01e5\1\34\1\uffff\1\u01e7\2\uffff\1\u01e8\1\uffff\1\34"+
        "\1\u01ea\1\34\1\u01ec\3\34\1\u01f0\1\34\1\uffff\2\34\1\u01f4\1\u01f5"+
        "\1\u01f6\6\34\1\u01fd\1\u01fe\2\34\1\uffff\1\u0201\1\34\2\uffff"+
        "\1\34\2\uffff\1\u0204\1\uffff\1\34\1\uffff\3\34\1\uffff\2\34\1\u020b"+
        "\3\uffff\5\34\1\u0211\2\uffff\2\34\1\uffff\2\34\1\uffff\1\u0216"+
        "\1\u0217\2\34\1\u021a\1\34\1\uffff\3\34\1\u021f\1\34\1\uffff\4\34"+
        "\2\uffff\2\34\1\uffff\1\34\1\u0228\1\u0229\1\u022a\1\uffff\1\u022b"+
        "\2\34\1\u022e\1\34\1\u0230\1\u0231\1\34\4\uffff\1\34\1\u0234\1\uffff"+
        "\1\34\2\uffff\2\34\1\uffff\3\34\1\u023b\1\34\1\u023d\1\uffff\1\34"+
        "\1\uffff\1\34\1\u0240\1\uffff";
    static final String DFA10_eofS =
        "\u0241\uffff";
    static final String DFA10_minS =
        "\1\11\1\uffff\1\141\1\145\1\155\1\144\1\145\1\164\1\151\1\141\2"+
        "\uffff\1\141\1\162\5\141\2\145\1\uffff\1\162\1\156\1\171\1\150\3"+
        "\uffff\1\52\1\uffff\1\156\1\157\1\163\1\154\1\143\1\160\1\165\1"+
        "\162\1\164\1\145\1\143\1\55\1\160\1\141\1\163\1\141\1\142\1\156"+
        "\1\151\1\145\1\144\2\156\1\163\2\156\1\144\1\164\1\156\1\157\1\163"+
        "\1\146\1\156\1\143\1\155\1\164\1\145\1\164\1\163\1\154\1\171\2\141"+
        "\1\157\1\171\2\147\1\160\1\145\2\uffff\1\141\1\55\1\154\1\145\1"+
        "\157\1\151\1\141\1\143\1\151\1\164\1\155\1\157\1\145\1\156\1\164"+
        "\1\61\1\165\1\154\1\146\1\157\1\146\1\147\1\164\1\151\1\164\1\155"+
        "\1\164\1\157\1\163\1\165\1\144\2\55\1\164\1\147\1\55\1\141\1\145"+
        "\1\160\1\146\1\151\2\145\1\165\1\151\1\147\1\55\1\145\1\151\1\146"+
        "\1\150\1\151\1\165\1\55\1\143\1\164\1\165\1\55\1\155\1\165\1\145"+
        "\1\156\1\162\1\55\1\uffff\1\145\1\55\1\156\1\155\1\165\1\162\1\141"+
        "\1\171\1\55\1\162\1\156\1\164\1\141\1\55\1\66\1\62\1\64\1\164\1"+
        "\165\1\145\1\162\1\55\1\164\1\55\1\156\1\165\1\157\1\61\1\156\1"+
        "\163\1\165\1\55\1\154\1\141\2\145\2\55\1\145\1\156\1\162\1\165\1"+
        "\141\1\151\1\143\1\55\1\162\1\156\1\151\1\163\1\145\1\uffff\1\163"+
        "\1\146\1\151\1\145\1\55\1\145\1\164\1\145\1\uffff\1\164\1\165\1"+
        "\160\1\170\1\145\1\155\2\55\1\171\1\uffff\1\141\1\uffff\1\147\1"+
        "\141\1\154\1\151\1\164\1\55\1\162\1\uffff\1\55\1\163\1\151\1\156"+
        "\1\uffff\4\55\1\144\1\141\1\164\1\145\1\154\1\uffff\1\150\1\uffff"+
        "\1\147\1\163\1\144\1\55\1\66\1\62\1\64\2\55\1\145\1\uffff\1\145"+
        "\1\164\2\154\1\uffff\1\166\1\154\1\151\1\145\1\164\1\143\1\147\1"+
        "\145\1\uffff\2\145\1\162\1\151\1\55\1\160\1\151\1\170\1\156\1\uffff"+
        "\1\162\1\151\1\55\1\151\1\162\1\151\1\155\1\156\2\145\2\uffff\1"+
        "\55\1\156\1\163\1\154\1\164\1\160\1\145\1\uffff\2\141\1\151\1\164"+
        "\1\143\4\uffff\1\145\1\164\1\55\1\146\1\151\3\55\1\165\1\uffff\3"+
        "\55\2\uffff\2\55\1\157\4\145\1\172\1\144\1\55\1\164\1\156\2\55\1"+
        "\156\1\55\1\145\1\157\1\uffff\1\141\1\143\1\55\1\143\1\156\1\157"+
        "\1\uffff\1\157\1\145\1\156\1\154\1\164\1\156\1\146\1\uffff\2\55"+
        "\1\66\1\55\1\164\1\157\1\55\1\164\1\160\1\145\1\157\1\171\1\145"+
        "\1\55\1\165\1\uffff\1\55\1\163\3\uffff\1\154\5\uffff\1\162\2\155"+
        "\1\162\1\155\1\141\1\55\1\uffff\1\55\1\145\2\uffff\1\143\1\uffff"+
        "\1\55\1\156\1\143\1\141\1\uffff\1\145\1\55\2\156\1\55\1\147\2\55"+
        "\1\164\1\55\1\uffff\1\164\1\64\1\uffff\1\151\1\156\1\uffff\1\151"+
        "\1\160\1\163\1\156\2\55\1\uffff\1\162\1\uffff\1\164\1\145\1\171"+
        "\2\145\1\163\1\145\1\164\1\142\1\uffff\1\162\1\145\1\151\1\55\1"+
        "\145\1\164\1\55\1\uffff\2\55\1\uffff\1\55\2\uffff\1\55\1\uffff\1"+
        "\157\1\55\1\157\1\55\1\157\1\55\1\163\1\55\1\145\1\uffff\1\151\1"+
        "\145\3\55\2\156\1\151\1\156\1\151\1\171\2\55\1\156\1\144\1\uffff"+
        "\1\55\1\151\2\uffff\1\144\2\uffff\1\55\1\uffff\1\156\1\uffff\1\156"+
        "\1\164\1\141\1\uffff\1\146\1\144\1\55\3\uffff\2\164\1\157\1\164"+
        "\1\157\1\55\2\uffff\1\163\1\141\1\uffff\1\157\1\151\1\uffff\2\55"+
        "\1\141\1\147\1\55\1\145\1\uffff\2\163\1\156\1\55\1\156\1\uffff\2"+
        "\164\1\156\1\147\2\uffff\1\147\1\145\1\uffff\1\156\3\55\1\uffff"+
        "\1\55\1\141\1\145\1\55\1\151\2\55\1\164\4\uffff\1\156\1\55\1\uffff"+
        "\1\164\2\uffff\1\151\1\143\1\uffff\1\163\1\146\1\145\1\55\1\151"+
        "\1\55\1\uffff\1\145\1\uffff\1\162\1\55\1\uffff";
    static final String DFA10_maxS =
        "\1\175\1\uffff\1\157\1\145\1\170\1\156\1\151\1\165\1\163\1\165"+
        "\2\uffff\1\151\1\165\1\157\1\160\1\157\1\162\1\141\1\145\1\162\1"+
        "\uffff\1\162\1\165\1\171\1\150\3\uffff\1\57\1\uffff\1\164\1\157"+
        "\1\163\1\154\1\166\1\160\1\165\1\162\1\164\1\145\1\164\1\55\1\160"+
        "\1\156\1\163\1\162\1\142\1\156\1\151\1\145\1\144\1\170\1\156\1\163"+
        "\2\156\1\147\1\164\1\156\1\157\1\163\1\166\1\156\1\143\1\155\1\164"+
        "\1\145\1\164\1\163\1\154\1\171\2\141\1\157\1\171\2\147\1\160\1\145"+
        "\2\uffff\1\141\1\172\1\154\1\145\1\157\1\151\1\141\1\143\1\151\1"+
        "\164\1\155\1\157\1\145\1\156\1\164\1\70\1\165\1\154\1\146\1\157"+
        "\1\146\1\147\1\164\1\151\1\164\1\155\2\164\1\163\1\165\1\144\2\55"+
        "\1\164\1\147\1\55\1\141\1\145\1\160\1\164\1\151\1\145\1\151\1\165"+
        "\1\151\1\147\1\172\1\145\1\151\1\163\1\164\1\151\1\165\1\172\1\143"+
        "\1\164\1\165\1\55\1\155\1\165\1\145\1\156\1\162\1\172\1\uffff\1"+
        "\145\1\172\1\156\1\155\1\165\1\162\1\141\1\171\1\172\1\162\1\156"+
        "\1\164\1\141\1\172\1\66\1\62\1\64\1\164\1\165\1\145\1\162\1\172"+
        "\1\164\1\172\1\156\1\165\1\157\1\70\1\156\1\163\1\165\1\172\1\154"+
        "\1\141\2\145\1\172\1\55\1\145\1\156\1\162\1\165\1\141\1\151\1\143"+
        "\1\172\1\162\1\156\1\151\1\163\1\145\1\uffff\1\163\1\146\1\151\1"+
        "\145\1\172\1\145\1\164\1\145\1\uffff\1\164\1\165\1\160\1\170\1\145"+
        "\1\155\2\172\1\171\1\uffff\1\141\1\uffff\1\147\1\141\1\154\1\151"+
        "\1\164\1\172\1\162\1\uffff\1\55\1\163\1\151\1\156\1\uffff\4\172"+
        "\1\144\1\141\1\164\1\145\1\154\1\uffff\1\150\1\uffff\1\147\1\163"+
        "\1\144\1\172\1\66\1\62\1\64\2\172\1\145\1\uffff\1\145\1\164\2\154"+
        "\1\uffff\1\166\1\154\1\151\1\145\1\164\1\151\1\147\1\145\1\uffff"+
        "\2\145\1\162\1\151\1\172\1\160\1\151\1\170\1\156\1\uffff\1\162\1"+
        "\151\1\172\1\151\1\162\1\151\1\155\1\156\2\145\2\uffff\1\172\1\156"+
        "\1\163\1\154\1\164\1\160\1\151\1\uffff\1\141\1\155\1\151\1\164\1"+
        "\143\4\uffff\1\145\1\164\1\172\1\146\1\151\3\172\1\165\1\uffff\3"+
        "\172\2\uffff\2\172\1\157\4\145\1\172\1\144\1\172\1\164\1\156\2\172"+
        "\1\156\1\172\1\145\1\157\1\uffff\1\141\1\143\1\172\1\143\1\156\1"+
        "\157\1\uffff\1\157\1\145\1\156\1\154\1\164\1\156\1\146\1\uffff\1"+
        "\172\1\55\1\66\1\172\1\164\1\157\1\172\1\164\1\160\1\145\1\157\1"+
        "\171\1\145\1\172\1\165\1\uffff\1\172\1\163\3\uffff\1\154\5\uffff"+
        "\1\162\2\155\1\162\1\155\1\141\1\55\1\uffff\1\172\1\145\2\uffff"+
        "\1\143\1\uffff\1\55\1\156\1\143\1\141\1\uffff\1\145\1\172\2\156"+
        "\1\172\1\147\2\172\1\164\1\172\1\uffff\1\164\1\64\1\uffff\1\151"+
        "\1\156\1\uffff\1\151\1\160\1\163\1\156\1\172\1\55\1\uffff\1\162"+
        "\1\uffff\1\164\1\145\1\171\2\145\1\163\1\145\1\164\1\142\1\uffff"+
        "\1\162\1\145\1\151\1\172\1\145\1\164\1\172\1\uffff\1\172\1\55\1"+
        "\uffff\1\172\2\uffff\1\172\1\uffff\1\157\1\172\1\157\1\172\1\157"+
        "\1\55\1\163\1\172\1\145\1\uffff\1\151\1\145\3\172\2\156\1\151\1"+
        "\156\1\151\1\171\2\172\1\156\1\144\1\uffff\1\172\1\151\2\uffff\1"+
        "\144\2\uffff\1\172\1\uffff\1\156\1\uffff\1\156\1\164\1\141\1\uffff"+
        "\1\146\1\144\1\172\3\uffff\2\164\1\157\1\164\1\157\1\172\2\uffff"+
        "\1\163\1\141\1\uffff\1\157\1\151\1\uffff\2\172\1\141\1\147\1\172"+
        "\1\145\1\uffff\2\163\1\156\1\172\1\156\1\uffff\2\164\1\156\1\147"+
        "\2\uffff\1\147\1\145\1\uffff\1\156\3\172\1\uffff\1\172\1\141\1\145"+
        "\1\172\1\151\2\172\1\164\4\uffff\1\156\1\172\1\uffff\1\164\2\uffff"+
        "\1\151\1\143\1\uffff\1\163\1\146\1\145\1\172\1\151\1\172\1\uffff"+
        "\1\145\1\uffff\1\162\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\10\uffff\1\27\1\30\11\uffff\1\62\4\uffff\1\131\1\132"+
        "\1\133\1\uffff\1\136\61\uffff\1\134\1\135\100\uffff\1\123\63\uffff"+
        "\1\73\10\uffff\1\53\11\uffff\1\3\1\uffff\1\63\7\uffff\1\124\4\uffff"+
        "\1\12\11\uffff\1\102\1\uffff\1\100\12\uffff\1\107\4\uffff\1\72\10"+
        "\uffff\1\105\11\uffff\1\42\12\uffff\1\122\1\127\7\uffff\1\6\5\uffff"+
        "\1\13\1\14\1\15\1\74\11\uffff\1\20\3\uffff\1\24\1\47\22\uffff\1"+
        "\67\6\uffff\1\44\7\uffff\1\2\17\uffff\1\125\2\uffff\1\71\1\17\1"+
        "\50\1\uffff\1\21\1\22\1\23\1\52\1\26\7\uffff\1\75\2\uffff\1\57\1"+
        "\104\1\uffff\1\111\4\uffff\1\40\12\uffff\1\4\2\uffff\1\25\2\uffff"+
        "\1\113\6\uffff\1\126\1\uffff\1\16\11\uffff\1\34\7\uffff\1\70\2\uffff"+
        "\1\117\1\uffff\1\106\1\110\1\uffff\1\121\11\uffff\1\116\17\uffff"+
        "\1\130\2\uffff\1\55\1\43\1\uffff\1\101\1\115\1\uffff\1\5\1\uffff"+
        "\1\112\3\uffff\1\114\3\uffff\1\103\1\31\1\56\6\uffff\1\77\1\36\2"+
        "\uffff\1\37\2\uffff\1\120\6\uffff\1\61\5\uffff\1\54\4\uffff\1\35"+
        "\1\7\2\uffff\1\10\4\uffff\1\64\10\uffff\1\66\1\65\1\32\1\33\2\uffff"+
        "\1\76\1\uffff\1\45\1\46\2\uffff\1\51\6\uffff\1\60\1\uffff\1\41\2"+
        "\uffff\1\11";
    static final String DFA10_specialS =
        "\u0241\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\36\2\uffff\1\36\22\uffff\1\36\1\uffff\1\33\4\uffff\1\33"+
            "\3\uffff\1\32\1\uffff\2\34\1\35\12\34\1\25\1\1\5\uffff\32\34"+
            "\4\uffff\1\34\1\uffff\1\27\1\2\1\16\1\3\1\4\1\24\1\26\1\34\1"+
            "\5\1\34\1\23\1\6\1\11\1\20\1\15\1\21\1\34\1\17\1\7\1\30\1\10"+
            "\1\22\1\31\1\34\1\14\1\34\1\12\1\uffff\1\13",
            "",
            "\1\41\3\uffff\1\42\3\uffff\1\37\5\uffff\1\40",
            "\1\43",
            "\1\44\1\45\3\uffff\1\46\5\uffff\1\47",
            "\1\50\1\uffff\1\52\6\uffff\1\53\1\51",
            "\1\54\3\uffff\1\55",
            "\1\56\1\57",
            "\1\60\4\uffff\1\61\4\uffff\1\62",
            "\1\64\7\uffff\1\65\5\uffff\1\63\5\uffff\1\66",
            "",
            "",
            "\1\67\7\uffff\1\70",
            "\1\71\2\uffff\1\72",
            "\1\75\6\uffff\1\74\6\uffff\1\73",
            "\1\77\3\uffff\1\76\12\uffff\1\100",
            "\1\101\15\uffff\1\102",
            "\1\104\15\uffff\1\105\2\uffff\1\103",
            "\1\106",
            "\1\107",
            "\1\111\14\uffff\1\110",
            "",
            "\1\112",
            "\1\113\3\uffff\1\115\2\uffff\1\114",
            "\1\116",
            "\1\117",
            "",
            "",
            "",
            "\1\120\4\uffff\1\121",
            "",
            "\1\122\5\uffff\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127\2\uffff\1\130\14\uffff\1\131\2\uffff\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\143\14\uffff\1\142\2\uffff\1\140\1\141",
            "\1\144",
            "\1\145",
            "\1\146\14\uffff\1\147",
            "\1\150",
            "\1\152\20\uffff\1\151",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160\11\uffff\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\167\2\uffff\1\166",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174\12\uffff\1\175\4\uffff\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "",
            "\1\u0090",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\22"+
            "\34\1\u0091\7\34",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a1\1\uffff\1\u00a2\2\uffff\1\u00a3\1\uffff\1\u00a0",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af\1\uffff\1\u00b1\2\uffff\1\u00b0",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00be\15\uffff\1\u00bd",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1\3\uffff\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9\14\uffff\1\u00ca",
            "\1\u00cb\13\uffff\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "",
            "\1\u00da",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\4\34"+
            "\1\u00e2\25\34",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f1\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff"+
            "\21\34\1\u00f0\10\34",
            "\1\u00f3",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f9\1\uffff\1\u00fa\2\uffff\1\u00fb\1\uffff\1\u00f8",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\3\34"+
            "\1\u0121\26\34",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u0124",
            "",
            "\1\u0125",
            "",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u012c",
            "",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "",
            "\1\u013a",
            "",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u0144",
            "",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e\5\uffff\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "",
            "\1\u015b",
            "\1\u015c",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "",
            "",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016c\3\uffff\1\u016b",
            "",
            "\1\u016d",
            "\1\u016e\13\uffff\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "",
            "",
            "",
            "",
            "\1\u0173",
            "\1\u0174",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u0176",
            "\1\u0177",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u017b",
            "",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "",
            "",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u0189",
            "\1\u018a",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u018d",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u018f",
            "\1\u0190",
            "",
            "\1\u0191",
            "\1\u0192",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u019f",
            "\1\u01a0",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u01a2",
            "\1\u01a3",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u01ac",
            "",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u01ae",
            "",
            "",
            "",
            "\1\u01af",
            "",
            "",
            "",
            "",
            "",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u01b8",
            "",
            "",
            "\1\u01b9",
            "",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "",
            "\1\u01be",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u01c0",
            "\1\u01c1",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u01c3",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u01c6",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "",
            "\1\u01c8",
            "\1\u01c9",
            "",
            "\1\u01ca",
            "\1\u01cb",
            "",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\21"+
            "\34\1\u01d0\10\34",
            "\1\u01d2",
            "",
            "\1\u01d3",
            "",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff"+
            "\32\34",
            "\1\u01e2",
            "\1\u01e3",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u01e6",
            "",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "",
            "",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "",
            "\1\u01e9",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u01eb",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u01f1",
            "",
            "\1\u01f2",
            "\1\u01f3",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u01ff",
            "\1\u0200",
            "",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u0202",
            "",
            "",
            "\1\u0203",
            "",
            "",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "",
            "\1\u0205",
            "",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "",
            "\1\u0209",
            "\1\u020a",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "",
            "",
            "",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "",
            "",
            "\1\u0212",
            "\1\u0213",
            "",
            "\1\u0214",
            "\1\u0215",
            "",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u0218",
            "\1\u0219",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u021b",
            "",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u0220",
            "",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "\1\u0224",
            "",
            "",
            "\1\u0225",
            "\1\u0226",
            "",
            "\1\u0227",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u022c",
            "\1\u022d",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u022f",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u0232",
            "",
            "",
            "",
            "",
            "\1\u0233",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "",
            "\1\u0235",
            "",
            "",
            "\1\u0236",
            "\1\u0237",
            "",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u023c",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "",
            "\1\u023e",
            "",
            "\1\u023f",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
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
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | RULE_STRING | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
    }
 

}