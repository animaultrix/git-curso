package calculadora;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.LineBorder;

public class Calculadora {

	private JFrame frmCalculadora;
	private JTextField textFieldAbajo;
	private JTextField textFieldArriba;
	private JLabel operacion;

	/**
	 * Lanzar aplicación.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Crear aplicación
	 */
	public Calculadora() {
		initialize();		
	}

	/**
	 * Iniciar Jframe.
	 */
	private void initialize() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int x = screenSize.width/2 - 166;
		int y = screenSize.height/2 - 215;
		frmCalculadora = new JFrame();		
		//frmCalculadora.setIconImage(Toolkit.getDefaultToolkit().getImage("src\\calculadora\\Icono_Calculadora(128x128x128).png"));
		frmCalculadora.setIconImage(new ImageIcon(getClass().getResource("/calculadora/Icono_Calculadora(128x128x128).png")).getImage());
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setResizable(false);
		frmCalculadora.setBounds(x, y, 332, 430);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		/**
		 * Iniciar Pantalla.
		 */
		
		textFieldArriba = new JTextField();
		textFieldArriba.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 20));
		textFieldArriba.setFocusable(false);
		textFieldArriba.setFocusTraversalKeysEnabled(false);
		textFieldArriba.setDisabledTextColor(Color.GRAY);
		textFieldArriba.setBorder(null);
		textFieldArriba.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldArriba.setColumns(10);
		textFieldArriba.setBounds(37, 39, 233, 27);
		frmCalculadora.getContentPane().add(textFieldArriba);
		
		textFieldAbajo = new JTextField();
		textFieldAbajo.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 20));
		textFieldAbajo.setFocusable(false);
		textFieldAbajo.setFocusTraversalKeysEnabled(false);
		textFieldAbajo.setToolTipText("");
		textFieldAbajo.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldAbajo.setBorder(null);
		textFieldAbajo.setColumns(10);
		textFieldAbajo.setBounds(37, 83, 233, 27);
		frmCalculadora.getContentPane().add(textFieldAbajo);		
		
		textFieldAbajo.setText("0");
		
		operacion = new JLabel("");
		operacion.setHorizontalAlignment(SwingConstants.CENTER);
		operacion.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		operacion.setFocusTraversalKeysEnabled(false);
		operacion.setFocusable(false);
		operacion.setHorizontalTextPosition(SwingConstants.CENTER);
		operacion.setBounds(251, 63, 20, 20);
		frmCalculadora.getContentPane().add(operacion);
		
				
		JEditorPane editorPane = new JEditorPane();
		editorPane.setFocusable(false);
		editorPane.setFocusTraversalKeysEnabled(false);
		editorPane.setFocusCycleRoot(false);
		editorPane.setBorder(new LineBorder(new Color(128, 128, 128), 2, true));
		editorPane.setBounds(33, 33, 250, 83);
		frmCalculadora.getContentPane().add(editorPane);
		
		/**
		 * Iniciar Botones.
		 */
		
		MyButton btnNewButton_igual = new MyButton("=");
		btnNewButton_igual.setPressedBackgroundColor(new Color(142, 142, 142));
		btnNewButton_igual.setBorder(new LineBorder(new Color(92, 92, 92)));
		btnNewButton_igual.setRolloverEnabled(false);	
		btnNewButton_igual.setFocusable(false);
		btnNewButton_igual.setForeground(new Color(0, 0, 0));
		btnNewButton_igual.setBackground(new Color(192, 192, 192));
		btnNewButton_igual.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
		btnNewButton_igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textFieldAbajo.getText().equals("")) {
					int posFinal = textFieldAbajo.getText().length()-1; //Restas uno para obtener el índice del ultimo caracter
					char caracterFinal = textFieldAbajo.getText().charAt(posFinal);//obtienes el carácter de dicha posición
					if (caracterFinal == '.') {
						String str = textFieldAbajo.getText();
						str = str.substring(0, str.length()-1);
						textFieldAbajo.setText(str);
					}
				}
				if (!textFieldArriba.getText().equals("") && !textFieldAbajo.getText().equals("") && !operacion.getText().equals("")) {
					double num1 = Double.parseDouble(textFieldArriba.getText());
					double num2 = Double.parseDouble(textFieldAbajo.getText());							
					if (operacion.getText().contains("-")) {
						double resta = num1-num2;
						if(resta - (int)resta == 0.0) {
						textFieldArriba.setText(String.valueOf((int)resta));
						}else textFieldArriba.setText(String.valueOf(resta));
					}else if(operacion.getText().contains("+")) {
						double suma = num1+num2;
						if(suma - (int)suma == 0.0) {
						textFieldArriba.setText(String.valueOf((int)suma));
						}else textFieldArriba.setText(String.valueOf(suma));
					}else if(operacion.getText().contains("÷")) {
						double dividir = num1/num2;
						if(dividir - (int)dividir == 0.0) {
						textFieldArriba.setText(String.valueOf((int)dividir));
						}else textFieldArriba.setText(String.valueOf(dividir));
					}else if(operacion.getText().contains("x")) {
						double multiplicar = num1*num2;
						if(multiplicar - (int)multiplicar == 0.0) {
						textFieldArriba.setText(String.valueOf((int)multiplicar));
						}else textFieldArriba.setText(String.valueOf(multiplicar));
					}
					textFieldAbajo.setText("");
					operacion.setText("");
				}
				if (operacion.getText().equals("") && !textFieldAbajo.getText().equals("")) {
					textFieldArriba.setText(textFieldAbajo.getText());
					textFieldAbajo.setText("");
				}
			}			
		});
		btnNewButton_igual.setBounds(163, 325, 120, 33);
		frmCalculadora.getContentPane().add(btnNewButton_igual);
		
		MyButton btnNewButton_clear = new MyButton("C");
		btnNewButton_clear.setPressedBackgroundColor(new Color(154, 52, 52));
		btnNewButton_clear.setBorder(new LineBorder(new Color(104, 02, 02)));
		btnNewButton_clear.setRolloverEnabled(false);
		btnNewButton_clear.setFocusable(false);
		btnNewButton_clear.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnNewButton_clear.setBackground(new Color(204, 102, 102));
		btnNewButton_clear.setForeground(new Color(235, 235, 235));
		btnNewButton_clear.setFont(new Font("Microsoft JhengHei", Font.BOLD, 17));
		btnNewButton_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldArriba.setText("");
				textFieldAbajo.setText("0");
				operacion.setText("");
			}
		});
		btnNewButton_clear.setBounds(163, 149, 55, 33);
		frmCalculadora.getContentPane().add(btnNewButton_clear);
		
		MyButton btnNewButton_restar = new MyButton("-");
		btnNewButton_restar.setPressedBackgroundColor(new Color(142, 142, 142));
		btnNewButton_restar.setBorder(new LineBorder(new Color(92, 92, 92)));
		btnNewButton_restar.setRolloverEnabled(false);		
		btnNewButton_restar.setFocusable(false);
		btnNewButton_restar.setForeground(new Color(0, 0, 0));
		btnNewButton_restar.setBackground(new Color(192, 192, 192));
		btnNewButton_restar.setFont(new Font("Microsoft JhengHei", Font.BOLD, 27));
		btnNewButton_restar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if (!textFieldAbajo.getText().equals("") && !textFieldArriba.getText().equals("") && !operacion.getText().equals("")) {
					btnNewButton_igual.doClick();
					operacion.setText("-");
				}else if(textFieldAbajo.getText().equals("")) {
					operacion.setText(e.getActionCommand());
				}else {
					textFieldArriba.setText(textFieldAbajo.getText());
					operacion.setText("-");
					textFieldAbajo.setText("");
				}
			}
		});
		btnNewButton_restar.setBounds(228, 149, 55, 33);
		frmCalculadora.getContentPane().add(btnNewButton_restar);
		
		MyButton btnNewButton_sumar = new MyButton("+");
		btnNewButton_sumar.setBorder(new LineBorder(new Color(142, 142, 142)));
		btnNewButton_sumar.setPressedBackgroundColor(new Color(142, 142, 142));
		btnNewButton_sumar.setBorder(new LineBorder(new Color(92, 92, 92)));
		btnNewButton_sumar.setRolloverEnabled(false);	
		btnNewButton_sumar.setFocusable(false);
		btnNewButton_sumar.setForeground(new Color(0, 0, 0));
		btnNewButton_sumar.setBackground(new Color(192, 192, 192));
		btnNewButton_sumar.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
		btnNewButton_sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!textFieldAbajo.getText().equals("") && !textFieldArriba.getText().equals("") && !operacion.getText().equals("")) {
					btnNewButton_igual.doClick();
					operacion.setText("+");
				}else if (textFieldAbajo.getText().equals("")) {
					operacion.setText("+");
				}else {
					textFieldArriba.setText(textFieldAbajo.getText());
					operacion.setText("+");
					textFieldAbajo.setText("");
				}
			}
		});
		btnNewButton_sumar.setBounds(228, 193, 55, 33);
		frmCalculadora.getContentPane().add(btnNewButton_sumar);
		
		MyButton btnNewButton_dividir = new MyButton("÷");
		btnNewButton_dividir.setPressedBackgroundColor(new Color(142, 142, 142));
		btnNewButton_dividir.setBorder(new LineBorder(new Color(92, 92, 92)));
		btnNewButton_dividir.setRolloverEnabled(false);	
		btnNewButton_dividir.setFocusable(false);
		btnNewButton_dividir.setForeground(new Color(0, 0, 0));
		btnNewButton_dividir.setBackground(new Color(192, 192, 192));
		btnNewButton_dividir.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!textFieldAbajo.getText().equals("") && !textFieldArriba.getText().equals("") && !operacion.getText().equals("")) {
					btnNewButton_igual.doClick();
					operacion.setText("÷");
				}else if (textFieldAbajo.getText().equals("")) {
					operacion.setText("÷");
				}else {
					textFieldArriba.setText(textFieldAbajo.getText());
					operacion.setText("÷");
					textFieldAbajo.setText("");
				}
			}
		});
		btnNewButton_dividir.setBounds(228, 237, 55, 33);
		frmCalculadora.getContentPane().add(btnNewButton_dividir);
		
		MyButton btnNewButton_multiplicar = new MyButton("x");
		btnNewButton_multiplicar.setPressedBackgroundColor(new Color(142, 142, 142));
		btnNewButton_multiplicar.setBorder(new LineBorder(new Color(92, 92, 92)));
		btnNewButton_multiplicar.setRolloverEnabled(false);
		btnNewButton_multiplicar.setFocusable(false);
		btnNewButton_multiplicar.setForeground(new Color(0, 0, 0));
		btnNewButton_multiplicar.setBackground(new Color(192, 192, 192));
		btnNewButton_multiplicar.setFont(new Font("Microsoft JhengHei", Font.BOLD, 19));
		btnNewButton_multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!textFieldAbajo.getText().equals("") && !textFieldArriba.getText().equals("") && !operacion.getText().equals("")) {
					btnNewButton_igual.doClick();
					operacion.setText("x");
				}else if (textFieldAbajo.getText().equals("")) {
					operacion.setText("x");
				}else {
					textFieldArriba.setText(textFieldAbajo.getText());
					operacion.setText("x");
					textFieldAbajo.setText("");
				}
			}
		});
		btnNewButton_multiplicar.setBounds(228, 281, 55, 33);
		frmCalculadora.getContentPane().add(btnNewButton_multiplicar);
		
		MyButton btnNewButton_punto = new MyButton(".");
		btnNewButton_punto.setPressedBackgroundColor(new Color(170, 170, 170));
		btnNewButton_punto.setBorder(new LineBorder(new Color(120, 120, 120)));
		btnNewButton_punto.setRolloverEnabled(false);	
		btnNewButton_punto.setFocusable(false);
		btnNewButton_punto.setForeground(new Color(0, 0, 0));
		btnNewButton_punto.setBackground(new Color(220, 220, 220));
		btnNewButton_punto.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
		btnNewButton_punto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textFieldAbajo.getText().equals(""))textFieldAbajo.setText(textFieldAbajo.getText()+".");
				else textFieldAbajo.setText("0.");
			}
		});
		btnNewButton_punto.setBounds(98, 325, 55, 33);
		frmCalculadora.getContentPane().add(btnNewButton_punto);
				
		MyButton btnNewButton_0 = new MyButton("0");
		btnNewButton_0.setPressedBackgroundColor(new Color(170, 170, 170));
		btnNewButton_0.setBorder(new LineBorder(new Color(120, 120, 120)));
		btnNewButton_0.setRolloverEnabled(false);	
		btnNewButton_0.setFocusable(false);		
		btnNewButton_0.setForeground(new Color(0, 0, 0));
		btnNewButton_0.setBackground(new Color(220, 220, 220));
		btnNewButton_0.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 20));
		btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(textFieldAbajo.getText().equals("0")) textFieldAbajo.setText("");
				textFieldAbajo.setText(textFieldAbajo.getText()+0);				
			}
		});
		btnNewButton_0.setBounds(33, 325, 55, 33);
		frmCalculadora.getContentPane().add(btnNewButton_0);
		
		MyButton btnNewButton_1 = new MyButton("1");
		btnNewButton_1.setPressedBackgroundColor(new Color(170, 170, 170));
		btnNewButton_1.setBorder(new LineBorder(new Color(120, 120, 120)));
		btnNewButton_1.setRolloverEnabled(false);	
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(220, 220, 220));
		btnNewButton_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldAbajo.getText().equals("0")) textFieldAbajo.setText("");
				textFieldAbajo.setText(textFieldAbajo.getText()+1);
			}
		});
		btnNewButton_1.setBounds(33, 281, 55, 33);
		frmCalculadora.getContentPane().add(btnNewButton_1);
		
		MyButton btnNewButton_2 = new MyButton("2");
		btnNewButton_2.setPressedBackgroundColor(new Color(170, 170, 170));
		btnNewButton_2.setBorder(new LineBorder(new Color(120, 120, 120)));
		btnNewButton_2.setRolloverEnabled(false);	
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBackground(new Color(220, 220, 220));
		btnNewButton_2.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldAbajo.getText().equals("0")) textFieldAbajo.setText("");
				textFieldAbajo.setText(textFieldAbajo.getText()+2);
			}
		});
		btnNewButton_2.setBounds(98, 281, 55, 33);
		frmCalculadora.getContentPane().add(btnNewButton_2);
		
		MyButton btnNewButton_3 = new MyButton("3");
		btnNewButton_3.setPressedBackgroundColor(new Color(170, 170, 170));
		btnNewButton_3.setBorder(new LineBorder(new Color(120, 120, 120)));
		btnNewButton_3.setRolloverEnabled(false);	
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setBackground(new Color(220, 220, 220));
		btnNewButton_3.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 20));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(textFieldAbajo.getText().equals("0")) textFieldAbajo.setText("");
				textFieldAbajo.setText(textFieldAbajo.getText()+3);
			}
		});
		btnNewButton_3.setBounds(163, 281, 55, 33);
		frmCalculadora.getContentPane().add(btnNewButton_3);
		
		MyButton btnNewButton_4 = new MyButton("4");
		btnNewButton_4.setPressedBackgroundColor(new Color(170, 170, 170));
		btnNewButton_4.setBorder(new LineBorder(new Color(120, 120, 120)));
		btnNewButton_4.setRolloverEnabled(false);	
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.setForeground(new Color(0, 0, 0));
		btnNewButton_4.setBackground(new Color(220, 220, 220));
		btnNewButton_4.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 20));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldAbajo.getText().equals("0")) textFieldAbajo.setText("");
				textFieldAbajo.setText(textFieldAbajo.getText()+4);
			}
		});
		btnNewButton_4.setBounds(33, 237, 55, 33);
		frmCalculadora.getContentPane().add(btnNewButton_4);
		
		MyButton btnNewButton_5 = new MyButton("5");
		btnNewButton_5.setPressedBackgroundColor(new Color(170, 170, 170));
		btnNewButton_5.setBorder(new LineBorder(new Color(120, 120, 120)));
		btnNewButton_5.setRolloverEnabled(false);	
		btnNewButton_5.setFocusable(false);
		btnNewButton_5.setForeground(new Color(0, 0, 0));
		btnNewButton_5.setBackground(new Color(220, 220, 220));
		btnNewButton_5.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 20));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldAbajo.getText().equals("0")) textFieldAbajo.setText("");
				textFieldAbajo.setText(textFieldAbajo.getText()+5);
			}
		});
		btnNewButton_5.setBounds(98, 237, 55, 33);
		frmCalculadora.getContentPane().add(btnNewButton_5);
				
		MyButton btnNewButton_6 = new MyButton("6");
		btnNewButton_6.setPressedBackgroundColor(new Color(170, 170, 170));
		btnNewButton_6.setBorder(new LineBorder(new Color(120, 120, 120)));
		btnNewButton_6.setRolloverEnabled(false);	
		btnNewButton_6.setFocusable(false);
		btnNewButton_6.setForeground(new Color(0, 0, 0));
		btnNewButton_6.setBackground(new Color(220, 220, 220));
		btnNewButton_6.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 20));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldAbajo.getText().equals("0")) textFieldAbajo.setText("");
				textFieldAbajo.setText(textFieldAbajo.getText()+6);
			}
		});
		btnNewButton_6.setBounds(163, 237, 55, 33);
		frmCalculadora.getContentPane().add(btnNewButton_6);
		
		MyButton btnNewButton_7 = new MyButton("7");
		btnNewButton_7.setPressedBackgroundColor(new Color(170, 170, 170));
		btnNewButton_7.setBorder(new LineBorder(new Color(120, 120, 120)));
		btnNewButton_7.setRolloverEnabled(false);	
		btnNewButton_7.setFocusable(false);
		btnNewButton_7.setForeground(new Color(0, 0, 0));
		btnNewButton_7.setBackground(new Color(220, 220, 220));
		btnNewButton_7.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 20));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldAbajo.getText().equals("0")) textFieldAbajo.setText("");
				textFieldAbajo.setText(textFieldAbajo.getText()+7);
			}
		});
		btnNewButton_7.setBounds(33, 193, 55, 33);
		frmCalculadora.getContentPane().add(btnNewButton_7);
		
		MyButton btnNewButton_8 = new MyButton("8");
		btnNewButton_8.setPressedBackgroundColor(new Color(170, 170, 170));
		btnNewButton_8.setBorder(new LineBorder(new Color(120, 120, 120)));
		btnNewButton_8.setRolloverEnabled(false);	
		btnNewButton_8.setFocusable(false);
		btnNewButton_8.setForeground(new Color(0, 0, 0));
		btnNewButton_8.setBackground(new Color(220, 220, 220));
		btnNewButton_8.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 20));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldAbajo.getText().equals("0")) textFieldAbajo.setText("");
				textFieldAbajo.setText(textFieldAbajo.getText()+8);
			}
		});
		btnNewButton_8.setBounds(98, 193, 55, 33);
		frmCalculadora.getContentPane().add(btnNewButton_8);
		
		MyButton btnNewButton_9 = new MyButton("9");
		btnNewButton_9.setPressedBackgroundColor(new Color(170, 170, 170));
		btnNewButton_9.setBorder(new LineBorder(new Color(120, 120, 120)));
		btnNewButton_9.setRolloverEnabled(false);	
		btnNewButton_9.setFocusable(false);
		btnNewButton_9.setForeground(new Color(0, 0, 0));
		btnNewButton_9.setBackground(new Color(220, 220, 220));
		btnNewButton_9.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 20));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldAbajo.getText().equals("0")) textFieldAbajo.setText("");
				textFieldAbajo.setText(textFieldAbajo.getText()+9);
			}
		});
		btnNewButton_9.setBounds(163, 193, 55, 33);
		frmCalculadora.getContentPane().add(btnNewButton_9);		
		
		/**
		 * Eventos de teclado.
		 */
		
		frmCalculadora.addKeyListener(new KeyAdapter() {					
			@Override
			public void keyPressed(KeyEvent e) {
				super.keyPressed(e);
				if (!textFieldAbajo.getText().equals("")) {
					if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {							
						String str = textFieldAbajo.getText();
						str = str.substring(0, str.length()-1);
						textFieldAbajo.setText(str);
						if(textFieldAbajo.getText().equals("")) textFieldAbajo.setText("0");
					}
				}if (e.getKeyCode() == KeyEvent.VK_ESCAPE || e.getKeyCode() == KeyEvent.VK_DELETE) {
					btnNewButton_clear.doClick();
				}if(e.getKeyCode() == KeyEvent.VK_SUBTRACT) {
					btnNewButton_restar.doClick();
				}if(e.getKeyCode() == KeyEvent.VK_ADD) {
					btnNewButton_sumar.doClick();
				}if(e.getKeyCode() == KeyEvent.VK_DIVIDE) {
					btnNewButton_dividir.doClick();
				}if(e.getKeyCode() == KeyEvent.VK_MULTIPLY) {
					btnNewButton_multiplicar.doClick();
				}if(e.getKeyCode() == KeyEvent.VK_DECIMAL) {
					btnNewButton_punto.doClick();
				}if(e.getKeyCode() == KeyEvent.VK_NUMPAD0) {
					btnNewButton_0.doClick();
				}if(e.getKeyCode() == KeyEvent.VK_NUMPAD1) {
					btnNewButton_1.doClick();
				}if(e.getKeyCode() == KeyEvent.VK_NUMPAD2) {
					btnNewButton_2.doClick();
				}if(e.getKeyCode() == KeyEvent.VK_NUMPAD3) {
					btnNewButton_3.doClick();
				}if(e.getKeyCode() == KeyEvent.VK_NUMPAD4) {
					btnNewButton_4.doClick();
				}if(e.getKeyCode() == KeyEvent.VK_NUMPAD5) {
					btnNewButton_5.doClick();
				}if(e.getKeyCode() == KeyEvent.VK_NUMPAD6) {
					btnNewButton_6.doClick();
				}if(e.getKeyCode() == KeyEvent.VK_NUMPAD7) {
					btnNewButton_7.doClick();
				}if(e.getKeyCode() == KeyEvent.VK_NUMPAD8) {
					btnNewButton_8.doClick();
				}if(e.getKeyCode() == KeyEvent.VK_NUMPAD9) {
					btnNewButton_9.doClick();
				}if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnNewButton_igual.doClick();
				}
			}
		});	
	}
	
	/**
	 * Modificar efectos jButon.
	 */
	
	class MyButton extends JButton {

        private Color hoverBackgroundColor;
        private Color pressedBackgroundColor;

        public MyButton() {
            this(null);
        }

        public MyButton(String text) {
            super(text);
            super.setContentAreaFilled(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            if (getModel().isPressed()) {
                g.setColor(pressedBackgroundColor);
            } else if (getModel().isRollover()) {
                g.setColor(hoverBackgroundColor);
            } else {
                g.setColor(getBackground());
            }
            g.fillRect(0, 0, getWidth(), getHeight());
            super.paintComponent(g);
        }

        @Override
        public void setContentAreaFilled(boolean b) {
        }

        public Color getHoverBackgroundColor() {
            return hoverBackgroundColor;
        }

        public void setHoverBackgroundColor(Color hoverBackgroundColor) {
            this.hoverBackgroundColor = hoverBackgroundColor;
        }

        public Color getPressedBackgroundColor() {
            return pressedBackgroundColor;
        }

        public void setPressedBackgroundColor(Color pressedBackgroundColor) {
            this.pressedBackgroundColor = pressedBackgroundColor;
        }
    }
}
