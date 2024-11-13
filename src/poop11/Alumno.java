/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop11;

/**
 * La clase {@code Alumno} representa a un estudiante con atributos como nombre, apellidos, 
 * número de cuenta, edad y semestre. Proporciona métodos para obtener y modificar estos 
 * atributos, así como un método para representar la acción de estudiar.
 * <p>La clase incluye métodos para consultar y actualizar los atributos, además de una 
 * implementación del método {@code toString} que devuelve una representación del alumno.</p>
 * 
 * @version 1.0
 */
public class Alumno {

    private String nombre;
    private String apPat;
    private String apMat;
    private int numCuenta;
    private int edad;
    private int semestre;

    /**
     * Constructor sin parámetros que inicializa un objeto {@code Alumno} sin valores específicos.
     */
    public Alumno() {
    }

    /**
     * Constructor que inicializa un objeto {@code Alumno} con valores específicos.
     * 
     * @param nombre    el nombre del alumno
     * @param apPat     el apellido paterno del alumno
     * @param apMat     el apellido materno del alumno
     * @param numCuenta el número de cuenta del alumno
     * @param edad      la edad del alumno
     * @param semestre  el semestre que cursa el alumno
     */
    public Alumno(String nombre, String apPat, String apMat, int numCuenta, int edad, int semestre) {
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.numCuenta = numCuenta;
        this.edad = edad;
        this.semestre = semestre;
    }

    /**
     * Obtiene el nombre del alumno.
     * @return el nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del alumno.
     * @param nombre el nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido paterno del alumno.
     * @return el apellido paterno del alumno
     */
    public String getApPat() {
        return apPat;
    }

    /**
     * Establece el apellido paterno del alumno.
     * @param apPat el apellido paterno del alumno
     */
    public void setApPat(String apPat) {
        this.apPat = apPat;
    }

    /**
     * Obtiene el apellido materno del alumno.
     * @return el apellido materno del alumno
     */
    public String getApMat() {
        return apMat;
    }

    /**
     * Establece el apellido materno del alumno.
     * @param apMat el apellido materno del alumno
     */
    public void setApMat(String apMat) {
        this.apMat = apMat;
    }

    /**
     * Obtiene el número de cuenta del alumno.
     * @return el número de cuenta del alumno
     */
    public int getNumCuenta() {
        return numCuenta;
    }

    /**
     * Establece el número de cuenta del alumno.
     * @param numCuenta el número de cuenta del alumno
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * Obtiene la edad del alumno.
     * @return la edad del alumno
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del alumno.
     * @param edad la edad del alumno
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el semestre actual del alumno.
     * @return el semestre actual del alumno
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * Establece el semestre actual del alumno.
     * @param semestre el semestre actual del alumno
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * Representa la acción de estudiar del alumno.
     */
    public void estudiar() {
        System.out.println("Estoy estudiando");
    }

    /**
     * Retorna una representación en cadena de texto del objeto {@code Alumno}.
     * @return una cadena con los atributos del alumno en formato CSV
     */
    @Override
    public String toString() {
        return nombre + "," + apPat + "," + apMat + "," + numCuenta + "," + edad + "," + semestre;
    }
}
