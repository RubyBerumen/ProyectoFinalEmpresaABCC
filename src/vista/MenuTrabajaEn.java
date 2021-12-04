/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author clara
 */
public class MenuTrabajaEn extends javax.swing.JPanel {

    /**
     * Creates new form MenuEmpleado1
     */
    public MenuTrabajaEn() {
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

        jpTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtpContenidoABCC = new javax.swing.JTabbedPane();
        jpAltas = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        DniEmpleado = new javax.swing.JLabel();
        jtfDniEmpleado = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        NumProyecto = new javax.swing.JLabel();
        jtfNumProyecto = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        Horas = new javax.swing.JLabel();
        jtfHoras = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jpBajas = new javax.swing.JPanel();
        Titulo1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        DniEmpleado1 = new javax.swing.JLabel();
        jtfDniEmpleado1 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        NumProyecto1 = new javax.swing.JLabel();
        jtfNumProyecto1 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        btnBuscar1 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBorrar1 = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        jpCambios = new javax.swing.JPanel();
        Titulo2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        DniEmpleado2 = new javax.swing.JLabel();
        jtfDniEmpleado2 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        NumProyecto2 = new javax.swing.JLabel();
        jtfNumProyecto2 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        Horas2 = new javax.swing.JLabel();
        jtfHoras2 = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        btnBuscar2 = new javax.swing.JButton();
        btnGuardar2 = new javax.swing.JButton();
        btnBorrar2 = new javax.swing.JButton();
        btnCancelar2 = new javax.swing.JButton();
        jpConsultas = new javax.swing.JPanel();
        jpTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(245, 198, 165));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpTitulo.setBackground(new java.awt.Color(162, 65, 107));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Trabaja En");

        javax.swing.GroupLayout jpTituloLayout = new javax.swing.GroupLayout(jpTitulo);
        jpTitulo.setLayout(jpTituloLayout);
        jpTituloLayout.setHorizontalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(817, Short.MAX_VALUE))
        );
        jpTituloLayout.setVerticalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTituloLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
        );

        add(jpTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 100));

        jtpContenidoABCC.setBackground(new java.awt.Color(245, 198, 165));
        jtpContenidoABCC.setForeground(new java.awt.Color(102, 102, 102));
        jtpContenidoABCC.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        jpAltas.setBackground(new java.awt.Color(245, 198, 165));
        jpAltas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Agregar en que trabaja un empleado");
        jpAltas.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 30, 500, 41));
        jpAltas.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 840, 21));

        DniEmpleado.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DniEmpleado.setForeground(new java.awt.Color(102, 102, 102));
        DniEmpleado.setText("Dni empleado");
        jpAltas.add(DniEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 30));

        jtfDniEmpleado.setBackground(new java.awt.Color(245, 198, 165));
        jtfDniEmpleado.setBorder(null);
        jpAltas.add(jtfDniEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 159, 30));
        jpAltas.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 159, 20));

        NumProyecto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        NumProyecto.setForeground(new java.awt.Color(102, 102, 102));
        NumProyecto.setText("Número de proyecto");
        jpAltas.add(NumProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, 30));

        jtfNumProyecto.setBackground(new java.awt.Color(245, 198, 165));
        jtfNumProyecto.setBorder(null);
        jpAltas.add(jtfNumProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 50, 30));
        jpAltas.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 50, 20));

        Horas.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Horas.setForeground(new java.awt.Color(102, 102, 102));
        Horas.setText("Horas");
        jpAltas.add(Horas, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, -1, 30));

        jtfHoras.setBackground(new java.awt.Color(245, 198, 165));
        jtfHoras.setBorder(null);
        jpAltas.add(jtfHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 80, 30));
        jpAltas.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 80, 20));

        btnAgregar.setBackground(new java.awt.Color(162, 65, 107));
        btnAgregar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(null);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpAltas.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 120, 30));

        btnBorrar.setBackground(new java.awt.Color(162, 65, 107));
        btnBorrar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.setBorder(null);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jpAltas.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 120, 30));

        btnCancelar.setBackground(new java.awt.Color(162, 65, 107));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        jpAltas.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 120, 30));

        jtpContenidoABCC.addTab("Altas", jpAltas);

        jpBajas.setBackground(new java.awt.Color(245, 198, 165));
        jpBajas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo1.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(255, 255, 255));
        Titulo1.setText("Eliminar en que trabaja un empleado");
        jpBajas.add(Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 30, 500, 41));
        jpBajas.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 840, 21));

        DniEmpleado1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DniEmpleado1.setForeground(new java.awt.Color(102, 102, 102));
        DniEmpleado1.setText("Dni empleado");
        jpBajas.add(DniEmpleado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 30));

        jtfDniEmpleado1.setBackground(new java.awt.Color(245, 198, 165));
        jtfDniEmpleado1.setBorder(null);
        jpBajas.add(jtfDniEmpleado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 159, 30));
        jpBajas.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 159, 20));

        NumProyecto1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        NumProyecto1.setForeground(new java.awt.Color(102, 102, 102));
        NumProyecto1.setText("Número de proyecto");
        jpBajas.add(NumProyecto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, 30));

        jtfNumProyecto1.setBackground(new java.awt.Color(245, 198, 165));
        jtfNumProyecto1.setBorder(null);
        jpBajas.add(jtfNumProyecto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 50, 30));
        jpBajas.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 50, 20));

        btnBuscar1.setBackground(new java.awt.Color(162, 65, 107));
        btnBuscar1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar1.setText("Buscar");
        btnBuscar1.setBorder(null);
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        jpBajas.add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 120, 30));

        btnEliminar.setBackground(new java.awt.Color(162, 65, 107));
        btnEliminar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jpBajas.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 120, 30));

        btnBorrar1.setBackground(new java.awt.Color(162, 65, 107));
        btnBorrar1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnBorrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar1.setText("Borrar");
        btnBorrar1.setBorder(null);
        btnBorrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar1ActionPerformed(evt);
            }
        });
        jpBajas.add(btnBorrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 120, 30));

        btnCancelar1.setBackground(new java.awt.Color(162, 65, 107));
        btnCancelar1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnCancelar1.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar1.setText("Cancelar");
        btnCancelar1.setBorder(null);
        jpBajas.add(btnCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 120, 30));

        jtpContenidoABCC.addTab("Bajas", jpBajas);

        jpCambios.setBackground(new java.awt.Color(245, 198, 165));
        jpCambios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo2.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        Titulo2.setForeground(new java.awt.Color(255, 255, 255));
        Titulo2.setText("Modificar en que trabaja un empleado");
        jpCambios.add(Titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 30, 500, 41));
        jpCambios.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 840, 21));

        DniEmpleado2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DniEmpleado2.setForeground(new java.awt.Color(102, 102, 102));
        DniEmpleado2.setText("Dni empleado");
        jpCambios.add(DniEmpleado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 30));

        jtfDniEmpleado2.setBackground(new java.awt.Color(245, 198, 165));
        jtfDniEmpleado2.setBorder(null);
        jpCambios.add(jtfDniEmpleado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 159, 30));
        jpCambios.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 159, 20));

        NumProyecto2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        NumProyecto2.setForeground(new java.awt.Color(102, 102, 102));
        NumProyecto2.setText("Número de proyecto");
        jpCambios.add(NumProyecto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, 30));

        jtfNumProyecto2.setBackground(new java.awt.Color(245, 198, 165));
        jtfNumProyecto2.setBorder(null);
        jpCambios.add(jtfNumProyecto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 50, 30));
        jpCambios.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 50, 20));

        Horas2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Horas2.setForeground(new java.awt.Color(102, 102, 102));
        Horas2.setText("Horas");
        jpCambios.add(Horas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, -1, 30));

        jtfHoras2.setBackground(new java.awt.Color(245, 198, 165));
        jtfHoras2.setBorder(null);
        jpCambios.add(jtfHoras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 80, 30));
        jpCambios.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 80, 20));

        btnBuscar2.setBackground(new java.awt.Color(162, 65, 107));
        btnBuscar2.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnBuscar2.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar2.setText("Buscar");
        btnBuscar2.setBorder(null);
        btnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar2ActionPerformed(evt);
            }
        });
        jpCambios.add(btnBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 120, 30));

        btnGuardar2.setBackground(new java.awt.Color(162, 65, 107));
        btnGuardar2.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnGuardar2.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar2.setText("Guardar cambios");
        btnGuardar2.setBorder(null);
        btnGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar2ActionPerformed(evt);
            }
        });
        jpCambios.add(btnGuardar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 160, 30));

        btnBorrar2.setBackground(new java.awt.Color(162, 65, 107));
        btnBorrar2.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnBorrar2.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar2.setText("Borrar");
        btnBorrar2.setBorder(null);
        btnBorrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar2ActionPerformed(evt);
            }
        });
        jpCambios.add(btnBorrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 120, 30));

        btnCancelar2.setBackground(new java.awt.Color(162, 65, 107));
        btnCancelar2.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnCancelar2.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar2.setText("Cancelar");
        btnCancelar2.setBorder(null);
        btnCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar2ActionPerformed(evt);
            }
        });
        jpCambios.add(btnCancelar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 120, 30));

        jtpContenidoABCC.addTab("Cambios", jpCambios);

        jpConsultas.setBackground(new java.awt.Color(245, 198, 165));
        jpConsultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jtpContenidoABCC.addTab("Consultas", jpConsultas);

        add(jtpContenidoABCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 960, 270));

        jpTabla.setBackground(new java.awt.Color(255, 255, 255));
        jpTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jpTabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 920, 290));

        add(jpTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 960, 330));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar2ActionPerformed

    private void btnGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardar2ActionPerformed

    private void btnBorrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar2ActionPerformed
        restablecerComponentes(jtfDniEmpleado2,jtfNumProyecto2,jtfHoras2);
    }//GEN-LAST:event_btnBorrar2ActionPerformed

    private void btnCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar2ActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        restablecerComponentes(jtfDniEmpleado,jtfNumProyecto,jtfHoras);
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBorrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar1ActionPerformed
        restablecerComponentes(jtfDniEmpleado1,jtfNumProyecto1);
    }//GEN-LAST:event_btnBorrar1ActionPerformed

    
    public void restablecerComponentes(Component...componentesGraficos) {
	for (Component c: componentesGraficos) {
            if  (c instanceof JTextField) {
		((JTextField)c).setText("");
            }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DniEmpleado;
    private javax.swing.JLabel DniEmpleado1;
    private javax.swing.JLabel DniEmpleado2;
    private javax.swing.JLabel Horas;
    private javax.swing.JLabel Horas2;
    private javax.swing.JLabel NumProyecto;
    private javax.swing.JLabel NumProyecto1;
    private javax.swing.JLabel NumProyecto2;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrar1;
    private javax.swing.JButton btnBorrar2;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnCancelar2;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpAltas;
    private javax.swing.JPanel jpBajas;
    private javax.swing.JPanel jpCambios;
    private javax.swing.JPanel jpConsultas;
    private javax.swing.JPanel jpTabla;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JTextField jtfDniEmpleado;
    private javax.swing.JTextField jtfDniEmpleado1;
    private javax.swing.JTextField jtfDniEmpleado2;
    private javax.swing.JTextField jtfHoras;
    private javax.swing.JTextField jtfHoras2;
    private javax.swing.JTextField jtfNumProyecto;
    private javax.swing.JTextField jtfNumProyecto1;
    private javax.swing.JTextField jtfNumProyecto2;
    private javax.swing.JTabbedPane jtpContenidoABCC;
    // End of variables declaration//GEN-END:variables
}
