package com.cip.pro.tema_4.actividad_5;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class Ejercicio_7 {
	/*
	* Juego de dados
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 05-12-2020
	*/
	public static void main(String[] args) {
		//Variables
		double dado1, dado2, r1, r2;
		String jugador1, jugador2;
		
		//Objeto
		Scanner sc = new Scanner(System.in);
		
		//Mensaje jugador 1	(sin Math ni formateo de datos de salida)
		System.out.println("Introduce el nombre del primer jugador para jugar: ");
		jugador1 = sc.next();
		System.out.println(jugador1 +" tira sus dados");
		dado1 = Math.random()*6+1;
		System.out.println("Dado 1: " 				
		+ (int)dado1);	
		dado2 = Math.random()*6+1;
		System.out.println("Dado 2: "
		+ (int)dado2);	
		
		//resultado 1
		r1 = (int)dado1 + (int)dado2;
		
		//Mensaje jugador 2 (con Math para redondeo y formateos diferentes)
		System.out.println("Introduce el nombre del segudo jugador para jugar: ");
		jugador2 = sc.next(); sc.close();
		System.out.println(jugador2 +" tira sus dados");
		dado1 = Math.random()*6;
		dado1 = Math.round(dado1);
		System.out.printf("Dado 1: "
		+ "%.0f %n", dado1);
		dado2 = Math.random()*6;
		dado2 = Math.round(dado2);
		DecimalFormat formatd = new DecimalFormat();
		formatd.setMaximumFractionDigits(0);
		System.out.println("Dado 2: " 
		+ formatd.format(dado2));
		
		//resultado 2
		r2 = (int)dado1 + (int)dado2;
		
		//Mensaje ganador
		System.out.print("La tirada mas alta es " + (int)Math.max(r1, r2));
		if (r1 > r2) System.out.println(", " + jugador1 + " es el ganador");		
		else if (r1 < r2) System.out.println(", " + jugador2 + " es el ganador");		
		else System.out.println(", se trata de un empate");		
		System.out.print("la media de los 4 dados es " + Math.round(r1+r2)/4);
		
		
	}

}
