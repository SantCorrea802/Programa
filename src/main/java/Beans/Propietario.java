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
public class Propietario extends Persona{
    private double salario;
    private LocalDate fechaRegistro;

    public Propietario(double salario, LocalDate fechaRegistro, String nombre, String correo, String id, LocalDate fechaNacimiento, String numeroContacto, String genero, String contraseña, String profesion, String apellido, int rol) {
        super(nombre, correo, id, fechaNacimiento, numeroContacto, genero, contraseña, profesion, apellido, rol);
        this.salario = salario;
        this.fechaRegistro = fechaRegistro;
    }





    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }


   
}
