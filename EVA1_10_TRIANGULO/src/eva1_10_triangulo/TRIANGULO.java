/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_10_triangulo;

/**
 *
 * @author invitado
 */
public class TRIANGULO {
    private double base;
    private double altura;
    private double hipo;
    
    public TRIANGULO(){
        base = 5;
        altura = 14;
    }
    
    public void setbase(double valor){
    base = valor;
}
    public double getbase(){
    return base;
    }
    
     public void setaltura(double valor){
    altura = valor;
}
    public double getaltura(){
    return altura;
    }
    
    private double CalcularArea(){
        return (base*altura)/2;
    }
    private double CalcularPerimetro(){
        //hipo = Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
        hipo = Math.sqrt((base * base) + (altura * altura));
        return hipo;
    }
    
    public void imprimirdatos(){
        System.out.println("Base del triangulo: " + getbase());
        System.out.println("Altura del triangulo: " + getaltura());
        System.out.println("El area del triangulo es: " + CalcularArea());
        System.out.println("El perimetro del triangulo es: " + CalcularPerimetro());
    }
}
