package com.cip.pro.tema_6.actividad_9;
import java.util.Scanner;
import java.util.GregorianCalendar;
public class Ejercicio_6 {

	public static void main(String[] args) {
		int teclado;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce año :");
		teclado = sc.nextInt();
		sc.close();
		b = calcularAnyoBisiesto(teclado);
		if (b == 1)System.out.print("Es bisiesto");
		else System.out.print("No es bisiesto");
 
	}
	public static int calcularAnyoBisiesto (int x) {
		int y;		
		GregorianCalendar g = new GregorianCalendar();
		if ( g.isLeapYear(x) == true )
			y = 1;
		else y = 0;
		return y ;
	}

}
