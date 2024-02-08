/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_3_modificadores_acceso;

import otro_paquete.otra_clase;

/**
 *
 * @author invitado
 */
public class EVA1_3_MODIFICADORES_ACCESO {
    public int x;
    protected int y;
    private int z;
    int w;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PruebaA obj = new PruebaA();
        //obj. --> puedo ver a x (public)
        //puedo ver a y (protected)
        //puedo ver a w (default)
        otra_clase obj2 = new otra_clase();
        //obj2.x -->
        //Esta clase no es visible para el paquete
        //PruebaB obj3 = new PruebB();
        
    }
    
}
//Clase con acceso default
class PruebaA {
    public int x;
    protected int y;
    private int z;
    int w;
    
    
}