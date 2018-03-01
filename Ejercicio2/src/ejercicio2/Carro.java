/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author jmendez
 */
public class Carro {
    
    String Modelo;

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    
    public String Info2()
    {
        String InfoTotal;
        InfoTotal = " " + "Modelo: " + getModelo();
        return InfoTotal;
    }
}
