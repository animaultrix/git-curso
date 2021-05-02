package com.cip.pro.tema_5.actividad_7;
import java.util.Scanner;

public class Ejercicio_2 {
	/*
	* Indicar mayor o si son iguales
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 07-12-2020
	*/
	public static void main(String[] args) {
		//Variables
		int numero1, numero2;
		
		//Objeto
		Scanner sc = new Scanner(System.in);
		
		//Mensaje
		System.out.println("Introduce 2 numeros");
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();sc.close();
		
		//condicional
		if (numero1 != numero2)
		System.out.print("El mayor es " + Math.max(numero1, numero2));
		else System.out.print("Son iguales");

	}

}
