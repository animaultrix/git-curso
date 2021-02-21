package com.cip.pro.tema_3.actividad_4;
import java.util.*;

public class Ejercicio_2 {
	/*
	* Convierte grados Fahrenheit a grados Centígrados
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 03-12-2020
	*/
	public static void main(String[] args) {
		
		//Variables
		float F, C;
		
		//Mensaje
		System.out.print("Introduce grado Fahrenheit: ");
		
		//Objeto sc de la clase scanner
		Scanner sc = new Scanner(System.in);
		
		//inicializa variables
		
		F = sc.nextFloat(); sc.close();
		C = (F-32) * 5/9;		
		
		//Impresión de resultado
		System.out.print(F + "°F son " + C + "°C");
	}

}
