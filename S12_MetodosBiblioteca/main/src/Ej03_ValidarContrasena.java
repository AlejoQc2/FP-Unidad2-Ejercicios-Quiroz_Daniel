/*
  Sesión: S12 - Metodos de Bibliotecas
  Ejercicio 03: Validación de una contraseña
  Enunciado: Validar una contraseña: mínimo 8 caracteres, al menos una mayúscula y un dígito (Character).
  Autor: Quiroz Daniel
  Fecha: 19/11/2026
*/
import java.util.Scanner;
public class Ej03_ValidarContrasena {
    public static boolean validarContrasena(String contrasena) {
        boolean Mayuscula = false;
        boolean Digito = false;
        if (contrasena.length() < 8) {
            return false;
        }
        for (int i = 0; i < contrasena.length(); i++) {
            char caracter = contrasena.charAt(i);
            if (Character.isUpperCase(caracter)) {
                Mayuscula = true;
            }
            if (Character.isDigit(caracter)) {
                Digito = true;
            }
        }
        return Mayuscula && Digito;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una contraseña: ");
        String contrasena = sc.nextLine();
        if (validarContrasena(contrasena)) {
            System.out.println("Contraseña válida.");
        } else {
            System.out.println("Contraseña no válida.");
            System.out.println("Debe tener mínimo 8 caracteres,");
            System.out.println("una mayúscula y un dígito.");
        }
    }
}