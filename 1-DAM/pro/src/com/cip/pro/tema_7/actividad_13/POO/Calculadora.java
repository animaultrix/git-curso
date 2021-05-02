/**
 * 
 */
package com.cip.pro.tema_7.actividad_13.POO;
import java.util.Scanner;
/**
 * @author Esteban
 *
 */
public class Calculadora {

	/**
	 * @param args
	 */
	private static double valor1;
	private static double valor2;
	public static void main(String[] args) {
		double teclado = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print(
					"*****************************\n"+
                    "1._Asignar valor 1\n"+
			        "2._Asignar valor 2\n"+
                    "3._Imprimir valores\n"+
			        "4._Multiplicar valores\n"+
                    "5._Dividir valores\n"+
			        "6._Calcular media\n"+
                    "7._Calcular si valor 1 es par\n"+
			        "8._Calcular si valor 2 es par\n"+
                    "0._Salir\n"
			);			
			teclado = sc.nextDouble();			
			switch ((int)teclado) {
			case 1: {
				System.out.print("Introduce valor 1 = ");
				teclado = sc.nextDouble();
				setValor1(teclado);
			}break;
			case 2: {
				System.out.print("Introduce valor 2 = ");
				teclado = sc.nextDouble();
				setValor2(teclado);
			}break;
			case 3: {
				System.out.println("Valor 1 = "+valor1+" --- Valor 2 = "+valor2);
			}break;
			case 4: {
				calcularMultipllicacion();			
			}break;
			case 5: {
				calculaDivision();
			}break;
			case 6: {
				calcularMedia();
			}break;
			case 7: {
				valor1EsPar();
			}break;
			case 8: {
				valor1EsPar();
			}break;
			}
		}	
		while (teclado != 0);sc.close();System.out.print("Fin.");
	}	
	//Método multiplicar
	public static double calcularMultipllicacion(){
		System.out.print("Valor 1 x Valor 2 = \n"+valor1*valor2);
		return valor1*valor2;		
	}
	//Método division
	public static double calculaDivision() {
		System.out.print("Valor 1 / Valor 2 = \n"+valor1/valor2);
		return valor1/valor2;
	}
	//Método media
	public static double calcularMedia() {
		System.out.print("La media de Valor 1 y Valor 2 = \n"+(valor1+valor2)/2);
		return (valor1+valor2)/2;
	}
	//Metodo valor 1 par
	public static boolean valor1EsPar() {
		boolean cierto;
		if(valor1 % 2 == 0) {
			cierto = true;
			System.out.println(valor1+" Es par");
		}
		else {
			cierto = false;
			System.out.println(valor1+" Es impar");
		}
		return cierto;
	}
	//Método valor 2 par
	public static boolean valor2EsPar() {
		boolean cierto;
		if(valor2 % 2 == 0) {
			cierto = true;
			System.out.println(valor2+" Es par");
		}
		else {
			cierto = false;
			System.out.println(valor2+" Es impar");
		}
		return cierto;
	}
	//Metodos getter and setters
	/**
	 * @return the valor1
	 */
	public double getValor1() {
		return valor1;
	}
	/**
	 * @param valor1 the valor1 to set
	 */
	public static void setValor1(double valor) {
		valor1 = valor;
	}
	/**
	 * @return the valor2
	 */
	public double getValor2() {
		return valor2;
	}
	/**
	 * @param valor2 the valor2 to set
	 */
	public static void setValor2(double teclado) {
		valor2 = teclado;
	}	
}
