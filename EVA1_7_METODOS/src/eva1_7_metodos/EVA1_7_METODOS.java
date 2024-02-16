/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_metodos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_7_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 = new Persona();
        perso1.setNombre("Kevin");
        perso1.setApellidos("Chico");
        perso1.setEdad(18);
    
        System.out.println("El nombre es " + perso1.generarnombrecompleto());
        System.out.println("Nacio en el año " + perso1.calcularannionacimiento());
        
        //---------
        Persona[] grupo = new Persona[5];
        //Hay que crear cada objeto 
        for (int i = 0; i < grupo.length; i++) {
            Scanner input = new Scanner(System.in);
            grupo[i] = new Persona();
            //UNA VEZ CREADO EL OBJETO, HAY QUE 
            System.out.println("Introduce el nombre:");
            String nombre = input.nextLine();
            grupo[i].setNombre(nombre);
            
            System.out.println("Introduce el apellido:");
            String apellido = input.nextLine();
            grupo[i].setApellidos(apellido);
            
            System.out.println("Introduce a edad:");
            int edad = input.nextInt();
            grupo[i].setEdad(edad);
        }
        //leer
        for (int i = 0; i < grupo.length; i++) {
             System.out.println("El nombre es " + grupo[i].generarnombrecompleto());
             System.out.println("Nacio en el año " + grupo[i].calcularannionacimiento());
        }
    }
    
}
