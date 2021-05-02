package com.cip.pro.tema_5.actividad_7;

import java.util.Scanner;

public class Ejercicio_10 {
	/*
	* Calcular factorial
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 07-12-2020
	*/
	public static void main(String[] args) {
		//Variables
		int numero; 
		int m = 1;
		
		//Objeto
		Scanner sc = new Scanner(System.in);
				
		//Mensaje
		System.out.println("Introduce un nº para calcular su factorial: ");
		numero = sc.nextInt();sc.close();
				
		//Concicional
		for (int i = 1; i <= numero; i++ ) {			
			m = m*i;
			if (i >= numero) System.out.println(m);
		    }
		
		
	}

}
