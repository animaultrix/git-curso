package com.cip.pro.tema_5.actividad_7;
import java.util.Scanner;

public class Ejercicio_1 {
	/*
	* Decir si n es par o impar
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 06-12-2020
	*/
	public static void main(String[] args) {
		//Variables
		float n, m1, m2;
		
		//Objeto
		Scanner sc = new Scanner(System.in);
		
		//Mensajes
		System.out.print("Introduce un número");
		n = sc.nextFloat();sc.close();
		
		m1 = n/2;
		m2 = m1 - (int)m1;
		
		if (m2 == 0) {//otra forma seria (n % 2 = 0) --- y no haria falta m1 y m2
			System.out.print("El número es par");
		}
		else System.out.print("El número es impar");

	}

}
