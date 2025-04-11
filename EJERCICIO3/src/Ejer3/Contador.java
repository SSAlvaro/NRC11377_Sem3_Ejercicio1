package Ejer3;

public class Contador {
	private String nom;
	private static int cant=0;
    private static int SumaSueldo;
    private int sueldo;
    
	public Contador(int sueldo) {
		this.sueldo = sueldo;
	}
	public Contador(String nom) {
		this.nom = nom;
		cant++;
	}
	public int Cantidad() {
		return cant;
	}
	public int CantidadSueldo(int Sueldo) {
		return SumaSueldo+=Sueldo;
	}
	
}
