/*
 * Realizar los siguientes pasos en su respectivo orden:
 * - Crear una variable para almacenar el nombre de un estudiante.
 * - Crear 5 variables de tipo double para almacenar 5 diferentes notas
 * decimales.
 * - Calcular el promedio final del estudiante a partir de las 5 notas
 * decimales.
 * - Mostrar el resultado y el nombre del estudiante.
 */
package ClasesOperadores;

public class Ejercicio1 {
  public static void main(String[] args) {
    String estudiante = "Jane";
    double nota1 = 8.2;
    double nota2 = 7.1;
    double nota3 = 2.2;
    double nota4 = 10.0;
    double nota5 = 4;
    double promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
    System.out.println("Estudiante: " + estudiante + "\nPromedio: " + promedio);
  }
}
