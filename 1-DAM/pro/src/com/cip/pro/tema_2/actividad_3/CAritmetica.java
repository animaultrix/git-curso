package com.cip.pro.tema_2.actividad_3;

public class CAritmetica {
	/*
	* author Operaciones aritméticas
	* @Antonio Esteban Pestana Guerra
    * @version 1.0
    * @since 03-12-2020
	*/
	public static void main (String[] args)
	{
		int datol, dato2, dato3, resultado;
		datol = 20;
		dato2 = 10;
		dato3 = 2;
		// Suma
		resultado = datol + dato2 + dato3;
		System.out.println(datol + " + " + dato2 + " + " + dato3 + " = " +  resultado);
		// Resta
		resultado = datol - dato2 - dato3;
		System.out.println(datol + " - " + dato2 + " - " + dato3 + " = " + resultado);
		// Producto
		resultado = datol * dato2 * dato3;
		System.out.println(datol + " * " + dato2 + " * " + dato3 + " = " + resultado);
		// Cociente
		resultado = (datol * dato3) / dato2;
		System.out.println("(" + datol + "*" + dato3 + ")" + " / " + dato2 + " = " + resultado);
		}
		
	}

