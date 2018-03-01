/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author jmendez
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner Dato = new Scanner(System.in);
        
        System.out.println("Porfavor ingrese un nombre");
        String Nombre = Dato.next();
        System.out.println("Porfavor ingrese un Apellido");
        String Apellido = Dato.next();
        System.out.println("Porfavor ingrese un Codigo");
        String Codigo = Dato.next();
        
        Persona Obj1 = new Persona();
        
        Obj1.setNombre(Nombre);
        Obj1.setApellido(Apellido);
        Obj1.setCodigo(Codigo);
        
        System.out.println(Obj1.Nombre_Completo());
    }
}
