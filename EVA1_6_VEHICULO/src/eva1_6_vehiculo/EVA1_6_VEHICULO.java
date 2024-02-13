/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_6_vehiculo;

import eva1_6_vehiculo.NewClass;

/**
 *
 * @author invitado
 */
public class EVA1_6_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewClass micarro = new NewClass();
        micarro.setcolor("blanco");
        micarro.setannio(2000);
        micarro.setmarca("Ford");
        micarro.setprecio(15000.54);
        micarro.setmodelo("Camaro");
        
        System.out.println("color " + micarro.getcolor());
        System.out.println("año " + micarro.getAnnio());
        System.out.println("marca " + micarro.getmarca());
        System.out.println("precio " + micarro.getprecio());
        System.out.println("color " + micarro.getcolor());
    }
}
