package com.cip.pro.tema_3.actividad_4;

import java.util.Scanner;


public class Ejercicio_4 {
	/*
	* Mostrar IMC
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 03-12-2020
	*/
	public static void main(String[] args) {
		
		//Mensaje
		System.out.print("Para determinar tu índice de masa corporal IMC\n"
				+ "introduce los siguentes datos:\n");
		
		//Objeto
		Scanner sc = new Scanner(System.in);
		
		//Pedida de datos
		System.out.print("\nPeso(Kg): ");		
		float peso = sc.nextFloat();		
	    System.out.print("\nAlutra(m): ");	
		float altura = sc.nextFloat(); sc.close();	
		float IMC = peso/(altura*altura);
		
		//impresión de IMC
		System.out.print("\nUna persona adulta de: \n"
				+ altura + "m y " + peso + "kg su IMC es " + IMC);		

	}

}
