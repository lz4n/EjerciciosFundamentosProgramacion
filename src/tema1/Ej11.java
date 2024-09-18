package tema1;

import java.util.Scanner;

/**
 * 11.	Hacer un programa que escriba el área de un triángulo (a partir de su base y altura) y de un circulo (a partir del radio), para ello pedirá que se introduzcan por teclado los valores de correspondientes a cada figura.
 */
public class Ej11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la base y la aultura de un triángulo (separados por espacios): ");
        System.out.printf("Área del triángulo: %f\n", (scanner.nextDouble() *scanner.nextDouble()) /2);

        System.out.print("Introduce el radio de un círculo: ");
        System.out.printf("Área del círculo: %f\n", Math.TAU *Math.pow(scanner.nextDouble(), 2));
    }
}
