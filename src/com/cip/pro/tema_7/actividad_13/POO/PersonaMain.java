/**
 * 
 */
package com.cip.pro.tema_7.actividad_13.POO;

/**
 * @author Esteban
 *
 */
public class PersonaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Persona a = new Persona();
		Persona b = new Persona();
		Persona c = new Persona();
		a.setAltura(1.77f);
		a.setEdad(20);
		a.setNombre("Raul");
		a.setPeso(120);
		a.setSexo('H');
		b.setAltura(1.60f);
		b.setEdad(21);
		b.setNombre("Laura");
		b.setPeso(59);
		b.setSexo('M');
		c.setAltura(1.81f);
		c.setEdad(17);
		c.setNombre("Jorge");
		c.setPeso(60);
		c.setSexo('H');
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
		System.out.println("Nombre: "+a.getNombre() +" | "+ " Altura: "+a.getAltura()+" | "+
				" Edad: "+a.getEdad()+" | "+ " Peso: "+a.getPeso()+" | "+" Sexo: "+a.getSexo());
		System.out.println("Nombre: "+b.getNombre() +" | "+ " Altura: "+b.getAltura()+" | "+
				" Edad: "+b.getEdad()+" | "+ " Peso: "+b.getPeso()+" | "+" Sexo: "+b.getSexo());
		System.out.println("Nombre: "+c.getNombre() +" | "+ " Altura: "+c.getAltura()+" | "+
				" Edad: "+c.getEdad()+" | "+ " Peso: "+c.getPeso()+" | "+" Sexo: "+c.getSexo()); 		
	}
}
