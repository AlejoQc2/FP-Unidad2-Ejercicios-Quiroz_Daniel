//
 // Sesión: S10 - Argumentos y parámetros: paso por valor
 // Ejercicio 05: Predicción de salida
 // Enunciado: Predice en papel la salida de un programa con 3 llamadas antes de ejecutarlo.
 // Autor: Quiroz Daniel
 // Fecha: 19/11/2026
 //
public class Ej05_PrediccionSalida {

    public static void modificarLista(String[] animales) {
        animales[1] = "Tigre";
        System.out.println("Animal actualizado: " + animales[1]);
    }
    public static void modificarTexto(String animal) {
        animal = "Leon";
        System.out.println("Animal temporal: " + animal);
    }
    public static void imprimirDatos(String[] animales, String animal) {
        System.out.println("Animal del arreglo: " + animales[1]);
        System.out.println("Animal individual: " + animal);
    }
    public static void main(String[] args) {

        String animal = "Perro";
        String[] animales = {"Gato", "Conejo"};

        /*Mi prediccion en cuanto a la presentacion de los datos seria la siguiente: 
        Animal actualizado: Tigre
        Animal temporal: Leon
        ----- RESULTADO FINAL -----
        Animal del arreglo: Tigre
        Animal individual: Perro
        */

        modificarLista(animales);
        modificarTexto(animal);

        System.out.println("----- RESULTADO FINAL -----");

        imprimirDatos(animales, animal);
    }
}