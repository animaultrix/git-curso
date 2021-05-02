/**
 * 
 */
package com.cip.pro.tema_7.actividad_12;

/**
 * @author Esteban
 *
 */
public class Profesor extends Persona {
	//parametros
	private double salario;
	//constructor predeterminado
	public Profesor() {
		this("",0,0.00);
	}
	//constructor con parametros
	public Profesor(String nombre, int anyoNacimiento, double salario) {
		super(nombre,anyoNacimiento);
		this.salario = salario;
	}
	//métodos getters and setters
	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	//método toString
	@Override
	public String toString() {
		return "Profesor [salario=" + salario + "]";
	}
	@Override
	public double calculaDescuento(double precio) {
		
		return 0.98*precio;
	}
	
}
