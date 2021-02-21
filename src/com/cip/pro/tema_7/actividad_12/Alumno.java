/**
 * 
 */
package com.cip.pro.tema_7.actividad_12;

/**
 * @author Esteban
 *
 */
public class Alumno extends Persona{
	//parametros
	private String curso;
	//constructor predeterminado
	public Alumno() {
		this("",0,"");				
	}
	//constructor con parametros
	public Alumno(String nombre, int anyoNacimiento,String curso) {
		super(nombre, anyoNacimiento);
		this.curso = curso;
	}
	//métodos getters and setters
	/**
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}
	/**
	 * @param curso the curso to set
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}
	//método toString
	@Override
	public String toString() {
		return "Alumno [curso=" + curso + "]";
	}
	@Override
	public double calculaDescuento(double precio) {
		
		return 0.9*precio;
	}
	
}
