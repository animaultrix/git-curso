/**
 * 
 */
package com.cip.pro.tema_7.actividad_13.POO;
import java.util.Scanner;

/**
 * @author Esteban
 *
 */
public class Cuenta {

	/**
	 * @param args
	 */
	
	private static String titular;
	private static double saldo;
	
	public static void main(String[] args) {
		
		double teclado;
		Scanner sc = new Scanner(System.in);		
		System.out.print(
				"********************\n"+
				"1._Ingresar efectivo\n"+
				"2._Retirar efectivo\n"+
				"3._Mostrar saldo\n"+
				"0._Fin\n"				
				);
		do {
			teclado = sc.nextDouble();
			switch ((int)teclado) {
			case 1: {
				System.out.print("cantidad a ingresa: ");
				teclado = sc.nextDouble();
				ingresar(teclado);
			}break;
			case 2: {
				System.out.print("cantidad a retirar: ");
				teclado = sc.nextDouble();
				retirar(teclado);
			}break;
			case 3: {
				System.out.println("Saldo actual es "+saldo());
			}break;				
			}		
		} while (teclado != 0);sc.close();System.out.print("Fin.");
	}	
	/**
	 * @param cuenta se incrementa
	 */	
	public static void ingresar(double cantidad) {
		if(cantidad >0) {
			saldo += cantidad;
		}
		else System.out.print("Cantidad no valida");
	}
	/**
	 * @param cuenta se decrimenta
	 */	
	public static void retirar(double cantidad) {
		if(saldo-cantidad<=0  ) {
			System.out.println("Se retira "+saldo);
			saldo =0;			
		}
		else{
			saldo -= cantidad;			
		}
	}
	/**
	 * @return  saldo actual
	 */
	public static double saldo() {		
		return saldo;
	}
}
