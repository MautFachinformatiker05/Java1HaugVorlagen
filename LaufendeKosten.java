import java.util.Scanner;

public class LaufendeKosten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben die Kosten je Einheit ein");
		double einheit = sc.nextDouble();
		
		System.out.println("Bitte geben Sie die Anzahl ein");
		int anzahl = sc.nextInt();
		
		// Ausgabe des Ergebnisse
		System.out.printf("Jahrskosten : %.2f",einheit * anzahl / 100);

	}

}
