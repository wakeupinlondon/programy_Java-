package PracaZaliczeniowa;

public class Zadanie1 {
	public static void main(String[] args) {
		double a = 56.8;
		double b = 25.4;
		double c = 3.14159;
		double d = a / c;
		double e = b / c;
		
		System.out.println("a / c = " + (a / c));
		System.out.println("b / c = " + (b / c));
		
		if (d > e) {
		System.out.print("Liczba " + (a/c));
		System.out.print(" jest wiêksza od liczby " + (b/c));
		} else { if (d == e ) { 
			System.out.println("Liczby s¹ równe");
		}
		
	}
	

	}}
