package Ejer1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

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
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblSegundoNmero;
	private JLabel lblTercerNmero;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNum3;
	private JButton btnSuma2int;
	private JButton btnSuma3int;
	private JButton btnSuma2double;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
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
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Primer número:");
			lblNewLabel.setBounds(28, 28, 91, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblSegundoNmero = new JLabel("Segundo número:");
			lblSegundoNmero.setBounds(28, 53, 114, 14);
			contentPane.add(lblSegundoNmero);
		}
		{
			lblTercerNmero = new JLabel("Tercer número:");
			lblTercerNmero.setBounds(28, 78, 91, 14);
			contentPane.add(lblTercerNmero);
		}
		{
			txtNum1 = new JTextField();
			txtNum1.setBounds(152, 25, 86, 20);
			contentPane.add(txtNum1);
			txtNum1.setColumns(10);
		}
		{
			txtNum2 = new JTextField();
			txtNum2.setBounds(152, 50, 86, 20);
			contentPane.add(txtNum2);
			txtNum2.setColumns(10);
		}
		{
			txtNum3 = new JTextField();
			txtNum3.setBounds(152, 75, 86, 20);
			contentPane.add(txtNum3);
			txtNum3.setColumns(10);
		}
		{
			btnSuma2int = new JButton("Suma 2 int");
			btnSuma2int.addActionListener(this);
			btnSuma2int.setBounds(28, 120, 107, 23);
			contentPane.add(btnSuma2int);
		}
		{
			btnSuma3int = new JButton("Suma 3 int");
			btnSuma3int.addActionListener(this);
			btnSuma3int.setBounds(145, 120, 107, 23);
			contentPane.add(btnSuma3int);
		}
		{
			btnSuma2double = new JButton("Suma 2 reales");
			btnSuma2double.addActionListener(this);
			btnSuma2double.setBounds(262, 120, 126, 23);
			contentPane.add(btnSuma2double);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(28, 155, 341, 95);
			contentPane.add(scrollPane);
			{
				textArea = new JTextArea();
				textArea.setText("VERIFICANDO");
				scrollPane.setViewportView(textArea);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSuma2double) {
			do_btnSuma2double_actionPerformed(e);
		}
		if (e.getSource() == btnSuma3int) {
			do_btnSuma3int_actionPerformed(e);
		}
		if (e.getSource() == btnSuma2int) {
			do_btnSuma2int_actionPerformed(e);
		}
	}
	protected void do_btnSuma2int_actionPerformed(ActionEvent e) {
		try {
			int n1=Integer.parseInt(txtNum1.getText());
			int n2=Integer.parseInt(txtNum2.getText());
			Calculadora c=new Calculadora(n1, n2);
			textArea.append("\nLa suma es: "+c.Sumar(n1, n2));
		}
		catch(Exception e2) {
			JOptionPane.showMessageDialog(this, "Ingrese números enteros");
		}
		
	}
	protected void do_btnSuma3int_actionPerformed(ActionEvent e) {
		try {
			int n1=Integer.parseInt(txtNum1.getText());
			int n2=Integer.parseInt(txtNum2.getText());
			int n3=Integer.parseInt(txtNum3.getText());
			Calculadora c=new Calculadora(n1, n2, n3);
			textArea.append("\nLa suma es: "+c.Sumar(n1, n2, n3));
		}
		catch(Exception e3) {
			JOptionPane.showMessageDialog(this, "Ingrese números enteros");
		}
	}
	protected void do_btnSuma2double_actionPerformed(ActionEvent e) {
		try {
			double n1=Double.parseDouble(txtNum1.getText());
			double n2=Double.parseDouble(txtNum2.getText());
			Calculadora c=new Calculadora(n1, n2);
			textArea.append("\nLa suma real es: "+c.Sumar(n1, n2));
		}
		catch(Exception r2) {
			JOptionPane.showMessageDialog(this, "Ingrese números");
		}
	}
}
