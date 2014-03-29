package ordenaArchivos.interfaz;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class OrdenaArchivos extends JFrame {

	private JPanel contentPane;
	private JTextPane textPane;
	private JButton btnSeleccionar;
	String ter;

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
		
		textPane = new JTextPane();
		textPane.setBounds(29, 72, 416, 35);
		contentPane.add(textPane);
		
		JLabel lblSeleccionaArchivo = new JLabel("Selecciona archivo");
		lblSeleccionaArchivo.setBounds(29, 37, 135, 24);
		contentPane.add(lblSeleccionaArchivo);
		
		btnSeleccionar = new JButton("Seleccionar");
		btnSeleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser jf=new JFileChooser(".");
				jf.showDialog(contentPane,"seleccion");
				ter=jf.getSelectedFile().getName();
				ter=ter.substring(ter.lastIndexOf('.')+1);
				textPane.setText(ter.toUpperCase());
			}
		});
		btnSeleccionar.setBounds(141, 38, 89, 23);
		contentPane.add(btnSeleccionar);
		
		
	}
	public JTextPane getTextPane() {
		return textPane;
	}
	public JButton getBtnSeleccionar() {
		return btnSeleccionar;
	}
}
