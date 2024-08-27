/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author ASUS
 */
public abstract class Vehiculo {
 protected String  matricula;
 protected String marca;
 protected String modelo;
protected int  año;

    public Vehiculo(String matricula, String marca, String modelo, int año) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public Vehiculo() {
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }




public abstract double calcularTarifa();
    

    
}
