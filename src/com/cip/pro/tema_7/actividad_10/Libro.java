/**
 * 
 */
package com.cip.pro.tema_7.actividad_10;
/**
 * @author Esteban
 *
 */
public class Libro {

	/**
	 * @param args
	 */
	 private static Libro libros [];
	 private static int lengthArray = 2;
	 private String titulo;
	 private String autor;
	 private int numEjemp;
	 private int numEjempPres;
	 //Método main
	 public static void main(String[] args) {
		 	        
		 libros = new Libro[lengthArray];
		 libros[0] = new Libro("Miguel de Cervantes", "El Quijote de la Mancha", 2, 0);	
		 libros[1] = new Libro("Arturo Pérez Reverte", "El Capitán Alatriste", 1, 0);
		 prestamo(0);
		 System.out.println(libros[0].getNumEjempPres());
		 prestamo(0);
		 System.out.println(libros[0].getNumEjempPres());
		 prestamo(0);
		 System.out.println(libros[0].getNumEjempPres());
		 devolucion(0);
		 System.out.println(libros[0].getNumEjempPres());
		 prestamo(0);
		 System.out.println(libros[0].getNumEjempPres());
		 System.out.println(libros[0].toString());
		 System.out.println(libros[1].toString());
	}
	 //Método prestamo
	 public static  boolean prestamo(int indice) {
				
		 boolean prestado;
		 int numEjempP = libros[indice].getNumEjemp();
		 int numEjempPresP = libros[indice].getNumEjempPres();
		
		 if (numEjempP > numEjempPresP) {	
			
			 libros[indice].setNumEjempPres(++numEjempPresP);		
			 prestado = true;						
			 System.out.println("Prestado " + libros[indice].getTitulo());
		 }
		 else {
			
			 System.out.println("No quedan ejemplares de " + libros[indice].getTitulo());		
			 prestado = false;
		 }
		 return prestado;
	 }
	//Método devolución
	 public static boolean devolucion(int indice) {
		 
		 Boolean devuelto;
		 int numEjempPresD = libros[indice].getNumEjempPres();
		
		 if (numEjempPresD > 0) {
			
			 libros[indice].setNumEjempPres(--numEjempPresD);			 									
			 System.out.println("Devuelto " + libros[indice].getTitulo());
			 devuelto = true;
		 }
		 else{
			
			 System.out.println("No pueden devolverse mas " + libros[indice].getTitulo());
			 devuelto = false;
		
		 } 	
		 return devuelto;
	}
	//Constructor por defecto
	 public Libro() {
		
		 this("","",0,0);
	}
	//Constructor con parametros
	 public Libro(String autor, String titulo, int numEjemp, int numEjempPres) {
		
		 this.titulo = titulo;
		 this.autor = autor;
		 this.numEjemp = numEjemp;
		 this.numEjempPres = numEjempPres;
	}
	//Métodos getters ans setters	
	 public String getTitulo() {
		 return titulo;
	 }
	 public void setTitulo(String titulo) {
		 this.titulo = titulo;
	 }
	 public String getAutor() {
		 return autor;
	 }
	 public void setAutor(String autor) {
		 this.autor = autor;
	 }
	 public int getNumEjemp() {
		 return numEjemp;
	 }
	 public void setNumEjemp(int numEjemp) {
		 this.numEjemp = numEjemp;
	 }
	 public int getNumEjempPres() {
		 return numEjempPres;
	 }
	 public void setNumEjempPres(int numEjempPres) {
		 this.numEjempPres = numEjempPres;		
	 }
	 public static Libro[] getLibros() {
		 return libros;
	 }
	 public static void setLibros(Libro[] libros) {
		 Libro.libros = libros;
	 }
	 public static int getLengthArray() {
		 return lengthArray;
	 }
	 public static void setLengthArray(int lengthArray) {
		 Libro.lengthArray = lengthArray;
	 }
	//Método toString
	 @Override
	 public String toString() {
		 return "Libro [getTitulo()=" + getTitulo() + ", getAutor()=" + getAutor() + ", getNumEjemp()=" + getNumEjemp()
				+ ", getNumEjempPres()=" + getNumEjempPres() + "]";
	 }
	 
}
