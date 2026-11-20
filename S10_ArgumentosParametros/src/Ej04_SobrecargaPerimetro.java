//
 // Sesión: S10 - Argumentos y parámetros: paso por valor
 // Ejercicio 04: Sobrecarga de métodos - Perímetro
 // Enunciado: Sobrecarga perimetro(double lado) (cuadrado) y perimetro(double a, double b) (rectángulo).
 // Autor: Quiroz Daniel
 // Fecha: 19/11/2026
//
public class Ej04_SobrecargaPerimetro {

    static double perimetro(double lado) { //cuadrado
        return 4*lado; 
    }
    static double perimetro(double a, double b) { //triangulo
        return 2 * (a + b);
    }
    static void main(String[]args){
        double cuadrado=5;
        double a=3;
        double b=6;
        double P = 4 * cuadrado;
        double P1 = perimetro(a, b); 
        System.out.println("El perimetro del cuadrado es: " + P + " y el perimetro del triangulo es: " + P1);
    }
}