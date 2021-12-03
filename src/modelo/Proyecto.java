/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author clara
 */
public class Proyecto {
    private String nombreProyecto;
    private int numProyecto;
    private String ubicaciónProyecto;
    private byte numDptoProyecto;

    public Proyecto(String nombreProyecto, int numProyecto, String ubicaciónProyecto, byte numDptoProyecto) {
        this.nombreProyecto = nombreProyecto;
        this.numProyecto = numProyecto;
        this.ubicaciónProyecto = ubicaciónProyecto;
        this.numDptoProyecto = numDptoProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public int getNumProyecto() {
        return numProyecto;
    }

    public String getUbicaciónProyecto() {
        return ubicaciónProyecto;
    }

    public byte getNumDptoProyecto() {
        return numDptoProyecto;
    }

    
    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public void setNumProyecto(int numProyecto) {
        this.numProyecto = numProyecto;
    }

    public void setUbicaciónProyecto(String ubicaciónProyecto) {
        this.ubicaciónProyecto = ubicaciónProyecto;
    }

    public void setNumDptoProyecto(byte numDptoProyecto) {
        this.numDptoProyecto = numDptoProyecto;
    }
    
    
    
}
