
public class Fallunterscheidung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int zahl1=15;
		int zahl2=7;
		// 1.Version
		// Angabe nur eine Variablen möglich
		// diese Variable muss ein nummerisches Ganzzahl Datentyp
		// z.b int
		// oder char 
		// ab JDK 1.7 ist auch String möglich
		switch (zahl1)
		{
		case 1 :  // beliebig viele
			System.out.println("zahl1 = 1");
			break; // Abschluss des case Zweiges
		case 2 :
			System.out.println("zahl1 = 2");
			break; // Abschluss des case Zweiges
			default :
				System.out.println("zahl1 hat einen anderen Wert");
		}
		
		String name="huber";
		
		switch (name)
		{
		case "huber" :
			System.out.println("der Name ist Huber");
			break;
		case "meier" :
			System.out.println("der Name ist meier");
			break;
			default :
				System.out.println("ein anderer Name");
				
		}
		
		// 2.Möglichkeit
		int monat = 2;
		int letzterTag = 0;
		
		switch(monat)
		{
		             // alle Monate mit 31 Tagen
		case 1:
		case 3:
		case 5 :
		case 7 :
		case 8 :
		case 10:
		case 12 :
			letzterTag = 31;
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			letzterTag = 30;
			break;
		case 2:
			letzterTag = 28;
			break;
			
		
		}
		
		System.out.println("Letzte Tag "+letzterTag);

	}

}
