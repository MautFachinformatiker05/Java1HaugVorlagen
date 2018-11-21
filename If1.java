
public class If1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int zahl1 = 15;
		int zahl2 = 7;
		
		// 1.) Schlüsselwort if
		// 2.) Bedingung muss immer true oder false liefern (boolean)
		// 3.) in dem sog. Zweig (true oder false) können eine oder 
		//     mehrere Bedingung codiert werden
		
		if (zahl2 == 7)
			System.out.println("Zahl2 = 7");
		
		// wenn mehr als eine Anweisung dann ist ein Block erforderlich
		if (zahl1 == 15)
		{
			System.out.println("Zahl1 = 15");
			System.out.println("Zahl2 = 7");
		}
		
		// bei und müssen beide Bedingungen erfüllt sein
		// alle Operatoren >=,<=,!=,>,<
		if (zahl1 > 15 && zahl2 == 7)
		{
			System.out.println("Zahl1 = 15");
			System.out.println("Zahl2 = 7");
		}
		else
			System.out.println("Bedingung nicht erfüllt");
		
		// Geschachtelte IF Bedingung
		// nicht mehr als drei Schachtelungen !!!!
		if (zahl1 == 15)
		{
			if (zahl2 == 6)
			{
				System.out.println("Beide Bedingungen sind erfüllt");
			}
			else
				System.out.println("zahl1 ist 15 aber zahl2 ist nicht 7");
		}

	}

}
