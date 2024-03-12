
package Camara;


import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class NewJFrame extends javax.swing.JFrame {
    int largocamara = 170;//ancho
    int anchocamara = 110;//largo
    BufferedImage ruta;
    int contador = 0;
    Dimension dimension = new Dimension(largocamara, anchocamara);
    Dimension dimension1 = WebcamResolution.VGA.getSize();
    Webcam webcam = Webcam.getDefault();
    WebcamPanel webcamPanel = new WebcamPanel(webcam, dimension, false);
    public NewJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        webcam.setViewSize(dimension1);
        webcamPanel.setFitArea(true);
        panelfoto.setLayout(new FlowLayout());
        panelfoto.add(webcamPanel);
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnApagar1 = new javax.swing.JButton();
        btnEncender1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        panelfoto = new javax.swing.JPanel();
        lblfoto = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnFoto = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new java.awt.Color(0, 0, 153)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("APAGAR");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 270, 90, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ENCENDER");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 90, -1));

        btnApagar1.setText("OFF");
        btnApagar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnApagar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 90, 50));

        btnEncender1.setText("ON");
        btnEncender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncender1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnEncender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 90, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, 340));

        jPanel3.setBackground(new java.awt.Color(0, 0, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelfoto.setBackground(new java.awt.Color(0, 51, 255));
        panelfoto.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 102)));

        javax.swing.GroupLayout panelfotoLayout = new javax.swing.GroupLayout(panelfoto);
        panelfoto.setLayout(panelfotoLayout);
        panelfotoLayout.setHorizontalGroup(
            panelfotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );
        panelfotoLayout.setVerticalGroup(
            panelfotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        jPanel3.add(panelfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 180, 120));

        lblfoto.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 255, 255)));
        jPanel3.add(lblfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 160, 100));

        btnGuardar.setText("Tomar Foto");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 140, -1));

        btnFoto.setText("Tomar Foto");
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });
        jPanel3.add(btnFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 140, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 410, 220));

        jPanel4.setBackground(new java.awt.Color(0, 0, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 410, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Imprimir Foto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, 40));

        btnCerrar.setBackground(new java.awt.Color(204, 204, 204));
        btnCerrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(0, 0, 255));
        btnCerrar.setText("Cerrar");
        btnCerrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCerrar.setBorderPainted(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 80, 30));

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jPanel1.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
     
        btnFoto.setText("Tomar Otra");
        btnGuardar.setEnabled(true);
        ImageIcon foto;
        foto = new ImageIcon(webcam.getImage());
        Icon iconoFoto = new ImageIcon(foto.getImage().getScaledInstance(lblfoto.getWidth(), lblfoto.getHeight(), Image.SCALE_SMOOTH));
        lblfoto.setIcon(iconoFoto);
        ruta = webcam.getImage();
    }//GEN-LAST:event_btnFotoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      int pregunta = JOptionPane.showConfirmDialog(this, "¿Guardar Fotografia?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (pregunta == 0) {
            File salidaimagen = new File("C:\\Users\\670292371\\OneDrive - Signify\\Documents\\PRODUCCION\\PROGRAMAS ALVARO YUSTE\\CamaraFotografica\\Fotos\\" + contador + ".jpg");
            try {
                ImageIO.write(ruta, "jpg", salidaimagen);
                JOptionPane.showMessageDialog(null, "Guardado en:" + salidaimagen.getAbsolutePath());
            } catch (IOException e) {

                System.out.println("Error " + e);
            }
            lblfoto.setIcon(null);
           }
        contador++;
    }//GEN-LAST:event_btnGuardarActionPerformed
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
    dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        webcamPanel.stop();
        lblfoto.setIcon(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEncenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO btnEncenderActionPerformed handling code here:
 Thread hilo = new Thread() {
            @Override
            public void run() {
                webcamPanel.start();
              }
        };
        hilo.setDaemon(true);
        hilo.start();
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnApagar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagar1ActionPerformed
        webcamPanel.stop();
        lblfoto.setIcon(null);

    }//GEN-LAST:event_btnApagar1ActionPerformed

    private void btnEncender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncender1ActionPerformed
        Thread hilo = new Thread() {
            @Override
            public void run() {
                webcamPanel.start();
            }
        };
        hilo.setDaemon(true);
        hilo.start();

    }//GEN-LAST:event_btnEncender1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar1;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEncender1;
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JPanel panelfoto;
    // End of variables declaration//GEN-END:variables
}
