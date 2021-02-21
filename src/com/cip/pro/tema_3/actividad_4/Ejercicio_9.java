package com.cip.pro.tema_3.actividad_4;
import java.util.Scanner;

public class Ejercicio_9 {
	/*
	* Imprimie solo la parte decimal
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 03-12-2020
	*/
	public static void main(String[] args) {
		
		//Variable
		float d;
		int e;
		float r;
		
		//Mensaje
		System.out.print("Introduce un numero con decimal: ");
		
		//Objeto
		Scanner sc = new Scanner(System.in); 
		
		//Cálculo parte decimal
		d = sc.nextFloat(); sc.close();
		e = (int) d;
		r = (d - e);
		
		//Imresión de resultado		
		System.out.print("La parte decimal es " + r);

	}

}
