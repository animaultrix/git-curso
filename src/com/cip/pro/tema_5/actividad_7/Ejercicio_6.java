package com.cip.pro.tema_5.actividad_7;
import java.lang.Math;
import java.util.Scanner;

public class Ejercicio_6 {
	/*
	* Hacer raiz cuadrada y impedir negativos
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
		System.out.println("Introduce un número positivo para hayar su raiz cuadrada");
		numero = sc.nextInt();sc.close();
		
		//Condicional
		if (numero < 0) System.out.print("No se pueden numero negativos");
		else System.out.print("El resultado es " + Math.sqrt(numero));

	}

}
