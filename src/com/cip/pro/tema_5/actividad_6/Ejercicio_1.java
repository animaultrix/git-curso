package com.cip.pro.tema_5.actividad_6;
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio_1 {
	/*
	* Adivina número 0<=n<=100
	* @author Antonio Esteban Pestana Guerra
    * @version 1.1
    * @since 06-12-2020
	*/
	public static void main(String[] args) {
		//Variables
        double prediccion, cero;
		double  n = Math.random()*100;;
		int contador = 0;
		int contador2 = 0;		
		
		//Objeto
		Scanner pre = new Scanner(System.in);
		
		//Mensaje inicial		
		do
		{					
		System.out.print("Introduce un valor \"n\" entero donde 0<=n<=100: ");
		
		prediccion = pre.nextDouble();
		cero = Math.abs((int)prediccion) - prediccion;
		contador2++;
		
		//Condicionales
		
		while ((int)n != prediccion && prediccion <= 100 && prediccion >= 0 && cero == 0) 
		{	
			++contador;
		if ((int)n < prediccion)
		{
			System.out.print("El número n es menor, prueba otra vez: ");
		    prediccion = pre.nextDouble();
		    cero = Math.abs((int)prediccion) - prediccion;
		}
		else if ((int)n > prediccion)
		{
			System.out.print("El número n es mayor, prueba otra vez: ");
		    prediccion = pre.nextDouble();
		    cero = Math.abs((int)prediccion) - prediccion;
		}}}
		while (prediccion > 100 || prediccion < 0 || cero < 0);
		System.out.print("Es el valor correcto\n    El número de intentos es "
		+ (contador + contador2));pre.close();
	}

}
