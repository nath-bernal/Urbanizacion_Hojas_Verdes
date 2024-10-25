/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;
import Utilidades.Multa;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.JOptionPane;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.Element;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.ArrayList;
import java.awt.Desktop;

/**
 *
 * @author NATALIA
 */
public class CrearMulta extends javax.swing.JFrame {
    
    public CrearMulta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salirButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        crearMultaButton = new javax.swing.JButton();
        descargarFacturaButton = new javax.swing.JButton();
        descargarInformacionButton = new javax.swing.JButton();
        salirButton2 = new javax.swing.JButton();

        salirButton1.setBackground(new java.awt.Color(147, 213, 109));
        salirButton1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        salirButton1.setText("Salir");
        salirButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salirButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(225, 240, 222));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 710));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel1.setText("Crear Multa");

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel2.setText("Identificación de la multa:");

        jTextField.setToolTipText("");
        jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel3.setText("Número de la propiedad multada:");

        jTextField1.setToolTipText("");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel4.setText("Fecha de la multa:");

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel5.setText("Fecha de los eventos:");

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel6.setText("Zona común en la que se origina la multa:");

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel7.setText("Valor de la multa:");

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel8.setText("Fecha límite de pago:");

        jLabel9.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel9.setText("Observaciones:");

        jTextField2.setToolTipText("");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setToolTipText("");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setToolTipText("");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setToolTipText("");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setToolTipText("");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.setToolTipText("");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        crearMultaButton.setBackground(new java.awt.Color(147, 213, 109));
        crearMultaButton.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        crearMultaButton.setText("Crear multa");
        crearMultaButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        crearMultaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearMultaButtonActionPerformed(evt);
            }
        });

        descargarFacturaButton.setBackground(new java.awt.Color(147, 213, 109));
        descargarFacturaButton.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        descargarFacturaButton.setText("Descargar factura");
        descargarFacturaButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        descargarFacturaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descargarFacturaButtonActionPerformed(evt);
            }
        });

        descargarInformacionButton.setBackground(new java.awt.Color(147, 213, 109));
        descargarInformacionButton.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        descargarInformacionButton.setText("Descargar información de la multa");
        descargarInformacionButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        descargarInformacionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descargarInformacionButtonActionPerformed(evt);
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
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                        .addGap(156, 156, 156))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(crearMultaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(descargarFacturaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(308, 308, 308))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(descargarInformacionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(salirButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearMultaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descargarFacturaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descargarInformacionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void salirButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salirButton1ActionPerformed

    private void salirButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButton2ActionPerformed
        Administrador ventanaAdministrador = new Administrador();
        this.setVisible(false);
        ventanaAdministrador.setVisible(true);
    }//GEN-LAST:event_salirButton2ActionPerformed

    private void descargarFacturaButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String identificacionMulta = jTextField.getText(); 
        String numeroPropiedad = jTextField1.getText();
        String fechaMulta = jTextField2.getText();
        String valorMulta = jTextField5.getText();
        String observaciones = jTextField7.getText();
    
        try {
            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("factura_multa.pdf"));
            document.open();

            Rectangle rect = new Rectangle(document.getPageSize());
            rect.setBackgroundColor(new BaseColor(225, 240, 222)); 
            writer.getDirectContentUnder().rectangle(rect);

            FontFactory.register("C:/Windows/Fonts/georgia.ttf", "Georgia");

            Font georgiaFont = FontFactory.getFont("Georgia", BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 12, Font.NORMAL, BaseColor.BLACK);
            Font georgiaFontTitle = FontFactory.getFont("Georgia", BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 20, Font.BOLD, BaseColor.BLACK);
            Font georgiaFontSubtitle = FontFactory.getFont("Georgia", BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 14, Font.BOLD, BaseColor.BLACK);
            Font georgiaFontSmall = FontFactory.getFont("Georgia", BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 10, Font.NORMAL, BaseColor.BLACK);

            Paragraph titulo = new Paragraph("Urbanización Hojas Verdes", georgiaFontTitle);
            titulo.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(titulo);

            document.add(new Paragraph("\n\n"));

            PdfPTable headerTable = new PdfPTable(2);
            headerTable.setWidthPercentage(100);
            headerTable.setSpacingBefore(10f);
            headerTable.setSpacingAfter(10f);
    
            PdfPCell cell1 = new PdfPCell(new Paragraph("Factura Multa", georgiaFontSubtitle));
            cell1.setBorder(PdfPCell.NO_BORDER);
            headerTable.addCell(cell1);
    
            PdfPCell cell2 = new PdfPCell(new Paragraph("Fecha de la multa: " + fechaMulta, georgiaFontSmall));
            cell2.setBorder(PdfPCell.NO_BORDER);
            cell2.setHorizontalAlignment(Element.ALIGN_RIGHT);
            headerTable.addCell(cell2);
    
            PdfPCell cell3 = new PdfPCell(new Paragraph("Número de la factura: " + "001", georgiaFontSmall));
            cell3.setBorder(PdfPCell.NO_BORDER);
            headerTable.addCell(cell3);
    
            PdfPCell cell4 = new PdfPCell(new Paragraph("Calle 6sur# 45-90", georgiaFontSmall));
            cell4.setBorder(PdfPCell.NO_BORDER);
            cell4.setHorizontalAlignment(Element.ALIGN_RIGHT);
            headerTable.addCell(cell4);
    
            PdfPCell cell5 = new PdfPCell(new Paragraph("Propiedad multada: " + numeroPropiedad, georgiaFontSmall));
            cell5.setBorder(PdfPCell.NO_BORDER);
            headerTable.addCell(cell5);
    
            PdfPCell cell6 = new PdfPCell(new Paragraph("", georgiaFontSmall)); // Celda vacía para mantener la estructura
            cell6.setBorder(PdfPCell.NO_BORDER);
            headerTable.addCell(cell6);
    
            document.add(headerTable);

            document.add(new Paragraph("\n"));

            PdfPTable table = new PdfPTable(4);
            table.setWidthPercentage(100);
            table.setSpacingBefore(10f);
            table.setSpacingAfter(10f);

            PdfPCell cellId = new PdfPCell(new Paragraph("Identificación", georgiaFont));
            cellId.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cellId.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cellId);
            
            PdfPCell cellDesc = new PdfPCell(new Paragraph("Descripción", georgiaFont));
            cellDesc.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cellDesc.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cellDesc);
    
            PdfPCell cellValue = new PdfPCell(new Paragraph("Valor de la Multa", georgiaFont));
            cellValue.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cellValue.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cellValue);
    
            PdfPCell cellTotal = new PdfPCell(new Paragraph("Total", georgiaFont));
            cellTotal.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cellTotal.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cellTotal);

            table.addCell(new PdfPCell(new Paragraph(identificacionMulta, georgiaFont)));
            table.addCell(new PdfPCell(new Paragraph(observaciones, georgiaFont)));
            table.addCell(new PdfPCell(new Paragraph(valorMulta, georgiaFont)));
            table.addCell(new PdfPCell(new Paragraph(valorMulta, georgiaFont)));

            document.add(table);

            document.add(new Paragraph("\n\n")); 
            Paragraph footer = new Paragraph("Gracias por su atención.", georgiaFont);
            footer.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(footer);
    
            document.close();
            File pdfFile = new File("factura_multa.pdf");
            if (pdfFile.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(pdfFile);
                } else {
                    System.out.println("Awt Desktop is not supported!");
                }
            } else {
                System.out.println("File does not exist!");
            }
            JOptionPane.showMessageDialog(this, "Factura descargada exitosamente");
        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
    }

    private void crearMultaButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
            String identificacionMulta = jTextField.getText();
            String numeroPropiedad = jTextField1.getText();
            String fechaMulta = jTextField2.getText();
            String fechaEventos = jTextField3.getText();
            String zonaComun = jTextField4.getText();
            String valorMulta = jTextField5.getText();
            String fechaLimitePago = jTextField6.getText();
            String observaciones = jTextField7.getText();
        
            Multa nuevaMulta = new Multa(identificacionMulta,numeroPropiedad, fechaMulta, fechaEventos, zonaComun, valorMulta, fechaLimitePago, observaciones);
        
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            List<Multa> multas = new ArrayList<>();

            File archivoMultas = new File("multas.json");
            if (archivoMultas.exists() && archivoMultas.length() != 0) {
                try (FileReader reader = new FileReader(archivoMultas)) {
                    java.lang.reflect.Type multaListType = new TypeToken<ArrayList<Multa>>(){}.getType();
                    multas = gson.fromJson(reader, multaListType);
                } catch (IOException e) {
                    e.printStackTrace();
                    multas = new ArrayList<>();
                }
            }
            
            multas.add(nuevaMulta);

            try (FileWriter writer = new FileWriter("multas.json")) {
                gson.toJson(multas, writer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(this, "Multa creada exitosamente");
        }


    private void descargarInformacionButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        String identificacionMulta = jTextField.getText();
        String numeroPropiedad = jTextField1.getText();
        String fechaMulta = jTextField2.getText();
        String fechaEventos = jTextField3.getText();
        String zonaComun = jTextField4.getText();
        String valorMulta = jTextField5.getText();
        String fechaLimitePago = jTextField6.getText();
        String observaciones = jTextField7.getText();

        try {
            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("informacion_multa.pdf"));
            document.open();

            Rectangle rect = new Rectangle(document.getPageSize());
            rect.setBackgroundColor(new BaseColor(225, 240, 222));
            writer.getDirectContentUnder().rectangle(rect);

            document.addAuthor("Urbanización Hojas Verdes");
            document.addTitle("Información de la Multa");

            Font titleFont = FontFactory.getFont("Georgia", 18, Font.BOLD);
            Font subtitleFont = FontFactory.getFont("Georgia", 14, Font.BOLD);
            Font boldFont = FontFactory.getFont("Georgia", 12, Font.BOLD);
            Font normalFont = FontFactory.getFont("Georgia", 12, Font.NORMAL);

            Paragraph title = new Paragraph("Urbanización Hojas Verdes", titleFont);
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);

            document.add(new Paragraph("\n"));

            Paragraph subtitle = new Paragraph("Información de la Multa", subtitleFont);
            subtitle.setAlignment(Element.ALIGN_CENTER);
            document.add(subtitle);

            document.add(new Paragraph("\n")); 

            PdfPTable table = new PdfPTable(2);
            table.setWidthPercentage(80);
            table.setSpacingBefore(15f);
            table.setSpacingAfter(15f);

            PdfPCell cell1 = new PdfPCell(new Phrase("Identificación de la Multa:", boldFont));
            cell1.setBorder(PdfPCell.NO_BORDER);
            table.addCell(cell1);

            PdfPCell cell2 = new PdfPCell(new Phrase(identificacionMulta, normalFont));
            cell2.setBorder(PdfPCell.NO_BORDER);
            table.addCell(cell2);

            PdfPCell cell3 = new PdfPCell(new Phrase("Número de la propiedad:", boldFont));
            cell3.setBorder(PdfPCell.NO_BORDER);
            table.addCell(cell3);

            PdfPCell cell4 = new PdfPCell(new Phrase(numeroPropiedad, normalFont));
            cell4.setBorder(PdfPCell.NO_BORDER);
            table.addCell(cell4);

            PdfPCell cell5 = new PdfPCell(new Phrase("Fecha de la Multa:", boldFont));
            cell5.setBorder(PdfPCell.NO_BORDER);
            table.addCell(cell5);

            PdfPCell cell6 = new PdfPCell(new Phrase(fechaMulta, normalFont));
            cell6.setBorder(PdfPCell.NO_BORDER);
            table.addCell(cell6);

            PdfPCell cell7 = new PdfPCell(new Phrase("Fecha de los eventos:", boldFont));
            cell7.setBorder(PdfPCell.NO_BORDER);
            table.addCell(cell7);

            PdfPCell cell8 = new PdfPCell(new Phrase(fechaEventos, normalFont));
            cell8.setBorder(PdfPCell.NO_BORDER);
            table.addCell(cell8);

            PdfPCell cell9 = new PdfPCell(new Phrase("Zona común:", boldFont));
            cell9.setBorder(PdfPCell.NO_BORDER);
            table.addCell(cell9);

            PdfPCell cell10 = new PdfPCell(new Phrase(zonaComun, normalFont));
            cell10.setBorder(PdfPCell.NO_BORDER);
            table.addCell(cell10);

            PdfPCell cell11 = new PdfPCell(new Phrase("Valor de la multa:", boldFont));
            cell11.setBorder(PdfPCell.NO_BORDER);
            table.addCell(cell11);

            PdfPCell cell12 = new PdfPCell(new Phrase(valorMulta, normalFont));
            cell12.setBorder(PdfPCell.NO_BORDER);
            table.addCell(cell12);

            PdfPCell cell13 = new PdfPCell(new Phrase("Fecha límite de pago:", boldFont));
            cell13.setBorder(PdfPCell.NO_BORDER);
            table.addCell(cell13);

            PdfPCell cell14 = new PdfPCell(new Phrase(fechaLimitePago, normalFont));
            cell14.setBorder(PdfPCell.NO_BORDER);
            table.addCell(cell14);

            PdfPCell cell15 = new PdfPCell(new Phrase("Observaciones:", boldFont));
            cell15.setBorder(PdfPCell.NO_BORDER);
            table.addCell(cell15);

            PdfPCell cell16 = new PdfPCell(new Phrase(observaciones, normalFont));
            cell16.setBorder(PdfPCell.NO_BORDER);
            table.addCell(cell16);

            document.add(table);

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
            JOptionPane.showMessageDialog(null, "Información descargada exitosamente");
        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(CrearMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearMulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearMultaButton;
    private javax.swing.JButton descargarFacturaButton;
    private javax.swing.JButton descargarInformacionButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton salirButton1;
    private javax.swing.JButton salirButton2;
    // End of variables declaration//GEN-END:variables
}
