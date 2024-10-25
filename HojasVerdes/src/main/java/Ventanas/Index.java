/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import Utilidades.Propietario;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Index extends javax.swing.JFrame {

    private final String adminUsuario = "admin";
    private final String adminContrasena = "admin123";
    private final String adminCorreo = "administrador@correo.com";
    private List<Propietario> propietarios;

    public Index() {
        initComponents();
        propietarios = new ArrayList<>();
        inicializarArchivoJSON();
        cargarPropietarios();
    }

    private void inicializarArchivoJSON() {
        File archivo = new File("propietarios.json");
        if (!archivo.exists()) {
            propietarios.add(new Propietario("Administrador", adminUsuario, adminCorreo, adminContrasena));
            guardarPropietarios();
        }
    }

    private void cargarPropietarios() {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader("propietarios.json")) {
            java.lang.reflect.Type propietarioListType = new TypeToken<ArrayList<Propietario>>(){}.getType();
            propietarios = gson.fromJson(reader, propietarioListType);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void guardarPropietarios() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(propietarios);

        try (FileWriter writer = new FileWriter("propietarios.json")) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        iniciarSesionButton = new javax.swing.JButton();
        propiedadesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(153, 0, 153));
        setPreferredSize(new java.awt.Dimension(900, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(225, 240, 222));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 685));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hojasVerdesFinal (4).png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel1.setText("Urbanización Hojas Verdes");

        iniciarSesionButton.setBackground(new java.awt.Color(147, 213, 109));
        iniciarSesionButton.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        iniciarSesionButton.setText("Iniciar Sesión");
        iniciarSesionButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iniciarSesionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionButtonActionPerformed(evt);
            }
        });

        propiedadesButton.setBackground(new java.awt.Color(147, 213, 109));
        propiedadesButton.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        propiedadesButton.setText("Propiedades");
        propiedadesButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        propiedadesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propiedadesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(iniciarSesionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(propiedadesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(108, 108, 108))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniciarSesionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(propiedadesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarSesionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionButtonActionPerformed
        IniciarSesion ventanaIniciarSesion = new IniciarSesion();
        this.setVisible(false);
        ventanaIniciarSesion.setVisible(true);
    }//GEN-LAST:event_iniciarSesionButtonActionPerformed

    private void propiedadesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propiedadesButtonActionPerformed
        Propiedades ventanaPropiedades = new Propiedades();
        this.setVisible(false);
        ventanaPropiedades.setVisible(true);
    }//GEN-LAST:event_propiedadesButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iniciarSesionButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton propiedadesButton;
    // End of variables declaration//GEN-END:variables
}
