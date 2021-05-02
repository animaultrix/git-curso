/**
 * 
 */
package com.cip.pro.tema_7.actividad_13.toString;

/**
 * @author Esteban
 *
 */
public class PersonaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Persona a = new Persona("Raul", 20, 'H', 120f,1.77f);
		Persona b = new Persona("Laura", 21, 'M', 59f, 1.60f);
		Persona c = new Persona("Jorge", 17, 'H', 60f, 1.81f);		
		switch (a.calcularIMC()) {
		case -1:System.out.println(a.getNombre()+" tiene IMC inferior a 20");break;
		case 0:System.out.println(a.getNombre()+" tiene IMC entre 20 y 25");break;
		case 1:System.out.println(a.getNombre()+" tiene IMC mayor a 20");break;
		}
		switch (b.calcularIMC()) {
		case -1:System.out.println(b.getNombre()+" tiene IMC inferior a 20");break;
		case 0:System.out.println(b.getNombre()+" tiene IMC entre 20 y 25");break;
		case 1:System.out.println(b.getNombre()+" tiene IMC mayor a 20");break;
		}
		switch (c.calcularIMC()) {
		case -1:System.out.println(c.getNombre()+" tiene IMC inferior a 20");break;
		case 0:System.out.println(c.getNombre()+" tiene IMC entre 20 y 25");break;
		case 1:System.out.println(c.getNombre()+" tiene IMC mayor a 20");break;
		}
		if (a.esMayorDeEdad())System.out.println(a.getNombre()+" es mayor de edad");
		else System.out.println(a.getNombre()+" es menor de edad");
		if (b.esMayorDeEdad())System.out.println(b.getNombre()+" es mayor de edad");
		else System.out.println(b.getNombre()+" es menor de edad");
		if (c.esMayorDeEdad())System.out.println(c.getNombre()+" es mayor de edad");
		else System.out.println(c.getNombre()+" es menor de edad");
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		
	}
}
