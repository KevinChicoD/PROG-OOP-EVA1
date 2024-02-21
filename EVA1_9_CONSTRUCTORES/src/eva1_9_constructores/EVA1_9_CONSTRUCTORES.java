/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_9_constructores;

/**
 *
 * @author Invitado
 */
public class EVA1_9_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancaria cuenta = new CuentaBancaria();
        System.out.println("Cliente: " + cuenta.getCliente());
        System.out.println("Cuenta: " + cuenta.getNoCuenta());
        System.out.println("Saldo: " + cuenta.getSaldo()) ;
    }
    
}
