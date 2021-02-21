package com.cip.pro.tema_8.actividad_14;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
/**
* Practica con ArrayList
* @author Antonio Esteban Pestana Guerra
* @version 1.0
* @since 15-02-2021 
*/
public class Lista {
	/**
	 * @param args
	 * @param static Scanner sc;
	 * @param static int teclado;
	 */
	static Scanner sc;
	static String teclado;
	public static void main(String[] args) {
		
		ArrayList<Persona> d = new ArrayList<Persona>();
		sc = new Scanner(System.in);		
		do {
			
			System.out.print(
				  "*****************************\n"
				+ "1.Cargar lista\n"
				+ "2.Mostrar lista\n"
				+ "3.Insertar persona\n"
				+ "4.Eliminar persona\n"
				+ "5.Numero de personas en lista\n"
				+ "6.Buscar\n"
				+ "7.Ordenar lista\n"
		        + "0.Fin\n");
			
			teclado = sc.nextLine();					
			switch (teclado) {
			
				case "1": cargar(d); break;
				case "2": listar(d); break;
				case "3": insertar(d); break;
				case "4": eliminar(d); break;
				case "5": contar(d); break;
				case "6": buscar(d); break;
				case "7": ordenar(d); break;
			}			
			
		} while (!teclado.equals("0")); System.out.println("Fin."); sc.close();		
	}	
	/**
	 * @lista de almacenamiento
	 */	
	public static void lista(ArrayList<Persona> lista) {
		
		lista.add(new Persona("Adrián", "García Santos", "11111111A", 23, "C/ Los Olivos", 3, 38493, "Santa Cruz de Tenerife"));
		lista.add(new Persona("Ana", "Méndez Núñéz", "22222222B", 22, "C/ Los Pinos", 25, 38403, "Santa Cruz de Tenerife"));
		lista.add(new Persona("María", "Sánchez Camacho", "33333333C", 45, "C/ Los Franceses", 23, 38505, "Las Palmas"));
		lista.add(new Persona("Julio", "Brito Gonzáles", "44444444D", 30, "C/ Los Pinos", 25, 38403, "Las Palmas"));	    	   
	}
	/**
	 * @carga miembros de la lista
	 */	
	public static void cargar(ArrayList<Persona> cargar) {
		
		lista(cargar);
		System.out.println("*****************************\n"
					     + "Lista cargada.");
	}
	/**
	 * @muestra miembros de la lista
	 */	
	public static void listar(ArrayList<Persona> listar) {
		
		for(Persona i: listar) {
			
			System.out.println("*****************************\n"
					  		  + i.toString());
		}
	}
	/**
	 * @inserta miembro a la lista
	 */	
	public static void insertar(ArrayList<Persona> insert) {				
		
		System.out.print("Inserta nombre: ");
		String nom = sc.nextLine();
		System.out.print("Inserta apellidos: ");
		String ape = sc.nextLine();
		System.out.print("Inserta dni: ");
		String dni = sc.nextLine();
		System.out.print("Inserta edad: ");
		int eda=0;
		do {
			
			try {
				eda = Integer.parseInt(sc.nextLine());
		
			}catch(Exception e){
			System.out.print("inserta edad valida:");
			
			}
		}while(eda==0);
		System.out.print("Inserta calle: ");
		String cal = sc.nextLine();
		System.out.print("Inserta número: ");
		int num=0;
		do {
			
			try {			
				num = Integer.parseInt(sc.nextLine());	
				
			}catch(Exception e){			
			System.out.print("inserta número valido:");
			
			}
		}while(num==0);
		System.out.print("Inserta CP: ");
		int cp=0;
		do {
			
			try {			
				cp = Integer.parseInt(sc.nextLine());	
				
			}catch(Exception e){			
			System.out.print("inserta CP valido:");
			
			}
		}while(cp==0);
		System.out.print("Inserta provincia: ");
		String pro = sc.nextLine();
		insert.add(new Persona(nom, ape, dni, eda, cal, num, cp, pro));
		System.out.println("*****************************\n"
				         + insert.get(insert.size()-1).getNombre()+" ha sido insertado");
	}
	/**
	 * @elimina miembro de la lista
	 */	
	public static void eliminar(ArrayList<Persona> eliminar) {
		
		System.out.println("Inserta el número de la posición de la lista a eliminar"); 
		String tec = sc.nextLine();
		System.out.println("*****************************\n"
						 + eliminar.get(Integer.parseInt(tec)).getNombre()+" ha sido eliminado"); 
		eliminar.remove(Integer.parseInt(tec));
	}
	/**
	 * @return número de personas en lista
	 */	
	public static void contar(ArrayList<Persona> contar) {
		
		System.out.println("*****************************\n"
		         		 + "Hay "+contar.size()+" personas en la lista");
	}
	/**
	 * @Buscar por dni
	 */	
	public static void buscar(ArrayList<Persona> buscar) {
		
		System.out.print("Insertar dni a buscar:");
		String teclado = sc.nextLine();
		boolean encontrado = false;
		for(Persona p: buscar) {
				
			if(teclado.equals(p.getDni())) {
								
				System.out.println("*****************************\n"
				         		  + p.toString());
				encontrado = true;
			}	
		}
		if(!encontrado)System.out.println("*****************************\n"
		         						+ "No encontrado");
	}
	/**
	 * @Ordenar lista por apellido alfabeticamente
	 */	
	public static void ordenar(ArrayList<Persona> ordenar) {
		
		Collections.sort(ordenar); 
		System.out.println("*****************************\n"
		         + "Lista ordenada por apellido "
		         + "\nalfabéticamente.");
	}	
}
class Direccion{
	/**
	 * @param private String calle;	
	 * @param private int numero;
	 * @param private int cp;
	 * @param private String provincia;
	 */
	private String calle;
	private int numero;
	private Integer cp;
	private String provincia;
	/**
	 * Constructor Direccion(String calle,int numero, int cp, String provincia)
	 */	
	Direccion(String calle,int numero, int cp, String provincia){
		
		this.calle = calle;
		this.numero = numero;
		this.cp = cp;
		this.provincia = provincia;
	}
	/**
	 * @return the calle
	 */
	public String getCalle() {
		
		return calle;
	}

	/**
	 * @param calle the calle to set
	 */
	public void setCalle(String calle) {
		
		this.calle = calle;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		
		this.numero = numero;
	}

	/**
	 * @return the cp
	 */
	public int getCp() {
		
		return cp;
	}

	/**
	 * @param cp the cp to set
	 */
	public void setCp(int cp) {
		
		this.cp = cp;
	}

	/**
	 * @return the provincia
	 */
	public String getProvincia() {
		
		return provincia;
	}

	/**
	 * @param provincia the provincia to set
	 */
	public void setProvincia(String provincia) {
		
		this.provincia = provincia;
	}
}
class Persona extends Direccion implements Comparable<Persona>{	
	/**
	 * Class Persona
	 * @param private Strin nombre
	 * @param private String apellido
	 * @param private String dni
	 * @param private int edad
	 */
	private String nombre;
	private String apellidos;
	private String dni;
	private Integer edad;
	/**
	 * Constructor Persona(String nombre, String apellidos, String dni, int edad, String calle,int numero, int cp, String provincia)
	 */	
	Persona(String nombre, String apellidos, String dni, int edad, String calle,int numero, int cp, String provincia){
		
		super(calle, numero, cp, provincia);
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;		
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		
		this.apellidos = apellidos;
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		
		this.dni = dni;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		
		this.edad = edad;
	}		
	/**
	 * @return toString
	 */
	@Override
	public String toString() {
		
		return "Datos [getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getDni()=" + getDni()
				+ ", getEdad()=" + getEdad() + ", getCalle()=" + getCalle() + ", getNumero()=" + getNumero()
				+ ", getCp()=" + getCp() + ", getProvincia()=" + getProvincia() + "]";
	}	
	/**
	 * @compareTo método de interface Comparable
	 */
	@Override
	public int compareTo(Persona o) {
		
		return apellidos.compareTo(o.getApellidos().toLowerCase());
	}	
}

