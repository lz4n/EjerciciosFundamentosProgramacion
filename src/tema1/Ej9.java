package tema1;

import java.util.Scanner;

/**
 * 9. Escribe un programa en java que calcule el cambio de euros a dólares.
 */
public class Ej9 {
    private static final float EUR_USD = 1.10f;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor en euros (€): ");

        float eurValue = scanner.nextFloat();
        System.out.printf("%.02f€ = %.02f$", eurValue, eurValue *EUR_USD);
    }
}
