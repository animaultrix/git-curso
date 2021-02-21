package com.cip.pro.tema_5.actividad_7;
import java.util.Scanner;
public class Ejercicio_8 {
	/*
	* Positivo o negativo 0 es fin
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
		do {
		System.out.print("\nIntroduce un número: ");
		numero = sc.nextInt();
		
		//Condicional
		if (numero > 0) System.out.print("Es positivo");	
		else if (numero < 0) System.out.print("Es negativo");
		}
		while (numero != 0);sc.close();

	}

}
