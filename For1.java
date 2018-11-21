
public class For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for Schleife
		// Teil 1 der Anfangswert
		// Teil 2 die Laufbedingung
		// Teil 3 die Schrittweite
		// eine for schleife sollte man immer hernehmen wenn die Anfangs - und ende
		// Werte bekannt sind
		
		int i = 0;
		for (i=1;i<10;i++)
			System.out.println(i);
		
		System.out.println(i);
		
		// Laufvariable j ist nur in der Schleife bekannt
		for(int j=0;j<10;j++)
			System.out.println(j);
		
		// Fallen !!!
		int k = 7;
		for (k=0;k<10;k++);
		    System.out.println(k);
		
		// der Anfangswert wird mit dem aktuellen Wert
		for (;k<20;k++)
			System.out.println("Falle "+k);
		
		for(int l=0;l<10;l+=2)
			System.out.println("l = "+l);
		
		for(int l=0;l<10;l+=2)
		{
			// Laufvariable niemals in der Schleife verändern !!!!!
			l++;
			System.out.println("l = "+l);
		}
		

	}

}
