package Ejer3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.nio.file.attribute.AclEntry;
import java.awt.event.ActionEvent;

public class Ventana3 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtObjeto;
	private JButton btnIngresar;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana3 frame = new Ventana3();
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
	public Ventana3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Ingrese objeto:");
			lblNewLabel.setBounds(36, 47, 93, 14);
			contentPane.add(lblNewLabel);
		}
		{
			txtObjeto = new JTextField();
			txtObjeto.setBounds(139, 44, 86, 20);
			contentPane.add(txtObjeto);
			txtObjeto.setColumns(10);
		}
		{
			btnIngresar = new JButton("Ingresar");
			btnIngresar.addActionListener(this);
			btnIngresar.setBounds(262, 43, 89, 23);
			contentPane.add(btnIngresar);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(36, 88, 316, 162);
			contentPane.add(scrollPane);
			{
				textArea = new JTextArea();
				scrollPane.setViewportView(textArea);
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnIngresar) {
			do_btnIngresar_actionPerformed(e);
		}
	}
	protected void do_btnIngresar_actionPerformed(ActionEvent e) {
		String nom = txtObjeto.getText();
		if (nom.matches("[a-zA-Z]+")) {
		    Contador c = new Contador(nom);
		    textArea.setText("");
		    textArea.append("Se ingresó: " + nom + "\n"
		                  + "La cantidad aumentó en +" + c.Cantidad());
		} else {
		    JOptionPane.showMessageDialog(null, "Solo se permiten letras (sin espacios, números ni símbolos).", 
		                                  "Entrada inválida", JOptionPane.ERROR_MESSAGE);
		}
		
	}
}
