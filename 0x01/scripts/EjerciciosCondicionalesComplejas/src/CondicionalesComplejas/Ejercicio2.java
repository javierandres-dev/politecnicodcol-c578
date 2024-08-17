/*
 * Desarrollar un programa que permita determinar la cantidad de cifras
 * de un número X teniendo en cuenta que el número únicamente puede
 * tener 4 cifras. Mostrar un mensaje por defecto si el número supera las
 * 4 cifras.
 */
package CondicionalesComplejas;

public class Ejercicio2 {
  public static void main(String[] args) {
    // final int num = -1;
    // final int num = -12;
    // final int num = -123;
    // final int num = -1234;
    // final int num = -12345;
    final int num = 0;
    // final int num = 1;
    // final int num = 12;
    // final int num = 123;
    // final int num = 1234;
    // final int num = 12345;
    if (num >= -9999 && num <= 9999) {
      if (num > -10 && num < 10) {
        System.out.println("El número " + num + " tiene 1 cifra");
      } else if (num >= -99 && num <= 99) {
        System.out.println("El número " + num + " tiene 2 cifras");
      } else if (num >= -999 && num <= 999) {
        System.out.println("El número " + num + " tiene 3 cifras");
      } else {
        System.out.println("El número " + num + " tiene 4 cifras");
      }
    } else {
      System.out.println("El número " + num + " supera las 4 cifras");
    }
  }
}
