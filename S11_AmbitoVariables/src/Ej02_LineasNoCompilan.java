/*
  Sesión: S11 - Ambitos de Variables
  Ejercicio 02: Lineas que no compilan
  Enunciado: Indica qué líneas no compilan y por qué.
  Autor: Quiroz Daniel
  Fecha: 19/11/2026
 */
public class Ej02_LineasNoCompilan {
    static int numero = 10;       // Ambito de Static
    static int contador = 0;      // Ambito de Static

    static void mostrar(int x) {  // Ambito Local
        int numero = 20;          // Ambito Local
        contador++;
        System.out.println(x);
        System.out.println(numero);
    }
    public static void main(String[] args) { // Ambito Local
        int x = 5;                // Ambito Local
        int y = 15;               // Ambito Local
        mostrar(x);
        System.out.println(numero);
        System.out.println(contador);
        if (y > 10) {
            int z = 30;           // Ambito de Bloque
            System.out.println(z);
        }
        System.out.println(y);
        System.out.println(numero);
        System.out.println(z);    // Esta linea no compila, porque z esta fuera del bloque donde se lo declaro, y solo se puede usar en ese bloque.
    }
}