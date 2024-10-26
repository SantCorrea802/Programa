/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class VerificacionDatos {
    public boolean verificarEntero(JTextField campo){
        try{
            Long.parseLong(campo.getText());
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    
    public boolean verificarFecha(JTextField campo, String formato){
        
        try{
            DateTimeFormatter f = DateTimeFormatter.ofPattern(formato);
            LocalDate.parse(campo.getText(), f);
            return true;
        } catch (DateTimeParseException e){
            return false;
        }
    }
}
