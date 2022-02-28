package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcion, suma;
        int [] notas = new int[5];
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("MENÚ DE OPCIONES: ");
            System.out.println("-----------------------");
            System.out.println("1.- (Re)Cargar.");
            System.out.println("2.- Mostrar");
            System.out.println("3.- Sumar.");
            System.out.println("4.- Promedio");
            System.out.println("5.- Máximo y mínimo");
            System.out.println("0.- Salir.");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("Dame tus notas");
                    for (int i = 0; i < notas.length; i++) {
                        System.out.print("Nota " + (i + 1) + " : ");
                        notas[i] = entrada.nextInt();
                    }
                    break;

                case 2:
                    System.out.println("Tus notas son: ");
                    for (int i = 0; i < notas.length; i++) {
                        System.out.print("Nota " + (i + 1) + ": " + notas[i] + " ");
                    }
                    break;

                case 3:
                    System.out.print("La suma de tus notas es: ");
                    suma = 0;
                    for (int i = 0; i < notas.length; i++) {
                        suma += notas[i];
                    }
                    System.out.print(suma);
                    break;

                case 4:
                    System.out.print("La media de tus notas es: ");
                    suma = 0;
                    for (int i = 0; i < notas.length; i++) {
                        suma += notas[i];
                    }
                    System.out.print(suma / notas.length);
                    break;

                case 5:
                    System.out.println("En proceso xd");
                    break;

                case 0:
                    System.out.println("Ta luego");
                    break;

                default:
                    System.out.println("Error: esa opción no es valida");
                    break;

            }
            System.out.println();

        } while (opcion != 0);
    }
}
