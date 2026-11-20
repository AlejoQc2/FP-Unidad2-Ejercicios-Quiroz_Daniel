//
 // Sesión: S10 - Argumentos y parámetros: paso por valor
 // Ejercicio 02: Intercambiar valores de dos arreglos
 // Enunciado: Escribe intercambiar(int[] v, int i, int j) que intercambie dos posiciones del arreglo. ¿Ahora sí?
 // Autor: Quiroz Daniel
 // Fecha: 19/11/2026
 //
import java.util.Arrays;
public class Ej02_IntercambiarArreglo {
    static void esArreglo(int []v,int i, int j){
        int temp = v[i];
        v[i] = v[j];
        v[j]= temp;
    }
    static void main(String[]args){
        int []v ={6,7,8};
        esArreglo(v,0,2);
        System.out.println("La matriz queda: " +Arrays.toString(v));
    }
}
//Porque en Java los arreglos permiten modificar sus elementos desde un método. Por eso, cuando regresamos a main, los cambios siguen ahí.