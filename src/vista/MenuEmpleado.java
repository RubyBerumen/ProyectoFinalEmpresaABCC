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
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author clara
 */
public class MenuEmpleado extends javax.swing.JPanel {

    /**
     * Creates new form MenuEmpleado1
     */
    public MenuEmpleado() {
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
        jSeparator1 = new javax.swing.JSeparator();
        Titulo = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        ApellidoP = new javax.swing.JLabel();
        jtfAp = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        ApellidoM = new javax.swing.JLabel();
        jtfAm = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Dni = new javax.swing.JLabel();
        jtfDni = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        FechaNac = new javax.swing.JLabel();
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
        btnCancelar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jpBajas = new javax.swing.JPanel();
        jpCambios = new javax.swing.JPanel();
        jpConsultas = new javax.swing.JPanel();
        jpTabla = new javax.swing.JPanel();
        jspTabla = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();

        setBackground(new java.awt.Color(245, 198, 165));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpTitulo.setBackground(new java.awt.Color(162, 65, 107));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Empleado");

        javax.swing.GroupLayout jpTituloLayout = new javax.swing.GroupLayout(jpTitulo);
        jpTitulo.setLayout(jpTituloLayout);
        jpTituloLayout.setHorizontalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(819, Short.MAX_VALUE))
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

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jpAltas.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 880, 21));

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Agregar Empleado");
        jpAltas.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 41));

        Nombre.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Nombre.setForeground(new java.awt.Color(102, 102, 102));
        Nombre.setText("Nombre(s)");
        jpAltas.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 30));

        jtfNombre.setBackground(new java.awt.Color(245, 198, 165));
        jtfNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtfNombre.setBorder(null);
        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });
        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreKeyTyped(evt);
            }
        });
        jpAltas.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 159, 30));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jpAltas.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 159, 20));

        ApellidoP.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ApellidoP.setForeground(new java.awt.Color(102, 102, 102));
        ApellidoP.setText("Apellido paterno");
        jpAltas.add(ApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, 30));

        jtfAp.setBackground(new java.awt.Color(245, 198, 165));
        jtfAp.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtfAp.setBorder(null);
        jpAltas.add(jtfAp, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 159, 30));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jpAltas.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 159, 20));

        ApellidoM.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ApellidoM.setForeground(new java.awt.Color(102, 102, 102));
        ApellidoM.setText("Apellido materno");
        jpAltas.add(ApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, -1, 30));

        jtfAm.setBackground(new java.awt.Color(245, 198, 165));
        jtfAm.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtfAm.setBorder(null);
        jpAltas.add(jtfAm, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 159, 30));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jpAltas.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 159, 20));

        Dni.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Dni.setForeground(new java.awt.Color(102, 102, 102));
        Dni.setText("Dni");
        jpAltas.add(Dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 30));

        jtfDni.setBackground(new java.awt.Color(245, 198, 165));
        jtfDni.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtfDni.setBorder(null);
        jpAltas.add(jtfDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 159, 30));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jpAltas.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 159, 20));

        FechaNac.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FechaNac.setForeground(new java.awt.Color(102, 102, 102));
        FechaNac.setText("Fecha de nacimiento");
        jpAltas.add(FechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, 30));

        jcbDia.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jcbDia.setForeground(new java.awt.Color(102, 102, 102));
        jcbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jcbDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDiaActionPerformed(evt);
            }
        });
        jpAltas.add(jcbDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, 30));

        jcbMes.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jcbMes.setForeground(new java.awt.Color(102, 102, 102));
        jcbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Nov", "Dic" }));
        jcbMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMesActionPerformed(evt);
            }
        });
        jpAltas.add(jcbMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, 30));

        jcbAño.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jcbAño.setForeground(new java.awt.Color(102, 102, 102));
        jcbAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005" }));
        jcbAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAñoActionPerformed(evt);
            }
        });
        jpAltas.add(jcbAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, 30));

        Direccion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Direccion.setForeground(new java.awt.Color(102, 102, 102));
        Direccion.setText("Dirección");
        jpAltas.add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, -1, 30));

        jtfDireccion.setBackground(new java.awt.Color(245, 198, 165));
        jtfDireccion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtfDireccion.setBorder(null);
        jpAltas.add(jtfDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 190, 30));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jpAltas.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 190, 20));

        Sexo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Sexo.setForeground(new java.awt.Color(102, 102, 102));
        Sexo.setText("Sexo");
        jpAltas.add(Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 30));

        jcbSexo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jcbSexo.setForeground(new java.awt.Color(102, 102, 102));
        jcbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "H" }));
        jcbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSexoActionPerformed(evt);
            }
        });
        jpAltas.add(jcbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, 30));

        Sueldo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Sueldo.setForeground(new java.awt.Color(102, 102, 102));
        Sueldo.setText("Sueldo");
        jpAltas.add(Sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, 30));

        jtfSueldo.setBackground(new java.awt.Color(245, 198, 165));
        jtfSueldo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtfSueldo.setBorder(null);
        jpAltas.add(jtfSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 130, 30));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jpAltas.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 130, 20));

        DniSuper.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DniSuper.setForeground(new java.awt.Color(102, 102, 102));
        DniSuper.setText("Dni supervisor");
        jpAltas.add(DniSuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, 30));

        jtfDniSuper.setBackground(new java.awt.Color(245, 198, 165));
        jtfDniSuper.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtfDniSuper.setBorder(null);
        jpAltas.add(jtfDniSuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 159, 30));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jpAltas.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 159, 20));

        NoDpto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        NoDpto.setForeground(new java.awt.Color(102, 102, 102));
        NoDpto.setText("Número departamento");
        jpAltas.add(NoDpto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, -1, 30));

        jtfNoDpto.setBackground(new java.awt.Color(245, 198, 165));
        jtfNoDpto.setBorder(null);
        jpAltas.add(jtfNoDpto, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 230, 40, 30));
        jpAltas.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 40, 20));

        btnCancelar.setBackground(new java.awt.Color(162, 65, 107));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        jpAltas.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 120, 30));

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
        jpAltas.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 120, 30));

        btnAgregar.setBackground(new java.awt.Color(162, 65, 107));
        btnAgregar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(null);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jpAltas.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 120, 30));

        jtpContenidoABCC.addTab("Altas", jpAltas);

        jpBajas.setBackground(new java.awt.Color(245, 198, 165));
        jpBajas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jtpContenidoABCC.addTab("Bajas", jpBajas);

        jpCambios.setBackground(new java.awt.Color(245, 198, 165));
        jpCambios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jtpContenidoABCC.addTab("Cambios", jpCambios);

        jpConsultas.setBackground(new java.awt.Color(245, 198, 165));
        jpConsultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jtpContenidoABCC.addTab("Consultas", jpConsultas);

        add(jtpContenidoABCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 960, 390));

        jpTabla.setBackground(new java.awt.Color(255, 255, 255));
        jpTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtTabla.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jspTabla.setViewportView(jtTabla);

        jpTabla.add(jspTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 27, 903, 135));

        add(jpTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 960, 210));
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jcbDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbDiaActionPerformed

    private void jcbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMesActionPerformed

    private void jcbAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbAñoActionPerformed

    private void jcbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbSexoActionPerformed

    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreKeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        restablecerComponentes(jtfNombre, jtfAp,jtfAm, jtfDni, jcbDia, jcbMes, jcbAño, jtfDireccion, jcbSexo, jtfSueldo, jtfDniSuper, jtfNoDpto);
    }//GEN-LAST:event_btnBorrarActionPerformed

    
    
    public void mostrarTabla(String sql) {
        ResultSetTableModel modeloDatos =null;
	try {
            modeloDatos = new ResultSetTableModel("com.mysql.cj.jdbc.Driver","jdbc:mysql://localhost:3306/empresa","sql");
            } catch (ClassNotFoundException e1) {
		e1.printStackTrace();
            } catch (SQLException e1) {
		e1.printStackTrace();
	}
        
        jpTabla.remove(jspTabla);
        jtTabla = new JTable(modeloDatos);
        jspTabla = new JScrollPane(jtTabla);
        jspTabla.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jpTabla.add(jspTabla);
        
    }
    
    public void restablecerComponentes(Component...componentesGraficos) {
	for (Component c: componentesGraficos) {
            if (c instanceof JComboBox) {
		((JComboBox<?>)c).setSelectedIndex(0);
            }else if (c instanceof JTextField) {
		((JTextField)c).setText("");
            }
        }
    }

    

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
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jpAltas;
    private javax.swing.JPanel jpBajas;
    private javax.swing.JPanel jpCambios;
    private javax.swing.JPanel jpConsultas;
    private javax.swing.JPanel jpTabla;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JScrollPane jspTabla;
    private javax.swing.JTable jtTabla;
    private javax.swing.JTextField jtfAm;
    private javax.swing.JTextField jtfAp;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfDniSuper;
    private javax.swing.JTextField jtfNoDpto;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfSueldo;
    private javax.swing.JTabbedPane jtpContenidoABCC;
    // End of variables declaration//GEN-END:variables
}
