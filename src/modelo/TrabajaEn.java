/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author clara
 */
public class TrabajaEn {
    private String dniEmpleado;
    private int numProyecto;
    private double horas;

    public TrabajaEn(String dniEmpleado, int numProyecto, double horas) {
        this.dniEmpleado = dniEmpleado;
        this.numProyecto = numProyecto;
        this.horas = horas;
    }

    public String getDniEmpleado() {
        return dniEmpleado;
    }

    public int getNumProyecto() {
        return numProyecto;
    }

    public double getHoras() {
        return horas;
    }

    public void setDniEmpleado(String dniEmpleado) {
        this.dniEmpleado = dniEmpleado;
    }

    public void setNumProyecto(int numProyecto) {
        this.numProyecto = numProyecto;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    
    
    
}
