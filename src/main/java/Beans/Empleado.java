/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class Empleado extends Persona{
    private String cargo;
    private LocalDate fechaInicio;

    public Empleado(String cargo, LocalDate fechaInicio, String name, String email, String id, LocalDate birthDate, String contactNumber, String gender, String password, String profession, String lastName, int rol) {
        super(name, email, id, birthDate, contactNumber, gender, password, profession, lastName, rol);
        this.cargo = cargo;
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
