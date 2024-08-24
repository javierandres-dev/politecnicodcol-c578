/*
 * Crear dos clases: una llamada Password y la clase principal para ejecutar.
 * - Clase Password, cuenta con dos atributos: longitud y password con sus
 *   respectivos Getters y Setters (password no tendrá setter), además un
 *   constructor por defecto que asignará 10 al atributo longitud y un
 *   constructor que reciba la longitud deseada; a parte dos métodos:
 * - generar(), genera una contraseña a partir del atributo longitud, aquí
 *   usaremos los caracteres de la tabla ASCII, de la siguiente forma:
 *   - usaremos un ciclo for que recorra las veces que tenga establecidas la
 *     variable longitud y generar caracteres:
 *     - Entre 48 – 57: números
 *     - Entre 65 – 90: mayúsculas
 *     - Entre 97 – 122: minúsculas
 *     Utiliza la clase Math y el método Math.random en los rangos
 *     anteriormente descritos para generar la contraseña.  Puedes usar una
 *     condicional con una variable auxiliar generada por Math entre 1 y 3 para
 *     determinar si generar una minúscula, mayúscula o un número.
 * - validar(), valida e imprime si la contraseña es segura, a partir de la
 *   cantidad de minúsculas, mayúsculas o números.  Para saber si una
 *   contraseña es segura, debe tener al menos 5 números, 1 minúscula y 2
 *   mayúsculas.
 * - En la clase principal realizar todos los procesos anteriormente diseñados
 *   por los métodos y mostrar los resultados.
 */
public class Password {
  private int longitud;
  private String password;

  public Password() {
    this.longitud = 10;
  }

  public Password(int longitud) {
    if (longitud < 8) {
      System.out.println("Longitud mínima debe ser de 8");
    } else {
      this.longitud = longitud;
    }
  }

  public int getLongitud() {
    return longitud;
  }

  public void setLongitud(int longitud) {
    this.longitud = longitud;
  }

  public String getPassword() {
    return password;
  }

  public void generar() {
    String password = "";
    int numbersCounter = 5;
    int uppersCounter = 2;
    int lowersCounter = 1;
    for (int i = 0; i < longitud; i++) {
      int lowerBound = 0;
      int upperBound = 0;
      int typeChar = 0;
      if (numbersCounter > 0 && uppersCounter <= 0 && lowersCounter <= 0) {
        typeChar = 1;
      } else if (numbersCounter <= 0 && uppersCounter > 0 && lowersCounter <= 0) {
        typeChar = 2;
      } else if (numbersCounter <= 0 && uppersCounter <= 0 && lowersCounter > 0) {
        typeChar = 3;
      } else if (numbersCounter > 0 && uppersCounter > 0 && lowersCounter <= 0) {
        typeChar = (int) Math.ceil(Math.random() * 2);
      } else if (numbersCounter > 0 && uppersCounter <= 0 && lowersCounter > 0) {
        typeChar = (int) Math.ceil(Math.random() * 2);
        if (typeChar == 2) {
          typeChar = 3;
        }
      } else if (numbersCounter <= 0 && uppersCounter > 0 && lowersCounter > 0) {
        typeChar = (int) Math.ceil(Math.random() * 2);
        if (typeChar == 1) {
          typeChar = 3;
        }
      } else {
        typeChar = (int) Math.ceil(Math.random() * 3);
      }
      if (typeChar == 1) {
        numbersCounter--;
        lowerBound = 48;
        upperBound = 57;
      }
      if (typeChar == 2) {
        uppersCounter--;
        lowerBound = 65;
        upperBound = 90;
      }
      if (typeChar == 3) {
        lowersCounter--;
        lowerBound = 97;
        upperBound = 122;
      }
      final int range = (upperBound - lowerBound) + 1;
      final int codeCharacter = (int) (Math.random() * range) + lowerBound;
      password += Character.toString(codeCharacter);
    }
    this.password = password;
  }

  public void validar(String password) {
    System.out.println("Validando el password: " + password);
    int errorsCounter = 0;
    int numbersCounter = 0;
    int uppersCounter = 0;
    int lowersCounter = 0;
    if (longitud < 8) {
      errorsCounter++;
      System.out.println("\tError: No cumple con la longitud mínima");
    }
    int i = 0;
    while (i < longitud) {
      int unicodeValue = password.codePointAt(i);
      if (unicodeValue >= 48 && unicodeValue <= 57) {
        numbersCounter++;
      }
      if (unicodeValue >= 65 && unicodeValue <= 90) {
        uppersCounter++;
      }
      if (unicodeValue >= 97 && unicodeValue <= 122) {
        lowersCounter++;
      }
      i++;
    }
    if (numbersCounter < 5) {
      errorsCounter++;
      System.out.println("\tError: No cumple con el mínimo de números");
    }
    if (uppersCounter < 2) {
      errorsCounter++;
      System.out.println("\tError: No cumple con el mínimo de mayúsculas");
    }
    if (lowersCounter < 1) {
      errorsCounter++;
      System.out.println("\tError: No cumple con el mínimo de minúsculas");
    }
    if (errorsCounter > 0) {
      System.out.println("\tSe encontraron " + errorsCounter + " errores\n\tPassword no válido");
    } else {
      System.out.println("\tPassword válido");
    }
  }
}
