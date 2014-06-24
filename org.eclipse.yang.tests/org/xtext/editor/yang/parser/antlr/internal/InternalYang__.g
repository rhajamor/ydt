lexer grammar InternalYang;
@header {
package org.xtext.editor.yang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T9 : 'module' ;
T10 : '{' ;
T11 : '}' ;
T12 : 'submodule' ;
T13 : 'yang-version' ;
T14 : ';' ;
T15 : 'organization' ;
T16 : 'contact' ;
T17 : 'description' ;
T18 : 'reference' ;
T19 : 'namespace' ;
T20 : 'prefix' ;
T21 : 'require-instance' ;
T22 : 'path' ;
T23 : 'position' ;
T24 : 'value' ;
T25 : 'error-app-tag' ;
T26 : 'error-message' ;
T27 : 'units' ;
T28 : 'default' ;
T29 : 'status' ;
T30 : 'revision-date' ;
T31 : 'unique' ;
T32 : 'key' ;
T33 : 'ordered-by' ;
T34 : 'presence' ;
T35 : 'mandatory' ;
T36 : 'config' ;
T37 : 'fraction-digits' ;
T38 : 'if-feature' ;
T39 : ':' ;
T40 : 'base' ;
T41 : 'yin-element' ;
T42 : 'min-elements' ;
T43 : 'max-elements' ;
T44 : 'range' ;
T45 : 'pattern' ;
T46 : 'length' ;
T47 : 'must' ;
T48 : 'rpc' ;
T49 : 'input' ;
T50 : 'output' ;
T51 : 'notification' ;
T52 : 'container' ;
T53 : 'list' ;
T54 : 'grouping' ;
T55 : 'leaf' ;
T56 : 'leaf-list' ;
T57 : 'choice' ;
T58 : 'case' ;
T59 : 'any-xml' ;
T60 : 'uses' ;
T61 : 'augment' ;
T62 : 'refine' ;
T63 : 'deviation' ;
T64 : 'deviate' ;
T65 : 'extension' ;
T66 : 'argument' ;
T67 : 'identity' ;
T68 : 'feature' ;
T69 : 'belongs-to' ;
T70 : 'typedef' ;
T71 : 'type' ;
T72 : 'bit' ;
T73 : 'enum' ;
T74 : 'import' ;
T75 : 'include' ;
T76 : 'when' ;
T77 : 'revision' ;
T78 : 'binary' ;
T79 : 'bits' ;
T80 : 'boolean' ;
T81 : 'decimal64' ;
T82 : 'empty' ;
T83 : 'enumeration' ;
T84 : 'identityref' ;
T85 : 'instance-identifier' ;
T86 : 'int8' ;
T87 : 'int16' ;
T88 : 'int32' ;
T89 : 'int64' ;
T90 : 'leafref' ;
T91 : 'string' ;
T92 : 'uint8' ;
T93 : 'uint16' ;
T94 : 'uint32' ;
T95 : 'uint64' ;
T96 : 'union' ;
T97 : '+' ;

// $ANTLR src "../org.xtext.editor.yang/src-gen/org/xtext/editor/yang/parser/antlr/internal/InternalYang.g" 10140
RULE_STRING : ('"' ( options {greedy=false;} : . )*'"'|'\'' ( options {greedy=false;} : . )*'\'');

// $ANTLR src "../org.xtext.editor.yang/src-gen/org/xtext/editor/yang/parser/antlr/internal/InternalYang.g" 10142
RULE_ID : ('a'..'z'|'A'..'Z'|'_'|'-'|'.'|'0'..'9')+;

// $ANTLR src "../org.xtext.editor.yang/src-gen/org/xtext/editor/yang/parser/antlr/internal/InternalYang.g" 10144
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.editor.yang/src-gen/org/xtext/editor/yang/parser/antlr/internal/InternalYang.g" 10146
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.editor.yang/src-gen/org/xtext/editor/yang/parser/antlr/internal/InternalYang.g" 10148
RULE_WS : (' '|'\t'|'\r'|'\n')+;


