/*
  Sesión: S11 - Ambitos de Variables
  Ejercicio 01: Marcar a los Ambitos
  Enunciado: Marca con colores el ámbito de cada variable de un programa impreso de 25 líneas..
  Autor: Quiroz Daniel
  Fecha: 19/11/2026
 */
public class Ej01_MarcarAmbito {

    // STATIC: pertenece a la clase completa y no a un método ni a un objeto específico.
    static int numero = 10;

    // STATIC: pertenece a la clase completa y conserva su valor entre las llamadas a los métodos.
    static int contador = 0;

    public static void mostrar(int x) {
        // LOCAL: x es un parámetro que solo se utiliza dentro del método mostrar.
        
        // LOCAL: numero solo existe dentro del método mostrar y no puede utilizarse directamente fuera de él.
        int numero = 20;

        // STATIC: contador pertenece a la clase y puede modificarse desde este método.
        contador++;

        System.out.println(x);
        System.out.println(numero);
    }

    public static void main(String[] args) {
        // LOCAL: x solo se utiliza dentro del método main.
        int x = 5;

        // LOCAL: y solo se utiliza dentro del método main.
        int y = 15;

        mostrar(x);

        System.out.println(numero);
        System.out.println(contador);

        if (y > 10) {
            // DE BLOQUE: z solo existe y puede utilizarse dentro de este bloque if.
            int z = 30;

            System.out.println(z);
        }

        System.out.println(y);
        System.out.println(numero);
    }
}
