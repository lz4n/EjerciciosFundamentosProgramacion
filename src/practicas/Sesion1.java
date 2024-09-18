import java.util.Scanner;

public class Sesion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        apartado2(scanner);
        apartado3(scanner);
        apartado4(scanner);
    }

    private static void apartado4(Scanner scanner) {
        System.out.print("Introduzca el primer número: ");
        int number1 = scanner.nextInt();
        System.out.print("Introduzca el segundo número: ");
        int number2 = scanner.nextInt();

        System.out.printf("El número %d es %s o igual que %d.\n", number1, number1 >= number2?"mayor":"menor", number2);
        System.out.printf("El número %d %s es divisible entre %d.\n", number1, number2 % number1 == 0?"":"no", number2);
    }

    private static void apartado3(Scanner scanner) {
        System.out.print("Introduzca un número comprendido entre 0 y 1000: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.printf("El número %d es menor que 0.\n", number);
        } else if (number > 1000) {
            System.out.printf("El número %d es mayor que 1000.\n", number);
        } else {
            System.out.printf("El número %d es correcto.\n", number);
        }
    }

    private static void apartado2(Scanner scanner) {
        System.out.print("1. Comprobar si un número es primo.\n" +
                "2. Escribir los n primeros números primos.\n" +
                "3. Escribir números primos gemelos entre dos valores.\n" +
                "4. Número par como suma de dos primos.\n" +
                "0. Finalizar la ejecución.\n" +
                "Introduzca la opción deseada: ");

        int option = scanner.nextInt();
        if (option >= 0 && option <= 4) {
            System.out.printf("Ha elegido la opción: %d.\n", option);
        } else {
            System.out.println("Opción incorrecta");
        }
    }
}