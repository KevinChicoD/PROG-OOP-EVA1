/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_tv;

/**
 *
 * @author invitado
 */
public class Television {
//ATRIBUTOS
    int volumen;
    int canal;
    boolean estaencendido;
    
    //CONSTRUCTORES:
    //CONSTRUCTOR SIN ARGUMENTOS: CONSTRUCTOR DEFAULT
    //Metodo para iniciar los objetos
    public Television(){
        //No es obligatorio
        volumen = 30;
        canal = 5;
        estaencendido = false;
    }
    
    public void SubirVolumen(){
        if (estaencendido && volumen < 100) {
            volumen = volumen + 1;

        }
        //volumen++
        //volumen+=1
    }
    
    public void BajarVolumen(){
        if (estaencendido && volumen > 0) {
            volumen = volumen - 1;   
        }
    }
    
     public void SubirCanal(){
         if (estaencendido) {
             canal = canal + 1;   
         }
    }
     
    public void BajarCanal(){
        if (estaencendido && canal > 0){
        canal = canal - 1;   
        }
    }
    
    public void CambiarCanal(int NoCanal){
        if (estaencendido && !(NoCanal < 0)){
             canal = NoCanal;
        }
    }
    
    public void Power(){
        
        /*if(estaencendido == true)
             estaencendido = false;
        
        else
            estaencendido = true*/
        
        estaencendido = !estaencendido;
    }
    
    public void imprimirconfiguracion(){
        System.out.println("Volumen: " + volumen);
        System.out.println("Canal: " + canal);
        System.out.println("Power: " + estaencendido);
    }
}
