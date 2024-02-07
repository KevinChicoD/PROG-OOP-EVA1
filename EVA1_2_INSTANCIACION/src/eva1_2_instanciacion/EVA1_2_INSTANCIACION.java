/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_2_instanciacion;

/**
 *
 * @author invitado
 */
public class EVA1_2_INSTANCIACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int valor = 100;
        
        //INSTANCIACION: Crear el objeto --> darle memoria
        // CLASE IDENTIFICADOR = new constructor();
        //constructor --> metodo con el mismo nombre de la clase
        
        persona perso1 = new persona();//
        System.out.println(perso1);
        
        //perso 1 --> referencia -- direccion de memoria      
        
        Vehiculo Laperrona = new Vehiculo();
        Laperrona.marca = "Ford";
        Laperrona.año = 1960;
        Laperrona.modelo = "mustang";
        System.out.println("marca: " + Laperrona.marca);
        System.out.println("modelo: " + Laperrona.modelo);
        System.out.println("año: " + Laperrona.año);
    }
    
}

//tipo de dato abstracto
class persona{                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
    
}

class Vehiculo{
    //atributos
    String marca;
    int año;
    String modelo;
    
}