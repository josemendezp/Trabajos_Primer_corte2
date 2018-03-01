/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author jmendez
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner Obj1 = new Scanner(System.in);
        
        System.out.println("Ingrese el color del vehiculo");
        String Color = Obj1.nextLine();
        System.out.println("Ingrese la Placa del vehiculo");
        String Placa = Obj1.nextLine();
        System.out.println("Ingrese el modelo");
        String Modelo = Obj1.nextLine();
        System.out.println("Ingrese el numero de llantas");
        int Llantas = Obj1.nextInt();
        
        Vehiculo Obj = new Vehiculo();
        
        Obj.setColor(Color);
        Obj.setPlaca(Placa);
        Obj.setModelo(Modelo);
        Obj.setNum_LLantas(Llantas);
        
        System.out.println(Obj.Info());        
    } 
}
