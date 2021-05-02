package com.cip.pro.tema_5.actividad_7;

import java.util.Scanner;

public class Ejercicio_5 {
	/*
	* nota escrita
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
				
				//Condicional 
				switch (nota) {
				case (0): System.out.print("Cero");  break;//se puede usar parentesis
				case (1): System.out.print("Uno");  break;//se puede usar comillas simples
				case (2): System.out.print("Dos");  break;
				case (3): System.out.print("Tres");  break;
				case (4): System.out.print("Cuatro");  break;
				case (5): System.out.print("Cinco");  break;
				case (6): System.out.print("Seis");  break;
				case (7): System.out.print("Siete");  break;
				case (8): System.out.print("Ocho");  break;
				case (9): System.out.print("Nueve");  break;
				case (10): System.out.print("Dies");  break;//con parentesis puedes metes 2 digitos
				}


	}

}
