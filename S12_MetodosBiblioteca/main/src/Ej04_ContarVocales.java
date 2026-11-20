/*
  Sesión: S12 - Metodos de Bibliotecas
  Ejercicio 04: Conteo de vocales mayusculas y minusculas
  Enunciado: Contar vocales de una frase (String + Character).
  Autor: Quiroz Daniel
  Fecha: 19/11/2026
*/
import java.util.Scanner;
public class Ej04_ContarVocales {
    public static void contarVocales(String frase) {
        int total_vocales=0;
        int mayusculas = 0;
        int minusculas = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i); //obtiene cada letra de la frase (Nose si hemos visto esto, pero lo vi en un tutorial de youtube)
            if (Character.isUpperCase(letra)) { //identifica a las letras mayusculas
                if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                    mayusculas++;
                }
            }
            if (Character.isLowerCase(letra)) { //identifica a las letras minusculas.
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    minusculas++;
                }
            }
        }
        total_vocales=mayusculas+minusculas;
        System.out.println("Vocales mayusculas detectadas en la frase: " + mayusculas);
        System.out.println("Vocales minusculas detectadas en la frase: " + minusculas);
        System.out.println("Total de vocales detectadas en la frase: " + total_vocales);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();
        contarVocales(frase);
    }
}