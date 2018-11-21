package arrays;

public class ZweiDim1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Deklaration einer zwei Dimensionalen Tabelle
		// bei Deklaration zwei []
		// Angabe der zeilen und der Spalten pro Zeile
		int[][] tab = new int[10][10];
		
		// Bei dem Zugriff auf die Tabelle 
		// jeweils zwei Indexe erforderlich sind
		tab[0][5] = 5;
		System.out.println(tab[0][0]);
		
		// ich möchte die Tabelle mit werten von 1 bis 100 füllen
		int k = 1;
		
		// zwei for Schleifen ( geschachtelte Schleifen)
		// die äussere Schleife ist für die Zeilen
		// die innere Schleifen für die Spalten in jeder Zeile
		
		for(int i=0;i<10;i++) // Schleife für Zeilen
		{
			for(int j=0;j<10;j++)
			{
				tab[i][j] = k;
				k++;
			}
		}
		
		// Ausgabe in aller Regel zwei for Schleifen
		for (int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print(tab[i][j]+"\t");
			}
			System.out.println();
		}
		

	
	
	// Direktinialisierung
	// Beispiel Namen der Monate und dazu die Anzahl der Tage pro Monat
		// wird selten hergenommen 
	String[][] monate = { {"Januar","31"},{"Februar","28"},{"März","31"} };
	
	System.out.println(monate.length); // Zeilen (1.Dimension)
	System.out.println(monate[1].length); // Spalter (2.Dimension)
	// monate[0] in der Forschleife ist die 1. Diminension (zeilen)
	for(int i=0;i< monate.length;i++)
	{
		for (int j=0;j<monate[1].length;j++)
		{
			System.out.println(monate[i][j]);
		}
	}
}

}
