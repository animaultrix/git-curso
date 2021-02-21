package com.cip.pro.tema_4.actividad_5;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio_6 {
	/*
	* División con dos decimales
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 05-12-2020
	*/
	public static void main(String[] args) {
		//Variables
		float numero1, numero2, resultado;
		
		//Objetos
		Scanner num = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat();
		
		//Mensaje
		System.out.println("Introduce números a dividir:");
		numero1 = num.nextFloat();
		System.out.println("entre");
		numero2 = num.nextFloat(); num.close();
		
		//Operación
		resultado = numero1/numero2;
		
		//Resultado
		System.out.printf("Es igual a %.2f %n", resultado);
		
		//Resultado con DecimalFormat
		dec.setMaximumFractionDigits(2);
		System.out.println("\nO lo que es lo mismo pero usando"
				+ " DecimalFormat igual a " + dec.format(resultado));
	}
}
