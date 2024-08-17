/*
 * Desarrollar un programa que determine si una palabra establecida
 * previamente es o no palíndroma.
 */
package ClasesWhile;

public class Ejercicio2 {
  public static void main(String[] args) {
    final String word = "anna";
    // final String word = "anne";
    String invertedWord = "";
    int i = word.length() - 1;
    while (i >= 0) {
      invertedWord += word.charAt(i);
      i--;
    }
    if (word.equals(invertedWord))
      System.out.println(word + " es una palabra palíndroma");
    else
      System.out.println(word + " no es una palabra palíndroma");
  }
}
