package ClaseMath;

public class Ejercicio3 {
  public static void main(String[] args) {
    double nota1 = (int) getNum();
    double nota2 = (int) getNum();
    double nota3 = (int) getNum();
    double nota4 = (int) getNum();
    double nota5 = (int) getNum();
    double promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
    System.out.println("Nota 1: " + nota1 + "\nNota 2: " + nota2 +
        "\nNota 3: " + nota3 + "\nNota 4: " + nota4 + "\nNota 5: " + nota5 + "\n----------\nPromedio: " + promedio);
  }

  static private double getNum() {
    return Math.random() * 10;
  }
}
