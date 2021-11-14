/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author clara
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jpMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jpHorasEmpleado = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jpEmpleado = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jpTrabajaEn = new javax.swing.JPanel();
        jlTrabajaEn = new javax.swing.JLabel();
        jpProyecto = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jpBienvenido = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);

        background.setBackground(new java.awt.Color(245, 198, 165));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpMenu.setBackground(new java.awt.Color(133, 39, 71));
        jpMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMPRESA");
        jpMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 68, -1, -1));
        jpMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 105, 177, 12));

        jpHorasEmpleado.setBackground(new java.awt.Color(133, 39, 71));
        jpHorasEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpHorasEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpHorasEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpHorasEmpleadoMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Horas por empleado");

        javax.swing.GroupLayout jpHorasEmpleadoLayout = new javax.swing.GroupLayout(jpHorasEmpleado);
        jpHorasEmpleado.setLayout(jpHorasEmpleadoLayout);
        jpHorasEmpleadoLayout.setHorizontalGroup(
            jpHorasEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHorasEmpleadoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jpHorasEmpleadoLayout.setVerticalGroup(
            jpHorasEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHorasEmpleadoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jpMenu.add(jpHorasEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 240, 70));

        jpEmpleado.setBackground(new java.awt.Color(133, 39, 71));
        jpEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpEmpleadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpEmpleadoMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Empleado");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jpEmpleadoLayout = new javax.swing.GroupLayout(jpEmpleado);
        jpEmpleado.setLayout(jpEmpleadoLayout);
        jpEmpleadoLayout.setHorizontalGroup(
            jpEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEmpleadoLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel3)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jpEmpleadoLayout.setVerticalGroup(
            jpEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEmpleadoLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(22, 22, 22))
        );

        jpMenu.add(jpEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 240, 70));

        jpTrabajaEn.setBackground(new java.awt.Color(133, 39, 71));
        jpTrabajaEn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpTrabajaEn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpTrabajaEnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpTrabajaEnMouseExited(evt);
            }
        });

        jlTrabajaEn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlTrabajaEn.setForeground(new java.awt.Color(255, 255, 255));
        jlTrabajaEn.setText("Trabaja en");

        javax.swing.GroupLayout jpTrabajaEnLayout = new javax.swing.GroupLayout(jpTrabajaEn);
        jpTrabajaEn.setLayout(jpTrabajaEnLayout);
        jpTrabajaEnLayout.setHorizontalGroup(
            jpTrabajaEnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTrabajaEnLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jlTrabajaEn)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jpTrabajaEnLayout.setVerticalGroup(
            jpTrabajaEnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTrabajaEnLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlTrabajaEn)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jpMenu.add(jpTrabajaEn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 240, 70));

        jpProyecto.setBackground(new java.awt.Color(133, 39, 71));
        jpProyecto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpProyectoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpProyectoMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Proyecto");

        javax.swing.GroupLayout jpProyectoLayout = new javax.swing.GroupLayout(jpProyecto);
        jpProyecto.setLayout(jpProyectoLayout);
        jpProyectoLayout.setHorizontalGroup(
            jpProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProyectoLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel6)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jpProyectoLayout.setVerticalGroup(
            jpProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProyectoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jpMenu.add(jpProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 240, 70));

        background.add(jpMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 700));

        jpBienvenido.setBackground(new java.awt.Color(162, 65, 107));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenid@ a empresa");

        javax.swing.GroupLayout jpBienvenidoLayout = new javax.swing.GroupLayout(jpBienvenido);
        jpBienvenido.setLayout(jpBienvenidoLayout);
        jpBienvenidoLayout.setHorizontalGroup(
            jpBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBienvenidoLayout.createSequentialGroup()
                .addContainerGap(372, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(356, 356, 356))
        );
        jpBienvenidoLayout.setVerticalGroup(
            jpBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBienvenidoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        background.add(jpBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 960, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEmpleadoMouseEntered
        jpEmpleado.setBackground(new Color(162,65,107));
    }//GEN-LAST:event_jpEmpleadoMouseEntered

    private void jpEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEmpleadoMouseExited
        jpEmpleado.setBackground(new Color(133,39,71));
    }//GEN-LAST:event_jpEmpleadoMouseExited

    private void jpTrabajaEnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTrabajaEnMouseEntered
        jpTrabajaEn.setBackground(new Color(162,65,107));
    }//GEN-LAST:event_jpTrabajaEnMouseEntered

    private void jpTrabajaEnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTrabajaEnMouseExited
        jpTrabajaEn.setBackground(new Color(133,39,71));
    }//GEN-LAST:event_jpTrabajaEnMouseExited

    private void jpProyectoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProyectoMouseEntered
        jpProyecto.setBackground(new Color(162,65,107));
    }//GEN-LAST:event_jpProyectoMouseEntered

    private void jpProyectoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProyectoMouseExited
        jpProyecto.setBackground(new Color(133,39,71));
    }//GEN-LAST:event_jpProyectoMouseExited

    private void jpHorasEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpHorasEmpleadoMouseEntered
        jpHorasEmpleado.setBackground(new Color(162,65,107));
    }//GEN-LAST:event_jpHorasEmpleadoMouseEntered

    private void jpHorasEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpHorasEmpleadoMouseExited
        jpHorasEmpleado.setBackground(new Color(133,39,71));
    }//GEN-LAST:event_jpHorasEmpleadoMouseExited

    private void jpEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEmpleadoMouseClicked
        MenuEmpleado me = new MenuEmpleado();
        mostrarPanelMenuABCC(me);
    }//GEN-LAST:event_jpEmpleadoMouseClicked

    
    private void mostrarPanelMenuABCC (JPanel p){
        p.setSize(960, 100);
        p.setLocation(0, 0);
        
        jpBienvenido.removeAll();
        jpBienvenido.add(p, BorderLayout.CENTER);
        jpBienvenido.revalidate();
        jpBienvenido.repaint();
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlTrabajaEn;
    private javax.swing.JPanel jpBienvenido;
    private javax.swing.JPanel jpEmpleado;
    private javax.swing.JPanel jpHorasEmpleado;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel jpProyecto;
    private javax.swing.JPanel jpTrabajaEn;
    // End of variables declaration//GEN-END:variables
}
