/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caixa.blanca;

/**
 *
 * @author MarcRoma & BilalBoulouban
 */
public class vehicles {

    static String[][] vehiclesALL = { // TOTS ELS VEHICLES
        /*{MATRÍCULA, ANY MATRICULACIÓ, TIPUS CARBURANT}*/
        {"1234BCD", "2004", "GASOLINA"},
        {"5678ABC", "2000", "GASOIL"},
        {"9012GFH", "2017", "GASOIL"},
        {"1035YUI", "1998", "GASOLINA"},
        {"2987POP", "2020", "GASOLINA"}
    };

    static String[][] vehiclesRetirats = null;

    static void LlistarTots() { // LLISTAR TOTS ELS VEHÍCLES

        System.out.println("LLISTAR TOTS ELS VEHICLES:");
        System.out.println("---------");

        for (int i = 0; i < vehiclesALL.length; i++) {
            System.out.println("VEHICLE N. " + i + " :");

            for (int j = 0; j < vehiclesALL[i].length; j++) {
                System.out.println(vehiclesALL[i][j]);
            }
            System.out.println("---------");
            System.out.println(" ");
        }
    }

    static void Comprovar() {
        boolean marcador = false;
        int comptador = 0;
        int anyVehicle;

        for (int i = 0; i < vehiclesALL.length; i++) {
            // CONVERTIR EL VALOR DE LA POSICIÓ ON HI HA ELS ANYS
            // DE MATRICULACIÓ DE STRING A INT PER POGUER SER 
            // COMPARATS.
            anyVehicle = Integer.parseInt(vehiclesALL[i][1]);

            if (anyVehicle < 2010) {
                marcador = true;
                comptador = comptador + 1;
            }
        }

        for (int i = 0; i < vehiclesALL.length; i++) {
            if (marcador == true && vehiclesALL[i][2] == "GASOIL") {

                // AFEGIR VEHICLE A ARRAY VEHICLES RETIRATS
            }
        }
    }

    static void LlistarRetirats() { // LLISTAR NOMÉS ELS VEHICLES RETIRATS
        System.out.println("LLISTAR ELS VEHICLES RETIRATS:");
        System.out.println("---------");

        for (int i = 0; i < vehiclesRetirats.length; i++) {
            System.out.println("VEHICLE N. " + i + " :");

            for (int j = 0; j < vehiclesRetirats[i].length; j++) {
                System.out.println(vehiclesRetirats[i][j]);
            }
            System.out.println("---------");
            System.out.println(" ");
        }

    }

}
