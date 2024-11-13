/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * La clase {@code POOP11} demuestra el uso de archivos en Java, incluyendo la creación,
 * escritura y lectura de archivos. También muestra el uso de {@code StringTokenizer} 
 * para manipular cadenas de texto.
 * <p>En esta clase se realiza la lectura de datos desde la entrada estándar, el manejo 
 * de excepciones para errores de I/O y el almacenamiento de datos en un archivo de texto.</p>
 * 
 * @version 1.0
 */
public class POOP11 {

    /**
     * Método principal que contiene la lógica de creación, escritura y lectura de archivos,
     * además de la manipulación de cadenas con {@code StringTokenizer}.
     * @param args argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Crea un archivo y verifica si existe
        File archivo = new File("archivo.txt");
        System.out.println(archivo.exists());
        try {
            boolean seCreo = archivo.createNewFile();
            System.out.println(archivo.exists());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("######## FileWriter #########");
        
        // Escritura en el archivo usando FileWriter, BufferedWriter y PrintWriter
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribe texto para el archivo: ");
            String texto = br.readLine();
            System.out.println(texto);
            
            FileWriter fw = new FileWriter("archivo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            
            salida.println(texto);
            salida.println("Esta es la segunda línea");
            
            for (int i = 0; i < 10; i++) {
                salida.println("Línea " + i);
            }
            
            for (int i = 0; i < 10; i++) {
                salida.println("Cargando archivo " + i * 10 + "%");
            }
            
            salida.close();
                        
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("########## FileReader #########");
        
        // Lectura del archivo usando FileReader y BufferedReader
        try {
            FileReader fr = new FileReader("archivo.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("El texto del archivo es: ");
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            fr.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("########## StringTokenizer ##########");
        
        // Uso de StringTokenizer para separar los datos de un alumno
        String alumnoParseado = "Eric Fernando,Soto,Bolaños,321184593,18,3";
        System.out.println(alumnoParseado);
        StringTokenizer tokenizador = new StringTokenizer(alumnoParseado, ",");
        while (tokenizador.hasMoreTokens()) {
            System.out.println(tokenizador.nextToken());
        }
        
        // Creación de objetos Alumno y almacenamiento en un ArrayList
        Alumno alumno1 = new Alumno("Halley", "Mendoza", "Sanchez", 321254601, 19, 3);
        Alumno alumno2 = new Alumno("Nestor", "Bueno", "Perez", 321563789, 19, 3);
        Alumno alumno3 = new Alumno("Derek", "Chavez", "Arceo", 321225795, 19, 3);
        Alumno alumno4 = new Alumno("Lia Alejandra", "Mendoza", "Avalos", 321324232, 17, 0);
        Alumno alumno5 = new Alumno("Ivan", "Gomez", "Castañeda", 323242354, 19, 3);
        
        ArrayList<Alumno> lista = new ArrayList<>();
        lista.add(alumno1);
        lista.add(alumno2);
        lista.add(alumno3);
        lista.add(alumno4);
        lista.add(alumno5);
        
        for (Alumno alumno : lista) {
            System.out.println(alumno);
        }
        
        System.out.println("Escribiendo en archivo alumnos.txt");
        
        // Escritura de la lista de alumnos en un archivo de texto
        try {
            FileWriter fw = new FileWriter("alumnos.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            
            for (Alumno alumno : lista) {
                salida.println(alumno);
            }
            
            salida.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
