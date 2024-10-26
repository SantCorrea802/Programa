/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Beans.Propietario;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class GestionLogueo {
    String rutaPropietarios = "BaseDatos/propietarios.csv";
    private String id;
    private int rol;

    public GestionLogueo(String id, int rol) {
        this.id = id;
        this.rol = rol;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public int verificarTipoUsuario(String id) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaPropietarios))) {
            String linea; 
            while ((linea = br.readLine()) != null) {
                String[] data = linea.split(";");
                String idRegistrado = data[4].trim();
                if (idRegistrado.equals(id)) {
                    String rolRegistrado = data[11].trim();
                    if (rolRegistrado.equals("1")) {
                        return 1;  // Retorna 1 si es propietario
                    } else if (rolRegistrado.equals("2")) {
                        return 2; // Retorna 2 si es empleado
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    
    public boolean loginUsuario(String id, String contraseña) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaPropietarios))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                // usae ";" como separador y guardar cada parte en data
                String[] data = linea.split(";");
                String idRegistrado = data[4].trim();
                String contraseñaRegistrada = data[8].trim();
                if (idRegistrado.equals(id) && contraseñaRegistrada.equals(contraseña)) {
                   return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("ID o contraseña incorrectos.");
        return false; 
    }

}
