/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;

/**
 *
 * @author clara
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        imgUser = new javax.swing.JLabel();
        lblIniSesion = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        usuarioTxtf = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        contraseñaPswf = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btnIngresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar sesión");
        setAutoRequestFocus(false);
        setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        setForeground(java.awt.Color.lightGray);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        jPanel1.add(imgUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 80));

        lblIniSesion.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblIniSesion.setText("INICIAR SESIÓN");
        jPanel1.add(lblIniSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblUsuario.setText("Usuario");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 110, -1));

        lblContraseña.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblContraseña.setText("Contraseña");
        jPanel1.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        usuarioTxtf.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        usuarioTxtf.setForeground(new java.awt.Color(102, 102, 102));
        usuarioTxtf.setText("Ingrese su nombre de usuario");
        usuarioTxtf.setBorder(null);
        usuarioTxtf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuarioTxtfMousePressed(evt);
            }
        });
        usuarioTxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTxtfActionPerformed(evt);
            }
        });
        jPanel1.add(usuarioTxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 290, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 290, 20));

        contraseñaPswf.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        contraseñaPswf.setForeground(new java.awt.Color(102, 102, 102));
        contraseñaPswf.setText("********");
        contraseñaPswf.setBorder(null);
        contraseñaPswf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contraseñaPswfMousePressed(evt);
            }
        });
        contraseñaPswf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaPswfActionPerformed(evt);
            }
        });
        jPanel1.add(contraseñaPswf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 290, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 290, 20));

        btnIngresar.setBackground(new java.awt.Color(133, 39, 71));
        btnIngresar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(null);
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 100, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EMPRESA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/building.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioTxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTxtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioTxtfActionPerformed

    private void contraseñaPswfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaPswfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaPswfActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void usuarioTxtfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioTxtfMousePressed
       if (usuarioTxtf.getText().equals("Ingrese su nombre de usuario")){
           usuarioTxtf.setText("");
           usuarioTxtf.setForeground(Color.black);
       }
        
    }//GEN-LAST:event_usuarioTxtfMousePressed

    private void contraseñaPswfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaPswfMousePressed
        if(String.valueOf(contraseñaPswf.getPassword()).equals("********")){
            contraseñaPswf.setText("");
            contraseñaPswf.setForeground(Color.black);
        }
        
    }//GEN-LAST:event_contraseñaPswfMousePressed

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarMouseClicked

    /**
     * @param args the command line arguments
     */
    //public static void

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPasswordField contraseñaPswf;
    private javax.swing.JLabel imgUser;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblIniSesion;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField usuarioTxtf;
    // End of variables declaration//GEN-END:variables
}
