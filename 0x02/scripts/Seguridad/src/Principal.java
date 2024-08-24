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
public class Principal {
    public static void main(String[] args) throws Exception {
        Password newPassword1 = new Password();
        newPassword1.generar();
        String password1 = newPassword1.getPassword();
        System.out.println("password 1: " + password1);
        newPassword1.validar(password1);

        Password newPassword2 = new Password(8);
        newPassword2.generar();
        String password2 = newPassword2.getPassword();
        System.out.println("password 2: " + password2);
        newPassword2.validar(password2);

        Password newPassword3 = new Password(11);
        newPassword3.generar();
        String password3 = newPassword3.getPassword();
        System.out.println("password 3: " + password3);
        newPassword3.validar(password3);

        Password newPassword4 = new Password(7);
        newPassword4.generar();
        String password4 = newPassword4.getPassword();
        System.out.println("password 4: " + password4);
        newPassword4.validar(password4);
    }
}
