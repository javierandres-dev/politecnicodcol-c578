package ClaseMath;

import java.util.List;

public class Ejercicio2 {
  public static void main(String[] args) {
    int[] numbers = { 2, 8, 9, 27, 28, 55, 121 };
    for (int i = 0; i < numbers.length; i++) {
      double squareRoot = Math.sqrt(numbers[i]);
      System.out.println("Raíz cuadrada de " + numbers[i] + " = " + squareRoot);
    }
  }
}
