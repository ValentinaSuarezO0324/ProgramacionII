package PrgmDos;

public class Persona {
    // Atributos
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método especial Mostrar
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    // Método especial Correr
    public void correr() {
        System.out.println("Hola soy" + nombre + " tengo " + edad + " y he corrido mucho hoy");
    }


}
