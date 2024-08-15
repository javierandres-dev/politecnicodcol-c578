public class App {
    public static void main(String[] args) throws Exception {
        ejercicio1(4);
        ejercicio1(8);
        ejercicio1(10);

        ejercicio2(3);
        ejercicio2(9);
        ejercicio2(10);

        ejercicio3(4);
        ejercicio3(5);
        ejercicio3(6);
        ejercicio3(7);
        ejercicio3(27);
        ejercicio3(28);
        ejercicio3(496);
        ejercicio3(500);

        ejercicio4(2);
        ejercicio4(3);
        ejercicio4(5);
    }

    private static void ejercicio1(int num) {
        long factorial = 1;
        for (long i = num; i > 0; i--)
            factorial *= i;
        System.out.println("Factorial de " + num + " = " + factorial);
    }

    private static void ejercicio2(int num) {
        for (int i = 1; i <= num; i++)
            if (num % i == 0)
                System.out.println(i + " es divisor de " + num);
    }

    private static void ejercicio3(int num) {
        if (num > 0) {
            int sum = 0;
            for (int i = 1; i < num; i++)
                if (num % i == 0)
                    sum += i;
            if (sum == num)
                System.out.println(num + " es un número perfecto");
            else
                System.out.println(num + " no es un número perfecto");
        } else {
            System.out.println("Ingrese un número entero positivo");
        }
    }

    private static void ejercicio4(int num) {
        System.out.println("** num: " + num);
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println("Suma = " + sum);
        System.out.println("Raíz cuadrada de " + sum + " = " + Math.sqrt(sum));
        int rand = (int) (Math.random() * sum) + 1;
        System.out.println("Número aleatorio entre 1 y " + sum + " = " + rand);
        ejercicio2(sum);
        ejercicio1(sum);
        ejercicio3(sum);
    }
}
