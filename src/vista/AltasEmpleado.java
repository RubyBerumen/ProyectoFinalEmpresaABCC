/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

/**
 *
 * @author clara
 */
public class AltasEmpleado extends javax.swing.JPanel {

    /**
     * Creates new form AltasEmpleado
     */
    public AltasEmpleado() {
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

        Titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        FechaNac = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jtfAp = new javax.swing.JTextField();
        ApellidoP = new javax.swing.JLabel();
        ApellidoM = new javax.swing.JLabel();
        jtfAm = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Dni = new javax.swing.JLabel();
        jtfDni = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Nombre = new javax.swing.JLabel();
        jcbDia = new javax.swing.JComboBox<>();
        jcbMes = new javax.swing.JComboBox<>();
        jcbAño = new javax.swing.JComboBox<>();
        Direccion = new javax.swing.JLabel();
        jtfDireccion = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        Sexo = new javax.swing.JLabel();
        jcbSexo = new javax.swing.JComboBox<>();
        Sueldo = new javax.swing.JLabel();
        jtfSueldo = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        DniSuper = new javax.swing.JLabel();
        jtfDniSuper = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        NoDpto = new javax.swing.JLabel();
        jtfNoDpto = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(245, 198, 165));
        setPreferredSize(new java.awt.Dimension(960, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Agregar Empleado");
        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 41));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 880, 21));

        FechaNac.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FechaNac.setForeground(new java.awt.Color(102, 102, 102));
        FechaNac.setText("Fecha de nacimiento");
        add(FechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, 30));

        jtfNombre.setBorder(null);
        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });
        add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 159, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 159, 20));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 159, 20));

        jtfAp.setBorder(null);
        add(jtfAp, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 159, 30));

        ApellidoP.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ApellidoP.setForeground(new java.awt.Color(102, 102, 102));
        ApellidoP.setText("Apellido paterno");
        add(ApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, 30));

        ApellidoM.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ApellidoM.setForeground(new java.awt.Color(102, 102, 102));
        ApellidoM.setText("Apellido materno");
        add(ApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, -1, 30));

        jtfAm.setBorder(null);
        add(jtfAm, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 159, 30));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 159, 20));

        Dni.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Dni.setForeground(new java.awt.Color(102, 102, 102));
        Dni.setText("Dni");
        add(Dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 30));

        jtfDni.setBorder(null);
        add(jtfDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 159, 30));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 159, 20));

        Nombre.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Nombre.setForeground(new java.awt.Color(102, 102, 102));
        Nombre.setText("Nombre(s)");
        add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 30));

        jcbDia.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jcbDia.setForeground(new java.awt.Color(102, 102, 102));
        jcbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02" }));
        jcbDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDiaActionPerformed(evt);
            }
        });
        add(jcbDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, 30));

        jcbMes.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jcbMes.setForeground(new java.awt.Color(102, 102, 102));
        jcbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ene", "Feb" }));
        jcbMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMesActionPerformed(evt);
            }
        });
        add(jcbMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, 30));

        jcbAño.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jcbAño.setForeground(new java.awt.Color(102, 102, 102));
        jcbAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022", "2023" }));
        jcbAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAñoActionPerformed(evt);
            }
        });
        add(jcbAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, 30));

        Direccion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Direccion.setForeground(new java.awt.Color(102, 102, 102));
        Direccion.setText("Dirección");
        add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, -1, 30));

        jtfDireccion.setBorder(null);
        add(jtfDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 190, 30));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 190, 20));

        Sexo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Sexo.setForeground(new java.awt.Color(102, 102, 102));
        Sexo.setText("Sexo");
        add(Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 30));

        jcbSexo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jcbSexo.setForeground(new java.awt.Color(102, 102, 102));
        jcbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "H" }));
        jcbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSexoActionPerformed(evt);
            }
        });
        add(jcbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, 30));

        Sueldo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Sueldo.setForeground(new java.awt.Color(102, 102, 102));
        Sueldo.setText("Sueldo");
        add(Sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, 30));

        jtfSueldo.setBorder(null);
        add(jtfSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 130, 30));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 130, 20));

        DniSuper.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DniSuper.setForeground(new java.awt.Color(102, 102, 102));
        DniSuper.setText("Dni supervisor");
        add(DniSuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, 30));

        jtfDniSuper.setBorder(null);
        add(jtfDniSuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 159, 30));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 159, 20));

        NoDpto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        NoDpto.setForeground(new java.awt.Color(102, 102, 102));
        NoDpto.setText("Número departamento");
        add(NoDpto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, -1, 30));

        jtfNoDpto.setBorder(null);
        add(jtfNoDpto, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 230, 40, 30));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 40, 20));

        btnAgregar.setBackground(new java.awt.Color(162, 65, 107));
        btnAgregar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(null);
        add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 120, 30));

        btnBorrar.setBackground(new java.awt.Color(162, 65, 107));
        btnBorrar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.setBorder(null);
        add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 120, 30));

        btnCancelar.setBackground(new java.awt.Color(162, 65, 107));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jcbAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbAñoActionPerformed

    private void jcbDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbDiaActionPerformed

    private void jcbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbSexoActionPerformed

    private void jcbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMesActionPerformed

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidoM;
    private javax.swing.JLabel ApellidoP;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Dni;
    private javax.swing.JLabel DniSuper;
    private javax.swing.JLabel FechaNac;
    private javax.swing.JLabel NoDpto;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Sexo;
    private javax.swing.JLabel Sueldo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JComboBox<String> jcbAño;
    private javax.swing.JComboBox<String> jcbDia;
    private javax.swing.JComboBox<String> jcbMes;
    private javax.swing.JComboBox<String> jcbSexo;
    private javax.swing.JTextField jtfAm;
    private javax.swing.JTextField jtfAp;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfDniSuper;
    private javax.swing.JTextField jtfNoDpto;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfSueldo;
    // End of variables declaration//GEN-END:variables
}
