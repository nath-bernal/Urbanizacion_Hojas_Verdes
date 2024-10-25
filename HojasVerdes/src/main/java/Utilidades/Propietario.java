/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

public class Propietario {
    private String nombre;
    private String cedula;
    private String numeroPropiedad;
    private String correo;

    public Propietario(String nombre, String cedula, String numeroPropiedad, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.numeroPropiedad = numeroPropiedad;
        this.correo = correo;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNumeroPropiedad() {
        return numeroPropiedad;
    }

    public void setNumeroPropiedad(String numeroPropiedad) {
        this.numeroPropiedad = numeroPropiedad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

  
}