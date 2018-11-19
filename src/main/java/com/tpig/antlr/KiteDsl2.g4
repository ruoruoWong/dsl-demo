grammar KiteDsl2;

/*
  class xxx.xxx.User[] -> /Users/User {
    id -> Id;
    name -> Name;
    (roleList[] -> Roles/Role){
      id -> Id;
      name -> Name;
      (subRole[] -> SubRoles/SubRole){
        id -> Id;
        name -> Name;
      };
    }
    (group -> Group){
      id -> Id;
      name -> Name;
    }
  }
*/
expr
  : 'class' SPACE* packageName '.' className SPACE* ARROW SPACE* path SPACE* objectBodyExpr
  ;

objectBodyExpr
  : LBRACE NEWLINE SPACE* singleFieldExpr (singleFieldExpr)* SPACE* RBRACE
  ;

singleFieldExpr
  : SPACE* normalFieldExpr SEMI NEWLINE
  | SPACE* objectFieldExpr SEMI NEWLINE
  ;

/*
  (group -> Group){
        id -> Id;
        name -> Name;
      }
*/
objectFieldExpr
  : LPAREN SPACE* fieldName SPACE* ARROW SPACE* path SPACE* RPAREN objectBodyExpr
  ;

/*
  id -> Id;
  (name -> Name);
*/
normalFieldExpr
  : fieldName SPACE* ARROW SPACE* path
  | LPAREN SPACE* fieldName SPACE* ARROW SPACE* path SPACE* RPAREN
  ;

className
  : Identifier
  | Identifier LBRACK RBRACK
  ;

/*
  name;
  roleList[];
*/
fieldName
  : Identifier
  | Identifier LBRACK RBRACK
  ;

packageName
	:	Identifier
	|	packageName '.' Identifier
	;

path
  : pathPiece pathPiece*
  ;

pathPiece
  : '/' Identifier
  | Identifier
  ;

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

SPACE : ' ';
ARROW : '->';
COLON : ':';
LBRACE : '{';
RBRACE : '}';
LPAREN : '(';
RPAREN : ')';
LBRACK : '[';
RBRACK : ']';
DOT : '.';
SEMI : ';';
NEWLINE : '\r'? '\n' ;