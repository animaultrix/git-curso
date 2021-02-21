package com.cip.pro.tema_6.actividad_8;
import java.util.Scanner;
import java.lang.Math;
/**
* Se trata de un generador array aleatorio
* @author Antonio Esteban Pestana Guerra
* @version 1.0
* @since 15-12-2020 
*/
public class Ejercicio_1 {
	
	
	//declaración de array en la clase principal (static)
	static int [] array = new int [20];
	
	/**Genera un menú del que se puede ejecutar los métodos del paquete*/	
	public static void main(String[] args) {		

		        //Variables		
				int valor;			
				
				//Array (aleatorio)
			
				for (int i = 0; i < 20; i++) {
				array [i]  =  NumRandom(i);
				}
				//Objeto Scanner
				Scanner sc = new Scanner(System.in);
				
				//Menu		
				System.out.print("\nSeleccione opción:\n\n"
						+ " 1-. Imprimir el mayor valor del array.\n"
						+ " 2-. Imprimir el menor valor del array.\n"
						+ " 3-. Calcular la media de todos los valores del array.\n"
						+ " 4-. Imprimir todos los valores del array.\n" 
						+ " 5-. Imprimir número de veces que se repite \"n\".\n" 
						+ " 0-. Salir del programa.\n");
				do {
					valor = sc.nextInt();
					if (valor < 0 | valor > 5)
						System.out.println("Introduce un valor valido");
					else
						switch (valor) {
						    case 1:
						    	FiltrarMayor ();
						    	break;
						    case 2:
						    	FiltrarMenor ();
						    	break;
							case 3:
								MediaArray();
								break;
					        case 4:
					        	ImprimirArray();
					        	break;
					        case 5:
					        	VecesN();
					        	break;
					    }   
					}		
				while(valor != 0);sc.close();
				System.out.print("Fin del programa.");
			}
			/**Método que genera números aleatorios 1<=n<=10*/
			public static int NumRandom (int n) {
				double ra, re;
				ra = 1+9*Math.random();
				re = Math.round(ra);
				n  =  (int)re;return n;
			}	
			/**Método que filtra el número mayor*/
			public  static void FiltrarMayor () {
				int n;
				int m = 0;
				for (int i = 0; i < 20; i++ ) {
		    		n = array[i];
		    		if (m<n) m = n;		    		
		    		}
				System.out.println("El array con mayor valor es: " + m);					
			}
			/**Método que filtrar el número menor*/
			public static void FiltrarMenor () {
				int n;
				int m = 10;
				for (int i = 0; i < 20; i++ ) {
			    	n = array[i];
			    	if (m>n) m = n;		    		
			    	}
				System.out.println("El array con menor valor es: " + m);
				}
			/**Método que calcula la media de array[i]*/
			public static void MediaArray() {
				float valorf = 0;
				for (int i = 0 ; i < 20; i++) {
					valorf = valorf + array[i];
					if (i == 19)
						System.out.println("La media de los Array es: " + valorf/20);
				}
			}
			/**Método que imprime el array[i]*/
			public static void ImprimirArray() {
				for (int i = 0 ; i < 20 ; i++) {
	        		if(i % 2 == 0 | i == 0)
	        			System.out.print(" Array [" + i + "] = " + array[i]);
	        		else
	        			System.out.println("    Array [" + i + "] = " + array[i]);
			    }
			}
			/**Método que imprime el número de veces que se repite "n" en el array[i]*/
			public static void VecesN() {
				int n;
				int m;
				int t = 0;
				Scanner scn = new Scanner(System.in);
				System.out.print("Introduce valor a n = ");
			    n = scn.nextInt();			    
			    for (int i = 0 ; i < 20 ; i++) {
			    	m = array [i];
			    	if (m == n) t++;
			    }
			    if (t > 1 | t == 0)
			    System.out.println(n + " se repite " + t + " veces.");
			    else 
			    System.out.println(n + " se repite una vez.");
//			    scn.close();
			}   //Si cierro el objeto scn me salta un error al finalizar VecesN ();
			    //Supongo que se cierra solo al finalizar el método VecesN
			
			
		}