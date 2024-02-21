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
public class CuentaBancaria {
    private int NoCuenta;
    private double saldo;
    private String cliente; 
    
    //Constructor default (sin argumentos)
    public CuentaBancaria(){
        NoCuenta = 0;
        saldo = 10000;
        cliente = "Sin cliente"; 
    }
    
    //get y set 
    public int getNoCuenta(){
        return NoCuenta;
    }
    
    public void setNocuenta(int cuenta){
        NoCuenta = cuenta;
    }
    
     public String getCliente(){
        return cliente;
    }
    
    public void setCliente(String NomCliente){
        cliente = NomCliente;
    }
    
    public void retirar(double monto){
        if(saldo >= monto)//hay que tener dinero
            saldo = saldo - monto;
    }
    
    public void depositar(double deposito){
        saldo = saldo + deposito;
    }
    
     public double getSaldo(){
        return saldo;
    }
}
