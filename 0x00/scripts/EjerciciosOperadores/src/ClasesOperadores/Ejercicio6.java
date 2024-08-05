package ClasesOperadores;

public class Ejercicio6 {
  public static void main(String[] args) {
    int ladoCuadrado = 8;
    int areaCuadrado = ladoCuadrado * ladoCuadrado;
    int perimetroCuadrado = ladoCuadrado * 4;
    System.out.println("Cuadrado\n\tÁrea: " + areaCuadrado + "\n\tPerímetro: " + perimetroCuadrado);

    int baseTriangulo = 9;
    int alturaTriangulo = 8;
    int ladoUnoTriangulo = 8;
    int ladoDosTriangulo = 8;
    int areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
    int perimetroTriangulo = (ladoUnoTriangulo + ladoDosTriangulo) + baseTriangulo;
    System.out.println("Triangulo\n\tÁrea: " + areaTriangulo + "\n\tPerímetro: " + perimetroTriangulo);

    int baseRectangulo = 8;
    int alturaRectangulo = 6;
    int areaRectangulo = baseRectangulo * alturaRectangulo;
    int perimetroRectangulo = (baseRectangulo * 2) + (alturaRectangulo * 2);
    System.out.println("Rectangulo\n\tÁrea: " + areaRectangulo + "\n\tPerímetro: " + perimetroRectangulo);
  }
}
