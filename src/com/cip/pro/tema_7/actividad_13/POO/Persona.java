/**
 * 
 */
package com.cip.pro.tema_7.actividad_13.POO;

/**
 * @author Esteban
 *
 */
public class Persona {

	/**
	 * @param args
	 */
	private String nombre;
	private int edad;
	private char sexo;
	private float peso;
	private float altura;	
	
	public int calcularIMC() {
		float IMC;
		IMC=peso/(altura*altura);
		if (IMC<20) {
			return -1;
		}
		else if (IMC>=20 && IMC<=25) {
			return 1;
		}
		else {
			return 0;
		}
		}
	public boolean esMayorDeEdad() {
		if(edad>=18) {
			return true;
		}else {
			return false;
		}		
	}
	public boolean comprobarSexo(char sexo) {
		if(sexo == 'H') {
			return false;
		}else{
			return true;
		}
	}
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
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	/**
	 * @return the peso
	 */
	public float getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}
	/**
	 * @return the altura
	 */
	public float getAltura() {
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
}
