package uebungenSchleifen;

import java.util.Scanner;

public class Uebung20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bitte geben Sie die Anzahl der Anmeldetermine ein");
		Scanner sc = new Scanner(System.in);
		int anzahlTermine = sc.nextInt();
		
		// Anmeldetermine
		int gesamtteilnehmer = 0;
		for(int i=1;i<=anzahlTermine;i++)
		{
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Teilnehmer für Anmeldetermin "+i);
			int teilnehmer = sc1.nextInt(); // Teilnehmer für den Termin
			gesamtteilnehmer +=teilnehmer;
			
			System.out.println("Teilnehmer für Anmeldetermin "+i+" : "+teilnehmer );
			
			
			
			
		}
		
		System.out.println("Gesamt Teilnehmer : "+gesamtteilnehmer);
		

	}

}
