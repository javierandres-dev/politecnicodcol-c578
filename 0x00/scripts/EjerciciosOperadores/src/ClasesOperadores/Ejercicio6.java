/*
 * Realizar los siguientes pasos en su respectivo orden.
 * - Crear una variable entera llamada “ladoCuadrado” de valor 8.
 * - Calcular el área y el perímetro del cuadrado a partir de la variable
 * anteriormente creada.
 * - Crear una variable entera llamada “baseTriangulo” de valor 9.
 * - Crear una variable entera llamada “alturaTriangulo” de valor 8.
 * - Crear dos variables enteras llamadas “ladoUnoTriangulo” y
 * “ladoDosTriangulo” de valor 8 ambas.
 * - Calcular el área y el perímetro del triángulo a partir de variables
 * anteriormente creadas.
 * - Crear una variable entera llamada “baseRectangulo” de valor 8.
 * - Crear una variable entera llamada “alturaRectangulo” de valor 6.
 * - Calcular el área y el perímetro del rectángulo a partir de variables
 * anteriormente creadas.
 * - Mostrar el resultado de las operaciones.
 */
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
