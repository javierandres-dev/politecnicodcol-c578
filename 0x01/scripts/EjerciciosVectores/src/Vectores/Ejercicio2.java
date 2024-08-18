/*
 * Desarrollar un programa que dados dos grupos (Grupo A – Grupo B)
 * cada uno con 10 estudiantes y una nota final de la materia por
 * estudiante, determinar:
 * - El promedio general de cada grupo.
 * - El promedio general de ambos grupos.
 * - El grupo con mejor promedio.
 */
package Vectores;

public class Ejercicio2 {
  public static void main(String[] args) {
    final float[] groupA = { 4.5f, 4.5f, 5.0f, 3.2f, 4.8f, 2.4f, 4.9f, 3.9f, 3.7f, 4.0f };
    final float[] groupB = { 4.6f, 4.4f, 3.5f, 4.9f, 4.1f, 3.3f, 2.8f, 4.7f, 3.2f, 4.2f };
    float sumA = 0;
    float sumB = 0;
    for (int i = 0; i < 10; i++) {
      sumA += groupA[i];
      sumB += groupB[i];
    }
    final float averageA = sumA / 10;
    final float averageB = sumB / 10;
    final float averageBoth = (sumA + sumB) / 20;
    final String theBest = averageA > averageB ? "Grupo A" : "Grupo B";
    System.out.println("Promedios generales:\nGrupo A: " + averageA + "\nGrupo B: " + averageB
        + "\nPromedio general de ambos grupos: " + averageBoth + "\nGrupo con mejor promedio: " + theBest);
  }
}
