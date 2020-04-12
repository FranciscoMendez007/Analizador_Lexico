package codigo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.File;

public class InformacionCodigo {
    public static int linea;
    public static String token;
    
    public static void guardarInfo(int l,String t){
        linea=l;
        token=t;
    }
    
    public static void main(String[] args) {
        
    String ruta="C:/Users/kevin/Documents/NetBeansProjects/Analizador_Lexico/src/codigo/Lexer.flex";
        generarLexer(ruta);
    }    
    public static void generarLexer(String ruta){
        File archivo=new File(ruta);
        JFlex.Main.generate(archivo);
    }    
}
