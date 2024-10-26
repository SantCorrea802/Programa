/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

/**
 *
 * @author HP
 */
public class Casa extends Propiedad{
    private String idCasa;
    private Propietario propietario;
    private double saldo;
    private double costoAdministracion;
    private double metrosCuadrados;

    public Casa(String idCasa, Propietario propietario, double saldo, double costoAdministracion, double metrosCuadrados, String estado) {
        super(estado);
        this.idCasa = idCasa;
        this.propietario = propietario;
        this.saldo = saldo;
        this.costoAdministracion = costoAdministracion;
        this.metrosCuadrados = metrosCuadrados;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(String idCasa) {
        this.idCasa = idCasa;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCostoAdministracion() {
        return costoAdministracion;
    }

    public void setCostoAdministracion(double costoAdministracion) {
        this.costoAdministracion = costoAdministracion;
    }
}
