package com.cip.pro.tema_7.actividad_13.ClassAbstract;

public abstract class Animal {
	
	private String nombre;
	public Animal(String nombre) {
	this.nombre = nombre;
	}
	public String habla() {
	return nombre + " dice " + sonido();
	}
	public abstract String sonido();
}
