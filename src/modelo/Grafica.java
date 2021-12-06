/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import conexionBD.ConexionBD;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author clara
 */
public class Grafica {
    

        public ChartPanel dibujar(){
            boolean retorno=false;
            try {
                String consulta="SELECT UbicacionProyecto,COUNT(UbicacionProyecto)AS Cantidad FROM Proyecto WHERE (UbicacionProyecto IS NOT null) GROUP BY UbicacionProyecto;";

                //Statement statement=c.createStatement();
                ConexionBD cbd = new ConexionBD();
                ResultSet rs = cbd.ejecutarConsulta(consulta);

                DefaultPieDataset dataset=new DefaultPieDataset();

                try {
                    while(rs.next()){
                        dataset.setValue(rs.getString("UbicacionProyecto"), Integer.parseInt(rs.getString("Cantidad")));
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Grafica.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }

                //dibujamos el grafico

                JFreeChart chart= ChartFactory.createPieChart("Grafico de cantidad de proyectos en una ubicación", dataset, true, true, false);
                ChartPanel panel = new ChartPanel(chart);
                panel.setMouseWheelEnabled(true);
                panel.setPreferredSize(new Dimension (400,200));
                
                return panel;
                
            } catch (Exception ex) {
                Logger.getLogger(Grafica.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
           
        }
}
