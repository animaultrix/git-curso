package com.cip.pro.tema_3.actividad_4;

import java.util.Scanner;

public class Ejercicio_1 {
	/*
	* Convierte grados Cent�grados a grados Fahrenheit
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 03-12-2020
	*/

	public static void main(String[] args) {
		
		//Objeto sc de clase Scanner
		Scanner sc = new Scanner(System.in);
		
		//Mensaje pantalla
		System.out.print("Introduce grados cent�grados: ");
		
		//Variables
		float C = sc.nextFloat();sc.close();		
		float F = C * 9/5 + 32;
		
		
		//impresi�n de conversi�n
		System.out.print(C + "�C son " + F + "�F");

	}

}
