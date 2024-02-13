/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_4_clase;

/**
 *
 * @author invitado
 */
public class EVA1_4_CLASE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Persona perso1 = new Persona();
        perso1.setNombre("Kevin");
        perso1.setNombre("Chico Diaz");
        perso1.setEdad(18);
        
        System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellidos());
        System.out.println(perso1.getEdad());
    }
    
}

class Persona{
    
    private String nombre;
    private String apellidos;
    private int edad;
    
    public String getNombre(){
    return nombre;
}

    public void setNombre(String valor){
    nombre = valor;
}
    public String getApellidos(){
    return apellidos;
    }
    
    public void setApellidos (String valor){
    apellidos = valor;
    }
    
    
    public int getEdad(){
    return edad;
    }
    
    public void setEdad (int valor){
    edad = valor;
    }
}

