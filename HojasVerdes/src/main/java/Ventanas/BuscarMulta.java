/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import Utilidades.Multa;

/**
 *
 * @author NATALIA
 */
public class BuscarMulta extends javax.swing.JFrame {

    private Multa multaEncontrada;

    /**
     * Creates new form BuscarMulta
     */
    public BuscarMulta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buscarButton = new javax.swing.JButton();
        identificacionMultaCampo = new javax.swing.JTextField();
        descargarInformacionMulta = new javax.swing.JButton();
        salirButton2 = new javax.swing.JButton();
        identificacionMulta = new javax.swing.JLabel();
        identificacionMulta1 = new javax.swing.JLabel();
        numeroPropiedadCampo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(225, 240, 222));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 685));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel1.setText("Buscar Multa");

        buscarButton.setBackground(new java.awt.Color(147, 213, 109));
        buscarButton.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        buscarButton.setText("Buscar");
        buscarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        identificacionMultaCampo.setToolTipText("");
        identificacionMultaCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificacionMultaCampoActionPerformed(evt);
            }
        });

        descargarInformacionMulta.setBackground(new java.awt.Color(147, 213, 109));
        descargarInformacionMulta.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        descargarInformacionMulta.setText("Descargar información multa");
        descargarInformacionMulta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        descargarInformacionMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descargarInformacionMultaActionPerformed(evt);
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

        identificacionMulta.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        identificacionMulta.setText("Identificación multa:");

        identificacionMulta1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        identificacionMulta1.setText("Numero de la propiedad:");

        numeroPropiedadCampo.setToolTipText("");
        numeroPropiedadCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroPropiedadCampoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setText("Ingrese el número de la propiedad o la identificación de la multa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(salirButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(382, 382, 382))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(276, 276, 276))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(identificacionMulta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(identificacionMultaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(identificacionMulta1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroPropiedadCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(136, 136, 136))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 154, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(385, 385, 385))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(descargarInformacionMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(324, 324, 324))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identificacionMulta1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroPropiedadCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identificacionMulta)
                    .addComponent(identificacionMultaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(descargarInformacionMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(salirButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
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

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        String numeroPropiedad = numeroPropiedadCampo.getText().trim();
        String identificacionMulta = identificacionMultaCampo.getText().trim();
        Gson gson = new Gson();
        List<Multa> multas = new ArrayList<>();

        // Leer el archivo JSON de multas si existe
        File archivoMultas = new File("multas.json");
        if (archivoMultas.exists() && archivoMultas.length() != 0) {
            try (FileReader reader = new FileReader(archivoMultas)) {
                java.lang.reflect.Type multaListType = new TypeToken<ArrayList<Multa>>(){}.getType();
                multas = gson.fromJson(reader, multaListType);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        multaEncontrada = null;
        // Buscar la multa por número de propiedad o identificación de la multa

        for (Multa multa : multas) {
            if (multa.getNumeroPropiedad().equals(numeroPropiedad) || multa.getIdentificacionMulta().equals(identificacionMulta)) {
                multaEncontrada = multa;
                break;
            }
        }

        if (multaEncontrada != null) {
            JOptionPane.showMessageDialog(this, "La multa se encontró, ya puede descargar la información de la multa");
        } else {
            JOptionPane.showMessageDialog(this, "Multa no encontrada");
        }
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void identificacionMultaCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificacionMultaCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identificacionMultaCampoActionPerformed

    private void descargarInformacionMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descargarInformacionMultaActionPerformed
        if (multaEncontrada == null) {
            JOptionPane.showMessageDialog(this, "Primero debe buscar y seleccionar una multa");
            return;
        }

        try {
            Document document = new Document(PageSize.A4);
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("informacion_multa.pdf"));
            document.open();

            Rectangle rect = new Rectangle(document.getPageSize());
            rect.setBackgroundColor(new BaseColor(225, 240, 222)); // Color #E1F0DE
            writer.getDirectContentUnder().rectangle(rect);

            // Establecer el color de fondo
            document.addAuthor("Urbanización Hojas Verdes");
            document.addTitle("Información de la Multa");

            // Fuentes
            Font titleFont = FontFactory.getFont("Georgia", 18, Font.BOLD);
            Font subtitleFont = FontFactory.getFont("Georgia", 14, Font.BOLD);
            Font boldFont = FontFactory.getFont("Georgia", 12, Font.BOLD);
            Font normalFont = FontFactory.getFont("Georgia", 12, Font.NORMAL);

            // Título
            Paragraph title = new Paragraph("Urbanización Hojas Verdes", titleFont);
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);

            document.add(new Paragraph("\n"));
            // Subtítulo
            Paragraph subtitle = new Paragraph("Información de la Multa", subtitleFont);
            subtitle.setAlignment(Element.ALIGN_CENTER);
            document.add(subtitle);

            // Información de la multa
            document.add(new Paragraph("\n"));
            document.add(new Paragraph("Identificación de la Multa: " + multaEncontrada.getIdentificacionMulta(), boldFont));
            document.add(new Paragraph("Número de la Propiedad: " + multaEncontrada.getNumeroPropiedad(), boldFont));
            document.add(new Paragraph("Fecha de la Multa: " + multaEncontrada.getFechaMulta(), boldFont));
            document.add(new Paragraph("Fecha de los Eventos: " + multaEncontrada.getFechaEventos(), boldFont));
            document.add(new Paragraph("Zona Común: " + multaEncontrada.getZonaComun(), boldFont));
            document.add(new Paragraph("Valor de la Multa: " + multaEncontrada.getValorMulta(), boldFont));
            document.add(new Paragraph("Fecha Límite de Pago: " + multaEncontrada.getFechaLimitePago(), boldFont));
            document.add(new Paragraph("Observaciones: " + multaEncontrada.getObservaciones(), boldFont));

            document.close();

            File pdfFile = new File("informacion_multa.pdf");
            if (pdfFile.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(pdfFile);
                } else {
                    System.out.println("Awt Desktop is not supported!");
                }
            } else {
                System.out.println("File does not exist!");
            }

        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_descargarInformacionMultaActionPerformed

    private void salirButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButton2ActionPerformed
        Index ventanaIndex = new Index();
        this.setVisible(false);
        ventanaIndex.setVisible(true);
    }//GEN-LAST:event_salirButton2ActionPerformed

    private void numeroPropiedadCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroPropiedadCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroPropiedadCampoActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarMulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarButton;
    private javax.swing.JButton descargarInformacionMulta;
    private javax.swing.JLabel identificacionMulta;
    private javax.swing.JLabel identificacionMulta1;
    private javax.swing.JTextField identificacionMultaCampo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numeroPropiedadCampo;
    private javax.swing.JButton salirButton2;
    // End of variables declaration//GEN-END:variables
}