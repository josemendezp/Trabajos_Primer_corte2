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
public class Vehiculo extends Carro {
    String Color,Placa;
    int Num_LLantas;

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public int getNum_LLantas() {
        return Num_LLantas;
    }

    public void setNum_LLantas(int Num_LLantas) {
        this.Num_LLantas = Num_LLantas;
    }
    
    public String Info()
    {
        String Info; 
        Info =  "Color: " + getColor() + " "  + "Placa: " + getPlaca() + " " + "Num llantas: "  + getNum_LLantas() + Info2();
        return Info;
    }
}
