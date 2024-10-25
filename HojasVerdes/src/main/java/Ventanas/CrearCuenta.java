/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import Utilidades.Usuario;
import Utilidades.Propietario;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CrearCuenta extends javax.swing.JFrame {
    public CrearCuenta() {
        initComponents();
        inicializarArchivosJSON();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoTexto1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoTexto2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoTexto3 = new javax.swing.JTextField();
        campoTexto4 = new javax.swing.JTextField();
        crearCuentaButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoTexto5 = new javax.swing.JTextField();
        campoTexto6 = new javax.swing.JTextField();
        iniciarSesionButton = new javax.swing.JButton();
        salirButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(225, 240, 222));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 685));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel1.setText("Crear Cuenta");

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel2.setText("Nombre completo:");

        campoTexto1.setToolTipText("");
        campoTexto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTexto1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel3.setText("Cédula:");

        campoTexto2.setToolTipText("");
        campoTexto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTexto2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel4.setText("Correo:");

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel5.setText("Número de su propiedad:");

        campoTexto3.setToolTipText("");
        campoTexto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTexto3ActionPerformed(evt);
            }
        });

        campoTexto4.setToolTipText("");
        campoTexto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTexto4ActionPerformed(evt);
            }
        });

        crearCuentaButton.setBackground(new java.awt.Color(147, 213, 109));
        crearCuentaButton.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        crearCuentaButton.setText("Crear ");
        crearCuentaButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        crearCuentaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCuentaButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel6.setText("Usuario con el que desea ingresar:");

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel7.setText("Contraseña:");

        iniciarSesionButton.setBackground(new java.awt.Color(147, 213, 109));
        iniciarSesionButton.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        iniciarSesionButton.setText("Iniciar Sesión");
        iniciarSesionButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iniciarSesionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionButtonActionPerformed(evt);
            }
        });

        salirButton2.setBackground(new java.awt.Color(147, 213, 109));
        salirButton2.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        salirButton2.setText("Salir");
        salirButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salirButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(172, 172, 172)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoTexto6)
                    .addComponent(campoTexto2, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(campoTexto4)
                    .addComponent(campoTexto3)
                    .addComponent(campoTexto1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoTexto5))
                .addGap(138, 138, 138))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(285, 285, 285))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(crearCuentaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(iniciarSesionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(salirButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoTexto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoTexto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoTexto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoTexto6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salirButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(crearCuentaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iniciarSesionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(147, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoTexto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTexto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTexto1ActionPerformed

    private void campoTexto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTexto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTexto2ActionPerformed

    private void campoTexto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTexto3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTexto3ActionPerformed

    private void campoTexto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTexto4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTexto4ActionPerformed

    private void iniciarSesionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionButtonActionPerformed
        IniciarSesion ventanaIniciarSesion = new IniciarSesion();
        this.setVisible(false);
        ventanaIniciarSesion.setVisible(true);
    }//GEN-LAST:event_iniciarSesionButtonActionPerformed

    private void salirButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButton2ActionPerformed
        Index ventanaIndex = new Index();
        this.setVisible(false);
        ventanaIndex.setVisible(true);
    }//GEN-LAST:event_salirButton2ActionPerformed

    private void inicializarArchivosJSON() {
        File archivoUsuarios = new File("usuarios.json");
        File archivoPropietarios = new File("propietarios.json");

        if (!archivoUsuarios.exists()) {
            try (FileWriter writer = new FileWriter(archivoUsuarios)) {
                List<Usuario> usuarios = new ArrayList<>();
                Gson gson = new Gson();
                gson.toJson(usuarios, writer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (!archivoPropietarios.exists()) {
            try (FileWriter writer = new FileWriter(archivoPropietarios)) {
                List<Propietario> propietarios = new ArrayList<>();
                Gson gson = new Gson();
                gson.toJson(propietarios, writer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (!archivoUsuarios.exists()) {
            List<Usuario> usuarios = new ArrayList<>();
            usuarios.add(new Usuario("admin", "admin123"));
            guardarUsuarios(usuarios, "admin", "admin123");
        }

        if (!archivoPropietarios.exists()) {
            List<Propietario> propietarios = new ArrayList<>();
            guardarPropietarios(propietarios);
            propietarios.add(new Propietario("Administrador", "0000000000", "administrador@correo.com","adminPropiedad"));
            guardarPropietarios(propietarios);
            }
        }

    private void guardarUsuarios(List<Usuario> usuarios, String usuario, String contrasena) {
        Gson gson = new Gson();
        List<Usuario> usuarios2 = new ArrayList<>();

        File archivoUsuarios = new File("usuarios.json");
        if (archivoUsuarios.exists() && archivoUsuarios.length() != 0) {
            try (FileReader reader = new FileReader(archivoUsuarios)) {
                java.lang.reflect.Type usuarioListType = new TypeToken<ArrayList<Usuario>>(){}.getType();
                usuarios2 = gson.fromJson(reader, usuarioListType);
            
            } catch (IOException e) {
                e.printStackTrace();
            }

            try (FileWriter writer = new FileWriter("usuarios.json")) {
                Gson gsonPretty = new GsonBuilder().setPrettyPrinting().create();
                gsonPretty.toJson(usuarios2, writer);
            } catch (IOException e) {
                e.printStackTrace();
            }

        usuarios.add(new Usuario(usuario, contrasena));
    }
}

    private void guardarPropietarios(List<Propietario> propietarios) {

        List<Propietario> propietarios2 = new ArrayList<>();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter("propietarios.json")) {
            String json = gson.toJson(propietarios2);
            writer.write(json);
        
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter writer = new FileWriter("proietarios.json")) {
            Gson gsonPretty = new GsonBuilder().setPrettyPrinting().create();
            gsonPretty.toJson(propietarios2, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void guardarUsuario(String usuario, String contrasena) {
        Gson gson = new Gson();

        File archivoUsuarios = new File("usuarios.json");
        List<Usuario> usuarios = new ArrayList<>();
        if (archivoUsuarios.exists() && archivoUsuarios.length() != 0) {
            try (FileReader reader = new FileReader(archivoUsuarios)) {
                java.lang.reflect.Type usuarioListType = new TypeToken<ArrayList<Usuario>>(){}.getType();
                usuarios = gson.fromJson(reader, usuarioListType);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        usuarios.add(new Usuario(usuario, contrasena));

        try (FileWriter writer = new FileWriter("usuarios.json")) {
            gson.toJson(usuarios, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void crearCuentaButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        String correo = campoTexto3.getText();
        String numeroPropiedad = campoTexto4.getText();
        String usuario = campoTexto5.getText();
        String contrasena = campoTexto6.getText();

        Gson gson = new Gson();
        List<Usuario> usuarios = new ArrayList<>();
        List<Propietario> propietarios = new ArrayList<>();

        File archivoUsuarios = new File("usuarios.json");
        if (archivoUsuarios.exists()) {
            try (FileReader reader = new FileReader(archivoUsuarios)) {
                java.lang.reflect.Type usuarioListType = new TypeToken<ArrayList<Usuario>>(){}.getType();
                usuarios = gson.fromJson(reader, usuarioListType);
            } catch (IOException e) {
                e.printStackTrace();
            }

            try (FileWriter writer = new FileWriter("usuarios.json")) {
                Gson gsonPretty = new GsonBuilder().setPrettyPrinting().create();
                gsonPretty.toJson(usuarios, writer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File archivoPropietarios = new File("propietarios.json");
        if (archivoPropietarios.exists()) {
            try (FileReader reader = new FileReader(archivoPropietarios)) {
                java.lang.reflect.Type propietarioListType = new TypeToken<ArrayList<Propietario>>(){}.getType();
                propietarios = gson.fromJson((java.io.Reader) reader, propietarioListType);           
            } catch (IOException e) {
                e.printStackTrace();
            }

            try (FileWriter writer = new FileWriter("propietarios.json")) {
                Gson gsonPretty = new GsonBuilder().setPrettyPrinting().create();
                gsonPretty.toJson(propietarios, writer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (Propietario propietario : propietarios) {
            if (propietario.getNumeroPropiedad().equals(numeroPropiedad)) {
                JOptionPane.showMessageDialog(this, "Las propiedades solo pueden estar a nombre de una sola persona");
                return;
            }
        }

        propietarios.add(new Propietario(campoTexto1.getText(), campoTexto2.getText(), numeroPropiedad, correo));

        try (FileWriter writer = new FileWriter("propietarios.json")) {
            gson.toJson(propietarios, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        guardarUsuario(usuario, contrasena);

        JOptionPane.showMessageDialog(this, "Cuenta creada exitosamente");
    
        }

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
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoTexto1;
    private javax.swing.JTextField campoTexto2;
    private javax.swing.JTextField campoTexto3;
    private javax.swing.JTextField campoTexto4;
    private javax.swing.JTextField campoTexto5;
    private javax.swing.JTextField campoTexto6;
    private javax.swing.JButton crearCuentaButton;
    private javax.swing.JButton iniciarSesionButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salirButton2;
    // End of variables declaration//GEN-END:variables
}
