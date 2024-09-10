package Tema1;

import java.util.Scanner;

/**
 * 12.	Hacer un programa que lea por teclado un número de 2 cifras y escriba el número inverso (el que resulta de colocar las cifras en orden contrario). Si se lee el 45 se escribirá el 54
 */
public class Ej12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("");

        System.out.print("Introduce un número de dos cifras: ");
        int digit1 = scanner.nextInt(), digit2 = scanner.nextInt();

        System.out.printf("El número inverso es: %d%d", digit2, digit1);
    }
}
