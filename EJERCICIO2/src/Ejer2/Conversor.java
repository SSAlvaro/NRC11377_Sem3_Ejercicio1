package Ejer2;

public class Conversor {
	private double celcius;
	private int kilometros, segundo;
	public Conversor(double celcius) {
		this.celcius = celcius;
	}
	public Conversor(int kilometros) {
		this.kilometros = kilometros;
	}
	public Conversor(int segundo, boolean flag) {
		this.segundo = segundo;
	}
	
	public double Convertir(double celcius) {
		return celcius*9/5+32;
	}
	public double Convertir(int kilometros) {
		return kilometros*0.621371;
	}
	public String Convertir(int segundos, boolean abc) {
		int min=segundos/60;
		int residuo=segundos%60;
		return min+":"+residuo;
	}
}
