package com.cip.pro.tema_5.actividad_7;
import java.util.Scanner;
public class Ejercicio_9 {
	/*
	* elegir número y calcular tabla multiplicar
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 07-12-2020
	*/
	public static void main(String[] args) {
		//Variables
		int numero; 
		
		//Objeto
		Scanner sc = new Scanner(System.in);
		
		//Mensaje
		System.out.println("Introduce un nº para generar tabla: ");
		numero = sc.nextInt();sc.close();
		
		//Condicional
		for (int i = 0; i <= 10; i++ ) {
			System.out.println(numero + " x " + i + " = " + numero*i);
		}

	 }

}
