package com.cip.pro.tema_4.actividad_5;
import java.util.Scanner;
import java.lang.Math;

public class Ejercicio_2 {
	/*
	* Calcular área círculo 
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 05-12-2020
	*/
	public static void main(String[] args) {
		//Variables
		double radio, area;
		
		//Objeto
		Scanner r = new Scanner(System.in);

		//Mensaje
		System.out.print("Para calcular el area de un circulo introduce"
				+ "\nRadio: ");
		radio = r.nextDouble(); r.close();
		
		//Calculo área
		area = Math.PI * Math.pow(radio, 2);	
		
		//Resultado
		System.out.print("El área de un círuclo de radio " + (float)radio
				+ " unidades es de " + (float)area + " unidades.");		

	}

}
