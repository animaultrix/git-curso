package com.cip.pro.tema_5.actividad_7;
import java.util.Scanner;

public class Ejercicio_4 {
	/*
	* Evaluar nota
	* @author Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 07-12-2020
	*/
	public static void main(String[] args) {
		//Variables
		int nota;
		
		//Objeto
		Scanner sc = new Scanner(System.in);
		
		//Mensaje
		System.out.println("Introduce una nota en entero n 0<=n<=10");
		nota = sc.nextInt();sc.close();
		
		//Condicional (Es mejor usar condicional if a switch case)
		switch (nota) {
		case (0): System.out.print("Insuficiente");  break;//se puede usar parentesis
		case (1): System.out.print("Insuficiente");  break;//se puede usar comillas simples
		case (2): System.out.print("Insuficiente");  break;
		case (3): System.out.print("Insuficiente");  break;
		case (4): System.out.print("Insuficiente");  break;
		case (5): System.out.print("Suficiente");  break;
		case (6): System.out.print("Bien");  break;
		case (7): System.out.print("Notable");  break;
		case (8): System.out.print("Notable");  break;
		case (9): System.out.print("Sobresaliente");  break;
		case (10): System.out.print("Sobresaliente");  break;//con parentesis puedes metes 2 digitos
		}


	}

}
