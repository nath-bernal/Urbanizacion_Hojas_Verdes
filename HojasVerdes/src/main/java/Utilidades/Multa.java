/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

public class Multa {
    private String identificacionMulta;
    private String numeroPropiedad;
    private String fechaMulta;
    private String fechaEventos;
    private String zonaComun;
    private String valorMulta;
    private String fechaLimitePago;
    private String observaciones;

    public Multa(String identificacionMulta, String numeroPropiedad, String fechaMulta, String fechaEventos, String zonaComun, String valorMulta, String fechaLimitePago, String observaciones) {

        this.identificacionMulta = identificacionMulta;
        this.numeroPropiedad = numeroPropiedad;
        this.fechaMulta = fechaMulta;
        this.fechaEventos = fechaEventos;
        this.zonaComun = zonaComun;
        this.valorMulta = valorMulta;
        this.fechaLimitePago = fechaLimitePago;
        this.observaciones = observaciones;
    }


    public String getIdentificacionMulta() {
        return identificacionMulta;
    }

    public void setIdentificacionMulta(String identificacionMulta) {
        this.identificacionMulta = identificacionMulta;
    }

    public String getNumeroPropiedad() {
        return numeroPropiedad;
    }

    public void setNumeroPropiedad(String numeroPropiedad) {
        this.numeroPropiedad = numeroPropiedad;
    }

    public String getFechaMulta() {
        return fechaMulta;
    }

    public void setFechaMulta(String fechaMulta) {
        this.fechaMulta = fechaMulta;
    }

    public String getFechaEventos() {
        return fechaEventos;
    }

    public void setFechaEventos(String fechaEventos) {
        this.fechaEventos = fechaEventos;
    }

    public String getZonaComun() {
        return zonaComun;
    }

    public void setZonaComun(String zonaComun) {
        this.zonaComun = zonaComun;
    }

    public String getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(String valorMulta) {
        this.valorMulta = valorMulta;
    }

    public String getFechaLimitePago() {
        return fechaLimitePago;
    }

    public void setFechaLimitePago(String fechaLimitePago) {
        this.fechaLimitePago = fechaLimitePago;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}