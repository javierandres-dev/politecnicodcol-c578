package ClaseMath;

public class Ejercicio3 {
  public static void main(String[] args) {
    long nota1 = getNum();
    long nota2 = getNum();
    long nota3 = getNum();
    long nota4 = getNum();
    long nota5 = getNum();
    System.out.println(nota1);
    System.out.println(nota2);
    System.out.println(nota3);
    System.out.println(nota4);
    System.out.println(nota5);
  }

  static private long getNum() {
    double x = Math.random() * 10;
    return Math.round(x);
  }
}
