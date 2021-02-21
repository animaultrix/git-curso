package com.cip.pro.tema_3.actividad_4;
import java.util.Scanner;

public class Ejercicio_3 {
	/*
	* Radio de una esfera a partir de su diámetro
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 03-12-2020
	*/
	public static void main(String[] args) {
		
		//Mensaje
		System.out.print("Introduce diametro de circulo: ");
		
		//Objeto
		Scanner d = new Scanner(System.in);
			
		//variables
		float diametro = d.nextFloat(); d.close();
		float radio = diametro / 2;		
			
		//impresión de resultado
		System.out.print("Si el diámetro es " + diametro 
		+ " el radio es " + radio);
		

	}

}
