package com.cip.pro.tema_6.actividad_9;
import java.util.Scanner;
public class Ejercicio_5 {

	public static void main(String[] args) {
		int teclado;
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"1-. Convertir de grados Centígrados a grados Fahrenheit.\n"
				+ "2-. Convertir de grados Fahrenheit a grados Centígrados.");
		do {
			teclado = sc.nextInt();
		    switch (teclado) {
		    case 1:CenFah ();
		    break;
		    case 2:FahCen ();
		    break;
		    }
		}
        while (teclado != 0);
		System.out.print("Fin del programa.");
		sc.close();
	}
	public static void CenFah () {
		float n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce grados centigrados");
		n = sc.nextFloat();
		System.out.println(n + "ºC son " + ((n*9/5)+32) + "ºF");
//		sc.close();
	}
    public static void FahCen () {
    	float n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce grados fahrenheit");
		n = sc.nextFloat();
		System.out.println(n + "ºF son " + ((n*5/9)-32) + "ºC");
		sc.close();
	}

}
