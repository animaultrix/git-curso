/**
 * 
 */
package com.cip.pro.tema_7.actividad_13.toString;

import java.util.Scanner;

/**
 * @author Esteban
 *
 */
public class Calculadora {

	/**
	 * @param args
	 */
	private int valor1;
	private int valor2;
	
	public static void main(String[] args) {
		
		int teclado = 0;
		Scanner sc = new Scanner(System.in);
		Calculadora c = new Calculadora();
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
			teclado = sc.nextInt();			
			switch (teclado) {
			case 1: {
				System.out.print("Introduce valor 1 = ");
				teclado = sc.nextInt();
				c.setValor1(teclado);
			}break;
			case 2: {
				System.out.print("Introduce valor 2 = ");
				teclado = sc.nextInt();
				c.setValor2(teclado);
			}break;
			case 3: {				
				System.out.println(c.toString());				
			}break;
			case 4: {
				System.out.println("Valor 1 x Valor 2 = "+c.calcularMultipllicacion());
							
			}break;
			case 5: {
				System.out.println("Valor 1 / Valor 2 = "+c.calculaDivision());
				
			}break;
			case 6: {
				System.out.println("La media de Valor 1 y Valor 2 = "+c.calcularMedia());				
			}break;
			case 7: {
				c.valor1EsPar();
			}break;
			case 8: {
				c.valor1EsPar();
			}break;
			}
		}	
		while (teclado != 0);sc.close();System.out.print("Fin.");
	}
	public Calculadora() {
		this(0,0);
	}
	public Calculadora(int valor1, int valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	//Método multiplicar
	public int calcularMultipllicacion(){		
		return valor1*valor2;		
	}
	//Método division
	public double calculaDivision() {		
		return (double)valor1/(double)valor2;
	}
	//Método media
	public double calcularMedia() {		
		return ((double)valor1+(double)valor2)/2;
	}
	//Metodo valor 1 par
	public boolean valor1EsPar() {
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
	public boolean valor2EsPar() {
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
	public int getValor1() {
		return valor1;
	}
	/**
	 * @param valor1 the valor1 to set
	 */
	public void setValor1(int valor) {
		valor1 = valor;
	}
	/**
	 * @return the valor2
	 */
	public int getValor2() {
		return valor2;
	}
	/**
	 * @param valor2 the valor2 to set
	 */
	public void setValor2(int teclado) {
		valor2 = teclado;
	}
	/**
	 * @return toString()
	 */
	@Override
	public String toString() {
		return "Calculadora [getValor1()=" + getValor1() + ", getValor2()=" + getValor2() + "]";
	}	
	
}

