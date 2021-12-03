/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

/**
 *
 * @author clara
 */
public class AltasProyecto extends javax.swing.JPanel {

    /**
     * Creates new form AltasEmpleado
     */
    public AltasProyecto() {
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
        DniEmpleado = new javax.swing.JLabel();
        jtfDniEmpleado = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jtfNumProyecto = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        DniEmpleado1 = new javax.swing.JLabel();
        jtfDniEmpleado1 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        FechaNac1 = new javax.swing.JLabel();
        jtfNumProyecto1 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(245, 198, 165));
        setPreferredSize(new java.awt.Dimension(960, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Agregar proyecto");
        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 30, 500, 41));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 840, 21));

        FechaNac.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FechaNac.setForeground(new java.awt.Color(102, 102, 102));
        FechaNac.setText("Número de proyecto");
        add(FechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, 30));

        DniEmpleado.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DniEmpleado.setForeground(new java.awt.Color(102, 102, 102));
        DniEmpleado.setText("Nombre del proyecto");
        add(DniEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 30));

        jtfDniEmpleado.setBorder(null);
        add(jtfDniEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 159, 30));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 159, 20));

        btnAgregar.setBackground(new java.awt.Color(162, 65, 107));
        btnAgregar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(null);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 120, 30));

        btnBorrar.setBackground(new java.awt.Color(162, 65, 107));
        btnBorrar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.setBorder(null);
        add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 120, 30));

        btnCancelar.setBackground(new java.awt.Color(162, 65, 107));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 120, 30));

        jtfNumProyecto.setBorder(null);
        add(jtfNumProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 50, 30));
        add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 50, 20));

        DniEmpleado1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DniEmpleado1.setForeground(new java.awt.Color(102, 102, 102));
        DniEmpleado1.setText("Ubicación del proyecto");
        add(DniEmpleado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, 30));

        jtfDniEmpleado1.setBorder(null);
        add(jtfDniEmpleado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 159, 30));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 159, 20));

        FechaNac1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FechaNac1.setForeground(new java.awt.Color(102, 102, 102));
        FechaNac1.setText("Número de departamento del proyecto");
        add(FechaNac1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, 30));

        jtfNumProyecto1.setBorder(null);
        add(jtfNumProyecto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 50, 30));
        add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 50, 20));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DniEmpleado;
    private javax.swing.JLabel DniEmpleado1;
    private javax.swing.JLabel FechaNac;
    private javax.swing.JLabel FechaNac1;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jtfDniEmpleado;
    private javax.swing.JTextField jtfDniEmpleado1;
    private javax.swing.JTextField jtfNumProyecto;
    private javax.swing.JTextField jtfNumProyecto1;
    // End of variables declaration//GEN-END:variables
}
