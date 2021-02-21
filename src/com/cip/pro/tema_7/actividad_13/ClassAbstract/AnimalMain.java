package com.cip.pro.tema_7.actividad_13.ClassAbstract;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal c = new Caballo("Pegasus");
		System.out.println(c.habla());
		Animal v = new Vaca("Alberta");
		System.out.println(v.habla());
		Animal o = new Oveja("Roberta");
		System.out.println(o.habla());
	}

}
