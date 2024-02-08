package GUI;

import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import Clases.*;
import javax.swing.JOptionPane;
import java.io.*;
import java.security.Key;
import javax.swing.*;

/**
 *
 * @author HP-001
 */
public class GUI_Encriptador extends javax.swing.JFrame {
    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    Class_Archivos gestionArchivs = new Class_Archivos();
    //---------------------------------
    public SecretKey claveSecreta;
    Class_Encriptador objEncriptador;
    
    public GUI_Encriptador() {
        initComponents();
    }

    public String getMensage(){
        return txtMensage.getText();
    }
    public String getMesageEncrip(){
        return txtMensageEncrip.getText();
    }
    
    public static SecretKey generarClave() throws Exception{
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        return keyGenerator.generateKey();
    }
    
    public static String Encriptar(String texto, SecretKey claveSecreta) throws Exception{
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, claveSecreta);
        byte[] textEnBites = texto.getBytes();
        byte[] textEncriptado = cipher.doFinal(textEnBites);
        return Base64.getEncoder().encodeToString(textEncriptado);
    }
    
    public static String Desencriptar(String textoEncriptado, SecretKey claveSecreta) throws Exception{
        Cipher cipher =Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, claveSecreta);
        byte[] textoEncripEnBites = Base64.getDecoder().decode(textoEncriptado);
        byte[] textoDesencrip = cipher.doFinal(textoEncripEnBites);
        return new String(textoDesencrip);       
    } 
    //Hola
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMensage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensage = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMensageEncrip = new javax.swing.JTextArea();
        btnEncriptar = new javax.swing.JButton();
        btnDesencritar = new javax.swing.JButton();
        btnCopiar = new javax.swing.JButton();
        btnSubir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel1.setText("ENCRIPTADOR DE TEXTO");

        jLabel2.setText("MENSAGE A ENCRIPTAR");

        lblMensage.setText("MENSAGE ");

        txtMensage.setColumns(20);
        txtMensage.setRows(5);
        jScrollPane1.setViewportView(txtMensage);

        txtMensageEncrip.setColumns(20);
        txtMensageEncrip.setRows(5);
        jScrollPane2.setViewportView(txtMensageEncrip);

        btnEncriptar.setText("ENCRIPTAR");
        btnEncriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncriptarActionPerformed(evt);
            }
        });

        btnDesencritar.setText("DESENCRIPTAR");
        btnDesencritar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesencritarActionPerformed(evt);
            }
        });

        btnCopiar.setText("COPIR");

        btnSubir.setText("SUBIR ARCHIBO");
        btnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirActionPerformed(evt);
            }
        });

        btnGuardar.setText("GUARDAR ARCHIVO");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEncriptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnDesencritar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSubir)))
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMensage)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCopiar)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(451, 451, 451))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblMensage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEncriptar)
                        .addComponent(btnDesencritar)
                        .addComponent(btnSubir))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCopiar)
                        .addComponent(btnGuardar)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncriptarActionPerformed
        
        if (!getMensage().equals("")) {
            
            try {
                claveSecreta = generarClave();
                objEncriptador = new Class_Encriptador(claveSecreta);
                
                objEncriptador.setTextOriginar(getMensage());
                objEncriptador.setTextEncrictado(Encriptar(objEncriptador.getTextOriginar(), claveSecreta));
                
                txtMensageEncrip.setText(objEncriptador.getEncritado());
                lblMensage.setText("MESAGE ENCRPTADO");
                
            } catch (Exception ex) {
                Logger.getLogger(GUI_Encriptador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "El cuadro de text esta vasio...!");
        }
        
    }//GEN-LAST:event_btnEncriptarActionPerformed

    private void btnDesencritarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesencritarActionPerformed
        if (claveSecreta != null && !getMensage().equals("")) {
            try {
                
                objEncriptador.setTextDesencritado(Desencriptar(objEncriptador.getEncritado(), claveSecreta));
                txtMensageEncrip.setText(objEncriptador.getTextDesencritado());
                lblMensage.setText("MESAGE DESENCRPTADO");
                
            } catch (Exception ex) {
                Logger.getLogger(GUI_Encriptador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDesencritarActionPerformed

    private void btnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirActionPerformed
        if(seleccionar.showDialog(this, "ABRIR ARCHIVO") == JFileChooser.APPROVE_OPTION){
            archivo = seleccionar.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith(".txt")) {
                    String contenido = gestionArchivs.AbrirArchivo(archivo);
                    txtMensage.setText(contenido);
                }
            }
        }
    }//GEN-LAST:event_btnSubirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(!getMesageEncrip().equals("")){
            try {
                SecretKey clave = objEncriptador.getClaveSecrta();
                String texto = txtMensageEncrip.getText();
                
                JFileChooser fileChooser = new JFileChooser();
                int seleccion = fileChooser.showSaveDialog(this);
                
                if (seleccion == JFileChooser.APPROVE_OPTION) {
                    String rutaArchivo = fileChooser.getSelectedFile().getAbsolutePath();
                    gestionArchivs.GuardarArchivo(rutaArchivo, texto, clave);
                    JOptionPane.showMessageDialog(this, "Texto cifrado y clave guardados correctamente.");
                }
                
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnDesencritar;
    private javax.swing.JButton btnEncriptar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSubir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMensage;
    private javax.swing.JTextArea txtMensage;
    private javax.swing.JTextArea txtMensageEncrip;
    // End of variables declaration//GEN-END:variables
}
