/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_11_formulageneral;

/**
 *
 * @author invitado
 */
public class FormulaG {
    private double a;
    private double b;
    private double c;
    private double oper;
    
    public FormulaG(){
        a = 1;
        b = -4;
        c = 3;
    }
    
    public void setA(double valor){
    a = valor;
}
    public double getA(){
    return a;
    }
     public void setB(double valor){
    b = valor;
}
    public double getB(){
    return b;
    }
    
     public void setC(double valor){
    c = valor;
}
    public double getC(){
    return c;
    }
    
    private double CalcularMas(){
       oper = ((-1 * b) + ((Math.sqrt((Math.pow(b, 2)) - (4 * (a * c)))))) / 2;
        return oper;
    }
    
    private double CalcularMenos(){
        oper = ((-1 * b) - ((Math.sqrt((Math.pow(b, 2)) - (4 * (a * c)))))) / 2;
        return oper;
    }
    
    public void imprimirdatos(){
        System.out.println("El valor de 'A' es: " + getA());
        System.out.println("El valor de 'B' es: " + getB());
        System.out.println("El valor de 'C' es: " + getC());
        System.out.println("x1: " + CalcularMenos());
        System.out.println("x2: " + CalcularMas());
    }
}
