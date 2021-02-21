/**
 * 
 */
package com.cip.pro.tema_7.actividad_11;



/**
 * @author Esteban
 *
 */
public class EstudianteInt extends Estudiante{

	/**
	 * @param args
	 */
	private boolean esErasmus;
	private String nacionalidad;
	private static Persona alumno[];
	public static void main(String[] args) {
		
		alumno = new Persona [5];
		alumno[0] = new Estudiante("Jaime", "calle Pamplona nº3", "4565");
		alumno[0].setEdad(20);
		alumno[1] = new Estudiante("frank", "calle Alcala nº7", "4df5");
		alumno[1].setEdad(17);
		alumno[2] = new EstudianteInt("Reven", "calle fran nº5", "4ddd", false,"inglés");
		alumno[2].setEdad(25);
		((EstudianteInt) alumno[2]).esErasmus(2);
		alumno[3] = new EstudianteInt("Jimmy", "calle Mecha nº1", "asd5", false, "francés");
		alumno[3].setEdad(23);
		((EstudianteInt) alumno[3]).esErasmus(3);
		alumno[4] = new EstudianteInt("Arturo", "calle Nicho nº10", "4ry5", false, "americano");
		alumno[4].setEdad(19);
		((EstudianteInt) alumno[4]).esErasmus(4);
		System.out.println(alumno[2].getNombre()+" Erasmus=" + ((EstudianteInt) alumno[2]).esEuropeo());
		System.out.println(alumno[2].getNombre()+" Descuento="+ ((EstudianteInt) alumno[2]).descuentoParaJovenes(2));
		System.out.println(alumno[3].getNombre()+" Erasmus=" + ((EstudianteInt) alumno[3]).esEuropeo());
		System.out.println(alumno[3].getNombre()+" Descuento="+ ((EstudianteInt) alumno[3]).descuentoParaJovenes(3));
		System.out.println(alumno[4].getNombre()+" Erasmus=" + ((EstudianteInt) alumno[4]).esEuropeo());
		System.out.println(alumno[4].getNombre()+" Descuento="+ ((EstudianteInt) alumno[4]).descuentoParaJovenes(4));
		
	}
	//Constructor predeterminado
	public EstudianteInt() {
		
		super();
		esErasmus = false;
		nacionalidad = "";
	}
	//Constructor con parametros
	public EstudianteInt(String nombre,String direccion,String codigo, boolean esErasmus, String nacionalidad)
	{
		
		//his.nombre = nombre;
		//this.direccion = direccion;
		//this.codigo = codigo;
		super(nombre,direccion,codigo);
		this.esErasmus = esErasmus;
		this.nacionalidad = nacionalidad;
		
	}

	//Métodos getters and setters
	/**
	 * @return the esErasmus
	 */
	public boolean esErasmus(int indice) {
		String a = ((EstudianteInt) alumno[indice]).getNacionalidad();
		
		if(a != "americano" && a != "") {
			
			esErasmus = true;
		}
		else {
			
			esErasmus = false;
		}
		return esErasmus;
	}
	/**
	 * @param esErasmus the esErasmus to set
	 */
	public void setEsErasmus(boolean esErasmus) {		
		this.esErasmus = esErasmus;
	}
	/**
	 * @return the nacionalidad
	 */
	public  String getNacionalidad() {
		return nacionalidad;
	}
	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public  void setNacionalidad(String nacionalidad) {
		String a = nacionalidad;
		if(a == "inglés" || a =="francés" || a == "portugués" || a == "americano") {
			
		this.nacionalidad = nacionalidad;
		}
		else {
			
			System.out.println("Nacionalidad invalidad");
		}
	}
	//Método esEuropeo
	private  boolean esEuropeo() {
		boolean esEuropeo;
		
		if (nacionalidad != "americano" && nacionalidad != "") {
			
			esEuropeo = true;
		}
		else {
			
			esEuropeo = false;
		}
		return esEuropeo;
	}
	//Método descuento para jovenes
	public boolean descuentoParaJovenes(int indice) {
		boolean descuento;
		//edad = getEdad();
		if(alumno[indice].getEdad() < 25 && ((EstudianteInt) alumno[indice]).esErasmus(indice)) {
			
			descuento = true;			
		}
		else {
			
			descuento = false;
		}
		return descuento;
	}
	//Método toString
	@Override
	public String toString() {
		return "EstudianteInt [esErasmus=" + esErasmus + ", nacionalidad=" + nacionalidad + "]";
	}
	
	
}
