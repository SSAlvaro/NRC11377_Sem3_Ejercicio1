package Ejer3;

public class Contador {
	private String nom;
	private static int cant=0;
    private static int SumaSueldo;
    private int sueldo;
    
	public Contador(String nom, int sueldo) {
		this.nom = nom;
		this.sueldo = sueldo;
		cant++;
	}
	public int Cantidad() {
		return cant;
	}
	public int CantidadSueldo(int Sueldo) {
		return SumaSueldo+=Sueldo;
	}
	
}
