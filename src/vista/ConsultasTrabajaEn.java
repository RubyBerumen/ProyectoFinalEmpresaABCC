/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

/**
 *
 * @author clara
 */
public class ConsultasTrabajaEn extends javax.swing.JPanel {

    /**
     * Creates new form AltasEmpleado
     */
    public ConsultasTrabajaEn() {
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
        DniEmpleado = new javax.swing.JLabel();
        jtfDniEmpleado = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        FechaNac = new javax.swing.JLabel();
        Horas = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jtfNumProyecto = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jtfHoras = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(245, 198, 165));
        setPreferredSize(new java.awt.Dimension(960, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Buscar en que trabaja un empleado");
        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 30, 500, 41));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 840, 21));

        DniEmpleado.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DniEmpleado.setForeground(new java.awt.Color(102, 102, 102));
        DniEmpleado.setText("Dni empleado");
        add(DniEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 30));

        jtfDniEmpleado.setBorder(null);
        add(jtfDniEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 159, 30));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 159, 20));

        FechaNac.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FechaNac.setForeground(new java.awt.Color(102, 102, 102));
        FechaNac.setText("Número de proyecto");
        add(FechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, 30));

        Horas.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Horas.setForeground(new java.awt.Color(102, 102, 102));
        Horas.setText("Horas");
        add(Horas, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, -1, 30));

        btnBuscar.setBackground(new java.awt.Color(162, 65, 107));
        btnBuscar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 120, 30));

        btnBorrar.setBackground(new java.awt.Color(162, 65, 107));
        btnBorrar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.setBorder(null);
        add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 120, 30));

        btnCancelar.setBackground(new java.awt.Color(162, 65, 107));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 120, 30));

        jtfNumProyecto.setBorder(null);
        add(jtfNumProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 50, 30));
        add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 50, 20));

        jtfHoras.setBorder(null);
        add(jtfHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 80, 30));
        add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 80, 20));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DniEmpleado;
    private javax.swing.JLabel FechaNac;
    private javax.swing.JLabel Horas;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jtfDniEmpleado;
    private javax.swing.JTextField jtfHoras;
    private javax.swing.JTextField jtfNumProyecto;
    // End of variables declaration//GEN-END:variables
}
