/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Beans.ZonaComun;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class GestionZonaComun {
    String descripcion;
    String horaInicio;
    String horaCierre;
    double costoMantenimiento;
    int cantidadMaxima;
    String estado;
    
    public void obtenerDatos(String nombreZonaComun) {
        // Inicializar Gson con el adaptador de LocalTime
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(LocalTime.class, new LocalTimeAdapter())
                .create();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        try {
            FileReader reader = new FileReader("BaseDatos/zonascomunes.json");

            // json a un objeto ZonasComunesWrapper
            ZonasComunesWrapper zonasWrapper = gson.fromJson(reader, ZonasComunesWrapper.class);

            // ista de ZonaComun
            List<ZonaComun> zonas = zonasWrapper.getZonasComunes();

            // buscar la parte que es el mismo que el nombre dado
            boolean zonaEncontrada = false;
            for (ZonaComun zona : zonas) {
                if (zona.getDescripcion().equalsIgnoreCase(nombreZonaComun)) {
                    // Si se encuentra, entonces asignar valores a las variables
                    this.descripcion = zona.getDescripcion();
                    this.horaInicio = zona.getHoraInicio().format(formatter);
                    this.horaCierre = zona.getHoraCierre().format(formatter);
                    this.costoMantenimiento = zona.getCostoMantenimiento();
                    this.cantidadMaxima = zona.getCantidadMaxima();
                    this.estado = zona.getEstado();

                    System.out.println("Descripción: " + this.descripcion);
                    System.out.println("Hora de Inicio: " + this.horaInicio);
                    System.out.println("Hora de Cierre: " + this.horaCierre);
                    System.out.println("Costo de Mantenimiento: " + this.costoMantenimiento);
                    System.out.println("Cantidad Máxima: " + this.cantidadMaxima);
                    System.out.println("Estado: " + this.estado);
                    System.out.println("-------------------------");

                    zonaEncontrada = true;
                    break;
                }
            }
            if (!zonaEncontrada) {
                System.out.println("La zona común con el nombre \"" + nombreZonaComun + "\" no fue encontrada.");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    
    public void imprimirInformacionReserva(){
        JOptionPane.showMessageDialog(null, "Hora de inicio: "+ this.horaInicio
        + "\nHora de cierre: " + this.horaCierre);
    }
    
    public void observarHorario(String zonaComun){
        obtenerDatos(zonaComun);
        imprimirInformacionReserva();
    }
    
}
