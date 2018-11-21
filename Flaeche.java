import java.util.Scanner;

public class Flaeche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bitte geben Sie den Radius ein");
		Scanner sc = new Scanner(System.in);
		
		// Eingabe eines Integers für den Radius
		//int radius = sc.nextInt();
		// Achtung ! Bei double Eingabe mit , nicht .
		double radius = sc.nextDouble();
		final double pi = Math.PI;
		
		System.out.println("Fläche = "+(radius*radius*pi));

	}

}
