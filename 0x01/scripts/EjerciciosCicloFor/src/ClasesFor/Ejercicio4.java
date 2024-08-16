/*
 * Desarrollar un programa que realice la sumatoria de todas las
 * iteraciones de un ciclo desde 0 hasta un número entero definido
 * previamente, al resultado de la suma realizar las siguientes operaciones:
 * - Raíz cuadrada.
 * - Generar un número aleatorio entre 1 y la sumatoria de las iteraciones.
 * - Determinar los divisores.
 * - Hallar la factorial.
 * - Definir si es un número perfecto.
 */
package ClasesFor;

public class Ejercicio4 {
  public static void main(String[] args) {
    long num = 3;
    System.out.println("Número: " + num);
    long sum1 = 0, sum2 = 0;
    for (long i = 0; i <= num; i++) {
      sum1 += i;
      if (i == 0)
        System.out.println("Divisores de: " + num);
      if (i > 0) {
        if (num % i == 0)
          System.out.println(i + " es divisor de " + num);
        if (i < num) {
          if (num % i == 0)
            sum2 += i;
        }
      }
    }
    System.out.println("Sumatoria = " + sum1);
    System.out.println("Raíz cuadrada de " + sum1 + " = " + Math.sqrt(sum1));
    long rand = (long) (Math.random() * sum1) + 1;
    System.out.println("Número aleatorio entre 1 y " + sum1 + " = " + rand);
    long factorial = 1;
    for (long i = num; i > 0; i--)
      factorial *= i;
    System.out.println("Factorial de " + num + " = " + factorial);
    System.out.println(num + " ¿Es un número perfecto?");
    if (sum2 == num)
      System.out.println("Sí, " + num + " es un número perfecto");
    else
      System.out.println("No, " + num + " no es un número perfecto");
  }
}
