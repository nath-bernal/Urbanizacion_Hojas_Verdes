/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

/**
 *
 * @author NATALIA
 */
public class Administracion {
    private String numeroPropiedad;
    private String valorAdministracion;

    public Administracion(String numeroPropiedad, String valorAdministracion) {
        this.numeroPropiedad = numeroPropiedad;
        this.valorAdministracion = valorAdministracion;
    }

    public String getNumeroPropiedad() {
        return numeroPropiedad;
    }

    public void setNumeroPropiedad(String numeroPropiedad) {
        this.numeroPropiedad = numeroPropiedad;
    }

    public String getValorAdministracion() {
        return valorAdministracion;
    }

    public void setValorAdministracion(String valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }
}

