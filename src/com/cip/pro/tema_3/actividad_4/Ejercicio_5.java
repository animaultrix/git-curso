package com.cip.pro.tema_3.actividad_4;
import java.util.Scanner;




public class Ejercicio_5 {
	/*
	* Estimar área de un círculo
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 03-12-2020
	*/
	public static void main(String[] args) {
		//Variables
		final float PI = 3.14f;
		float radio;
		float area;
				
		//Mensaje
		System.out.print("Introduce el radio: ");
		
		//instancia
		Scanner	R = new Scanner(System.in);
		radio = R.nextFloat(); R.close();
		area = PI * radio * radio;
		
		//impresión área
		
		System.out.print("El area es " + area);
		
	}

}
