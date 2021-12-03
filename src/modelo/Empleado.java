/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author clara
 */
public class Empleado {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private String fechaNac;
    private String direccion;
    private String sexo;
    private int sueldo;
    private String superDni;
    private byte dno;

    public Empleado(String nombre, String apellido1, String apellido2, String dni, String fechaNac, String direccion, String sexo, int sueldo, String superDni, byte dno) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
        this.sexo = sexo;
        this.sueldo = sueldo;
        this.superDni = superDni;
        this.dno = dno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getDni() {
        return dni;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public String getSuperDni() {
        return superDni;
    }

    public byte getDno() {
        return dno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void setSuperDni(String superDni) {
        this.superDni = superDni;
    }

    public void setDno(byte dno) {
        this.dno = dno;
    }
    
   
}
