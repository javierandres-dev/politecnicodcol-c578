/*
 * Realizar los siguientes pasos en su respectivo orden.
 * - Generar 2 números con decimales aleatorios entre 1 y 50,
 * que serán almacenados en dos variables.
 * - Redondear las dos variables anteriormente creadas por medio del método
 * Math.round, Math.floor o Math.ceil.
 * - Calcular el número mayor por medio de Math.max.
 * - Mostrar el número mayor entre ambas variables.
 */
package ClaseMath;

public class Ejercicio4 {
  public static void main(String[] args) {
    long num1 = getNum();
    long num2 = getNum();
    long max = Math.max(num1, num2);
    System.out.println("Número 1: " + num1 + "\nNúmero 2: " + num2 +
        "\nNúmero mayor: " + max);
  }

  static private long getNum() {
    double x = Math.random() * 50;
    return Math.round(Math.ceil(x));
  }
}
