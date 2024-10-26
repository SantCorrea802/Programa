/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 *
 * @author HP
 */
public class ZonaComun extends Propiedad {
    private String descripcion;
    private LocalTime horaInicio;
    private LocalTime horaCierre;
    private double costoMantenimiento;
    private int cantidadMaxima; // se refiere a cantidad de personas

    public ZonaComun(String descripcion, LocalTime horaInicio, LocalTime horaCierre, double costoMantenimiento, int cantidadMaxima, String estado) {
        super(estado);
        this.descripcion = descripcion;
        this.horaInicio = horaInicio;
        this.horaCierre = horaCierre;
        this.costoMantenimiento = costoMantenimiento;
        this.cantidadMaxima = cantidadMaxima;
    }

    public ZonaComun() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(LocalTime horaCierre) {
        this.horaCierre = horaCierre;
    }

    public double getCostoMantenimiento() {
        return costoMantenimiento;
    }

    public void setCostoMantenimiento(double costoMantenimiento) {
        this.costoMantenimiento = costoMantenimiento;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

 


}

