/**
 * 
 */
package com.cip.pro.tema_7.actividad_12;

/**
 * @author Esteban
 *
 */
public abstract  class BeneficiadosMain extends Persona{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Persona a = new Alumno();
		Persona b = new Profesor();		
		System.out.println("Descuento aplicado a 44 eur para alumno "+a.calculaDescuento(44));
		System.out.println("Descuento aplicado a 44 eur para profesor "+b.calculaDescuento(44));
	}

}
