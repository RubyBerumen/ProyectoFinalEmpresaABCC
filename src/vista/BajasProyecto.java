/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

/**
 *
 * @author clara
 */
public class BajasProyecto extends javax.swing.JPanel {

    /**
     * Creates new form AltasEmpleado
     */
    public BajasProyecto() {
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
        nomProyecto = new javax.swing.JLabel();
        jtfNomProyecto = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        numProyecto = new javax.swing.JLabel();
        jtfNumProyecto = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        ubiProyecto = new javax.swing.JLabel();
        jtfUbiProyecto = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        numDepProyecto = new javax.swing.JLabel();
        jtfNumDepProyecto = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(245, 198, 165));
        setPreferredSize(new java.awt.Dimension(960, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Eliminar proyecto");
        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 30, 500, 41));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 840, 21));

        nomProyecto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        nomProyecto.setForeground(new java.awt.Color(102, 102, 102));
        nomProyecto.setText("Nombre del proyecto");
        add(nomProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 30));

        jtfNomProyecto.setBorder(null);
        add(jtfNomProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 159, 30));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 159, 20));

        numProyecto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        numProyecto.setForeground(new java.awt.Color(102, 102, 102));
        numProyecto.setText("Número de proyecto");
        add(numProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, 30));

        jtfNumProyecto.setBorder(null);
        add(jtfNumProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 50, 30));
        add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 50, 20));

        ubiProyecto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ubiProyecto.setForeground(new java.awt.Color(102, 102, 102));
        ubiProyecto.setText("Ubicación del proyecto");
        add(ubiProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, 30));

        jtfUbiProyecto.setBorder(null);
        add(jtfUbiProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 159, 30));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 159, 20));

        numDepProyecto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        numDepProyecto.setForeground(new java.awt.Color(102, 102, 102));
        numDepProyecto.setText("Número de departamento del proyecto");
        add(numDepProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, 30));

        jtfNumDepProyecto.setBorder(null);
        add(jtfNumDepProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 50, 30));
        add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 50, 20));

        btnBuscar.setBackground(new java.awt.Color(162, 65, 107));
        btnBuscar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 120, 30));

        btnEliminar.setBackground(new java.awt.Color(162, 65, 107));
        btnEliminar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 120, 30));

        btnBorrar.setBackground(new java.awt.Color(162, 65, 107));
        btnBorrar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.setBorder(null);
        add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 120, 30));

        btnCancelar.setBackground(new java.awt.Color(162, 65, 107));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jtfNomProyecto;
    private javax.swing.JTextField jtfNumDepProyecto;
    private javax.swing.JTextField jtfNumProyecto;
    private javax.swing.JTextField jtfUbiProyecto;
    private javax.swing.JLabel nomProyecto;
    private javax.swing.JLabel numDepProyecto;
    private javax.swing.JLabel numProyecto;
    private javax.swing.JLabel ubiProyecto;
    // End of variables declaration//GEN-END:variables
}