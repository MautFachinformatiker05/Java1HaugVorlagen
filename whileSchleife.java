import java.util.Scanner;

public class whileSchleife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// eine while Schleife bietet sich immer an,
		// wenn die Anzahl der Durchläufe nicht bekannt ist
		
		while (Math.random() < 0.5)
		{
			System.out.println("Treffer");
		}
		
		// Lesen von mehreren Eingaben
		// Möglichkeit 1
		System.out.println("Bitte geben Sie die Namen ein, Ende mit ende");
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			
			if (name.toLowerCase().equals("ende"))
				break; // Beenden die Schleife
			
			System.out.println(name);
			
		}
		
		// Möglichkeit 2
		String name = "";
		System.out.println("Bitte geben Sie die Namen ein, Ende mit ende");
		while (!name.toLowerCase().equals("ende"))
		{
			Scanner sc = new Scanner(System.in);
			name = sc.next();
			System.out.println(name);
		}

	}

}
