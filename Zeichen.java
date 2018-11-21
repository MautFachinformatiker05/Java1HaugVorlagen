import java.util.Scanner;

public class Zeichen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bitte geben Sie einen Text mit 5 Zeichen ein");
		Scanner sc = new Scanner(System.in);
		String eingabe = sc.next();
		
		// Abfrage auf die Länge der Zeichenkette
		if (eingabe.length() == 5)
			System.out.println(eingabe.charAt(1));
		else
			System.err.println("Die Länge der Zeichenkette ist nicht 5");

	}

}
