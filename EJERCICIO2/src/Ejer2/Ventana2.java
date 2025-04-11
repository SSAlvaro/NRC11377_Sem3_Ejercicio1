package Ejer2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana2 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblKilometros;
	private JLabel lblCelcius;
	private JTextField txtKm;
	private JTextField txtSeg;
	private JTextField txtCelcius;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnConvertir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 frame = new Ventana2();
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
	public Ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Segundos:");
			lblNewLabel.setBounds(29, 31, 83, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblKilometros = new JLabel("Kilometros:");
			lblKilometros.setBounds(29, 56, 83, 14);
			contentPane.add(lblKilometros);
		}
		{
			lblCelcius = new JLabel("Celcius:");
			lblCelcius.setBounds(29, 81, 83, 14);
			contentPane.add(lblCelcius);
		}
		{
			txtKm = new JTextField();
			txtKm.setBounds(110, 53, 86, 20);
			contentPane.add(txtKm);
			txtKm.setColumns(10);
		}
		{
			txtSeg = new JTextField();
			txtSeg.setBounds(110, 28, 86, 20);
			contentPane.add(txtSeg);
			txtSeg.setColumns(10);
		}
		{
			txtCelcius = new JTextField();
			txtCelcius.setBounds(110, 78, 86, 20);
			contentPane.add(txtCelcius);
			txtCelcius.setColumns(10);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(29, 112, 297, 138);
			contentPane.add(scrollPane);
			{
				textArea = new JTextArea();
				scrollPane.setViewportView(textArea);
			}
		}
		{
			btnConvertir = new JButton("Convertir");
			btnConvertir.addActionListener(this);
			btnConvertir.setBounds(237, 52, 89, 23);
			contentPane.add(btnConvertir);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnConvertir) {
			do_btnConvertir_actionPerformed(e);
		}
	}
	protected void do_btnConvertir_actionPerformed(ActionEvent e) {
		double celcius = Double.parseDouble(txtCelcius.getText());
		int kilometros = Integer.parseInt(txtKm.getText());
		int segundos = Integer.parseInt(txtSeg.getText());
		boolean flag = true;
		Conversor c=new Conversor(celcius);
		Conversor km= new Conversor(kilometros);
		Conversor seg= new Conversor(segundos, flag);
		textArea.setText("");
		textArea.append("Conversión de Celsius a Fahrenheit: "+c.Convertir(celcius));
		textArea.append("\nConversión de Kilometros a Millas: "+km.Convertir(kilometros));
		textArea.append("\nConversión de segundos a minutos y segundos: "+seg.Convertir(segundos, flag));
	}
}
