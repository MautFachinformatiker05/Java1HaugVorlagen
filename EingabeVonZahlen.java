import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EingabeVonZahlen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Bitte geben Sie eine Zahl ein");
		String eingabe = br.readLine();
		
		// die Eingabe muss in diesem in einen nummerischen Datentyp umgewandelt
		// werden
		// Umwandlung mit Hilfe von Integer.parseint
		// Für Double gibt es Double.ParseDouble
		int zahl = Integer.parseInt(eingabe);
		System.out.println(++zahl);

	}

}
