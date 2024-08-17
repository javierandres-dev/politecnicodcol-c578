/*
 * Desarrollar un programa que permita contar cuantas vocales existen en el
 * siguiente parrafo:
 * “Porta fames dis aenean platea neque semper? Conubia eleifend commodo
 * maecenas risus risus pellentesque.  Eros iaculis duis posuere integer purus
 * euismod consequat.  Vel congue curabitur penatibus ac mus nisi iaculis;
 * scelerisque feugiat blandit molestie euismod.  Tincidunt risus sociis
 * nostra fermentum laoreet aliquet aptent est.  Platea non proin aliquet
 * scelerisque nam maecenas elit cum.”
 */
package CicloWhile;

public class Ejercicio3 {
  public static void main(String[] args) {
    final String paragraph = "Porta fames dis aenean platea neque semper? Conubia eleifend commodo maecenas risus risus pellentesque.  Eros iaculis duis posuere integer purus euismod consequat.  Vel congue curabitur penatibus ac mus nisi iaculis; scelerisque feugiat blandit molestie euismod.  Tincidunt risus sociis nostra fermentum laoreet aliquet aptent est.  Platea non proin aliquet scelerisque nam maecenas elit cum.";
    final String vowels = "aeiouAEIOUáéíóúÁÉÍÓÚ";
    int count = 0;
    int i = 0;
    while (i < paragraph.length()) {
      final char character = paragraph.charAt(i);
      final String letter = Character.toString(character);
      if (vowels.contains(letter))
        count++;
      i++;
    }
    System.out.println("El parráfo contiene " + count + " vocales");
  }
}
