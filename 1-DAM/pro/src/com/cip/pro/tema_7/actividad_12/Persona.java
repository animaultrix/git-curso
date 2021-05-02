/**
 * 
 */
package com.cip.pro.tema_7.actividad_12;

/**
 * @author Esteban
 *
 */
public abstract class Persona{
	//parametros
	private String nombre;
	private int anyoNacimiento;
	//constructor predeterminado
	public Persona() {
		this("",0);
	}
	//constructor con parametros
	public Persona(String nombre, int anyoNacimiento) {
		this.nombre = nombre;
		this.anyoNacimiento = anyoNacimiento;
	}
	//métodos setters and getters
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the anyoNacimiento
	 */
	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}
	/**
	 * @param anyoNacimiento the anyoNacimiento to set
	 */
	public void setAnyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}
	//método toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", anyoNacimiento=" + anyoNacimiento + "]";
	}
	//método calculaDescuento
	public abstract double calculaDescuento(double precio);
}
