/*
  Sesión: S11 - Ambitos de Variables
  Ejercicio 04: Reescribir sin Static
  Enunciado: Reescribe un programa que usa 3 atributos static para que use parámetros y return.
  Autor: Quiroz Daniel
  Fecha: 19/11/2026
 */
public class Ej04_ReescribirSinStatic {
    /*
     Version original tenia atributos static compartidos:
        static int estudiantesAprobados = 0;
        static int puntosAcumulados = 0;
        static int notaMinima = 7;
     La nueva version utiliza variables locales dentro de main.
     */
    // Recibe dos notas y calcula el promedio del estudiante.
    public static double calcularPromedio(double nota1, double nota2) {
        double promedio = (nota1 + nota2) / 2;
        return promedio;
    }
    // Determina si el estudiante aprobo o reprobo.
    public static boolean verificarAprobacion(double promedio) {
        return promedio >= 14;
    }
    public static void main(String[] args) {
        // Aqui declaramos variables locales para el conteo de los estudiantes.
        int estudiantesAprobados = 0;
        int estudiantesReprobados = 0;
        double[][] notas = {{15, 13}, {17, 20}, {4, 18}};
        // Procedemos a recorrer las calificaciones de cada estudiante.
        for (int i = 0; i < notas.length; i++) {

            double promedio = calcularPromedio(notas[i][0], notas[i][1]);

            System.out.println("Estudiante " + (i + 1));
            System.out.println("Promedio: " + promedio);

            if (verificarAprobacion(promedio)) {
                estudiantesAprobados++;
                System.out.println("Estado: Aprobado");
            } else {
                estudiantesReprobados++;
                System.out.println("Estado: Reprobado");
            }

            System.out.println("-------------------");
        }
        System.out.println("Total de aprobados: " + estudiantesAprobados);
        System.out.println("Total de reprobados: " + estudiantesReprobados);
    }
}