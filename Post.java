package uebungenAbfragen;

import java.util.Scanner;

public class Post {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie das Gewicht ein");
		int gewicht = sc.nextInt();
		
		System.out.println("Bitte geben Sie die Anzahl ein");
		int anzahl = sc.nextInt();
		
		System.out.println("Einschreiben ja / nein");
		String janein = sc.next();
		
		double preis = 0;
		
		if (gewicht > 20)
			preis = 0.90;
		else
			preis = 0.55;
		
		preis *= anzahl;
		
		if (janein.toLowerCase().equals("ja"))
			preis += 2.05 * anzahl;
		
		System.out.println("Gewicht : "+gewicht);
		System.out.println("Anzahl : "+anzahl);
		System.out.println("Einschreiben : "+janein);
		System.out.printf("Gesamtpreis : %.2f",preis);
		
		
		
		

	}

}
