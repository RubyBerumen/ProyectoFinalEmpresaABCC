/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import java.awt.Component;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author clara
 */
public class MenuHorasEmpleado extends javax.swing.JPanel {

    /**
     * Creates new form MenuEmpleado1
     */
    public MenuHorasEmpleado() {
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
        jpTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(245, 198, 165));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpTitulo.setBackground(new java.awt.Color(162, 65, 107));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Horas que trabaja un empleado y sueldo");

        javax.swing.GroupLayout jpTituloLayout = new javax.swing.GroupLayout(jpTitulo);
        jpTitulo.setLayout(jpTituloLayout);
        jpTituloLayout.setHorizontalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(459, Short.MAX_VALUE))
        );
        jpTituloLayout.setVerticalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTituloLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
        );

        add(jpTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 100));

        jpTabla.setBackground(new java.awt.Color(245, 198, 165));
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

        jpTabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 920, 560));

        add(jpTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 960, 600));
    }// </editor-fold>//GEN-END:initComponents

    
    public void restablecerComponentes(Component...componentesGraficos) {
	for (Component c: componentesGraficos) {
            if  (c instanceof JTextField) {
		((JTextField)c).setText("");
            }
        }
    }
    
    public void mostrarTabla(){
        ResultSetTableModel modeloDatos = null;
	try {
            modeloDatos = new ResultSetTableModel("com.mysql.cj.jdbc.Driver","jdbc:mysql://localhost:3306/empresa","CALL sp_HorasEmpleado");
	} catch (ClassNotFoundException e1) {
            e1.printStackTrace();
	} catch (SQLException e1) {
            e1.printStackTrace();
	}
        
        jpTabla.remove(jScrollPane1);
        jTable1 = new JTable(modeloDatos);
        jScrollPane1 = new JScrollPane(jTable1);
        jpTabla.add(jScrollPane1);  
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpTabla;
    private javax.swing.JPanel jpTitulo;
    // End of variables declaration//GEN-END:variables
}
