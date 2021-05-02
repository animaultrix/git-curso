package com.cip.pro.tema_4.actividad_5;
import java.lang.Math;
import java.util.Scanner;
public class Ejercicio_1 {
	/*
	* Calcular IMC 
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 05-12-2020
	*/
	public static void main(String[] args) {
		//Variables
		double altura, peso, imc;
		
		//Objeto
		Scanner sc = new Scanner(System.in);
		
		//Mensaje
		System.out.print("Para calcular tu IMC introduce\nAltura(m): ");
		altura = sc.nextFloat();
		System.out.print("Peso(kg): ");
		peso = sc.nextFloat(); sc.close();
		
		//Calculo IMC
		
		imc = peso / Math.pow(altura, 2);
		
		//Mensaje resultado
		
		System.out.print("El IMC para un adulto de " + (float)altura + "m y "
		+ (float)peso + "kg es de " + (int)imc);		
	}
}
