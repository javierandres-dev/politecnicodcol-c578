/*
 * Desarrollar un programa que determine los divisores de un número definido
 * previamente.
 */
package CicloFor;

public class Ejercicio2 {
  public static void main(String[] args) {
    long num = 10;
    System.out.println("Divisores de: " + num);
    for (long i = 1; i <= num; i++)
      if (num % i == 0)
        System.out.println(i + " es divisor de " + num);
  }
}
