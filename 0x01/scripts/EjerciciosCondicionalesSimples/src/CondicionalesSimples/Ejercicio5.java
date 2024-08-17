/*
 * Por medio de una nota decimal, determinar sí el estudiante aprobó o no
 * la clase (0 – 6 = Perdió – 7 – 10 = Aprobó).
 */
package CondicionalesSimples;

public class Ejercicio5 {
  public static void main(String[] args) {
    final float grade = 6.1f;
    System.out.println("Nota: " + grade);
    if (grade <= 6) {
      System.out.println("Perdió");
    } else {
      System.out.println("Aprobó");
    }
  }
}
