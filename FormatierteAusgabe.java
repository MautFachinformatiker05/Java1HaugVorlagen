
public class FormatierteAusgabe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 16;
		double preis = 49.1111;
		
		// zwei Teile
		// 1.formatierungsstring
		// %d PLatzhalter f�r integer 
		// 2.die entsprechenden Variablen
		// f�r jeden Platzhalter eine Variable
		System.out.printf("Ausgabe einer Zahl %d\n",i);
		// %f gibt bei Double die Anzahl der Gesamtstellen
		// sowie die Anzahl der Nachkommastellen
		// %f rundet kaufm�nisch
		System.out.printf("Anzahl %d Einzelpreis %10.2f\n",i,preis);
		System.out.printf("Hexadecimal %x\n",i);
		
		boolean schalter = true;
		System.out.printf("Boolean %b\n",schalter);
		

	}

}
