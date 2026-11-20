/*
  Sesión: S12 - Metodos de Bibliotecas
  Ejercicio 01: Distancia entre 2 puntos
  Enunciado: Distancia entre dos puntos con Math.sqrt y Math.pow.
  Autor: Quiroz Daniel
  Fecha: 19/11/2026
*/
public class Ej01_DistanciaPuntos {
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double diferencia_en_X = Math.pow(x2 - x1, 2);
        double diferencia_en_Y = Math.pow(y2 - y1, 2);
        double distancia = Math.sqrt(diferencia_en_X + diferencia_en_Y);
        return distancia;
    }
    public static void main(String[] args) {
        double puntoA_en_X = 3;
        double puntoA_en_Y = 4;
        double puntoB__en_X = 7;
        double puntoB_en_Y = 8;
        double resultado = calcularDistancia(puntoA_en_X, puntoA_en_Y, puntoB__en_X, puntoB_en_Y);
        System.out.println("Punto A: (" + puntoA_en_X + ", " + puntoA_en_Y + ")");
        System.out.println("Punto B: (" + puntoB__en_X + ", " + puntoB_en_Y + ")");
        System.out.println("Distancia entre los puntos: " + resultado);
    }
}