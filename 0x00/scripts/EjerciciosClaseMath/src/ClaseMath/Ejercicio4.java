package ClaseMath;

public class Ejercicio4 {
  public static void main(String[] args) {
    long num1 = getNum();
    long num2 = getNum();
    long max = Math.max(num1, num2);
    System.out.println("Número 1: " + num1 + "\nNúmero 2: " + num2 +
        "\nNúmero mayor: " + max);
  }

  static private long getNum() {
    double x = Math.random() * 50;
    return Math.round(Math.ceil(x));
  }
}
