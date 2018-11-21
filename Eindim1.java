package arrays;

public class Eindim1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// eindimensionales Array für Ganzzahlen
		// Kennzeichen sind []
		// Festlegen des Speicherplatzes bei der Deklaration
		// Reservierung ist ein Befehl new Befehl
		// Speicherplatz = anzahl (5) * speicherbedarf für den Datentyp
		// int = 4 Bytes 
		int[] tab1 = new int[5];
		tab1[0] = 1; // in das erste Element (Index 0) wird ein wert (1) gespeichert
        tab1[1] = 2;
        tab1[2] = 3;
        tab1[3] = 4;
        tab1[4] = 5;
        // tab1[5] = 6; Index ist zu gross => ArrayIndexOutOfBoundsException
        System.out.println("Tabelle wurde erfolgreich gefüllt");
        
        // Zugriff auf ein bestimmtes Element immer über den Index
        int erg = tab1[2];
        System.out.println(erg);
        System.out.println("Das dritte Element hat den Inhalt "+ tab1[2]);
        
        // Ich möchte alle Elemente der Tabelle ausgeben
        System.out.println("Ausgabe aller Elemente");
        
        for(int i=0;i<5;i++)
        	System.out.println(tab1[i]);
        
        // Alternative 1
        for(int i=0;i<tab1.length;i++)
        	System.out.println(tab1[i]);
        
        // Alternative 2 for each Schleife
        // stellt der Reihe nach alle Elemente der tab1 zur Verfügung
        // der Bezeichner iausgabe muss derselbe Datentyp sein wie
        // die Tabelle, der Bezeichner ist frei wählbar
        // Achtung : die for each Schleife funktioniert nur für Ausgabe
        System.out.println("Ausgabe mit For each Schleife");
        for(int iausgabe : tab1)
        	System.out.println(iausgabe);
        	
        
	}

}
