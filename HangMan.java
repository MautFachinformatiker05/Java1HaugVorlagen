package arrays;

import java.util.Scanner;

public class HangMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// das gew�mschte Wort
		System.out.println("Bitte geben Sie das Suchwort ein");
		Scanner sc = new Scanner(System.in);
		String wort = sc.next();
		int zaehler = 0;
		
		// 2 Arrays Vorgabe (wort) Ergebnis 
		char[] vorgabe = new char[wort.length()];
		char[] ergebnis = new char[wort.length()];
		
		
		
		// Vorbelgung der einzelnen Arrays
		for(int i=0;i<wort.length();i++)
		{
			vorgabe[i] = wort.charAt(i);
			ergebnis[i] = '-';
		}
		
		// Eingabe des Buchstabens des Benutzers
		while(true)
		{
			System.out.println("Bitte geben Sie einen Buchstaben ein");
			Scanner sce = new Scanner(System.in);
			char zeichen = sce.next().charAt(0);
			zaehler++;
			
			// Pr�fung ob das Zeichen in der vorgabe enthalten ist
			for(int i=0;i<wort.length();i++)
			{
				// Buchstabe ist vorhanden
				if (vorgabe[i] == zeichen)
				{
					// Einspielen des Zeichens in dem Ergebnis
					ergebnis[i] = zeichen;
					
				}
				
				
			}
			
			// Ausgabe des aktuellen Wortes
			for(int i=0;i<wort.length();i++)
			{
				System.out.print(ergebnis[i]);
			}
			
			// Pr�fung ob das Wort erraten wurde
			boolean schalter = true;
			for(int i=0;i<wort.length();i++)
			{
				if (ergebnis[i] == '-')
				{
					schalter = false;
					break;
				}
					
			}
			
			// Abfrage Z�hler �berschritten
			if ( zaehler > wort.length() * 2 )
			{
				System.out.println();
				System.out.println("Leider haben Sie das Wort nicht erraten");
				break;
			}
			
			// Ende wenn der Schalter auf true steht
			if (schalter)
			{
				
				System.out.println("\nGl�ckwunsch Sie haben das Wort erraten");
				System.out.println("\nSie haben "+zaehler+" Versuche ben�tigt");
				break; // while Schleife wird abgebrochen
			}
			
			System.out.println();
			
		}

	}

}
