/* The following code was generated by JFlex 1.4.3 on 11/04/20 12:41 PM */

package codigo;
import java.io.*;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 11/04/20 12:41 PM from the specification file
 * <tt>C:/Users/kevin/Documents/NetBeansProjects/Analizador_Lexico/src/codigo/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\6\2\0\1\1\22\0\1\1\1\54\1\11\2\0"+
    "\1\62\1\52\1\0\1\2\1\3\1\5\1\60\1\13\1\4\1\70"+
    "\1\61\12\7\1\0\1\67\1\56\1\57\1\55\2\0\1\43\2\10"+
    "\1\41\1\40\1\30\1\10\1\36\1\51\2\10\1\44\1\45\4\10"+
    "\1\50\1\47\2\10\1\27\4\10\1\65\1\0\1\66\1\71\2\0"+
    "\1\22\1\35\1\23\1\33\1\26\1\12\1\42\1\34\1\14\1\46"+
    "\1\10\1\24\1\15\1\32\1\17\1\16\1\10\1\20\1\25\1\21"+
    "\1\31\1\37\4\10\1\63\1\53\1\64\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\10\1\12\23\10\3\13\2\14\1\15"+
    "\1\16\1\17\1\1\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\0\1\27\1\15\1\30\1\7\22\31"+
    "\1\32\17\31\1\13\1\14\1\2\1\33\1\0\16\31"+
    "\1\34\7\31\1\35\1\36\1\31\1\37\5\31\1\40"+
    "\5\31\1\7\1\31\1\41\5\31\1\42\2\31\1\43"+
    "\1\31\1\44\3\31\1\45\2\31\1\46\1\47\5\31"+
    "\1\50\5\31\1\51\6\31\1\52\11\31\1\53\3\31"+
    "\1\54\5\31\1\55\1\56\1\57\1\60\1\61\13\31"+
    "\1\62\3\31\1\63\1\31\1\64\5\31\1\65\1\31"+
    "\1\66\1\31\1\67\1\31\1\70\3\31\1\71\1\72"+
    "\1\73\1\74\6\31\1\75\3\31\1\76\1\77\1\100"+
    "\1\101\1\102\3\31\1\103\4\31\1\104\1\105\2\31"+
    "\1\106\2\31\1\107\1\110\4\31\1\111\1\112";

  private static int [] zzUnpackAction() {
    int [] result = new int[268];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\72\0\164\0\256\0\72\0\350\0\u0122\0\u015c"+
    "\0\u0196\0\72\0\u01d0\0\164\0\u020a\0\u0244\0\u027e\0\u02b8"+
    "\0\u02f2\0\u032c\0\u0366\0\u03a0\0\u03da\0\u0414\0\u044e\0\u0488"+
    "\0\u04c2\0\u04fc\0\u0536\0\u0570\0\u05aa\0\u05e4\0\u061e\0\u0658"+
    "\0\u0692\0\u06cc\0\u0706\0\u0740\0\u06cc\0\u077a\0\u07b4\0\u0122"+
    "\0\72\0\72\0\72\0\72\0\72\0\u07ee\0\72\0\u0828"+
    "\0\72\0\72\0\u0862\0\u089c\0\72\0\u0196\0\u08d6\0\u0910"+
    "\0\u094a\0\u0984\0\u09be\0\u09f8\0\u0a32\0\u0a6c\0\u0aa6\0\u0ae0"+
    "\0\u0b1a\0\u0b54\0\u0b8e\0\u0bc8\0\u0c02\0\u0c3c\0\u0c76\0\u0cb0"+
    "\0\u0cea\0\u0d24\0\u0d5e\0\u0d98\0\u0dd2\0\u0e0c\0\u0e46\0\u0e80"+
    "\0\u0eba\0\u0ef4\0\u0f2e\0\u0f68\0\u0fa2\0\u0fdc\0\72\0\72"+
    "\0\u1016\0\u07ee\0\u1050\0\u108a\0\u10c4\0\u10fe\0\u1138\0\u1172"+
    "\0\u11ac\0\u11e6\0\u1220\0\u125a\0\u1294\0\u12ce\0\u1308\0\u1342"+
    "\0\u137c\0\u13b6\0\u13f0\0\u142a\0\u1464\0\u149e\0\u14d8\0\u1512"+
    "\0\u154c\0\u1586\0\u0196\0\u15c0\0\u0196\0\u15fa\0\u1634\0\u166e"+
    "\0\u16a8\0\u16e2\0\u0196\0\u171c\0\u1756\0\u1790\0\u17ca\0\u1804"+
    "\0\72\0\u183e\0\u1878\0\u18b2\0\u18ec\0\u1926\0\u1960\0\u199a"+
    "\0\u0196\0\u19d4\0\u1a0e\0\u0196\0\u1a48\0\u0196\0\u1a82\0\u1abc"+
    "\0\u1af6\0\u0196\0\u1b30\0\u1b6a\0\u0196\0\u0196\0\u1ba4\0\u1bde"+
    "\0\u1c18\0\u1c52\0\u1c8c\0\u0196\0\u1cc6\0\u1d00\0\u1d3a\0\u1d74"+
    "\0\u1dae\0\u0196\0\u1de8\0\u1e22\0\u1e5c\0\u1e96\0\u1ed0\0\u1f0a"+
    "\0\u0196\0\u1f44\0\u1f7e\0\u1fb8\0\u1ff2\0\u202c\0\u2066\0\u20a0"+
    "\0\u20da\0\u2114\0\u0196\0\u214e\0\u2188\0\u21c2\0\u0196\0\u21fc"+
    "\0\u2236\0\u2270\0\u22aa\0\u22e4\0\u0196\0\u0196\0\u0196\0\u0196"+
    "\0\u0196\0\u231e\0\u2358\0\u2392\0\u23cc\0\u2406\0\u2440\0\u247a"+
    "\0\u24b4\0\u24ee\0\u2528\0\u2562\0\u0196\0\u259c\0\u25d6\0\u2610"+
    "\0\u0196\0\u264a\0\u0196\0\u2684\0\u26be\0\u26f8\0\u2732\0\u276c"+
    "\0\u0196\0\u27a6\0\u0196\0\u27e0\0\u0196\0\u281a\0\u0196\0\u2854"+
    "\0\u288e\0\u28c8\0\u0196\0\u0196\0\u0196\0\u0196\0\u2902\0\u293c"+
    "\0\u2976\0\u29b0\0\u29ea\0\u2a24\0\u2a5e\0\u2a98\0\u2ad2\0\u2b0c"+
    "\0\u0196\0\u0196\0\u0196\0\u0196\0\u0196\0\u2b46\0\u2b80\0\u2bba"+
    "\0\u0196\0\u2bf4\0\u2c2e\0\u2c68\0\u2ca2\0\u0196\0\u0196\0\u2cdc"+
    "\0\u2d16\0\u0196\0\u2d50\0\u2d8a\0\u0196\0\u0196\0\u2dc4\0\u2dfe"+
    "\0\u2e38\0\u2e72\0\u0196\0\u0196";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[268];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\3\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\11"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\11"+
    "\1\27\1\11\1\30\1\31\1\32\1\33\1\11\1\34"+
    "\1\35\3\11\1\36\2\11\1\37\2\11\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
    "\1\52\1\53\1\54\1\55\1\56\1\57\73\0\1\3"+
    "\4\0\1\3\4\0\1\3\62\0\1\60\71\0\1\61"+
    "\52\0\1\62\71\0\1\62\21\0\1\10\1\63\1\0"+
    "\1\63\1\0\36\63\16\0\1\64\1\0\6\65\1\0"+
    "\2\66\1\65\1\66\1\65\36\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\6\66\1\67\1\66\1\70\25\66"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\1\66\1\71"+
    "\34\66\26\65\1\0\2\66\1\65\1\66\1\65\1\72"+
    "\2\66\1\73\32\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\1\74\3\66\1\75\1\66\1\76\27\66\26\65"+
    "\1\0\2\66\1\65\1\66\1\65\12\66\1\77\23\66"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\4\66\1\100"+
    "\5\66\1\101\23\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\10\66\1\102\25\66\26\65\1\0\2\66\1\65"+
    "\1\66\1\65\1\103\5\66\1\104\1\66\1\105\25\66"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\12\66\1\106"+
    "\23\66\26\65\1\0\2\66\1\65\1\66\1\65\1\107"+
    "\5\66\1\110\27\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\4\66\1\111\11\66\1\112\17\66\26\65\1\0"+
    "\2\66\1\65\1\66\1\65\15\66\1\113\20\66\26\65"+
    "\1\0\2\66\1\65\1\66\1\65\15\66\1\114\20\66"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\3\66\1\115"+
    "\2\66\1\116\3\66\1\117\23\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\6\66\1\120\27\66\26\65\1\0"+
    "\2\66\1\65\1\66\1\65\1\121\5\66\1\122\27\66"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\12\66\1\123"+
    "\23\66\26\65\1\0\2\66\1\65\1\66\1\65\11\66"+
    "\1\124\24\66\26\65\1\0\2\66\1\65\1\66\1\65"+
    "\12\66\1\125\23\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\24\66\1\126\11\66\20\65\52\0\1\127\72\0"+
    "\1\127\75\0\1\130\67\0\1\130\1\0\1\130\70\0"+
    "\2\130\71\0\1\62\1\61\70\0\1\62\1\0\1\131"+
    "\17\0\1\132\71\0\1\133\72\0\1\63\1\0\1\63"+
    "\1\0\36\63\27\0\1\64\62\0\6\65\1\0\2\66"+
    "\1\65\1\66\1\65\10\66\1\134\25\66\26\65\1\0"+
    "\2\66\1\65\1\66\1\65\3\66\1\135\32\66\26\65"+
    "\1\0\2\66\1\65\1\66\1\65\2\66\1\136\33\66"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\12\66\1\137"+
    "\23\66\26\65\1\0\2\66\1\65\1\66\1\65\11\66"+
    "\1\140\24\66\26\65\1\0\2\66\1\65\1\66\1\65"+
    "\16\66\1\141\17\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\12\66\1\142\23\66\26\65\1\0\2\66\1\65"+
    "\1\66\1\65\4\66\1\143\31\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\5\66\1\144\30\66\26\65\1\0"+
    "\2\66\1\65\1\66\1\65\15\66\1\145\20\66\26\65"+
    "\1\0\2\66\1\65\1\66\1\65\4\66\1\146\31\66"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\5\66\1\147"+
    "\30\66\26\65\1\0\2\66\1\65\1\66\1\65\7\66"+
    "\1\150\26\66\26\65\1\0\2\66\1\65\1\66\1\65"+
    "\1\66\1\151\2\66\1\152\4\66\1\153\5\66\1\154"+
    "\16\66\26\65\1\0\2\66\1\65\1\66\1\65\6\66"+
    "\1\155\27\66\26\65\1\0\2\66\1\65\1\66\1\65"+
    "\12\66\1\156\23\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\16\66\1\157\17\66\26\65\1\0\2\66\1\65"+
    "\1\66\1\65\10\66\1\160\25\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\4\66\1\161\31\66\26\65\1\0"+
    "\2\66\1\65\1\66\1\65\5\66\1\162\30\66\26\65"+
    "\1\0\2\66\1\65\1\66\1\65\16\66\1\163\17\66"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\10\66\1\164"+
    "\25\66\26\65\1\0\2\66\1\65\1\66\1\65\21\66"+
    "\1\165\14\66\26\65\1\0\2\66\1\65\1\66\1\65"+
    "\14\66\1\166\5\66\1\167\13\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\11\66\1\170\24\66\26\65\1\0"+
    "\2\66\1\65\1\66\1\65\7\66\1\171\1\66\1\172"+
    "\24\66\26\65\1\0\2\66\1\65\1\66\1\65\5\66"+
    "\1\173\30\66\26\65\1\0\2\66\1\65\1\66\1\65"+
    "\32\66\1\174\3\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\4\66\1\175\31\66\26\65\1\0\2\66\1\65"+
    "\1\66\1\65\7\66\1\176\26\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\7\66\1\177\26\66\26\65\1\0"+
    "\2\66\1\65\1\66\1\65\34\66\1\200\1\66\20\65"+
    "\6\131\1\0\63\131\3\0\1\201\3\0\1\133\62\0"+
    "\6\65\1\0\2\66\1\65\1\66\1\65\11\66\1\202"+
    "\24\66\26\65\1\0\2\66\1\65\1\66\1\65\5\66"+
    "\1\203\30\66\26\65\1\0\2\66\1\65\1\66\1\65"+
    "\3\66\1\204\32\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\16\66\1\205\17\66\26\65\1\0\2\66\1\65"+
    "\1\66\1\65\5\66\1\206\30\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\31\66\1\207\4\66\26\65\1\0"+
    "\2\66\1\65\1\66\1\65\2\66\1\210\33\66\26\65"+
    "\1\0\2\66\1\65\1\66\1\65\6\66\1\211\27\66"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\3\66\1\212"+
    "\1\213\31\66\26\65\1\0\2\66\1\65\1\66\1\65"+
    "\12\66\1\214\23\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\1\66\1\215\34\66\26\65\1\0\2\66\1\65"+
    "\1\66\1\65\3\66\1\216\32\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\10\66\1\217\25\66\26\65\1\0"+
    "\2\66\1\65\1\66\1\65\21\66\1\220\14\66\26\65"+
    "\1\0\2\66\1\65\1\66\1\65\6\66\1\221\27\66"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\3\66\1\222"+
    "\32\66\26\65\1\0\2\66\1\65\1\66\1\65\12\66"+
    "\1\223\23\66\26\65\1\0\2\66\1\65\1\66\1\65"+
    "\11\66\1\224\24\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\4\66\1\225\31\66\26\65\1\0\2\66\1\65"+
    "\1\66\1\65\3\66\1\226\32\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\1\227\35\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\3\66\1\230\32\66\26\65\1\0"+
    "\2\66\1\65\1\66\1\65\3\66\1\231\1\232\5\66"+
    "\1\233\23\66\26\65\1\0\2\66\1\65\1\66\1\65"+
    "\3\66\1\234\32\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\12\66\1\235\23\66\26\65\1\0\2\66\1\65"+
    "\1\66\1\65\3\66\1\236\32\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\17\66\1\237\16\66\26\65\1\0"+
    "\2\66\1\65\1\66\1\65\12\66\1\240\23\66\26\65"+
    "\1\0\2\66\1\65\1\66\1\65\5\66\1\241\30\66"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\3\66\1\242"+
    "\32\66\26\65\1\0\2\66\1\65\1\66\1\65\17\66"+
    "\1\243\16\66\26\65\1\0\2\66\1\65\1\66\1\65"+
    "\25\66\1\244\1\66\1\245\6\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\25\66\1\246\1\66\1\247\6\66"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\35\66\1\250"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\3\66\1\251"+
    "\6\66\1\214\23\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\6\66\1\252\27\66\26\65\1\0\2\66\1\65"+
    "\1\66\1\65\4\66\1\253\31\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\5\66\1\254\30\66\26\65\1\0"+
    "\2\66\1\65\1\66\1\65\4\66\1\255\31\66\26\65"+
    "\1\0\2\66\1\65\1\66\1\65\3\66\1\256\32\66"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\13\66\1\257"+
    "\22\66\26\65\1\0\2\66\1\65\1\66\1\65\4\66"+
    "\1\260\31\66\26\65\1\0\2\66\1\65\1\66\1\65"+
    "\6\66\1\261\27\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\1\262\35\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\3\66\1\263\32\66\26\65\1\0\2\66\1\65"+
    "\1\66\1\65\1\264\35\66\26\65\1\0\2\66\1\65"+
    "\1\66\1\65\7\66\1\265\26\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\16\66\1\266\17\66\26\65\1\0"+
    "\2\66\1\65\1\66\1\65\12\66\1\267\23\66\26\65"+
    "\1\0\2\66\1\65\1\66\1\65\17\66\1\270\16\66"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\4\66\1\271"+
    "\31\66\26\65\1\0\2\66\1\65\1\66\1\65\16\66"+
    "\1\272\17\66\26\65\1\0\2\66\1\65\1\66\1\65"+
    "\6\66\1\273\27\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\4\66\1\274\31\66\26\65\1\0\2\66\1\65"+
    "\1\66\1\65\7\66\1\275\26\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\4\66\1\276\31\66\26\65\1\0"+
    "\2\66\1\65\1\66\1\65\12\66\1\277\23\66\26\65"+
    "\1\0\2\66\1\65\1\66\1\65\4\66\1\300\31\66"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\6\66\1\301"+
    "\27\66\26\65\1\0\2\66\1\65\1\66\1\65\6\66"+
    "\1\302\27\66\26\65\1\0\2\66\1\65\1\66\1\65"+
    "\1\303\35\66\26\65\1\0\2\66\1\65\1\66\1\65"+
    "\16\66\1\304\17\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\1\305\35\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\16\66\1\306\17\66\26\65\1\0\2\66\1\65"+
    "\1\66\1\65\27\66\1\307\6\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\16\66\1\310\17\66\26\65\1\0"+
    "\2\66\1\65\1\66\1\65\5\66\1\311\30\66\26\65"+
    "\1\0\2\66\1\65\1\66\1\65\4\66\1\312\31\66"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\6\66\1\313"+
    "\27\66\26\65\1\0\2\66\1\65\1\66\1\65\17\66"+
    "\1\314\16\66\26\65\1\0\2\66\1\65\1\66\1\65"+
    "\6\66\1\315\27\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\16\66\1\316\17\66\26\65\1\0\2\66\1\65"+
    "\1\66\1\65\11\66\1\317\24\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\16\66\1\320\17\66\26\65\1\0"+
    "\2\66\1\65\1\66\1\65\3\66\1\321\32\66\26\65"+
    "\1\0\2\66\1\65\1\66\1\65\5\66\1\322\30\66"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\6\66\1\323"+
    "\27\66\26\65\1\0\2\66\1\65\1\66\1\65\6\66"+
    "\1\324\27\66\26\65\1\0\2\66\1\65\1\66\1\65"+
    "\13\66\1\325\1\326\21\66\26\65\1\0\2\66\1\65"+
    "\1\66\1\65\7\66\1\327\26\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\17\66\1\330\16\66\26\65\1\0"+
    "\2\66\1\65\1\66\1\65\3\66\1\331\32\66\26\65"+
    "\1\0\2\66\1\65\1\66\1\65\17\66\1\332\16\66"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\26\66\1\333"+
    "\7\66\26\65\1\0\2\66\1\65\1\66\1\65\6\66"+
    "\1\334\27\66\26\65\1\0\2\66\1\65\1\66\1\65"+
    "\26\66\1\335\7\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\6\66\1\336\27\66\26\65\1\0\2\66\1\65"+
    "\1\66\1\65\30\66\1\337\5\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\5\66\1\340\30\66\26\65\1\0"+
    "\2\66\1\65\1\66\1\65\6\66\1\341\27\66\26\65"+
    "\1\0\2\66\1\65\1\66\1\65\6\66\1\342\27\66"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\4\66\1\343"+
    "\31\66\26\65\1\0\2\66\1\65\1\66\1\65\3\66"+
    "\1\344\32\66\26\65\1\0\2\66\1\65\1\66\1\65"+
    "\3\66\1\345\32\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\3\66\1\346\32\66\26\65\1\0\2\66\1\65"+
    "\1\66\1\65\6\66\1\347\27\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\12\66\1\350\23\66\26\65\1\0"+
    "\2\66\1\65\1\66\1\65\31\66\1\351\4\66\26\65"+
    "\1\0\2\66\1\65\1\66\1\65\12\66\1\352\23\66"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\6\66\1\353"+
    "\27\66\26\65\1\0\2\66\1\65\1\66\1\65\12\66"+
    "\1\354\23\66\26\65\1\0\2\66\1\65\1\66\1\65"+
    "\6\66\1\355\27\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\12\66\1\356\23\66\26\65\1\0\2\66\1\65"+
    "\1\66\1\65\10\66\1\357\25\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\10\66\1\360\25\66\26\65\1\0"+
    "\2\66\1\65\1\66\1\65\12\66\1\361\23\66\26\65"+
    "\1\0\2\66\1\65\1\66\1\65\4\66\1\362\31\66"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\11\66\1\363"+
    "\24\66\26\65\1\0\2\66\1\65\1\66\1\65\4\66"+
    "\1\364\31\66\26\65\1\0\2\66\1\65\1\66\1\65"+
    "\4\66\1\365\31\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\3\66\1\366\32\66\26\65\1\0\2\66\1\65"+
    "\1\66\1\65\4\66\1\367\31\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\10\66\1\370\25\66\26\65\1\0"+
    "\2\66\1\65\1\66\1\65\11\66\1\371\24\66\26\65"+
    "\1\0\2\66\1\65\1\66\1\65\31\66\1\372\4\66"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\4\66\1\373"+
    "\31\66\26\65\1\0\2\66\1\65\1\66\1\65\3\66"+
    "\1\374\32\66\26\65\1\0\2\66\1\65\1\66\1\65"+
    "\3\66\1\375\32\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\17\66\1\376\16\66\26\65\1\0\2\66\1\65"+
    "\1\66\1\65\17\66\1\377\16\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\11\66\1\u0100\24\66\26\65\1\0"+
    "\2\66\1\65\1\66\1\65\3\66\1\u0101\32\66\26\65"+
    "\1\0\2\66\1\65\1\66\1\65\3\66\1\u0102\32\66"+
    "\26\65\1\0\2\66\1\65\1\66\1\65\26\66\1\u0103"+
    "\7\66\26\65\1\0\2\66\1\65\1\66\1\65\26\66"+
    "\1\u0104\7\66\26\65\1\0\2\66\1\65\1\66\1\65"+
    "\3\66\1\u0105\32\66\26\65\1\0\2\66\1\65\1\66"+
    "\1\65\17\66\1\u0106\16\66\26\65\1\0\2\66\1\65"+
    "\1\66\1\65\1\u0107\35\66\26\65\1\0\2\66\1\65"+
    "\1\66\1\65\1\u0108\35\66\26\65\1\0\2\66\1\65"+
    "\1\66\1\65\7\66\1\u0109\26\66\26\65\1\0\2\66"+
    "\1\65\1\66\1\65\7\66\1\u010a\26\66\26\65\1\0"+
    "\2\66\1\65\1\66\1\65\6\66\1\u010b\27\66\26\65"+
    "\1\0\2\66\1\65\1\66\1\65\6\66\1\u010c\27\66"+
    "\20\65";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11948];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\4\1\1\11\36\1\5\11"+
    "\1\1\1\11\1\0\2\11\2\1\1\11\41\1\2\11"+
    "\2\1\1\0\45\1\1\11\213\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[268];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;
    public int linea;



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 154) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 40: 
          { linea = yyline; lexeme=yytext(); return nulo;
          }
        case 75: break;
        case 23: 
          { linea = yyline; lexeme=yytext(); return Op_incremento;
          }
        case 76: break;
        case 59: 
          { linea = yyline; lexeme=yytext(); return retorno;
          }
        case 77: break;
        case 30: 
          { linea = yyline; lexeme=yytext(); return fun;
          }
        case 78: break;
        case 12: 
          { linea = yyline; lexeme=yytext(); return Op_relacional;
          }
        case 79: break;
        case 18: 
          { linea = yyline; lexeme=yytext(); return Corchete_a;
          }
        case 80: break;
        case 46: 
          { linea = yyline; lexeme=yytext(); return daHor;
          }
        case 81: break;
        case 58: 
          { linea = yyline; lexeme=yytext(); return pinModo;
          }
        case 82: break;
        case 31: 
          { linea = yyline; lexeme=yytext(); return dob;
          }
        case 83: break;
        case 74: 
          { clinea = yyline; lexeme=yytext(); return LecAnalogica;
          }
        case 84: break;
        case 8: 
          { linea = yyline; lexeme=yytext(); return identificador;
          }
        case 85: break;
        case 70: 
          { linea = yyline; lexeme=yytext(); return verdadero;
          }
        case 86: break;
        case 16: 
          { linea = yyline; lexeme=yytext(); return Llave_a;
          }
        case 87: break;
        case 10: 
          { linea = yyline; lexeme=yytext(); return coma;
          }
        case 88: break;
        case 4: 
          { linea = yyline; lexeme=yytext(); return Parentesis_c;
          }
        case 89: break;
        case 34: 
          { linea = yyline; lexeme=yytext(); return para;
          }
        case 90: break;
        case 54: 
          { linea = yyline; lexeme=yytext(); return EscDig;
          }
        case 91: break;
        case 2: 
          { /*Ignore*/
          }
        case 92: break;
        case 13: 
          { linea = yyline; lexeme=yytext(); return Op_atribucion;
          }
        case 93: break;
        case 5: 
          { linea = yyline; lexeme=yytext(); return resta;
          }
        case 94: break;
        case 29: 
          { linea = yyline; lexeme=yytext(); return ent;
          }
        case 95: break;
        case 68: 
          { linea = yyline; lexeme=yytext(); return salidaMod;
          }
        case 96: break;
        case 65: 
          { linea = yyline; lexeme=yytext(); return terminar;
          }
        case 97: break;
        case 14: 
          { linea = yyline; lexeme=yytext(); return suma;
          }
        case 98: break;
        case 64: 
          { linea = yyline; lexeme=yytext(); return mientras;
          }
        case 99: break;
        case 37: 
          { linea = yyline; lexeme=yytext(); return caso;
          }
        case 100: break;
        case 32: 
          { linea = yyline; lexeme=yytext(); return bit;
          }
        case 101: break;
        case 27: 
          { linea = yyline+1; lexeme=yytext(); return ERRORD;
          }
        case 102: break;
        case 33: 
          { linea = yyline; lexeme=yytext(); return flot;
          }
        case 103: break;
        case 25: 
          { return ERROR;
          }
        case 104: break;
        case 69: 
          { linea = yyline; lexeme=yytext(); return errorVerd;
          }
        case 105: break;
        case 20: 
          { linea = yyline; lexeme=yytext(); return punto_y_coma;
          }
        case 106: break;
        case 49: 
          { linea = yyline; lexeme=yytext(); return hasta;
          }
        case 107: break;
        case 44: 
          { linea = yyline; lexeme=yytext(); return clase;
          }
        case 108: break;
        case 3: 
          { linea = yyline; lexeme=yytext(); return Parentesis_a;
          }
        case 109: break;
        case 9: 
          { linea = yyline; lexeme=yytext(); return Comillas;
          }
        case 110: break;
        case 73: 
          { linea = yyline; lexeme=yytext(); return EscAnalogica;
          }
        case 111: break;
        case 21: 
          { linea = yyline; lexeme=yytext(); return punto;
          }
        case 112: break;
        case 35: 
          { linea = yyline; lexeme=yytext(); return Op_booleano;
          }
        case 113: break;
        case 24: 
          { linea = yyline+1; lexeme=yytext(); return ERRORI;
          }
        case 114: break;
        case 15: 
          { linea = yyline; lexeme=yytext(); return division;
          }
        case 115: break;
        case 56: 
          { linea = yyline; lexeme=yytext(); return SERIAL;
          }
        case 116: break;
        case 52: 
          { linea = yyline; lexeme=yytext(); return cadena;
          }
        case 117: break;
        case 7: 
          { linea = yyline; lexeme=yytext(); return numero;
          }
        case 118: break;
        case 11: 
          { linea = yyline; lexeme=yytext(); return Op_logico;
          }
        case 119: break;
        case 62: 
          { linea = yyline; lexeme=yytext(); return flotante;
          }
        case 120: break;
        case 51: 
          { linea = yyline; lexeme=yytext(); return cambio;
          }
        case 121: break;
        case 39: 
          { linea = yyline; lexeme=yytext(); return sino;
          }
        case 122: break;
        case 42: 
          { linea = yyline; lexeme=yytext(); return falso;
          }
        case 123: break;
        case 38: 
          { linea = yyline; lexeme=yytext(); return leer;
          }
        case 124: break;
        case 43: 
          { linea = yyline; lexeme=yytext(); return ciclo;
          }
        case 125: break;
        case 48: 
          { linea = yyline; lexeme=yytext(); return hacer;
          }
        case 126: break;
        case 19: 
          { linea = yyline; lexeme=yytext(); return Corchete_c;
          }
        case 127: break;
        case 66: 
          { linea = yyline; lexeme=yytext(); return caracter;
          }
        case 128: break;
        case 57: 
          { linea = yyline; lexeme=yytext(); return mostrar;
          }
        case 129: break;
        case 22: 
          { linea = yyline; lexeme=yytext(); return potencia;
          }
        case 130: break;
        case 45: 
          { linea = yyline; lexeme=yytext(); return daFec;
          }
        case 131: break;
        case 41: 
          { linea = yyline; lexeme=yytext(); return bajo;
          }
        case 132: break;
        case 6: 
          { linea = yyline; lexeme=yytext(); return multiplicacion;
          }
        case 133: break;
        case 50: 
          { linea = yyline; lexeme=yytext(); return prepVa;
          }
        case 134: break;
        case 53: 
          { linea = yyline; lexeme=yytext(); return entero;
          }
        case 135: break;
        case 17: 
          { linea = yyline; lexeme=yytext(); return Llave_c;
          }
        case 136: break;
        case 1: 
          { linea = yyline+1; lexeme=yytext(); return ERROR;
          }
        case 137: break;
        case 55: 
          { linea = yyline; lexeme=yytext(); return LecDig;
          }
        case 138: break;
        case 60: 
          { linea = yyline; lexeme=yytext(); return retraso;
          }
        case 139: break;
        case 71: 
          { linea = yyline; lexeme=yytext(); return errorFalso;
          }
        case 140: break;
        case 47: 
          { linea = yyline; lexeme=yytext(); return desde;
          }
        case 141: break;
        case 26: 
          { linea = yyline; lexeme=yytext(); return si;
          }
        case 142: break;
        case 28: 
          { linea = yyline; lexeme=yytext(); return car;
          }
        case 143: break;
        case 61: 
          { linea = yyline; lexeme=yytext(); return entrada;
          }
        case 144: break;
        case 72: 
          { linea = yyline; lexeme=yytext(); return entradaMod;
          }
        case 145: break;
        case 36: 
          { linea = yyline; lexeme=yytext(); return alto;
          }
        case 146: break;
        case 67: 
          { linea = yyline; lexeme=yytext(); return entonces;
          }
        case 147: break;
        case 63: 
          { linea = yyline; lexeme=yytext(); return importar;
          }
        case 148: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
