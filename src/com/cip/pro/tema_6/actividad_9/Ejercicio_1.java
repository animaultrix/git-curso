package com.cip.pro.tema_6.actividad_9;
/*
* Imprimir texto por pantalla
* @author Antonio Esteban Pestana Guerra
* @version 1.0
* @since 17-12-2020
*/
import  java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		
		ImprimirMensaje ();
	}
public static void ImprimirMensaje () {
	Scanner m = new Scanner(System.in);
	System.out.print("Introduce mensaje a imprimir");
	String texto = m.nextLine();
	System.out.print(texto);	
	m.close();
	
	
}
}
