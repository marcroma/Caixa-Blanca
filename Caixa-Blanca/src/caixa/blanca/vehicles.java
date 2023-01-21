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
        {"1234BCD", "2004", "DIESEL"},
        {"5678ABC", "2001", "GASOLINA"},
        {"9012GFH", "2017", "DIESEL"},
        {"1035YUI", "1998", "GASOLINA"},
        {"2987POP", "2020", "GASOLINA"}
    };

    static String[][] vehiclesRetirats;

    public static void LlistarTots() { // LLISTAR TOTS ELS VEHÍCLES

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

    public static void Comprovar() {
        int comptador = 0;

        // CONTAR EL NOMBRE DE VEHICLES QUE S'ON ABANS DEL 2010 I SON DIESEL
        for (int i = 0; i < vehiclesALL.length; i++) {
            int anyVehicle = Integer.parseInt(vehiclesALL[i][1]);
            if (anyVehicle < 2010 && vehiclesALL[i][2].equals("DIESEL")) {
                comptador++;
                System.out.println(comptador);
            }
        }
        // INICIALITZAR vehiclesRetirats AMB LA LLARGADA NECESSARIA EPR EMMAGATZEMAR-HI ELS VEHICLES TROBATS
        vehiclesRetirats = new String[comptador][3];
        comptador = 0;

        // AFEGIR ELS VEHICLES ESMENTATS ANTERIORMENT A L'ARRAY vehiclesRetirats
        for (int i = 0; i < vehiclesALL.length; i++) {
            int anyVehicle = Integer.parseInt(vehiclesALL[i][1]);
            if (anyVehicle < 2010 && vehiclesALL[i][2].equals("DIESEL")) {
                for (int j = 0; j < 3; j++) {
                    vehiclesRetirats[comptador][j] = vehiclesALL[i][j];
                }
                comptador++;
                
            }
        }
        comptador = 0;
        
    }

    public static void LlistarRetirats() { // LLISTAR NOMÉS ELS VEHICLES RETIRATS
        if (vehiclesRetirats == null) {
            System.out.println("Encara no hi ha cap vehicle retirat a la llista.");
        } else {
            System.out.println("LLISTAR ELS VEHICLES RETIRATS:");
            System.out.println("---------");
            for (int i = 0; i < vehiclesRetirats.length; i++) {
                for (int j = 0; j < vehiclesRetirats[i].length; j++) {
                    System.out.print(vehiclesRetirats[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}
