/**
 * 
 */
package com.cip.pro.tema_7.actividad_11;

/**
 * @author Esteban
 *
 */
public class Persona {

	/**
	 * @param args
	 */
	protected String nombre;
	protected  String direccion;
	protected  int edad;
	
	//Constructor predeterminado
	public Persona() {
		
		this("",""/*, 0*/);
	}
	//Constructor con parametros
	public Persona(String nombre, String direccion/*, int edad*/) {
		
		this.nombre = nombre;
		this.direccion = direccion;
	}
	//Métodos getter and setter
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
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public  void setEdad(int edad) {
		this.edad = edad;
	}
	//Método mayor de edad
	public boolean mayorEdad() {
		
		boolean mayorEdad;
		int edad = getEdad();
		
		if(edad >= 18) {
			mayorEdad = true;
		}
		else {
			mayorEdad = false;
		}
		return mayorEdad;
	}
	//Método toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + "]";
	}
	

}
