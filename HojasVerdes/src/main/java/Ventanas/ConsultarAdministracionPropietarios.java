/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Rectangle;
import java.util.Date;
import java.awt.Desktop;



import Utilidades.Administracion;

/**
 *
 * @author NATALIA
 */
public class ConsultarAdministracionPropietarios extends javax.swing.JFrame {

    public ConsultarAdministracionPropietarios() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buscarButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        numeroPropiedad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        valorAdministracion = new javax.swing.JTextField();
        descargarReciboButton = new javax.swing.JButton();
        salirButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(225, 240, 222));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 685));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel1.setText("Consultar Valor Administración");

        buscarButton.setBackground(new java.awt.Color(147, 213, 109));
        buscarButton.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        buscarButton.setText("Buscar");
        buscarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel2.setText("Número de propiedad:");

        numeroPropiedad.setToolTipText("");
        numeroPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroPropiedadActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel3.setText("Valor de administración:");

        valorAdministracion.setToolTipText("");
        valorAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorAdministracionActionPerformed(evt);
            }
        });

        descargarReciboButton.setBackground(new java.awt.Color(147, 213, 109));
        descargarReciboButton.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        descargarReciboButton.setText("Descargar recibo de pago");
        descargarReciboButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        descargarReciboButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descargarReciboButtonActionPerformed(evt);
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
                .addGap(136, 136, 136)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(numeroPropiedad, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(valorAdministracion))
                .addGap(150, 150, 150))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(388, 388, 388))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(descargarReciboButton, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(331, 331, 331))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(salirButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(382, 382, 382))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numeroPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(valorAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(descargarReciboButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(salirButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
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

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        String numeroPropiedadStr = numeroPropiedad.getText();
        String valorAdministracionStr = "";

        if (numeroPropiedadStr.contains("A")) {
            valorAdministracionStr = "550.000";
        } else if (numeroPropiedadStr.contains("B")) {
            valorAdministracionStr = "750.000";
        } else if (numeroPropiedadStr.contains("C")) {
            valorAdministracionStr = "950.000";
        }

        Administracion administracion = new Administracion(numeroPropiedadStr, valorAdministracionStr);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<Administracion> administraciones = new ArrayList<>();

        File archivoAdministraciones = new File("administraciones.json");
        if (archivoAdministraciones.exists() && archivoAdministraciones.length() != 0) {
            try (FileReader reader = new FileReader(archivoAdministraciones)) {
                java.lang.reflect.Type propiedadListType = new TypeToken<ArrayList<Administracion>>(){}.getType();
                administraciones = gson.fromJson(reader, propiedadListType);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        administraciones.add(administracion);

        try (FileWriter writer = new FileWriter("administraciones.json")) {
            gson.toJson(administraciones, writer);
        } catch (IOException e) {
            e.printStackTrace();
    }

    valorAdministracion.setText(valorAdministracionStr);
    }

    private void numeroPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroPropiedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroPropiedadActionPerformed

    private void valorAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorAdministracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorAdministracionActionPerformed

    private void salirButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButton2ActionPerformed
        Propietarios ventanaPropietarios = new Propietarios();
        this.setVisible(false);
        ventanaPropietarios.setVisible(true);
    }//GEN-LAST:event_salirButton2ActionPerformed

    private void descargarReciboButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        try{
            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("recibo.pdf"));
            document.open();

            writer.setPageEvent(new PdfPageEventHelper() {
                @Override
                public void onEndPage(PdfWriter writer, Document document) {
                    PdfContentByte canvas = writer.getDirectContentUnder();
                    Rectangle rect = document.getPageSize();
                    canvas.setColorFill(new BaseColor(225, 240, 222)); 
                    canvas.rectangle(rect.getLeft(), rect.getBottom(), rect.getWidth(), rect.getHeight());
                    canvas.fill();
                }
            });

            FontFactory.register("C:/Windows/Fonts/georgia.ttf", "Georgia");

            Font georgiaFont = FontFactory.getFont("Georgia", BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 12, Font.NORMAL, BaseColor.BLACK);
            Font georgiaFontTitle = FontFactory.getFont("Georgia", BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 20, Font.BOLD, BaseColor.BLACK);
            Font georgiaFontSubtitle = FontFactory.getFont("Georgia", BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 14, Font.BOLD, BaseColor.BLACK);

            Paragraph titulo = new Paragraph("Urbanización Hojas Verdes", georgiaFontTitle);
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);

            document.add(new Paragraph("\n\n"));

            Paragraph subtitulo = new Paragraph("Factura Administración", georgiaFontSubtitle);
            subtitulo.setAlignment(Element.ALIGN_LEFT);
            document.add(subtitulo);

            String fecha = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
            Paragraph date = new Paragraph("Fecha: " + fecha, georgiaFont);
            date.setAlignment(Element.ALIGN_LEFT);
            document.add(date);

            Paragraph direccion = new Paragraph("Dirección: Calle 6sur# 45-90", georgiaFont);
            direccion.setAlignment(Element.ALIGN_LEFT);
            document.add(direccion);

            Phrase numeroPropiedadPhrase = new Phrase("Numero de Propiedad: " + numeroPropiedad.getText(), georgiaFont);
            direccion.setAlignment(Element.ALIGN_LEFT);
            document.add(numeroPropiedadPhrase);

            document.add(new Paragraph("\n")); 

            PdfPTable table = new PdfPTable(2);
            table.setWidthPercentage(100);
            table.setSpacingBefore(10f);
            table.setSpacingAfter(10f);

            PdfPCell header1 = new PdfPCell(new Phrase("Descripción", georgiaFontSubtitle));
            header1.setBackgroundColor(BaseColor.LIGHT_GRAY); 
            header1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(header1);

            PdfPCell header2 = new PdfPCell(new Phrase("Valor", georgiaFontSubtitle));
            header2.setBackgroundColor(BaseColor. LIGHT_GRAY); 
            header2.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(header2);

            table.addCell(new PdfPCell(new Phrase("Administración", georgiaFont)));
            table.addCell(new PdfPCell(new Phrase("$" + valorAdministracion.getText(), georgiaFont))); 

            document.add(table);

             document.add(new Paragraph("\n\n")); 
             Paragraph footer = new Paragraph("Gracias por su atención.", georgiaFont);
             footer.setAlignment(Paragraph.ALIGN_CENTER);
             document.add(footer);

            document.close();

            File pdfFile = new File("recibo.pdf");
            if (pdfFile.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(pdfFile);
                } else {
                    System.out.println("Awt Desktop is not supported!");
                }
            } else {
                System.out.println("File does not exist!");
            }
            
            JOptionPane.showMessageDialog(null, "Factura descargada exitosamente");

        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
    }
    


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
            java.util.logging.Logger.getLogger(ConsultarAdministracionPropietarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarAdministracionPropietarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarAdministracionPropietarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarAdministracionPropietarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarAdministracionPropietarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarButton;
    private javax.swing.JButton descargarReciboButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numeroPropiedad;
    private javax.swing.JButton salirButton2;
    private javax.swing.JTextField valorAdministracion;
    // End of variables declaration//GEN-END:variables
}
