/*
 * Click nbfs:nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs:nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class Multa {
    private LocalDate fechaMulta;
    private LocalDate fechaMaxuma;
    private LocalDate fechaEvento;
    private String idMulta;
    private double costo;
    private String descripcionEvento;
    private Empleado emisorMulta;
    private Propietario receptorMulta;
    private int idReceptor;
    private String evento;

    public Multa(LocalDate fechaMulta, LocalDate fechaMaxuma, LocalDate fechaEvento, String idMulta, double costo, String descripcionEvento, Empleado emisorMulta, Propietario receptorMulta, int idReceptor, String evento) {
        this.fechaMulta = fechaMulta;
        this.fechaMaxuma = fechaMaxuma;
        this.fechaEvento = fechaEvento;
        this.idMulta = idMulta;
        this.costo = costo;
        this.descripcionEvento = descripcionEvento;
        this.emisorMulta = emisorMulta;
        this.receptorMulta = receptorMulta;
        this.idReceptor = idReceptor;
        this.evento = evento;
    }

    public LocalDate getFechaMulta() {
        return fechaMulta;
    }

    public void setFechaMulta(LocalDate fechaMulta) {
        this.fechaMulta = fechaMulta;
    }

    public LocalDate getFechaMaxuma() {
        return fechaMaxuma;
    }

    public void setFechaMaxuma(LocalDate fechaMaxuma) {
        this.fechaMaxuma = fechaMaxuma;
    }

    public LocalDate getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(LocalDate fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getIdMulta() {
        return idMulta;
    }

    public void setIdMulta(String idMulta) {
        this.idMulta = idMulta;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    public void setDescripcionEvento(String descripcionEvento) {
        this.descripcionEvento = descripcionEvento;
    }

    public Empleado getEmisorMulta() {
        return emisorMulta;
    }

    public void setEmisorMulta(Empleado emisorMulta) {
        this.emisorMulta = emisorMulta;
    }

    public Propietario getReceptorMulta() {
        return receptorMulta;
    }

    public void setReceptorMulta(Propietario receptorMulta) {
        this.receptorMulta = receptorMulta;
    }

    public int getIdReceptor() {
        return idReceptor;
    }

    public void setIdReceptor(int idReceptor) {
        this.idReceptor = idReceptor;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

}
