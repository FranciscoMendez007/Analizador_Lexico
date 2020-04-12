package codigo;
import java.io.*;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
ES=[" "]
PA=["("]
PC=[")"]
S=["+"|"-"]
E=["**"]
V=""
SL=[\n]
D=[0-9]+
L=[a-zA-Z]+
CA = "\""[^*]~"\"" | "\"" + "\""
espacio=[ ,\t,\r,\n]+
tDato=[entero,cadena,flotante,caracter]+
%{
    public String lexeme;
    public int linea;

%}
%%


/*PALABRAS REERVADAS*/
/*Por completar*/

<YYINITIAL> ("importar")    {linea = yyline; lexeme=yytext(); return importar;}
<YYINITIAL> ("clase")       {linea = yyline; lexeme=yytext(); return clase;}
<YYINITIAL> ("prepVa")      {linea = yyline; lexeme=yytext(); return prepVa;}
<YYINITIAL> ("ciclo")       {linea = yyline; lexeme=yytext(); return ciclo;}
<YYINITIAL> ("Fun")         {linea = yyline; lexeme=yytext(); return fun;}
<YYINITIAL> ("desde")       {linea = yyline; lexeme=yytext(); return desde;}
<YYINITIAL> ("si")          {linea = yyline; lexeme=yytext(); return si;}
<YYINITIAL> ("sino")        {linea = yyline; lexeme=yytext(); return sino;}
<YYINITIAL> ("entonces")    {linea = yyline; lexeme=yytext(); return entonces;}
<YYINITIAL> ("para")        {linea = yyline; lexeme=yytext(); return para;}
<YYINITIAL> ("hasta")       {linea = yyline; lexeme=yytext(); return hasta;}
<YYINITIAL> ("mientras")    {linea = yyline; lexeme=yytext(); return mientras;}
<YYINITIAL> ("hacer")       {linea = yyline; lexeme=yytext(); return hacer;}
<YYINITIAL> ("mostrar")     {linea = yyline; lexeme=yytext(); return mostrar;}
<YYINITIAL> ("entrada")     {linea = yyline; lexeme=yytext(); return entrada;}
<YYINITIAL> ("ent")         {linea = yyline; lexeme=yytext(); return ent;}
<YYINITIAL> ("flot")        {linea = yyline; lexeme=yytext(); return flot;}
<YYINITIAL> ("dob")         {linea = yyline; lexeme=yytext(); return dob;}
<YYINITIAL> ("car")         {linea = yyline; lexeme=yytext(); return car;}
<YYINITIAL> ("retorno")     {linea = yyline; lexeme=yytext(); return retorno;}
<YYINITIAL> ("cadena")      {linea = yyline; lexeme=yytext(); return cadena;}
<YYINITIAL> ("daFec")       {linea = yyline; lexeme=yytext(); return daFec;}
<YYINITIAL> ("daHor")       {linea = yyline; lexeme=yytext(); return daHor;}
<YYINITIAL> ("nulo")        {linea = yyline; lexeme=yytext(); return nulo;}
<YYINITIAL> ("bit")         {linea = yyline; lexeme=yytext(); return bit;}
<YYINITIAL> ("falso")       {linea = yyline; lexeme=yytext(); return falso;}
<YYINITIAL> ("verdadero")   {linea = yyline; lexeme=yytext(); return verdadero;}
<YYINITIAL> ("errorVerd")   {linea = yyline; lexeme=yytext(); return errorVerd;}
<YYINITIAL> ("errorFalso")  {linea = yyline; lexeme=yytext(); return errorFalso;}
<YYINITIAL> ("retraso")     {linea = yyline; lexeme=yytext(); return retraso;}
<YYINITIAL> ("EscDig")      {linea = yyline; lexeme=yytext(); return EscDig;}
<YYINITIAL> ("EscAnalogica") {linea = yyline; lexeme=yytext(); return EscAnalogica;}
<YYINITIAL> ("LecDig")      {linea = yyline; lexeme=yytext(); return LecDig;}
<YYINITIAL> ("LecAnalogica") {clinea = yyline; lexeme=yytext(); return LecAnalogica;}
<YYINITIAL> ("pinModo")     {linea = yyline; lexeme=yytext(); return pinModo;}
<YYINITIAL> ("alto")        {linea = yyline; lexeme=yytext(); return alto;}
<YYINITIAL> ("bajo")        {linea = yyline; lexeme=yytext(); return bajo;}
<YYINITIAL> ("salidaMod")   {linea = yyline; lexeme=yytext(); return salidaMod;}
<YYINITIAL> ("entradaMod")  {linea = yyline; lexeme=yytext(); return entradaMod;}
<YYINITIAL> ("SERIAL")      {linea = yyline; lexeme=yytext(); return SERIAL;}
<YYINITIAL> ("cambio")      {linea = yyline; lexeme=yytext(); return cambio;}
<YYINITIAL> ("caso")        {linea = yyline; lexeme=yytext(); return caso;}
<YYINITIAL> ("terminar")    {linea = yyline; lexeme=yytext(); return terminar;}
<YYINITIAL> ("leer")        {linea = yyline; lexeme=yytext(); return leer;}

/*======================================================================================================================*/
/*OPERADORES LOGICOS*/

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {linea = yyline; lexeme=yytext(); return Op_logico;}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {linea = yyline; lexeme=yytext(); return Op_relacional;}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" | "=" ) {linea = yyline; lexeme=yytext(); return Op_atribucion;}

/* Operadores Incremento y decremento */
( "++" | "--" ) {linea = yyline; lexeme=yytext(); return Op_incremento;}
/*Operadores Booleanos*/
( true | false ) {linea = yyline; lexeme=yytext(); return Op_booleano;}

/* Parentesis de apertura */
( "(" ) {linea = yyline; lexeme=yytext(); return Parentesis_a;}

/* Parentesis de cierre */
( ")" ) {linea = yyline; lexeme=yytext(); return Parentesis_c;}

/* Llave de apertura */
( "{" ) {linea = yyline; lexeme=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {linea = yyline; lexeme=yytext(); return Llave_c;}

/* Corchete de apertura */
( "[" ) {linea = yyline; lexeme=yytext(); return Corchete_a;}

/* Corchete de cierre */
( "]" ) {linea = yyline; lexeme=yytext(); return Corchete_c;}

/* Comillas */
( "\"" ) {linea = yyline; lexeme=yytext(); return Comillas;}

/*======================================================================================================================*/

/*PUNTOS*/

<YYINITIAL> ";" {linea = yyline; lexeme=yytext(); return punto_y_coma;}
<YYINITIAL> "," {linea = yyline; lexeme=yytext(); return coma;}
<YYINITIAL> "." {linea = yyline; lexeme=yytext(); return punto;}

/*OPERADORES ARITMETICOS*/

<YYINITIAL> "+" {linea = yyline; lexeme=yytext(); return suma;}
<YYINITIAL> "-" {linea = yyline; lexeme=yytext(); return resta;}
<YYINITIAL> "/" {linea = yyline; lexeme=yytext(); return division;}
<YYINITIAL> "*" {linea = yyline; lexeme=yytext(); return multiplicacion;}
<YYINITIAL> "^" {linea = yyline; lexeme=yytext(); return potencia;}

/*Palabras de tipos de datos*/
<YYINITIAL> ("entero")   {linea = yyline; lexeme=yytext(); return entero;}
<YYINITIAL> ("flotante") {linea = yyline; lexeme=yytext(); return flotante;}
<YYINITIAL> ("caracter") {linea = yyline; lexeme=yytext(); return caracter;}



({D}+ | {D}+("."{D}*) | ("(-"{D}+")")) {linea = yyline; lexeme=yytext(); return numero;}
{L}({L}|{D})*
 . {return ERROR;}
/*IDENTIFICADORES*/

<YYINITIAL> {L}({L}|{D})* {linea = yyline; lexeme=yytext(); return identificador;}

/*COMENTARIOS*/
/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}


/*ERRORES*/

<YYINITIAL> "."{D}+  {linea = yyline+1; lexeme=yytext(); return ERRORD;}
<YYINITIAL> {D}+{L}+ {linea = yyline+1; lexeme=yytext(); return ERRORI;}

. {linea = yyline+1; lexeme=yytext(); return ERROR;}