/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import conexionBD.ConexionBD;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperDesignViewer;
import net.sf.jasperreports.view.JasperViewer;



/**
 *
 * @author clara
 */
public class Reporte {
    
    public void mostrarReporte(){

        try {
            ConexionBD cbd = new ConexionBD();
            String ruta=System.getProperty("user.dir")+"/src/Reportes/report2.jasper";
            JasperReport jaspe=(JasperReport)JRLoader.loadObjectFromFile(ruta);
            JasperPrint print=JasperFillManager.fillReport(jaspe, null,cbd.getConexion());
            JasperViewer view= new JasperViewer(print,false);
            view.setVisible(true);
        } catch (Exception e) {
            System.err.println("Error al generar el reporte---->"+e.getMessage());
        }

    }
    
}
