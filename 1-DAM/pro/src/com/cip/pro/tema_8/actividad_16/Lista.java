package com.cip.pro.tema_8.actividad_16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//La librería iTextPDF es una librería OpenSource para crear y manipular documentos CSV. La URL en Maven Central es:
//https://mvnrepository.com/artifact/com.opencsv/opencsv
import com.itextpdf.text.Chunk; 
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Paragraph;

public class Lista {
	/**
	 * @param args
	 * @param static Scanner sc;
	 * @param static int teclado;
	 */
	static Scanner sc;	
	static String teclado;
	public static void main(String[] args) throws IOException  {
		
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
				+ "8.Guardar\n"
				+ "9.Guardar PDF\n"
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
				case "8": guardar(d); break;
				case "9": guardarPDF(d); break;
			}			
			
		} while (!teclado.equals("0")); System.out.println("Fin."); sc.close();		
	}
	/**
	 * @carga miembros de la lista
	 */	
	public static void cargar(ArrayList<Persona> cargar) {
		
		String csvFile = "src/com/cip/pro/tema_8/actividad_16/lista.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				
			String[] campo = line.split(cvsSplitBy);			
			cargar.add(new Persona(campo[0],campo[1],Integer.parseInt(campo[2].trim()),Integer.parseInt(campo[3].trim())
					,campo[4],Integer.parseInt(campo[5].trim()),Integer.parseInt(campo[6].trim()),campo[7]));
			}
		
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}
		System.out.println("*****************************\n"
					     + "Lista cargada");
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
		int dni=0;
		do {
			
			try {				
				dni = Integer.parseInt(sc.nextLine());	
				
			}catch(Exception e){			
			System.out.print("inserta dni valido:");
			
			}
		}while(dni==0);
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
		System.out.print("Inserta n�mero: ");
		int num=0;
		do {
			
			try {			
				num = Integer.parseInt(sc.nextLine());	
				
			}catch(Exception e){			
			System.out.print("inserta n�mero valido:");
			
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
		
		System.out.println("Inserta el n�mero de la posici�n de la lista a eliminar"); 
		String tec = sc.nextLine();
		System.out.println("*****************************\n"
						 + eliminar.get(Integer.parseInt(tec)).getNombre()+" ha sido eliminado"); 
		eliminar.remove(Integer.parseInt(tec));
	}
	/**
	 * @return n�mero de personas en lista
	 */	
	public static void contar(ArrayList<Persona> contar) {
		
		System.out.println("*****************************\n"
		         		 + "Hay "+contar.size()+" personas en la lista");
	}
	/**
	 * @return 
	 * @Buscar por dni o nombre
	 */	
	public static Object buscar(ArrayList<Persona> buscar) {
		
		System.out.print("Insertar dni o nombre a buscar:");
		String teclado = sc.nextLine();
		boolean encontrado = false;		
		for(Persona p: buscar) {
				
			if(teclado.equals(Integer.toString(p.getDni())) || teclado.equals(p.getNombre())) {
								
				System.out.println("*****************************\n"
				         		  + p.toString());
				encontrado = true;
			}	
		}
		if(!encontrado)System.out.println("*****************************\n"
		         						+ "No encontrado");return null;
	}	
	/**
	 * @Ordenar lista por apellido alfabeticamente
	 */	
	public static void ordenar(ArrayList<Persona> ordenar) {
		
		Collections.sort(ordenar); 
		System.out.println("*****************************\n"
				         + "Lista ordenada por apellido "
				         + "\nalfab�ticamente.");
	}
	/**
	 * @Guardar lista.csv
	 */	
	public static void guardar(ArrayList<Persona> guardar) throws IOException{

		String archivo = "src/com/cip/pro/tema_8/actividad_16/lista.csv";
		BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));	
		try {
			
			for(Persona i: guardar) {
				
				bw.append(i.toString().replace("\n","").replace("Nombre: ","")
						.replace(" Dni: ","").replace(" Edad: ","").replace("Calle: ","")
						.replace(" Numero: ","").replace(" Cp: ","").replace(" Apellidos: ",""));
				bw.append("\n");
			}
			System.out.println("*****************************\n"
			         		 + "Lista.csv guardada");			
		}catch(Exception e) {
			
			System.out.println("*****************************\n"
			         		 + "Error al guardar");
		}		
		bw.close();
	}
	/**
	 * @Guardar lista.pdf
	 */	
	public static void guardarPDF(ArrayList<Persona> guardarPDF) {
		try {
						
			Document document = new Document();			
			FileOutputStream outputStream = new FileOutputStream(
					new File("src/com/cip/pro/tema_8/actividad_16/Usuarios.pdf"));			
			PdfWriter.getInstance(document, outputStream);			
			document.open();			
			document.add(new Paragraph("LISTADO:"));
			document.add(Chunk.NEWLINE);			
			for (Persona persona: guardarPDF) {
						
				document.add(new Paragraph(persona.toString()));
				document.add(Chunk.NEWLINE);
			}			
			document.close();
			outputStream.close();
			System.out.println("*****************************\n" 
							 + "Documento PDF creado.");
		} catch (Exception e) {
			
		e.printStackTrace();
		}		
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
	private int cp;
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
	private int dni;
	private int edad;
	
	/**
	 * Constructor Persona(String nombre, String apellidos, String dni, int edad, String calle,int numero, int cp, String provincia)
	 */	
	Persona(String nombre, String apellidos, int dni, int edad, String calle,int numero, int cp, String provincia){
		
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
	public int getDni() {
		
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(int dni) {
		
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
		
		return "Nombre: " + getNombre() + ", Apellidos: " + getApellidos() + ", Dni: " + getDni()
				+ ", Edad: " + getEdad() + ",\nCalle: " + getCalle() + ", Numero: " + getNumero()
				+ ", Cp: " + getCp() + ", Provincia: " + getProvincia();
	}	
	/**
	 * @compareTo m�todo de interface Comparable
	 */
	@Override
	public int compareTo(Persona o) {
		
		return apellidos.compareTo(o.getApellidos().toLowerCase());
	}
}
