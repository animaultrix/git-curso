package com.cip.pro.tema_3.actividad_4;
import java.util.Scanner;

public class Ejercicio_6 {
	/*
	* Convierte Euros en Dólares
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 03-12-2020
	*/
	public static void main(String[] args) {
	
		//variables
		final float usd = 1.1757f;
		float eur;
		float eurporusd;
		
		//Mensaje
		System.out.print("Introduce cantidad de euros a convertir a dolares: ");
		
        //Objeto
		Scanner Eur = new Scanner(System.in);
		eur = Eur.nextFloat(); Eur.close();
		eurporusd = usd*eur;
		
		//impresión euro a dólares
		System.out.print(eur + " EUR son " + eurporusd + " USD" );
				
	}

}
