package com.cip.pro.tema_5.actividad_7;
import java.util.Scanner;

public class Ejercicio_3 {
	/*
	* Calcula division con condicion "no se puede dividir por 0"
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 07-12-2020
	*/
	public static void main(String[] args) {
		//Variables
		int numerador;
		int divisor;
		//Objeto
		Scanner sc = new Scanner(System.in);
		
		//Mensaje
		System.out.println("Introduce 2 numeros a dividir");
		numerador = sc.nextInt();
		divisor = sc.nextInt();sc.close();
		
		//Condicional
		if (divisor == 0)
			System.out.print("No se puede dividir entre 0");
		else 
			System.out.print(numerador + "/" + divisor + " = " + (float)numerador/divisor);

	}

}
