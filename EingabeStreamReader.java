import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EingabeStreamReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Erzeugung eines Objektes von der Klasse
		// System.in ist die Konsole
		// liest Eingabe nur in den HS 
		InputStreamReader sr = new InputStreamReader(System.in);
		// um es bearbeiten zu können
		// ist die Weiterverarbeitung mit den BufferedReader erforderlich
		BufferedReader br = new BufferedReader(sr);
		// Grundsatz alle Eingaben und Ausgaben sind immer vom Typ String !!!
		System.out.println("Bitte geben Sie ein");
		String eingabe = br.readLine();
		
		System.out.println(eingabe);
		
		// Einfache IF Abfrage
		// ob der eingegebene Wert Meier ist
		// in Eingabe steht die Speicheradresse der Eingabe
		// Abfrage funktioniert nur mit equals
		if (eingabe.toLowerCase().equals("meier"))
			System.out.println("Die Eingabe ist Meier");
		else
			System.out.println("Es ist ein andere Eingabe");
		
		System.out.println(eingabe.toLowerCase()); // Umwandeln in Kleinschrift
		System.out.println(eingabe.length()); // liefert die Länge des Stringes
		System.out.println(eingabe.charAt(2)); // liefert ein Zeichen an der 
		// entsprechenden Stelle der Index beginnt immer mit 0
		
		

	}

}
