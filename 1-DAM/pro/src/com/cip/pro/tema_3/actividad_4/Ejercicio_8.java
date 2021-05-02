package com.cip.pro.tema_3.actividad_4;
import java.util.Scanner;

public class Ejercicio_8 {
	/*
	* Calculo horas después
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 03-12-2020
	*/
	public static void main(String[] args) {
		//Variables
		int t, h, c, r;
		
		//Objeto
		Scanner sc = new Scanner(System.in);
		
	    //Pedir datos
	    System.out.print("Introduce la hora actual: ");
	    t = sc.nextInt();
	    System.out.print("Introduce horas despues a calcular: ");
	    h = sc.nextInt(); sc.close();
	    
	    //Cálculo horas después	    
	    c = (t + h)/24;
	    r = (t + h) - 24*c;
	    
	    //Predicción
	    System.out.print("En " + h + " horas seran las "
	    + r + " horas");
	}

}
