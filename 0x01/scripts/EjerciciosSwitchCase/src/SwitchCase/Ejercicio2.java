/*
 * Desarrollar una calculadora, la cual, en base a un operador, realice
 * una operación con dos números enteros ya definidos y mostrar el
 * resultado, los operadores a tener en cuenta son los vistos en la
 * tabla de operadores aritméticos, sí deseas agregar más operadores,
 * siéntete en libertad de hacerlo.
 */
package SwitchCase;

public class Ejercicio2 {
  public static void main(String[] args) {
    final String sign = "+";
    // final String sign = "-";
    // final String sign = "x";
    // final String sign = "÷";
    // final String sign = "%";
    final int num1 = 10;
    final int num2 = 5;
    switch (sign) {
      case "+":
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        break;
      case "-":
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        break;
      case "x":
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        break;
      case "÷":
        System.out.println(num1 + " ÷ " + num2 + " = " + (num1 / num2));
        break;
      default:
        System.out.println(sign + " Operador no válido");
        break;
    }
  }
}
