/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contolador;
import modelo.Proyecto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexionBD.ConexionBD;

/**
 *
 * @author clara
 */
public class ProyectoDAO {
    
    ConexionBD conexion;
    
    public ProyectoDAO(){
        conexion = new ConexionBD();
    }
    
    //Métodos para ALTAS, BAJAS, CAMBIOS, CONSULTAS
    public boolean insertarRragistro(Proyecto p) {
	boolean resultado = false;
		
	String sql="INSERT INTO proyecto VALUES('"+p.getNombreProyecto()+"', '"+p.getNumProyecto()+"',"
                + " '"+p.getUbicaciónProyecto()+"', '"+p.getNumDptoProyecto()+"' );";
        System.out.println(sql);
	resultado = conexion.ejecutarInstruccion(sql);
		
	return resultado;
    }
    
    
    public boolean eliminarRegistro(int numProyecto){
	boolean resultado = false;
		
	String sql =  "DELETE FROM proyecto WHERE numProyecto = \""+numProyecto+"\"";
	resultado = conexion.ejecutarInstruccion(sql);
		
	return resultado;
    }
    
    
    public boolean modificarRegistro(Proyecto p) {
	boolean resultado = false;
		
	String sql = "UPDATE proyecto SET NombreProyecto='"+p.getNombreProyecto()+"', UbicacionProyecto='"+p.getUbicaciónProyecto()+"', "
                + " NumDptoProyecto='"+p.getNumDptoProyecto()+"', "
                + " WHERE NumProyecto='"+p.getNumProyecto()+"';";
	resultado = conexion.ejecutarInstruccion(sql);
		
	return resultado;
    }
    
    
    public ArrayList<Proyecto> buscarProyecto (String filtro){
	ArrayList<Proyecto> listaProyecto = new ArrayList<>();
		
	ResultSet rs = conexion.ejecutarConsulta(filtro);
		
	try {
            if(rs.next()) {
		do {
                    listaProyecto.add(new Proyecto(rs.getString(1),
                            rs.getInt(2),
                            rs.getString(3),
                            rs.getByte(4)));
		}while(rs.next());
            }
        } catch (SQLException e) {
			e.printStackTrace();
	}
			
	return listaProyecto;
	}
    
    
}//EmpleadoDAO
