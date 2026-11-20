/*
  Sesión: S11 - Ambitos de Variables
  Ejercicio 03: Traza de contador en Static
  Enunciado: Haz la traza de un programa con un contador static llamado desde un for.
  Autor: Quiroz Daniel
  Fecha: 19/11/2026
 */
public class Ej03_TrazaContadorStatic {
    static int total_Ventas = 0;
    public static void main(String[] args) {
        int producto;
        for (producto = 1; producto <= 5; producto++) {
            total_Ventas++;
            System.out.println("Producto vendido: " + producto);
            System.out.println("Total de ventas: " + total_Ventas);
        }
        System.out.println("Ventas registradas: " + total_Ventas);
    }
}

/*
Línea   Variables Usadas        Valor

  9     totalVentas             0
  12    producto                1
  13    producto, totalVentas   1, 1
  12    producto, totalVentas   2, 1
  13    producto, totalVentas   2, 2
  12    producto, totalVentas   3, 2
  13    producto, totalVentas   3, 3
  12    producto, totalVentas   4, 3
  13    producto, totalVentas   4, 4
  12    producto, totalVentas   5, 4
  13    producto, totalVentas   5, 5
  12    producto, totalVentas   6, 5
  17    totalVentas             5   
 */