package com.cip.pro.tema_4.actividad_5;
import java.util.Scanner;
import java.lang.Math;

public class Ejercicio_3 {
	/*
	* Selecciona n�mero mayor
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 05-12-2020
	*/
	public static void main(String[] args) {
		//Varibles
		int numero1, numero2, max;
		
		//Objeto
		Scanner num = new Scanner(System.in);
		
		//Mensaje
		System.out.println("Introduce 2 n�mero entero diferentes:");
		numero1 = num.nextInt();
		numero2 = num.nextInt();
		
		//N�mero mas grande
		max = Math.max(numero1, numero2); num.close();
		
		//Resultado
		
		System.out.print("El n�mero mas garnde es " + max);

	}

}
