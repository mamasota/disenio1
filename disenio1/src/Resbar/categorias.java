
import Resbar.Categorias;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author willi
 */
public class categorias extends javax.swing.JFrame {

    /**
     * Creates new form categorias
     */
   
    
    public categorias() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/imagenrestaurante.png")).getImage());
        this.setTitle("Categorias");
         this.setLocationRelativeTo(null);
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblcategorias = new javax.swing.JTable();
        btnmodificar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Categorias");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 102));
        jLabel1.setText("categorias");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/categories_gnome_applications_15716.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 70, 40));

        jtblcategorias.setBackground(new java.awt.Color(204, 255, 255));
        jtblcategorias.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 0), 2, true));
        jtblcategorias.setForeground(new java.awt.Color(153, 255, 255));
        jtblcategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "IdCategoria", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtblcategorias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, 90));

        btnmodificar.setBackground(new java.awt.Color(102, 255, 102));
        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.setBorder(null);
        btnmodificar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnmodificarMouseMoved(evt);
            }
        });
        btnmodificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnmodificarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnmodificarMouseEntered(evt);
            }
        });
        jPanel1.add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 140, 40));

        btnsalir.setBackground(new java.awt.Color(102, 255, 102));
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1486564399-close_81512.png"))); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.setBorder(null);
        btnsalir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnsalirMouseMoved(evt);
            }
        });
        btnsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsalirMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsalirMouseEntered(evt);
            }
        });
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
         dashboard menu=new dashboard();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnsalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseEntered
        // TODO add your handling code here:
        btnsalir.setBackground(new Color(0,204,51));//cambia el color del boton cuando paso el puntero sobre el boton
    }//GEN-LAST:event_btnsalirMouseEntered

    private void btnsalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseExited
        // TODO add your handling code here:
        btnsalir.setBackground(new Color(102,255,102));//cambia el color del boton cuando paso el puntero sobre el boton
    }//GEN-LAST:event_btnsalirMouseExited

    private void btnmodificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmodificarMouseEntered
        // TODO add your handling code here:
        btnmodificar.setBackground(new Color(0,204,51));//cambia el color del boton cuando paso el puntero sobre el boton
    }//GEN-LAST:event_btnmodificarMouseEntered

    private void btnmodificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmodificarMouseExited
        // TODO add your handling code here:
        btnmodificar.setBackground(new Color(102,255,102));//cambia el color del boton cuando paso el puntero sobre el boton
    }//GEN-LAST:event_btnmodificarMouseExited

    private void btnsalirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseMoved
        // TODO add your handling code here:
         String texto="Salir";
        btnsalir.setToolTipText(texto);//el metodo setToolTipTex hace que cuando pongo el puntero del raton sobre el boton muestre el nombre del boton
    }//GEN-LAST:event_btnsalirMouseMoved

    private void btnmodificarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmodificarMouseMoved
        // TODO add your handling code here:
         String texto="Modificar";
        btnmodificar.setToolTipText(texto);//el metodo setToolTipTex hace que cuando pongo el puntero del raton sobre el boton muestre el nombre del boton
    }//GEN-LAST:event_btnmodificarMouseMoved

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
            java.util.logging.Logger.getLogger(categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new categorias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtblcategorias;
    // End of variables declaration//GEN-END:variables
}
