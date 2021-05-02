package com.cip.pro.tema_3.actividad_4;
import java.util.Scanner;

public class Ejercicio_10 {
	/*
	* Redondear número 
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 03-12-2020
	*/
	public static void main(String[] args) {
		//Variables
		float numerod;
		float numerod2;		
		int resultado;
		
		//Mensaje
		System.out.println("Introduce numero a rendondear: ");
		
		//Objeto
		Scanner sc = new Scanner(System.in);
		
		//Redondeo
		numerod = sc.nextFloat(); sc.close();
		numerod2 = numerod * 2 + 1;
		resultado = (int) numerod2/2;		
		
		//Mensaje resultado
		System.out.print("El numero " + numerod + " redondeado es " + resultado);
		

	}
}
