package uebungenSchleifen;

import java.util.Scanner;

public class HangMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bitte geben Sie das Suchwort ein");
		Scanner sc = new Scanner(System.in);
		// vorgabe Eingabe des Wortes
		String vorgabe = sc.next();
		String erraten = "";
		// Vorbelegen des Erraten Stringes mit "-
		for(int i=0;i<vorgabe.length();i++)
			erraten +="-";
		System.out.println(vorgabe);
		System.out.println(erraten);
		
		// Definition eines Hilfstring in dem entweder das erratene Zeichen 
		// oder das Zeichen das bereits erraten wurde eingegeben wird
		String hilf = "";
		
		// Zaehler , wieviel Versuche notwendig waren
		int zaehler = 0;
		
		// Versuche solange bis er alle Buchstaben erraten
		
		while(true)
		{
			System.out.println("Bitte geben Sie einen Buchstaben ein");
			Scanner sc1 = new Scanner(System.in);
			// Erstes Zeichen bestimmen
			char zeichen = sc.next().charAt(0);
			zaehler++;
			
			// Prüfung ob dieses Zeichen in der Vorgabe enthalten ist
			for ( int i = 0;i<vorgabe.length();i++)
			{
				if (vorgabe.charAt(i) == zeichen)
					//erraten.charAt(i) = zeichen; charAt erlaubt keine Zuweisung
					hilf += zeichen;
				else
					// wenn nicht erraten das Zeichen aus dem
					// erraten String übernehmen
					hilf += erraten.charAt(i);
			}
			
			// hilf String ist jetzt aktuell
			// erraten String mit dem hilf string festsetze
			System.out.println(hilf);
			// Übertragen des Hilf Stringes in den erraten String
			erraten = hilf;
			// Rücksetzen des Hilf Stringes auf Leerstring
			hilf = "";
			
			// Wenn erraten Abbruch der Schleife
			if (erraten.equals(vorgabe))
			{
				System.out.println("Herzlichen Glückwunsch Sie haben "+zaehler+" Versuche benötigt");
				break;
			}
		}
	}

}
