package codigo;




import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.undo.UndoManager;
import jdk.nashorn.internal.parser.Lexer;
import org.omg.CORBA.ORB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abril
 */
public class Ventana_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Principal
     */
     private NumeroLinea numeroLinea,numeroLinea2; //variable para poner numeros al txtArea
    private UndoManager um = new UndoManager(); //variable para manejar el deshacer y reahcer.
    public Ventana_Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("BAND-WATCH");
        numeroLinea = new NumeroLinea(txtArea);//Agregar el txtArea para numero de lineas.
        numeroLinea2 = new NumeroLinea(txtErrores);
        jSPanel.setRowHeaderView(numeroLinea); //Agregar JScrollPanel para numero de lineas (solo con este se puede)
        jspErrores.setRowHeaderView(numeroLinea2);
        txtArea.getDocument().addUndoableEditListener(um);//agregar al txt area para editar el  deshacer y reahcer
        tblTokens.setVisible(true);
        modelo=(DefaultTableModel)tblTokens.getModel();
    }

public void validar() throws FileNotFoundException, IOException      
{ //Selecciona el nombre del archivo txt
    
    
    codigo.InformacionCodigo co = new codigo.InformacionCodigo();
    
    String archivo=p;/*IMPORTANTE  NOMBRE DEL ARCHIVO ABIERTO*/
    /*File fichero = new File(archivo);
    
    PrintWriter writer = new PrintWriter(fichero);
    writer.print(txtArea.getText());
    writer.close();
    
    Reader reader= new BufferedReader(new FileReader(archivo));*/
    String cadena="";
        String linea;
        BufferedReader bs = new BufferedReader(new FileReader(archivo));
             while((linea=bs.readLine())!=null){
                cadena+=linea+"\n";
                }
                        
                        txtArea.setText(cadena);
    codigo.Lexer lexer = new codigo.Lexer(new StringReader(cadena));
    
    
    ArrayList <String> lexema=new ArrayList<>();
   // ArrayList <Integer> Linea=new ArrayList<>();
    ArrayList <String> comp=new ArrayList<>();
    
    String resultado="";
    boolean errores=false;
     while (true) {
    codigo.Tokens token = lexer.yylex();
            if (token == null) {
                resultado=resultado+ "FIN";
                txtErrores.setText(resultado);
                if(errores==false){
                    modelo.setRowCount(lexema.size());
                    for(int k=0;k<lexema.size();k++){
                        //tblTokens.setValueAt(Linea.get(k), k, 0);
                        tblTokens.setValueAt(lexema.get(k), k, 1);
                        tblTokens.setValueAt(comp.get(k), k, 2);
                    }
                    txtErrores.setText("Correcto");
                    txtErrores.setForeground(new Color(25, 111, 61));
                }
                else{
                    modelo.setRowCount(lexema.size());
                        for(int k=0;k<lexema.size();k++){
                        //tblTokens.setValueAt(Linea.get(k), k, 0);
                        tblTokens.setValueAt(lexema.get(k), k, 1);
                        tblTokens.setValueAt(comp.get(k), k, 2);
                        }
                    txtErrores.setText(resultado);
                    txtErrores.setForeground(new Color(25, 111, 61));
                }
                
                return;
             
            }
        
                switch (token) {
                case comillas:
                    comp.add("Cadena");
                    lexema.add(lexer.lexeme);
                    break;
                case punto:
                    comp.add("punto");
                    lexema.add(lexer.lexeme);
                    break;
                case cadena:
                    comp.add("Cadena");
                    lexema.add(lexer.lexeme);
                    break;
                case entero:////============================================================
                    comp.add("entero");
                    lexema.add(lexer.lexeme);
                    break;
                case bit:
                    comp.add("bit");
                    lexema.add(lexer.lexeme);
                    break;
                case flotante:
                    comp.add("flotante");
                    lexema.add(lexer.lexeme);
                   break;
                case retorno:
                    comp.add("retorno");
                    lexema.add(lexer.lexeme);
                break;
                case car:
                    comp.add("Caracter");
                    lexema.add(lexer.lexeme);
                break;
                case si:
                    comp.add("if");
                    lexema.add(lexer.lexeme);
                    break;
                case entonces:
                    comp.add("entonces");
                    
                    lexema.add(lexer.lexeme);
                    break;
                case hacer:
                    comp.add("hacer");
                    lexema.add(lexer.lexeme);
                    break;
                case mientras:
                    comp.add("mientras");
                    lexema.add(lexer.lexeme);
                    break;
                case para:
                    comp.add("para");
                    lexema.add(lexer.lexeme);
                    break;
                case fun:
                    comp.add("funcion");
                    lexema.add(lexer.lexeme);
                    break;
                case suma:
                    comp.add("suma");
                    lexema.add(lexer.lexeme);
                    break;
                case resta:
                    comp.add("resta");
                    lexema.add(lexer.lexeme);
                    break;
                case multiplicacion:
                    comp.add("multiplicacion");
                    lexema.add(lexer.lexeme);
                    break;
                case division:
                    comp.add("division");
                    lexema.add(lexer.lexeme);
                case Op_logico:
                    lexema.add(lexer.lexeme);
                    comp.add("Op_Logico");
                    break;
                case Op_incremento:
                    lexema.add(lexer.lexeme);
                    comp.add("Op_incremento");
                    break;
                case Op_relacional:
                    lexema.add(lexer.lexeme);
                    comp.add("Op_relacional");
                    break;
                case Op_atribucion:
                    lexema.add(lexer.lexeme);
                    comp.add("Op_atribucion");
                    break;
                case Op_booleano:
                    lexema.add(lexer.lexeme);
                    comp.add("Op_booleano");
                    break;
                case Parentesis_a:
                    String l=co.linea+"";
                    
                    lexema.add(lexer.lexeme);
                    comp.add("Parentesis_a");
                    break;
                case Parentesis_c:
                    lexema.add(lexer.lexeme);
                    comp.add("Parentesis_c");
                    break;
                case Llave_a:
                    lexema.add(lexer.lexeme);
                    comp.add("Llave_a");
                  //  Linea.add(lexer.linea);
                    break;
                case Llave_c:
                    lexema.add(lexer.lexeme);
                    comp.add("Llave_c");
                    break;
                case Corchete_a:
                    lexema.add(lexer.lexeme);
                    comp.add("Corchete_a");
                    break;
                case Corchete_c:
                    lexema.add(lexer.lexeme);
                    comp.add("Corchete_c");
                    break;
                case prepVa:
                    lexema.add(lexer.lexeme);
                    comp.add("prepVa");
                    break;
                case punto_y_coma:
                    lexema.add(lexer.lexeme);
                    comp.add("punto_y_coma");
                    break;
                    
                /*---------------------------------------------------------*/
                    case EscDig:
                    comp.add("Esc_Digital");
                    lexema.add(lexer.lexeme);
                    break;
                    case EscAnalogica:
                    comp.add("Esc_Analogica");
                    lexema.add(lexer.lexeme);
                    break;
                    case LecDig:
                    comp.add("Lectura_Digital");
                    lexema.add(lexer.lexeme);
                    break;
                    case LecAnalogica:
                    comp.add("Lectura_analigica");
                    lexema.add(lexer.lexeme);
                    break;
                    
                /*---------------------------------------------------------*/    
                    case ciclo:
                    comp.add("ciclo");
                    lexema.add(lexer.lexeme);
                    break;
                    case clase:
                    comp.add("clase");
                    lexema.add(lexer.lexeme);
                    break;
                    case Leer:
                    comp.add("leer");
                    lexema.add(lexer.lexeme);
                    break;
                    case importar:
                    comp.add("importar");
                    lexema.add(lexer.lexeme);
                    break;
                    case mostrar:
                    comp.add("mostrar");
                    lexema.add(lexer.lexeme);
                    break;
                /*---------------------------------------------------------*/
                case identificador:
                    lexema.add("ID");
                    comp.add(lexer.lexeme);
                    break;
                case numero:
                    lexema.add("Numero");
                    comp.add(lexer.lexeme);
                    break;
                case ERROR:
                    
                    resultado += "ERROR LEXICO:-> Linea: "+lexer.linea+ " Caracter no definido: "+lexer.lexeme+"\n" ;
                    errores=true;
                    break;
                    
                case ERRORD:
                    resultado += "ERROR LEXICO:-> Linea: "+lexer.linea+ " Caracter no definido: "+lexer.lexeme+"\n" ;
                    errores=true;
                    break;
                case ERRORI:
                    resultado += "ERROR LEXICO:-> Linea: "+lexer.linea+ " Caracter no definido: "+lexer.lexeme+"\n" ;
                    errores=true;
                    break;
                    
                default:
                    resultado += "  < " + lexer.lexeme + " >\n";
                    break;
            }
              
       
}
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        Panel = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel5 = new javax.swing.JLabel();
        BtnNuevo = new javax.swing.JButton();
        BtnAbrir = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BTNCompilar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTokens = new javax.swing.JTable();
        jspErrores = new javax.swing.JScrollPane();
        txtErrores = new javax.swing.JTextArea();
        jSPanel = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        itemCerrar = new javax.swing.JMenu();
        btnNuevo = new javax.swing.JMenuItem();
        btnAbrir = new javax.swing.JMenuItem();
        btnGuardar = new javax.swing.JMenuItem();
        btnGuardarC = new javax.swing.JMenuItem();
        btnCompilar = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(255, 255, 255));

        jToolBar1.setRollover(true);

        jLabel5.setText("     ");
        jToolBar1.add(jLabel5);

        BtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/icons8-nuevo-documento-24.png"))); // NOI18N
        BtnNuevo.setFocusable(false);
        BtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(BtnNuevo);

        BtnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/icons8-abrir-carpeta-24.png"))); // NOI18N
        BtnAbrir.setFocusable(false);
        BtnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAbrirActionPerformed(evt);
            }
        });
        jToolBar1.add(BtnAbrir);

        BtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/icons8-guardar-24.png"))); // NOI18N
        BtnGuardar.setFocusable(false);
        BtnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(BtnGuardar);

        jLabel6.setText("     ");
        jToolBar1.add(jLabel6);
        jToolBar1.add(jSeparator4);
        jToolBar1.add(jLabel4);

        jLabel2.setText("     ");
        jToolBar1.add(jLabel2);

        BTNCompilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/icons8-conejo-corredor-24.png"))); // NOI18N
        BTNCompilar.setFocusable(false);
        BTNCompilar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTNCompilar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTNCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCompilarActionPerformed(evt);
            }
        });
        jToolBar1.add(BTNCompilar);

        tblTokens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Linea", "Lexema", "Comp. Lexico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblTokens);

        txtErrores.setEditable(false);
        txtErrores.setBackground(java.awt.Color.lightGray);
        txtErrores.setColumns(20);
        txtErrores.setRows(5);
        jspErrores.setViewportView(txtErrores);

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jSPanel.setViewportView(txtArea);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jspErrores)
                    .addComponent(jSPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(PanelLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1032, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(jSPanel)
                        .addGap(18, 18, 18)
                        .addComponent(jspErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        itemCerrar.setText("File");

        btnNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/icons8-nuevo-documento-24.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        itemCerrar.add(btnNuevo);
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/icons8-nuevo-documento-24.png"))); // NOI18N

        btnAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/icons8-abrir-carpeta-24.png"))); // NOI18N
        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        itemCerrar.add(btnAbrir);

        btnGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/icons8-guardar-24.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        itemCerrar.add(btnGuardar);

        btnGuardarC.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        btnGuardarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/icons8-save as.png"))); // NOI18N
        btnGuardarC.setText("Guardar como");
        btnGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCActionPerformed(evt);
            }
        });
        itemCerrar.add(btnGuardarC);

        btnCompilar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        btnCompilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/icons8-conejo-corredor-24.png"))); // NOI18N
        btnCompilar.setText("Compilar");
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });
        itemCerrar.add(btnCompilar);

        jMenuBar1.add(itemCerrar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        btnNuevoActionPerformed(evt);
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAbrirActionPerformed
        btnAbrirActionPerformed(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAbrirActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        btnGuardarActionPerformed(evt);
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BTNCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCompilarActionPerformed
        btnCompilarActionPerformed(evt);
    }//GEN-LAST:event_BTNCompilarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
 if(txtArea.getText().isEmpty()){
        txtArea.setText("");
        txtErrores.setText("");
                modelo.setRowCount(0);
 }else{
        btnGuardarActionPerformed(evt);
        txtArea.setText("");
        txtErrores.setText("");
        modelo.setRowCount(0);
 }
p="";
       
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCActionPerformed
      JFileChooser jf = new JFileChooser("C:\\BRAND-WATCH");
        
        jf.setMultiSelectionEnabled(false);
        FileNameExtensionFilter filter=new FileNameExtensionFilter("Archivo De BRAND-WATCH","BRAND-WATCH");
        jf.setFileFilter(filter);
 
        
        File seleccion_ruta =jf.getSelectedFile();
        if (seleccion_ruta!= null) {
    txtArea.setText(seleccion_ruta.getAbsolutePath());
        }
     if (jf.showSaveDialog(this) == JFileChooser.APPROVE_OPTION)
     {
         PrintWriter printwriter = null;
            try {
                //comprueba si ha presionado el boton de aceptar
                File JFC = jf.getSelectedFile();
                String PATH = JFC.getAbsolutePath();//obtenemos el path del archivo a guardar
                p=PATH;
                printwriter = new PrintWriter(JFC);
                printwriter.print(txtArea.getText());//escribe en el archivo todo lo que se encuentre en el JTextArea
                printwriter.close();
                
                //comprobamos si a la hora de guardar obtuvo la extension y si no se la asignamos
                    if(!(PATH.endsWith(".BRAND-WATCH"))){
                        File temp = new File(PATH+".BRAND-WATCH");
                        p=temp+"";
                        JFC.renameTo(temp);//renombramos el archivo
                    }
                    
                    System.out.println(p);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Ventana_Principal.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                printwriter.close();
            }
}
     
                                          
    }//GEN-LAST:event_btnGuardarCActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
JFileChooser jf = new JFileChooser("C:\\BRAND-WATCH");
        jf.setMultiSelectionEnabled(false);
        FileNameExtensionFilter filter=new FileNameExtensionFilter("Archivo De BRAND-WATCH","BRAND-WATCH");
        jf.setFileFilter(filter);
        jf.showOpenDialog(this);
        File seleccion_ruta =jf.getSelectedFile();
        ruta=seleccion_ruta+"";
        if (seleccion_ruta!= null) {
    txtArea.setText(seleccion_ruta.getAbsolutePath());
}
        try {
            FileReader fr= new FileReader(seleccion_ruta);
            BufferedReader br = new BufferedReader(fr);
            File JFC = jf.getSelectedFile();
            String PATH = JFC.getAbsolutePath();//obtenemos el path del archivo a guardar
            p=PATH;
            String linea,cad = "";
            while((linea=br.readLine())!=null)
            cad=cad+linea+"\n";
      
            txtArea.setText(cad);
            n=false;
        } catch (FileNotFoundException ex) {
            showMessageDialog(this,"Seleccione un archivo porfavor");
        } catch (IOException ex) {
            Logger.getLogger(Ventana_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }                                       
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
File directorio=new File("c:\\BRAND-WATCH");
       directorio.mkdir();
        File file = new File(p);
         FileWriter flwriter = null;
         BufferedWriter bfwriter = null;
        if(file.exists()){
            try {
			//crea el flujo para escribir en el archivo
			flwriter = new FileWriter(p);
			//crea un buffer o flujo intermedio antes de escribir directamente en el archivo
			bfwriter = new BufferedWriter(flwriter);
				//escribe los datos en el archivo
				bfwriter.write(txtArea.getText());
			//cierra el buffer intermedio
			bfwriter.close();
                        JOptionPane.showMessageDialog(this, "Archivo Guardado satisfactoriamente");
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {//cierra el flujo principal
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
          
            
        }else{
           btnGuardarCActionPerformed(evt);
            
        }                                      
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
        btnGuardarActionPerformed(evt);
        try {
             validar();
         } catch (IOException ex) {
             Logger.getLogger(Ventana_Principal.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btnCompilarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Principal().setVisible(true);
            }
        });
    }
    static boolean s;
    static String ruta ="";
    static String p="";
    boolean n=true;
    private DefaultTableModel modelo;
    public static ArrayList <String> ERRORES=new ArrayList<String>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCompilar;
    private javax.swing.JButton BtnAbrir;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JPanel Panel;
    private javax.swing.JMenuItem btnAbrir;
    private javax.swing.JMenuItem btnCompilar;
    private javax.swing.JMenuItem btnGuardar;
    private javax.swing.JMenuItem btnGuardarC;
    private javax.swing.JMenuItem btnNuevo;
    private javax.swing.JMenu itemCerrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jSPanel;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JScrollPane jspErrores;
    private javax.swing.JTable tblTokens;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextArea txtErrores;
    // End of variables declaration//GEN-END:variables
}
