/**
 * 
 */
package com.cip.pro.tema_7.actividad_11;



/**
 * @author Esteban
 *
 */
public class Estudiante extends Persona {

	/**
	 * @param args
	 */
	private String codigo;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
	}
	//Constructor predeterminado
	public Estudiante() {
		
		super();
		this.codigo = "";
	}
	//Constructor con parametros
	public Estudiante(String nombre, String direccion, String codigo){
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.codigo = codigo;
	}
	//Métodos getter and setter
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	//Método toString
	@Override
	public String toString() {
		return "Estudiante [codigo=" + codigo + "]";
	}
	
	
}
