/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caixa.blanca;

import java.util.Scanner;

/**
 *
 * @author MarcRoma & BilalBoulouban
 */
public class menu {

    static void Principal() {
        String op = "";
        boolean sortir = false;
        Scanner input = new Scanner (System.in);

        do { // LOOP START
            // MENU
            System.out.println("Benvingut al comprovador de cotxes contaminants de la DGT.");
            System.out.println("Per començar, seleccioni una de les següents opcions:");
	
            System.out.println("1. Comprovar i Verificar vehicles");
            System.out.println("2. Llistar TOTS els Vehicles");
            System.out.println("3. Llistar Vehicles RETIRATS");
            System.out.println("0. Finalitzar el programa"); 
            // READ USER INPUT
            op = input.nextLine();

            //SWITCH CASE
            switch (op) {
                case "1": // Comprovar i Verificar vehicles
                    vehicles.Comprovar();
                    break;

                case "2": // Llistar tots els vehicles
                    vehicles.LlistarTots();
                    break;

                case "3": // Llistar vehicles retirats
                    vehicles.LlistarRetirats();
                    break;

                case "0": // Finalitzar el programa
                    System.out.println("Sortint...");
                    sortir = true;
                    break;
            }
        } while (!sortir);
    }
    
}
