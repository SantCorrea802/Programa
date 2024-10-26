/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;


import java.time.format.DateTimeFormatter;

import Beans.Propietario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class GestionPropietario {
    
    String rutaPropietarios = "BaseDatos/propietarios.csv";
    
    public Propietario buscarPorId(String id){
        try(BufferedReader br = new BufferedReader(new FileReader(rutaPropietarios))){
            String linea;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            while ((linea = br.readLine()) != null){
                String[] data = linea.split(";");
                if (data[4].trim().equals(id.trim())){
                    return new Propietario(Double.parseDouble(data[0]), LocalDate.parse(data[1], formatter),
                    data[2], data[3], data[4], LocalDate.parse(data[5], formatter), data[6], data[7], data[8], data[9],
                    data[10], Integer.parseInt(data[11]));
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Propietario creado con exito");
        return null; // si retorna null, es porque ningun usuario tiene ese id
    }
    
    public boolean idRegistrado(String id){
        return buscarPorId(id) != null;
    }
    
    public void registrarPropietario(Propietario propietario){
        if (idRegistrado(propietario.getId())){
            JOptionPane.showMessageDialog(null, "El ID ya está registrado.");
            System.out.println("ERROR");
            return;
        }
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(rutaPropietarios, true))){
            wr.write(propietario.getSalario() + ";" + propietario.getFechaRegistro()+ ";" +propietario.getNombre()+ ";" + 
                    propietario.getCorreo()+ ";" + propietario.getId() + ";" + propietario.getFechaNacimiento()
                    + ";" +propietario.getNumeroContacto() + ";" + propietario.getGenero() + ";" + propietario.getContraseña()
                    + ";" + propietario.getProfesion() + ";" + propietario.getApellido() + ";" + propietario.getRol());
            wr.newLine();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
