package com.cip.pro.tema_5.actividad_7;

public class Ejercicio_11 {
	/*
	* Array con enteros
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 07-12-2020
	*/
	public static void main(String[] args) {
		//Variables
		int n;
		int m = 0;
		//Array
		int[] numeros;//declaro
		numeros = new int [10];//instancio
		//Tambien en una linea int [] numeros = new int [10]; 		
		//inicializo		
		numeros [0] = 1;
		numeros [1] = 524;
		numeros [2] = 423;
		numeros [3] = 825;
		numeros [4] = 1524;
		numeros [5] = 324;
		numeros [6] = 899;
		numeros [7] = 975;
		numeros [8] = 775;
		numeros [9] = 657;
		for (int i = 0; i < 9; i++ ) {
			n = numeros[i];
		if (m<n) {
			m = n;
		}
		}
		System.out.println("El número mas grande es " + m);
		//System.out.print(numeros [5]);

	}

}
