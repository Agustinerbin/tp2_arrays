

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Seleccione el ejercicio que desea ejecutar");
            System.out.println("1.");
            System.out.println("2.mostrar el array por pantalla(for)");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5.");
            System.out.println("6.");
            System.out.println("7.");
            System.out.println("8.");
            System.out.println("9.");
            System.out.println("10.");
            System.out.println("11.");
            System.out.println("12.");
            System.out.println("13.");
            System.out.println("14.");
            System.out.println("0. Salir");
            System.out.println("0pción: ");
            option = scanner.nextInt();

            switch (option) {
//                case 1:
//                    ejercicio1();
//                    break;
                case 2:
                    ejercicio2();
                    break;
//              case 3:
//                  ejercicio3;
//                    break;
//                case 4:
//                    ejercicio4();
//                    break;
//                case 5:
//                    ejercicio5();
//                    break;
                case 6:
                    ejercicio6();
                    break;
//                case 7:
//                    ejercicio7();
//                    break;
//                case 8:
//                    ejercicio8();
//                    break;
//                case 9:
//                    ejercicio9();
//                    break;
                case 10:
                    ejercicio10(scanner);
                    break;
//                case 11:
//                    ejercicio11();
//                    break;
//                case 12:
//                    ejercicio12();
//                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");

            }
            System.out.println();
        } while (option != 0);

        scanner.close();
    }

    public static void ejercicio2() {
        int array[] = {1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void ejercicio6() {
        int array[] = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] =(int) (Math.random() * 1000);
            System.out.println(array[i]);
        }
    }
    private static final char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public static void ejercicio10(Scanner scanner) {
        System.out.println("Ingrese el numero del dni: ");
       int numero_dni = scanner.nextInt();

       if (numero_dni < 0) {
           System.out.println("El numero del dni no puede ser negativo.");
           return;
       }

       if (numero_dni > 99999999) {
           System.out.println("Número de DNI inválido. Debe tener como máximo 8 dígitos.");
           return;
       }

       char letra = optenerLetra(numero_dni);
       System.out.println("El DNI completo es: "+ numero_dni + letra);

    }
    public static char optenerLetra(int numero_dni) {
        int resto = numero_dni % 23;

        return letras[resto];

    }
}