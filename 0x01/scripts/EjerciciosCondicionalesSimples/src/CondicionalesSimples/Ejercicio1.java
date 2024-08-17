/*
 * Desarrollar un algoritmo que genere un número aleatorio de 1 a 100
 * (Math.random) y por medio de una condicional determinar sí el número
 * es menor a 50 o mayor.
 */
package CondicionalesSimples;

public class Ejercicio1 {
  public static void main(String[] args) {
    final int randomNumber = (int) Math.ceil(Math.random() * 100);
    if (randomNumber < 50) {
      System.out.println(randomNumber + " es menor a 50");
    } else if (randomNumber > 50) {
      System.out.println(randomNumber + " es mayor a 50");
    } else {
      System.out.println(randomNumber + " es igual a 50");
    }
  }
}
