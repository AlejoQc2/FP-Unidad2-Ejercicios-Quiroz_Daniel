//
 // Sesión: S10 - Argumentos y parámetros: paso por valor
 // Ejercicio 03: Aplicar descuento
 // Enunciado: aplicarDescuento(double[] precios, double pct) que modifique todo el arreglo.
 // Autor: Quiroz Daniel
 // Fecha: 19/11/2026
 //
import java.util.Arrays;
public class Ej03_AplicarDescuento {
    static void aplicarDescuento(double[] precio, double pct){
        for (int i = 0; i < precio.length; i++)
           precio[i]= precio[i] - (precio[i]*pct/100);
    }
    static void main(String[]args){
        double[] precio={40,50,60,70};
        aplicarDescuento(precio,10);
        System.out.println("Los precios con su respectivo descuento son: " +Arrays.toString(precio));
    }
}