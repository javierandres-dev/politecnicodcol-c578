/*
 * Desarrollar un programa que permita definir si un número entero ya
 * establecido es un número perfecto o no.
 */
package CicloFor;

public class Ejercicio3 {
  public static void main(String[] args) {
    long num = 6;
    System.out.println(num + " ¿Es un número perfecto?");
    if (num > 0) {
      int sum = 0;
      for (int i = 1; i < num; i++)
        if (num % i == 0)
          sum += i;
      if (sum == num)
        System.out.println("Sí, " + num + " es un número perfecto");
      else
        System.out.println("No, " + num + " no es un número perfecto");
    } else {
      System.out.println("Ingrese un número entero positivo");
    }
  }
}
