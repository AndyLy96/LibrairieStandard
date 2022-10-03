package org.example;

import java.util.Scanner;

public class EntrezUnNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre");
        while (scanner.hasNext() && !scanner.hasNextInt())
        {
            System.out.println("Nombre pls");
            scanner.next();
        }

        int nb = scanner.nextInt();
        System.out.println("votre nombre est " + nb);
    }
}
