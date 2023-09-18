/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melian
 */
public class Empleado {
    String nombre;
    double horas, valorHora,salario;
    
    public Empleado (String nombre, double horas, double valor){
        this.nombre = nombre;
        this.horas = horas;
        valorHora = valor;
    }
    
    public double calcularSalario(){
        return (valorHora * horas);
    }
}
