package com.cip.pro.tema_4.actividad_5;
import java.util.Scanner;
import java.lang.Math;

public class Ejercicio_4 {
	/*
	* Selecciona n�mero menor
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 05-12-2020
	*/
	public static void main(String[] args) {
		//Varibles
		int numero1, numero2, min;
				
		//Objeto
		Scanner num = new Scanner(System.in);
				
		//Mensaje
		System.out.println("Introduce 2 n�mero entero diferentes:");
		numero1 = num.nextInt();
		numero2 = num.nextInt();
				
		//N�mero mas peque�o
		min = Math.min(numero1, numero2); num.close();
				
		//Resultado
				
		System.out.print("El n�mero mas peque�o es " + min);

	}

}
