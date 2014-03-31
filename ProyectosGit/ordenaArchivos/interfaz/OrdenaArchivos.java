package ordenaArchivos.interfaz;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class OrdenaArchivos extends JFrame {

	private JPanel contentPane;
	private JTextPane TextAr;
	private JButton botonSelA;
	String ter;
	private JButton botonSelOr;
	private JButton botonSelDes;
	private JTextPane textOrigen;
	private JTextPane textDestino;
	JFileChooser jf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrdenaArchivos frame = new OrdenaArchivos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OrdenaArchivos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		TextAr = new JTextPane();
		TextAr.setText("Extension del archivo");
		TextAr.setBounds(28, 122, 416, 35);
		contentPane.add(TextAr);
		
		JLabel SelAr = new JLabel("Selecciona archivo");
		SelAr.setBounds(28, 87, 135, 24);
		contentPane.add(SelAr);
		
		botonSelA = new JButton("Seleccionar");
		botonSelA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser jf=new JFileChooser(".");
				jf.showDialog(contentPane,"seleccion");
				ter=jf.getSelectedFile().getName();
				ter=ter.substring(ter.lastIndexOf('.')+1);
				TextAr.setText(ter.toUpperCase());
			}
		});
		botonSelA.setBounds(355, 88, 89, 23);
		contentPane.add(botonSelA);
		
		JLabel SelOr = new JLabel("Selecciona Carpeta donde buscar");
		SelOr.setBounds(28, 168, 201, 23);
		contentPane.add(SelOr);
		
		botonSelOr = new JButton("Seleccionar");
		botonSelOr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser jf=new JFileChooser(".");
				jf.showDialog(contentPane,"seleccion");
				ter=jf.getSelectedFile().getName();
				ter=ter.substring(ter.lastIndexOf('.')+1);
				TextAr.setText(ter.toUpperCase());
			}
		});
		botonSelOr.setBounds(355, 168, 89, 23);
		contentPane.add(botonSelOr);
		
		JLabel Titulo = new JLabel("ORGANIZADOR DE ARCHIVOS 1.0");
		Titulo.setBounds(28, 30, 175, 14);
		contentPane.add(Titulo);
		
		JLabel SelDes = new JLabel("Selecciona Carpeta donde copiar");
		SelDes.setBounds(28, 248, 201, 23);
		contentPane.add(SelDes);
		
		botonSelDes = new JButton("Seleccionar");
		botonSelOr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				jf=new JFileChooser(".");
				jf.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				 jf.setAcceptAllFileFilterUsed(false);
				jf.showDialog(contentPane,"seleccion");
				
				String ar=(jf.getCurrentDirectory().getAbsolutePath());
				textOrigen.setText(ar);
				}
			
		});
		botonSelDes.setBounds(355, 248, 89, 23);
		contentPane.add(botonSelDes);
		
		textOrigen = new JTextPane();
		textOrigen.setText("Ruta de Busqueda");
		textOrigen.setBounds(28, 202, 416, 35);
		contentPane.add(textOrigen);
		
		textDestino = new JTextPane();
		textDestino.setText("Ruta de Destino");
		textDestino.setBounds(28, 282, 416, 35);
		contentPane.add(textDestino);
		
		
	}
	public JTextPane getTextPane() {
		return TextAr;
	}
	public JButton getBtnSeleccionar() {
		return botonSelA;
	}
	public JButton getBotonSelOr() {
		return botonSelOr;
	}
	public JButton getBotonSelDes() {
		return botonSelDes;
	}
	public JTextPane getTextOrigen() {
		return textOrigen;
	}
	public JTextPane getTextDestino() {
		return textDestino;
	}
}
