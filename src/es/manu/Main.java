package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcion, suma, maxima, minima;
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
                        System.out.println("Nota " + (i + 1) + ": " + notas[i] + " ");
                    }
                    break;

                case 3:
                    System.out.print("La suma de tus notas es: ");
                    suma = 0;

                    for (int i = 0; i < notas.length; i++) {
                        suma += notas[i];
                    }
                    System.out.println(suma);
                    break;

                case 4:
                    System.out.print("La media de tus notas es: ");
                    suma = 0;

                    for (int i = 0; i < notas.length; i++) {
                        suma += notas[i];
                    }
                    System.out.println(suma / notas.length);
                    break;

                case 5:
                    maxima = minima = notas[0];

                    for (int i = 0; i < notas.length; i++) {

                        if(notas[i]>maxima){

                            maxima=notas[i];

                        }

                        if(
                                notas[i]<minima){

                            minima=notas[i];

                        }
                    }
                    System.out.println("Tu nota máxima es " + maxima + " y tu nota mínima es " + minima);
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
