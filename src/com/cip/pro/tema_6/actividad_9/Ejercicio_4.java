package com.cip.pro.tema_6.actividad_9;
import java.util.Scanner;
public class Ejercicio_4 {

	public static void main(String[] args) {
		int teclado;
		Scanner sc = new Scanner(System.in);		
		System.out.println(
				"Menú:\n"
				+ "1. Imprimir números pares del 1 al 20.\n"
				+ "2. Imprimir números impares del 1 al 20.\n"
				+ "0. Salir."
				);		
		do {
			teclado = sc.nextInt();
			switch (teclado){
				case 1: ImprimirPares ();
				break;
				case 2: ImprimirImpares ();
				break;				
			}
		}
		while(teclado != 0) ;
		System.out.print("Fin del programa.");
		sc.close();
	}
	public static void ImprimirPares () {
		System.out.print("Números pares entre el 1 y el 20" );
		for (int i=1 ; i<21 ; i++) {
			if (i%2 == 0 )
				System.out.println("\n"+i);
		}
	}
	public static void ImprimirImpares () {
		System.out.print("Números pares entre el 1 y el 20" );
		for (int i=1 ; i<21 ; i++) {
			if (i%2 != 0 )
				System.out.println("\n"+i);
		}
	}
}
