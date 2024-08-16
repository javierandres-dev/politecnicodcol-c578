/*
 * Realizar los siguientes pasos en su respectivo orden:
 * - Crear una variable entera con el valor de 9.
 * - Crear una variable entera con el valor de 7.
 * - Calcular la suma de la variable número uno más la variable número dos.
 * - Calcular la resta de la variable número uno menos la variable número
 * dos.
 * - Calcular la multiplicación de la variable número uno por la variable
 * número dos.
 * - Calcular la división de la variable número uno dividida la variable número
 * dos.
 * - Mostrar los resultados de cada operación.
 */
package ClasesOperadores;

public class Ejercicio2 {
  public static void main(String[] args) {
    int num1 = 9;
    int num2 = 7;
    System.out.println("Suma: " + num1 + " + " + num2 + " = " + (num1 + num2));
    System.out.println("Resta: " + num1 + " - " + num2 + " = " + (num1 - num2));
    System.out.println("Multiplicación: " + num1 + " x " + num2 + " = " + (num1 * num2));
    System.out.println("División: " + num1 + " \u00F7 " + num2 + " = " + (num1 / num2));
  }
}
