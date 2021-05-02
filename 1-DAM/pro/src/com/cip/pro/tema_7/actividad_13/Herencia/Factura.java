/**
 * 
 */
package com.cip.pro.tema_7.actividad_13.Herencia;

/**
 * @author Esteban
 *
 */
public class Factura extends Precio {

	/**
	 * @param args
	 */
	public  String emisor="Empresa S.A.";;
	public String cliente = "Alberto";
	public static void main(String[] args) {		
		
	   Factura p = new Factura();
	   p.setEuros(50);
	   p.imprimirFactura();
	}	
	public void imprimirFactura() {
	
			System.out.print("Factura de "+emisor+"\npara cliente "
			+cliente+"\nimporte "+ euros+" euros");
	}
}
