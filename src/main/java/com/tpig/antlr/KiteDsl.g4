grammar KiteDsl;

/*
   * roleList[0].roleName
   * name
   * age
   * birthday(default:19900301,format:yyyyMMdd)
*/
expr
  : multipleCommonFieldName
  ;

multipleCommonFieldName
  : (oneCommonFieldName NEWLINE)+
  ;

oneCommonFieldName
  : commonFieldName (DOT commonFieldName)*
  ;

commonFieldName
  : simpleFieldName
  | arrayFieldName
  ;

simpleFieldName
  : Identifier
  | Identifier LPAREN defaultExpr RPAREN
  | Identifier LPAREN formatExpr RPAREN
  | Identifier LPAREN defaultExpr ',' formatExpr RPAREN
  ;

arrayFieldName
  : Identifier LBRACK Digits RBRACK
  ;

defaultExpr
  : 'default' COLON defaultValue
  ;

formatExpr
  : 'format' COLON formatValue
  ;

defaultValue
  : Identifier
  ;

formatValue
  : Identifier
  ;
/*
*
*/
Identifier
	:	JavaLetter JavaLetterOrDigit*
	;

Digits
	:	Digit (Digit)*
	;

fragment
JavaLetter
  :	[a-zA-Z$_] // these are the "java letters" below 0x7F
  |	// covers all characters above 0x7F which are not a surrogate
    ~[\u0000-\u007F\uD800-\uDBFF]
    {Character.isJavaIdentifierStart(_input.LA(-1))}?
  |	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
    [\uD800-\uDBFF] [\uDC00-\uDFFF]
    {Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
  ;

fragment
JavaLetterOrDigit
  :	[a-zA-Z0-9$_] // these are the "java letters or digits" below 0x7F
  |	// covers all characters above 0x7F which are not a surrogate
    ~[\u0000-\u007F\uD800-\uDBFF]
    {Character.isJavaIdentifierPart(_input.LA(-1))}?
  |	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
    [\uD800-\uDBFF] [\uDC00-\uDFFF]
    {Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
  	;

fragment
Digit
	:	'0'
	|	NonZeroDigit
	;

fragment
NonZeroDigit
	:	[1-9]
	;

COLON : ':';
LPAREN : '(';
RPAREN : ')';
LBRACK : '[';
RBRACK : ']';
DOT : '.';
NEWLINE : '\r'? '\n' ;