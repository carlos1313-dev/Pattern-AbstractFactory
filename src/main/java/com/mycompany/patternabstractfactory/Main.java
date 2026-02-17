/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patternabstractfactory;

/**
 *
 * @author sangr
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        IMenuFactory factory = null;

        // Elección del tipo de menú
        System.out.println("Seleccione el tipo de menú:");
        System.out.println("1. Gourmet");
        System.out.println("2. Saludable");
        System.out.println("3. Vegetariano");

        int opcionMenu = scanner.nextInt();

        switch (opcionMenu) {
            case 1:
                factory = new MenuGourmetFactory();
                break;
            case 2:
                factory = new MenuSaludableFactory();
                break;
            case 3:
                factory = new MenuVegetarianoFactory();
                break;
            default:
                System.out.println("Opción inválida");
                scanner.close();
                return;
        }

        // Menú de consumo
        int opcion;
        do {
            System.out.println("\n¿Qué desea consumir?");
            System.out.println("1. Entrada");
            System.out.println("2. Plato principal");
            System.out.println("3. Bebida");
            System.out.println("4. Postre");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(factory.crearEntrada().getDescripcion());
                    break;
                case 2:
                    System.out.println(factory.crearPlatoPrincipal().getDescripcion());
                    break;
                case 3:
                    System.out.println(factory.crearBebida().getDescripcion());
                    break;
                case 4:
                    System.out.println(factory.crearPostre().getDescripcion());
                    break;
                case 0:
                    System.out.println("Gracias por su visita.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
