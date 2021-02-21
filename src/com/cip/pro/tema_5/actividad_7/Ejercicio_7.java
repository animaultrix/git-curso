package com.cip.pro.tema_5.actividad_7;
import java.lang.Math;
import java.util.Scanner;

public class Ejercicio_7 {
	/*
	* Men� con raiz y potencia
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 07-12-2020
	*/
	public static void main(String[] args) {
		//Variables
	    int numero, opcion;
				
		//Objeto
		Scanner sc = new Scanner(System.in);
				
		//Mensaje
		do {
		System.out.println("\nMen�\n\n1.- Calcular la ra�z cuadrada de un n�mero." +
				"\n\n2.- Calcular el cuadrado de un n�mero.\n\n0.- Salir.");
		opcion = sc.nextInt();
				
		//Condicional
		if (opcion < 0 | opcion > 2) {System.out.println("Opci�n incorrecta. Por favor,"
				+ " introduzca un valor entre 0 y 2.");
		}
		else if  (opcion == 1) { 
			System.out.print("Introduzca un numero: ");
		    numero = sc.nextInt();
			System.out.println("La ra�z cuadrada es: " + Math.sqrt(numero));
		}
		else if (opcion == 2) {
			System.out.print("Introduzca un numero: ");
		     numero = sc.nextInt();
			System.out.print("La ra�z cuadrada es: " + Math.pow(numero, 2));
		}
		}
		
		while (opcion !=0);sc.close();
	}

}
