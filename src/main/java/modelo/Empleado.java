/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author rosam
 */
public class Empleado {
    //atributos
    protected String nombre;
    protected double salarioBase;
    
    public Empleado(String nombre, double salarioBase){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    
    //metodo sera polimorfico
    
    public double CalcularPago(){
        return salarioBase;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
