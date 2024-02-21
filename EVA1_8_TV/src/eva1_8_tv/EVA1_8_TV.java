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
public class EVA1_8_TV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
                            //CONTRUCTOR
        Television tv = new Television();
        tv.imprimirconfiguracion();
        tv.BajarCanal();
        tv.BajarVolumen();
        tv.Power();
        tv.imprimirconfiguracion();

    }
    
}
