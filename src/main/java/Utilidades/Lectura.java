/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author HP
 */
public class Lectura {
    // Método para leer un String
    public static String leerString(BufferedReader bln, String label) throws IOException {
        System.out.print(label);
        return bln.readLine();
    }

    // Método para leer un entero
    public static int leerEntero(BufferedReader bln, String label) throws IOException {
        
        do{
           System.out.print(label);
            try{
              int retornar = Integer.parseInt(bln.readLine());
              return retornar;
              }
              catch(NumberFormatException e){
              System.err.println("Debe ingresar un numero");
              }
        }while(true);
    }

    // Método para leer un flotante
    public static float leerFlotante(BufferedReader bln, String label) throws IOException {
        do{
           System.out.print(label);
            try{
              float retornar =Float.parseFloat(bln.readLine());
              return retornar;
              }
              catch(NumberFormatException e){
              System.err.println("Debe ingresar un numero ");
              }
        }while(true);
    }

    // Método para leer un doble
    public static double leerDoble(BufferedReader bln, String label) throws IOException {
        do{
           System.out.print(label);
            try{
              double retornar = Double.parseDouble(bln.readLine());
              return retornar;
              }
              catch(NumberFormatException e){
              System.err.println("Debe ingresar un numero");
              }
        }while(true);
    }

    // Método para leer un booleano
    public static boolean leerBooleano(BufferedReader bln, String label) throws IOException {
        do{
           System.out.print(label);
            try{
              boolean retornar = Boolean.parseBoolean(bln.readLine());
              return retornar;
              }
              catch(NumberFormatException e){
              System.err.println("Debe ingresar un valor booleano ");
              }
        }while(true);
    }
}