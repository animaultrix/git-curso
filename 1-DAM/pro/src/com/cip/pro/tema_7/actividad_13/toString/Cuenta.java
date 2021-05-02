/**
 * 
 */
package com.cip.pro.tema_7.actividad_13.toString;

import java.util.Scanner;

/**
 * @author Esteban
 *
 */
public class Cuenta {

	
	
	/**
	 * @param args
	 */
	private  String titular;
	private  double saldo;
	
	public Cuenta() {
		this("",0);
	}
	public Cuenta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public static void main(String[] args) {
		double teclado;
		Cuenta c = new Cuenta("vacío",0);
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
				c.ingresar(teclado);
			}break;
			case 2: {
				System.out.print("cantidad a retirar: ");
				teclado = sc.nextDouble();
				c.retirar(teclado);
			}break;
			case 3: {
				c.saldo();
			}break;				
			}		
		} while (teclado != 0);sc.close();System.out.print("Fin.");
	}	
	/**
	 * @param cuenta se incrementa
	 */	
	public  void ingresar(double cantidad) {
		if(cantidad >0) {
			saldo += cantidad;
		}
		else System.out.print("Cantidad no valida");
	}
	/**
	 * @param cuenta se decrimenta
	 */	
	public  void retirar(double cantidad) {
		if(saldo-cantidad<=0  ) {
			System.out.println("Se retira "+saldo);
			saldo =0;			
		}
		else{
			saldo = saldo-cantidad;			
		}
	}
	/**
	 * @return  saldo actual
	 */
	public void saldo() {		
		System.out.println(toString());
	}
	/**
	 * @return the titular
	 */
	public  String getTitular() {
		return titular;
	}
	/**
	 * @param titular the titular to set
	 */
	public  void setTitular(String titular) {
		this.titular = titular;
	}
	/**
	 * @return the saldo
	 */
	public  double getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public  void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", saldo=" + saldo + "]";
	}	
}
