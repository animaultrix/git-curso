/**
 * 
 */
package com.cip.pro.tema_7.actividad_13.ClassFinal;

import java.lang.Math;

/**
 * @author Esteban
 *
 */
public class MathFS {

	/**
	 * @param args
	 */
	
	static double array[];
	public static void main(String[] args) {		
		
		Math2 arrayM = new Math2();
		array = new double[5];
		 array[0] = 0.1;
		 array[1] = 0.5;
		 array[2] = 0.4;
		 array[3] = 0.9;
		 array[4] = 0.7;
		 System.out.println("El número mas grande es "+arrayM.numMax(array));
		 System.out.println("El número mas pequeño es "+arrayM.numMin(array));
		 System.out.printf("La sumatoria es "+"%.2f %n", arrayM.numSum(array));
		 System.out.printf("La media aritmética es "+"%.2f%n",arrayM.numMedA(array));
		 System.out.printf("La media geométrica es "+"%.2f%n",arrayM.numMedG(array));
	}
	
	final static class  Math2 {
		
		double numMax(double[] m) {
			
			double n = 0;
			int i=0;
			while(i<m.length) {
			if(m[i]>n) {
				n = m[i];
			}
			i++;
			}
			return n;	
		}
		double numMin(double[] m) {
			double n = 1;
			int i=0;
			while(i<m.length) {
			if(m[i]<n) {
				n = m[i];
			}
			i++;
			}			
			return n;	
		}
		double numSum(double[] m) {			
			double n=0;
			for(int i=0;i<m.length;i++)	{
				n += m[i];
			}
			
			return n;
					
		}
		double numMedA(double[] m) {
			
			return   numSum(m)/m.length;
		}
		double numMedG(double[] m) {
			
			return Math.pow(numSum(m),1.0/m.length);	
		}
	}

}
