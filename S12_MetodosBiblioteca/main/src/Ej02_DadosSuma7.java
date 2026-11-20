/*
  Sesión: S12 - Metodos de Bibliotecas
  Ejercicio 02: Dados que suman 7
  Enunciado: Lanzar dos dados 1000 veces y contar cuántas veces suman 7 (Random).
  Autor: Quiroz Daniel
  Fecha: 19/11/2026
*/
import java.util.Random;
public class Ej02_DadosSuma7 {
    public static void main(String[] args) {
        Random dado = new Random();
        double porcentaje;
        int Sietes = 0;
        int Lanzamientos = 1000;
        for (int i = 1; i <= Lanzamientos; i++) {
            int primerdado = dado.nextInt(6) + 1;
            int segundodado = dado.nextInt(6) + 1;
            int suma = primerdado + segundodado;
            if (suma == 7) {
                Sietes++;
            }
        }
        porcentaje = (Sietes*100.0)/Lanzamientos;
        System.out.println("Cantidad de lanzamientos: " + Lanzamientos);
        System.out.println("Veces que sumaron 7: " + Sietes);
        System.out.println("El porcentaje de las veces que se sumaron 7 son:"+ porcentaje);
    }
}