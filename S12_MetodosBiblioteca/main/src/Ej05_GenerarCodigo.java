/*
  Sesión: S12 - Metodos de Bibliotecas
  Ejercicio 05: Generacion de un codigo aleatorio
  Enunciado: Generar un código de 6 caracteres: 3 letras aleatorias + 3 dígitos.
  Autor: Quiroz Daniel
  Fecha: 19/11/2026
*/
import java.util.Random;
public class Ej05_GenerarCodigo {
    public static String generarCodigo() {
        Random aleatorio = new Random();
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String codigo = "";
        // Aqui se generaran los 3 caracteres aleatorios.
        for (int i = 0; i < 3; i++) {
            int posicion = aleatorio.nextInt(letras.length());
            char letra = letras.charAt(posicion);
            codigo = codigo + letra;
        }
        // Aqui se generaran los 3 digitos aleatoriamente.
        for (int i = 0; i < 3; i++) {
            int digito = aleatorio.nextInt(10);
            codigo = codigo + digito;
        }
        return codigo;
    }
    public static void main(String[] args) {
        String resultado = generarCodigo();
        System.out.println("Codigo generado: " + resultado);
    }
}