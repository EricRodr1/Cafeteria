package com.mycompany.cafeteria;

import java.util.Scanner;

public class Cafeteria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int CafePequeno = 45;
        int CafeMediano = 56;
        int CafeGrande = 65;
        int leche = 5;
        int cremora = 8;
        int clientes = 0;
        int vendidosp = 0;
        int vendidosm = 0;
        int vendidosg = 0;
        double totaldeldia = 0;
        int eleccion;
        int edad;
        double totalapagar = 0;
        
        
        boolean cierrecaja = true;

        while (cierrecaja) {
            System.out.println("BIENVENIDO A CAFE EXPRESS UNI");
            System.out.println("MENU:");
            System.out.println("1. Cafe Pequeno");
            System.out.println("2. Cafe Mediano");
            System.out.println("3. Cafe Grande");
            System.out.println("4. Cerrar Caja");
            System.out.println("Seleccione una opcion:");
             eleccion = sc.nextInt();

            if (eleccion == 4) {
                cierrecaja = false;
                break;
            }

            System.out.println("Como quiere su cafe?");
            System.out.println("1. Leche");
            System.out.println("2. Cremora");
            System.out.println("3. Sencillo");
            int eleccion2 = sc.nextInt();

            System.out.println("Ingrese su edad:");
            edad = sc.nextInt();

            

            switch (eleccion) {
                case 1 -> {
                    totalapagar = CafePequeno;
                    if (eleccion2 == 1) {
                        totalapagar += leche;
                    } else if (eleccion2 == 2) {
                        totalapagar += cremora;
                    }
                    if (edad >= 65) {
                        totalapagar *= 0.8; 
                    }
                    vendidosp++;
                }

                case 2 -> {
                    totalapagar = CafeMediano;
                    if (eleccion2 == 1) {
                        totalapagar += leche;
                    } else if (eleccion2 == 2) {
                        totalapagar += cremora;
                    }
                    if (edad >= 65) {
                        totalapagar *= 0.8;
                    }
                    vendidosm++;
                }

                case 3 -> {
                    totalapagar = CafeGrande;
                    if (eleccion2 == 1) {
                        totalapagar += leche;
                    } else if (eleccion2 == 2) {
                        totalapagar += cremora;
                    }
                    if (edad >= 65) {
                        totalapagar *= 0.8;
                    }
                    vendidosg++;
                }

                default -> {
                    System.out.println("Opcion no valida");
                      
                }
            }

            System.out.println("Su total es: " + totalapagar);
            clientes++;
            totaldeldia += totalapagar;
        }

         
        System.out.println("Resumen Del Dia: ");
        System.out.println("Clientes  : " + clientes);
        System.out.println("Cafes vendidos:");
        System.out.println("  Pequenos: " + vendidosp);
        System.out.println("  Medianos: " + vendidosm);
        System.out.println("  Grandes: " + vendidosg);
        System.out.println("Total Ganado: " + totaldeldia);
    }
}
