/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contolador;
import modelo.TrabajaEn;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexionBD.ConexionBD;

/**
 *
 * @author clara
 */
public class TrabajaEnDAO {
    
    ConexionBD conexion;
    
    public TrabajaEnDAO(){
        conexion = new ConexionBD();
    }
    
    //Métodos para ALTAS, BAJAS, CAMBIOS, CONSULTAS
    public boolean insertarRragistro(TrabajaEn te) {
	boolean resultado = false;
		
	String sql="INSERT INTO trabaja_en VALUES('"+te.getDniEmpleado()+"', '"+te.getNumProyecto()+"',"
                + " '"+te.getHoras()+"' );";
	resultado = conexion.ejecutarInstruccion(sql);
		
	return resultado;
    }
    
    
    public boolean eliminarRegistro(String dniEmpleado, int numProyecto){
	boolean resultado = false;
		
	String sql =  "DELETE FROM trabaja_en WHERE dniEmpleado=\""+dniEmpleado+"\" AND numProyecto=\""+numProyecto+"\"";
	resultado = conexion.ejecutarInstruccion(sql);
		
	return resultado;
    }
    
    
    public boolean modificarRegistro(TrabajaEn te) {
	boolean resultado = false;
		
	String sql = "UPDATE proyecto SET Horas='"+te.getHoras()+"', "
                + " WHERE DniEmpleado='"+te.getDniEmpleado()+"' AND NumProyecto='"+te.getNumProyecto()+"';";
	resultado = conexion.ejecutarInstruccion(sql);
		
	return resultado;
    }
    
    
    public ArrayList<TrabajaEn> buscarTrabajaEn (String filtro){
	ArrayList<TrabajaEn> listaTrabajaEn = new ArrayList<>();
		
	ResultSet rs = conexion.ejecutarConsulta(filtro);
		
	try {
            if(rs.next()) {
		do {
                    listaTrabajaEn.add(new TrabajaEn(rs.getString(1),
                            rs.getInt(2),
                            rs.getDouble(4)));
		}while(rs.next());
            }
        } catch (SQLException e) {
			e.printStackTrace();
	}
			
	return listaTrabajaEn;
	}
    
    
}//EmpleadoDAO
