//asdf
package fuenteCalculadora;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Calculadora {
	
	public static void main(String[] args) {
		
		MarcoCalculadora mimarco = new MarcoCalculadora();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}
}
class MarcoCalculadora extends JFrame{
	public MarcoCalculadora() {		
		
		setTitle("Calculadora");
		setBounds(500,300,450,300);	
		
		Pantalla pantalla = new Pantalla();
		add(pantalla);	
		
		Botonera botonera = new Botonera();
		add(botonera);
	}
}
class Pantalla extends JPanel{
	
	JButton pantalla;
	public Pantalla() {
		
		setLayout(new BorderLayout());
		pantalla = new JButton("0");
		add(pantalla,BorderLayout.NORTH);
		pantalla.setEnabled(false);
	}
}
class Botonera extends Pantalla{
	String ultimoParametro= "=";
	double resultado;
	
	boolean principio = true;
	private JPanel botones = new JPanel();
	public Botonera() {		
		
		botones.setLayout(new GridLayout(4,4));
		add(botones,BorderLayout.CENTER);		
		//JButton boton1 = new JButton("1");
		//botones.add(boton1);
		ActionListener insertar = new InsertaNumero();
		ActionListener operacion = new Operaciones();
		ponerBoton("7",insertar);
		ponerBoton("8",insertar);
		ponerBoton("9",insertar);
		ponerBoton("/",operacion);
		ponerBoton("4",insertar);
		ponerBoton("5",insertar);
		ponerBoton("6",insertar);
		ponerBoton("*",operacion);
		ponerBoton("1",insertar);
		ponerBoton("2",insertar);
		ponerBoton("3",insertar);
		ponerBoton("-",operacion);
		ponerBoton("0",insertar);
		ponerBoton(".",insertar);
		ponerBoton("=",operacion);
		ponerBoton("+",operacion);
	}
	public void ponerBoton(String rotulo, ActionListener oyente) {
		
		JButton boton=new JButton(rotulo);
		botones.add(boton);
		boton.addActionListener(oyente);
		
	}	
	private class InsertaNumero implements ActionListener{	
		
		public void actionPerformed(ActionEvent e) {
			
			String entrada=e.getActionCommand();
			if (principio) {
				pantalla.setText("");
				principio=false;
			}
			pantalla.setText(pantalla.getText() + entrada);
			
		}
		
	}
	private class Operaciones implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			String parametro = e.getActionCommand();			
			calcular(Double.parseDouble(pantalla.getText()));
			principio = true;
			ultimoParametro = parametro;
			
		}
		
		void calcular (double x) {
			
			switch (ultimoParametro) {
			case "+":resultado += x;break;
			case "-":resultado -= x;break;
			case "*":resultado *= x;break;
			case "/":resultado /= x;break;
			case "=":resultado = x;break;				
			}
			/*
			if (ultimoParametro.equals("+")) {
				resultado += x;				
			}
			else if(ultimoParametro.equals("-")){
				resultado-=x;}
			else if(ultimoParametro.equals("*")){
				resultado*=x;}
			else if(ultimoParametro.equals("/")){
				resultado/=x;}
			else if(ultimoParametro.equals("=")){
				resultado=x;}*/
			System.out.println(resultado);
			pantalla.setText(""+resultado);
			
					
			
		}
		
	}
	
	
}