package com.cip.pro.tema_6.actividad_9;
import java.util.Scanner;
public class Ejercicio_2 {

	public static void main(String[] args) {
		int n ;
		System.out.print("Introduce valor para sumarle 1");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.print("1 + " + n + " es " + SumarNumeros(n));
		sc.close();

	}
	
	public static int SumarNumeros (int n) {
		n = n + 1;

		return n;
		
	}

}
