/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contolador;
import modelo.Empleado;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexionBD.ConexionBD;

/**
 *
 * @author clara
 */
public class EmpleadoDAO {
    
    ConexionBD conexion;
    
    public EmpleadoDAO(){
        conexion = new ConexionBD();
    }
    
    //Métodos para ALTAS, BAJAS, CAMBIOS, CONSULTAS
    public boolean insertarRragistro(Empleado e) {
	boolean resultado = false;
		
	String sql="INSERT INTO empleado VALUES('"+e.getNombre()+"', '"+e.getApellido1()+"', '"+e.getApellido2()+"', "
                + "'"+e.getDni()+"', '"+e.getFechaNac()+"', '"+e.getDireccion()+"', '"+e.getSexo()+"', "
                + "'"+e.getSueldo()+"', '"+e.getSuperDni()+"', '"+e.getDno()+"' );";
	resultado = conexion.ejecutarInstruccion(sql);
		
	return resultado;
    }
    
    
    public boolean eliminarRegistro(String dni){
	boolean resultado = false;
		
	String sql =  "DELETE FROM empleado WHERE dni = \""+dni+"\"";
	resultado = conexion.ejecutarInstruccion(sql);
		
	return resultado;
    }
    
    
    public boolean modificarRegistro(Empleado e) {
	boolean resultado = false;
		
	String sql = "UPDATE empleado SET Nombre='"+e.getNombre()+"', Apellido1='"+e.getApellido1()+"', Apellido2='"+e.getApellido2()+"', "
                + " FechaNac='"+e.getFechaNac()+"', Direccion='"+e.getDireccion()+"', Sexo='"+e.getSexo()+"', "
                + " Sueldo='"+e.getSueldo()+"', SuperDni='"+e.getSuperDni()+"', Dno='"+e.getDno()+"'"
                + " WHERE Dni='"+e.getDni()+"';";
	resultado = conexion.ejecutarInstruccion(sql);
		
	return resultado;
    }
    
    
    public ArrayList<Empleado> buscarEmpleado (String filtro){
	ArrayList<Empleado> listaEmpleados = new ArrayList<>();
		
	ResultSet rs = conexion.ejecutarConsulta(filtro);
		
	try {
            if(rs.next()) {
		do {
                    listaEmpleados.add(new Empleado(rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getInt(2),
                            rs.getString(3),
                            rs.getByte(4)));
		}while(rs.next());
            }
        } catch (SQLException e) {
			e.printStackTrace();
	}
			
	return listaEmpleados;
	}
    
    
}//EmpleadoDAO
