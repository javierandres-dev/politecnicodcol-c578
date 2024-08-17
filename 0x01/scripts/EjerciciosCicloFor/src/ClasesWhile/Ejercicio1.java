/*
 * Desarrolla un programa que permita invertir la palabra “Programación”.
 * El resultado debe ser “nóicamargorP”.
 */
package ClasesWhile;

public class Ejercicio1 {
  public static void main(String[] args) {
    final String word = "Programación";
    String invertedWord = "";
    int i = word.length() - 1;
    while (i >= 0) {
      invertedWord += word.charAt(i);
      i--;
    }
    System.out.println(invertedWord);
  }
}
