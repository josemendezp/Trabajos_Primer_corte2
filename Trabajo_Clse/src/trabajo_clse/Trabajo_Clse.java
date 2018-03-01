/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_clse;

import java.util.Scanner;

/**
 *
 * @author jmendez
 */
public class Trabajo_Clse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner Obj = new Scanner(System.in);
        System.out.println("Digite el primer número para realizar las operaciones");
        int num1 = Obj.nextInt();
        
        System.out.println("Digite el segundo número para realizar las operaciones");
        int num2 = Obj.nextInt();
        
        Trabajo_Clse.Sumar(num1,num2);
        Trabajo_Clse.Restar(num1,num2);
        Trabajo_Clse.Multiplicacion(num1,num2);
        
        System.out.println("EL resultado de la División es: " + Trabajo_Clse.Division(num1,num2) + "\n");
    }
    
    public static void Sumar(int num1, int num2)
    {
        int Result = num1 + num2;   
        System.out.println("EL resultado de la suma es: " + Result + "\n");
    }
    
    public static void Restar(int num1, int num2)
    {
        int Result = num1 - num2;
        System.out.println("EL resultado de la Resta es: " + Result + "\n");
    }
    
    public static void Multiplicacion(int num1, int num2)
    {
        int Result = num1 * num2;
        System.out.println("EL resultado de la Multiplicación es: " + Result + "\n");
    }
    
    public static double Division(int num1, int num2)
    {
        double Result = num1/num2;
        return Result;
    }
}
