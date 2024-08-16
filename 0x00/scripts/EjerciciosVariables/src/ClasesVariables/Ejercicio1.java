/*
 * Crear las siguientes variables según su criterio:
 * - Una variable que me permita almacenar el nombre de una persona.
 * - Una variable “x” para almacenar un número con 2 decimales.
 * - Una variable constante para almacenar el valor del dólar.
 * - Una variable primitiva float para almacenar los primeros 7 decimales
 * de “pi”.
 * - Un variable de estructura tipo Double para almacenar los primeros 15
 * decimales de “Euler”.
 * Imprima en consola las variables creadas
 */
package ClasesVariables;

public class Ejercicio1 {
  public static void main(String[] args) {
    String nombrePersona = "Jane";
    double x = 9.2;
    final double valorDolar = 4110.37d;
    float pi = 3.1415926f;
    double euler = 2.718281828459045;
    System.out.println("Variable | Valor");
    System.out.println("nombrePersona: " + nombrePersona);
    System.out.println("x: " + x);
    System.out.println("valorDolar: " + valorDolar);
    System.out.println("pi: " + pi);
    System.out.println("euler: " + euler);
  }
}
