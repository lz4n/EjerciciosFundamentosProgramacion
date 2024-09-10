package Tema1;

import java.util.Scanner;

/**
 * 10.	Escribe un programa en java que lea dos números enteros de teclado y los muestre por pantalla,
 */
public class Ej10 {
    private static final int NUMBERS_AMOUNT = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= NUMBERS_AMOUNT; i++) {
            System.out.printf("Introduce un número entero (%d/%d): ", i, NUMBERS_AMOUNT);
            System.out.printf("Has introducido el número: %d\n", scanner.nextInt());
        }
    }
}
