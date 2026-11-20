//
 // Sesion: S10 - Argumentos y parámetros: paso por valor
 // Ejercicio 01: Intercambiar valores de dos variables
 // Enunciado: Escribe intercambiar(int a, int b) e intenta intercambiar dos variables de main. ¿Funciona? Explica.
 // Autor: Quiroz Daniel
 // Fecha: 19/11/2026
 //
public class Ej01_IntercambiarPrimitivos {
    static void esCambio(int a, int b) {
        int temporal=a;
        a = b;
        b = temporal;
    }
    static void main (String[]args){
        int a = 6;
        int b = 7;
        esCambio(a, b);
        System.out.println("a= "+b+ " b= "+a);
    }
}
//Si, el método cumple su función de intercambiar los valores temporalmente, porque utiliza una variable auxiliar llamada temporal para guardar el valor de a antes de reemplazarlo por el de b, pero al volver al main, este retorna sus valores, teniendo que a se quedara con su valor inicial y b con el suyo.