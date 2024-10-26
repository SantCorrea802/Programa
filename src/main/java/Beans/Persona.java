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
public class Persona {
    String nombre;
    private String correo;
    private String id;
    private LocalDate fechaNacimiento;
    private String numeroContacto;
    private String genero;
    private String contraseña;
    private String profesion;
    private String apellido;
    private int rol; // 1 = user, 2 = admin/empleado

    public Persona(String nombre, String correo, String id, LocalDate fechaNacimiento, String numeroContacto, String genero, String contraseña, String profesion, String apellido, int rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroContacto = numeroContacto;
        this.genero = genero;
        this.contraseña = contraseña;
        this.profesion = profesion;
        this.apellido = apellido;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
    

}
