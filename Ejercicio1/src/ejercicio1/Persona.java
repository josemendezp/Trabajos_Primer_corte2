/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author jmendez
 */
public class Persona extends Docente{
    
    String Nombre,Apellido;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    public String Nombre_Completo()
    {   
        String Nombre_Completo;
        Nombre_Completo = "Nombre: " + getNombre() +" " +  " Apellido: " + getApellido() + " "  + informacion();
        return Nombre_Completo;
    }   
    //modulo documental documentos
}
