/*
 * - Crear 2 variables enteras, una llamada “Base” y la otra “Exponente”,
 * asignar valores a su criterio.
 * - Calcular la potencia utilizando el método Math.pow.
 * - Mostrar el resultado de la operación.
 */
package ClaseMath;

public class Ejercicio1 {
  public static void main(String[] args) {
    int Base = 8;
    int Exponente = 2;
    double potencia = Math.pow(Base, Exponente);
    System.out.println("Base: " + Base + "\nExponente: " + Exponente +
        "\nPotencia: " + potencia);
  }
}
