package com.cip.pro.tema_3.actividad_4;
import java.util.Scanner;

public class Ejercicio_7 {
	/*
	* Calcular media 
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 03-12-2020
	*/
	public static void main(String[] args) {
		 //Variables
		float valor1, valor2, valor3;
		float media;
		
		//Objeto
		Scanner sc;
		sc = new Scanner(System.in);
		
		//Pedida de valores
		System.out.print("Introduce 3 valores enteros\n"
				+ "para calcular su media.\nValor 1: ");		
		valor1 = sc.nextFloat();
		System.out.print("Valor 2: ");
		valor2 = sc.nextInt();
		System.out.print("Valor 3: ");
		valor3 = sc.nextInt(); sc.close();
		media = (valor1 + valor2 + valor3)/3;
		
		//Mensaje media		
		System.out.print("La media es " + media);
				

	}

}
