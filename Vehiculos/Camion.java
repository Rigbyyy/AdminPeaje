/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author ASUS
 */
public class Camion extends Vehiculo {
    private int NumeroEjes;
    
     public Camion( String  matricula,String marca,String modelo,int  año) {
        super(matricula,marca,modelo,año);
    }

    @Override
    public double calcularTarifa() {
       return NumeroEjes*300;
    }
}
    
    
    
    

