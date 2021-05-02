package com.cip.pro.tema_6.actividad_9;

public class Ejercicio_3 {

	public static void main(String[] args) {
		ImprimirPares ();

	}
	public static void ImprimirPares () {
		System.out.print("Números pares entre el 1 y el 20" );
		for (int i=1 ; i<21 ; i++) {
			if (i%2 == 0 )
				System.out.println("\n"+i);
		}
	}
   
}
