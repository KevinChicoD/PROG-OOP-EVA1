 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_metodos;

/**
 *
 * @author invitado
 */
public class Persona {
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
    
    //reglas para el nombre de los metodos en java
    //iniciar el nombre de los metodos en un verbo en minuscular
    public String generarnombrecompleto(){
        return nombre + " " + apellidos;
    }
    
    //calcular año de nacimiento
    public int calcularannionacimiento (){
        return 2024 - edad;
    }
}

